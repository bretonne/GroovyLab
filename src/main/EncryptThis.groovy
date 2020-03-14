package main

class EncryptThis {
    static def encryptThis(String text) {
        String[] tokens = text.split(' ');
        String encrypted='';
        tokens.each {word -> encrypted += encryptAWord(word) + ' '};
        encrypted = encrypted.trim();
        return encrypted;
    }

    static def encryptAWord(String word) {
        String encrypted = '';
        int len = word.length();
        if (len>=1) {
            encrypted += (int) word.charAt(0);
            if (len >2 ) {
                encrypted += word.charAt(word.length() - 1);
                encrypted += word.substring(2, word.length() - 1);
                encrypted += word.charAt(1);
            }
            else if (len ==2) {
                encrypted += word.charAt(1);
            }
        }
        return encrypted;
    }
}
