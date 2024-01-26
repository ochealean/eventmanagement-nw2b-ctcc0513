/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagement;

/**
 *
 * @author LEANDER
 */
public class transaction {
    
    String id;
    String name;
        String email;
        String event;
        String venue;
        String no_of_attendees;
        String addons;
        String month;
        String day;
        String year;
        String hour1;
        String hour2;
        String min1;
        String min2;
        String ap;
        transaction next;
        
        transaction(){}
        
        transaction(String id, String name, String email, String event, String venue, String no_of_attendees, String addons, String month, String day, String year, String hour1, String hour2, String min1, String min2, String ap)
        {
            this.id=id;
            this.name = name;
            this.email = email;
            this.event = event;
            this.venue = venue;
            this.no_of_attendees = no_of_attendees;
            this.addons = addons;
            this.month = month;
            this.day = day;
            this.year = year;
            this.hour1 = hour1;
            this.hour2 = hour2;
            this.min1 = min1;
            this.min2 = min2;
            this.ap = ap;
        }
}
