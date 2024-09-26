package itstep.learning.services;

public class MdSHashService implements HashService {
    @Override
    public String hash(String string) {
        return "Md5HashService";
    }
}
