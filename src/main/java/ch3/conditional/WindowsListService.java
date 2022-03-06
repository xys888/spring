package ch3.conditional;

public class WindowsListService implements LisetService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
