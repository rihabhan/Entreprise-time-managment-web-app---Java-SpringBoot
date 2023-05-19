package com.enit.ProjectSpring11.Controller;

import java.util.List;
import java.util.Set;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SQLController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/sql")
    public String sqlPage() {
        return "sql";
    }

    @PostMapping("/execute-sql")
    public String executeSQL(@RequestParam("query") String query, Model model) {
        try {
            String queryType = getQueryType(query);
            if (queryType.equalsIgnoreCase("SELECT")) {
                List<Map<String, Object>> results = jdbcTemplate.queryForList(query);
                if (!results.isEmpty()) {
                    Set<String> columns = results.get(0).keySet();
                    model.addAttribute("columns", columns);
                    model.addAttribute("rows", results);
                }
            } else if (queryType.equalsIgnoreCase("INSERT") || queryType.equalsIgnoreCase("DELETE")) {
                int rowsAffected = jdbcTemplate.update(query);
                model.addAttribute("message", rowsAffected + " row(s) affected.");
            } else {
                throw new IllegalArgumentException("Unsupported query type.");
            }
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "sql";
    }

    private String getQueryType(String query) {
        if (query != null && !query.isEmpty()) {
            String[] queryTokens = query.trim().split("\\s+");
            if (queryTokens.length > 0) {
                return queryTokens[0].toUpperCase();
            }
        }
        return "";
    }
}

