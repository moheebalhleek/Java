package Lab_4_assinment;

/**
 ** Created by Ahmed Al masadi on 2/02/2022.
 */
public class R_3_30 {

    public CircularyLinkedList split (CircularyLinkedList<E> L){
        CircularyLinkedList A=new CircularyLinkedList ();
        Node temp =L.tail;
        for (int i = 0; i <L.size()/2 ; i++) {
            temp=temp.getNext();

        }
        A.tail = temp.getNext();

        temp.setNext(L.tail);


        for (int i = 0; i <L.size()/2 ; i++) {
            temp = temp.getNext();

        }
        temp.setNext (A.tail)
                return A;
    }
}
