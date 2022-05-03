public static void main(String[]) args {

    //khai báo 1 ArrayList có tên là arrListString

    //có kiểu String

    ArrayList<Integer> arrayListInteger = new ArrayLisst<>();



    //thêm các phần tử sử dụng phương pháp add()

    arrayListInteger.add("0");

    arrayListINteger.add("7");

    arrayListInteger.add("1");

    arrayListInteger.add("9");



    // duyệt theo kích thước của arrListInteger

    // sử dụng vòng lặp for theo đối tượng

    // trong các kiểu dữ liệu của biến number

    // phải trùng với kiểu dữ liệu của arrListInteger

    System.out.println("Các phần tử trong arrListInteger là: ");

    for (int number : arrListInteger) {

        System.out.print(number +"\t");

         }

    }