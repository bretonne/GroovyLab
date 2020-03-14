package test

import main.EncryptThis
import org.junit.Test

class EncryptThisTest {
    @Test
    void simpleTests() {
        assert EncryptThis.encryptThis("Hello") == "72olle"
        assert EncryptThis.encryptThis("good") == "103doo"
        assert EncryptThis.encryptThis("hello world") == "104olle 119drlo"
    }

    @Test
    void "Example Tests"() {
        assert EncryptThis.encryptThis("A wise old owl lived in an oak") == "65 119esi 111dl 111lw 108dvei 105n 97n 111ka"
        assert EncryptThis.encryptThis("The more he saw the less he spoke") == "84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp"
        assert EncryptThis.encryptThis("The less he spoke the more he heard") == "84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare"
        assert EncryptThis.encryptThis("Why can we not all be like that wise old bird") == "87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri"
        assert EncryptThis.encryptThis("Thank you Piotr for all your help") == "84kanh 121uo 80roti 102ro 97ll 121ruo 104ple"
    }
}
