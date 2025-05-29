public class QueueLinkedList1221 {
    NodeKendaraan1221 head;
    NodeKendaraan1221 tail;
    int size;

    public QueueLinkedList1221(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){
        if(!isEmpty()){
            head = tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tambahData(Kendaraan1221 input){
        NodeKendaraan1221 data = new NodeKendaraan1221(input, null);
        if(isEmpty()){
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }
    
    public void tampilkanSemua(){
        if(!isEmpty()){
            NodeKendaraan1221 tmp = head;
            System.out.println("================================");
            System.out.println("\tAntrian Kendaraan");
            System.out.println("================================");
            while (tmp != null){
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kendaraan masih kosong");
        }
    }

    public void sizeAntrian(){
        System.out.println(">> Jumlah kendaraan dalam antrian: " + size);
    }
}
