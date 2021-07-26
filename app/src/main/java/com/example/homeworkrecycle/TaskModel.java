package com.example.homeworkrecycle;

public class TaskModel {
    String txtTitle,txtDescription;

    public TaskModel(String txtTitle, String txtDescription) {
        this.txtTitle = txtTitle;
        this.txtDescription = txtDescription;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }
}
