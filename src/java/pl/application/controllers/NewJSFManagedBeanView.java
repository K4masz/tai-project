/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.application.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import pl.application.dao.UzytkownikDao;
import pl.application.to.UzytkownikTo;

/**
 *
 * @author K4masz
 */
@ManagedBean
@ViewScoped
public class NewJSFManagedBeanView {

    private List<UzytkownikTo> uzytkownikToList;

    @ManagedProperty(value="#{NewJSFManagedBeanApplication}")
    NewJSFManagedBeanApplication appBean;
    
    public NewJSFManagedBeanView() {
        this.uzytkownikToList = new ArrayList();
    }

    public List<UzytkownikTo> getUzytkownikToList() {
        return uzytkownikToList;
    }

    public void visibleChange(UzytkownikTo uzytkownikTo) {
        int indexObject = uzytkownikToList.indexOf(uzytkownikTo);
        uzytkownikTo.setEdited(true);
        UzytkownikDao daneDao = new UzytkownikDao();
        if (daneDao.update(uzytkownikTo) != -1) {
            uzytkownikToList.set(indexObject, uzytkownikTo);
        }
    }

    public void deleteRow(UzytkownikTo uzytkownikTo) {
        int indexObject = uzytkownikToList.indexOf(uzytkownikTo);
        UzytkownikDao daneDao = new UzytkownikDao();
        if (daneDao.delete(uzytkownikTo.getId()) != -1) {
            uzytkownikToList.remove(indexObject);
        }
    }

    public void addRow(UzytkownikTo uzytkownikTo) {
        int indexObject = uzytkownikToList.indexOf(uzytkownikTo);
        int listSize = uzytkownikToList.size();
        UzytkownikTo newRow = new UzytkownikTo(listSize + 1l, "", "", true);
        UzytkownikDao daneDao = new UzytkownikDao();
        Long id = daneDao.create(newRow);
        if (id != null) {
            newRow.setId(id);
            uzytkownikToList.add(indexObject + 1, newRow);
        }
    }

    public final void refreshData() {

        UzytkownikDao daneDao = new UzytkownikDao();
        java.util.List<UzytkownikTo> uzytkownikToListLokal = daneDao.findAll();
        if (uzytkownikToListLokal != null) {
            uzytkownikToList.clear();
            uzytkownikToList = uzytkownikToListLokal;
        }
    }

    public void sort(String dir) {
        java.util.Comparator<UzytkownikTo> comparator = (UzytkownikTo a, UzytkownikTo b) -> {
            int compareResult = 0;
            if (dir.equals("asc")) {
                compareResult = a.getNazwisko().compareTo(b.getNazwisko());
            } else {
                compareResult = b.getNazwisko().compareTo(a.getNazwisko());
            }
            return compareResult;
        };
        java.util.Collections.sort(uzytkownikToList, comparator);
    }

    public NewJSFManagedBeanApplication getAppBean() {
        return appBean;
    }

    public void setAppBean(NewJSFManagedBeanApplication appBean) {
        this.appBean = appBean;
    }
    
    
}
