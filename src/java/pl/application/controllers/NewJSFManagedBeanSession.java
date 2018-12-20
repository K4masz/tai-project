/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.application.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pl.application.common.DataRow;
import pl.application.common.MenuItem;
import pl.application.dao.UzytkownikDao;
import pl.application.to.UzytkownikTo;

/**
 *
 * @author biala
 */
@ManagedBean
@SessionScoped
public class NewJSFManagedBeanSession {

    private ArrayList<MenuItem> menuItemList;
    private ArrayList<DataRow> dataRow;
   

    /**
     * Creates a new instance of NewJSFManagedBeanSession
     */
    public NewJSFManagedBeanSession() {
       
        this.menuItemList = new ArrayList();
        this.dataRow = new ArrayList();
        menuItemList.add(new MenuItem("Karuzela", "/views/carouselView"));
        menuItemList.add(new MenuItem("Tabela", "/views/tableView"));
        menuItemList.add(new MenuItem("Tabela Ajaxowa", "/views/ajaxTableView"));
        menuItemList.add(new MenuItem("Wylogowanie", "/logoutWindow"));
        dataRow.add(new DataRow("Adam", "Nowak", 25, "Warszawa", "563"));
        dataRow.add(new DataRow("Maciej", "Kowalski", 35, "Gdańsk", "425"));
        dataRow.add(new DataRow("Kamil", "Kamiński", 37, "Gdynia", "432"));
        dataRow.add(new DataRow("Monika", "Kownacka", 22, "Sopot", "564"));
        dataRow.add(new DataRow("Anna", "Skłodowska", 41, "Zakopane", "432"));
    }

    public ArrayList<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public ArrayList<DataRow> getDataRow() {
        return dataRow;
    }


}
