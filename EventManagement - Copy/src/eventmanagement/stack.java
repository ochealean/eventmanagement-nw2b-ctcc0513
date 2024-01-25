
package eventmanagement;

/**
 *
 * @author LEANDER
 */
public class stack {
    
    sub_stack top = null;
    sub_stack temp = null;
    
    
        void enqueue(String id, String name, String email, String event, String venue, String no_of_attendees, String addons)
        {
            sub_stack ss = new sub_stack(id, name, email, event, venue, no_of_attendees, addons);

            //kapag walang laman yung unang data ng linkedlist gagana itong if kapag naman meron nang laman yung top, yung else naman gagana
            if(top==null) top = ss;
            else
            {
                sub_stack another_ss = top;
                while(another_ss.next!=null) another_ss = another_ss.next;
                another_ss.next = ss;
            }
        }
        
        
        
        sub_stack search(String num)
        {
            sub_stack ss_search = top;
            while(ss_search!=null)
            {
                if(num.equals(ss_search.id)) break;
                else ss_search = ss_search.next;
            }
            return ss_search;
        }
        
        
//          ["one"]["two"]["three"]["four"]["five"]
//             1      2       3       4       5
        void update(String num, String name, String email, String event, String venue, String noa, String addons )
        {
            sub_stack ss_update = top;
            while(ss_update!=null)
            {
                if(num.equals(ss_update.id)) 
                {
                    ss_update.name = name;
                    ss_update.email = email;
                    ss_update.event = event;
                    ss_update.venue = venue;
                    ss_update.no_of_attendees = noa;
                    ss_update.addons = addons;
                    break;
                }
                else ss_update = ss_update.next;
            }
        }
        
        void delete(String num)
        {
            int counter = 1;
            sub_stack ss_delete = top;

//          ["one"]["two"]["three"]["four"]["five"]
//             1      2       3       4       5

//          ["one"]["one"]["two"]["four"]["five"]
//             1      2       3       4       5
        
            
//          ang point ng loop na ito ay para ma-set kung ilang beses ililipat ng current node yung laman nya sa kasunod nitong node
            for(int a=Integer.parseInt(num); a>1; a--)
            {
                
//              ito naman ay para mapalitan yung value ng node na nauna sa kanya
                for(int b=1; b<a-1; b++)
                {
                    ss_delete = ss_delete.next;
                }
                ss_delete.next.id = ss_delete.id;
                ss_delete.next.name = ss_delete.name;
                ss_delete.next.email = ss_delete.email;
                ss_delete.next.event = ss_delete.event;
                ss_delete.next.venue = ss_delete.venue;
                ss_delete.next.no_of_attendees = ss_delete.no_of_attendees;
                ss_delete.next.addons = ss_delete.addons;
                ss_delete = top;
            }
            
//          pagkatapos mapalitan yung value napiling node ng mga nauna sa kanya, idedelete naman ngayon ang 1st node

//            ["one"]["two"]["four"]["five"]
//               2      3       4       5
            top = top.next;

//            ["one"]["two"]["four"]["five"]
//               1      2       3       4


            
//          dahil na palitan na yung mga value ng node sa linkedlist, yung id naman ang papalitan
//          gamit ang code na ito, mare-rewrite yung id ng data value ng node sa ascending order
            if(size()!=0 || Integer.parseInt(num)==size())
            {
                ss_delete = top;
                if(ss_delete.next!=null)  {
                    while(Integer.parseInt(ss_delete.id) == counter)
                    {
                        ss_delete = ss_delete.next;
                        counter++;
                        if(counter==size()) break;
                    }
                }
                
//            ["one"]["two"]["three"]["four"]
//               1      2       3       4
                if(counter!=size() || Integer.parseInt(ss_delete.id)!=size()){
                    while(counter<=size())
                    {
                        ss_delete.id=String.valueOf(counter);
                        ss_delete = ss_delete.next;
                        counter++;
                    }
                    counter=1;
                } 
            }
        }
        
        
        int size()
        {
            int num = 0;
            sub_stack varA = top;
            while(varA!=null) {
                varA = varA.next;
                num++;
            }
            return num;
        }
}
