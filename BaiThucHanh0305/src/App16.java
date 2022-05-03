public static void main(String[]) args {

    //khai báo 1 ArrayList có tên là arrListString

    //có kiểu String

    ArrayList<String> arrayListString = new ArrayLisst<>();



    //thêm các phần tử sử dụng phương pháp add()

    arrayListString.add("JAVA");

    arrayListString.add("PHP");

    arrayListString.add("C#");

    arrayListString.add("C++");



    // duyệt theo kích thước của arrListString

    // sử dụng vòng lặp for thông thường

    // phương thức arrListString.size() sẽ trả về số phần tử của arrListString

    // và sau đó lấy phần tử tại vị  trí i trong hàm get()

    //sau đó hiển thị phần tử đó ra

    System.out.println(" Các phần tử trong arrListString là: ");

    for (int i = 0;i<arrListString.size();i++) {

        System.out.print(arrListString.get(i)+"\t");

    }

}