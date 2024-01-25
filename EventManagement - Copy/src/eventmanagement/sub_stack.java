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
class sub_stack {
    String id;
    String name;
        String email;
        String event;
        String venue;
        String no_of_attendees;
        String addons;
        sub_stack next;
        
        sub_stack(){}
        
        sub_stack(String id, String name, String email, String event, String venue, String no_of_attendees, String addons)
        {
            this.id=id;
            this.name = name;
            this.email = email;
            this.event = event;
            this.venue = venue;
            this.no_of_attendees = no_of_attendees;
            this.addons = addons;
        }
}
