/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tecAuto.connectionDB;

import java.sql.*;

/**
 *
 * @author manoel.carvalho
 */
public class ModuloConnection {
    
    public static Connection connector() {
        //métdo responsavel por estabelecer conexao com DB
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referentes ao DB
        String url = "jdbc:mysql://localhost:3306/gestao_servico";
        String user = "root";
        String password = "123456";
        // Estabelecendo a conexao com DB
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return   conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } 
    }

    

}
