package main

class Pyramid {
    static Integer[][] pyramid(Integer n) {
        def numbers = []
        if (n>0) {
            for (int i=0; i<n; i++) {
                def layer = [];
                for (int j=0; j<=i; j++){
                    layer.add(1);
                }
                numbers.add(layer);
            }
        }
        return numbers
    }
}
