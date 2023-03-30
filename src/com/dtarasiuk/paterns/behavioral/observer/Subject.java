package com.dtarasiuk.paterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
        private List<Observer> observers = new ArrayList<>();
        private int state;

        public void attach(Observer observer){
          observers.add(observer);
        }

        public void detouch(Observer observer){
            observers.remove(observer);
        }

        void setState(int state){
            this.state = state;
        }

        int getState(){
            return state;
        }

        private void notifyObserver(Observer observer){
            for(Observer observer1 : observers){
                observer.update();
            }
        }

}


