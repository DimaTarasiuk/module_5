package com.prosalyte.patterns.behavioral.command;

public class Developer {
    Command select;
    Command insert;
    Command delete;
    Command update;

    public Developer(Command select, Command insert, Command delete, Command update) {
        this.select = select;
        this.insert = insert;
        this.delete = delete;
        this.update = update;
    }

    public void selectRecord(){
        select.execute();
    }

    public void insertRecord(){
        insert.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }

    public void updateRecord(){
        update.execute();
    }
}
