class Kata2 {
    static def spinWords(sentence) {
        String[] words = sentence.split(' ')
        String result = ''
        words.each{ word ->
            if (word.length()>5)
                result += word.reverse()
            else
                result += word
            result += ' '
        }
        result.trim()
    }
}
