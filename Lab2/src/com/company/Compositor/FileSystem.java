package com.company.Compositor;

import java.io.File;
import java.io.IOException;

public interface FileSystem {
    public void ls();
    public void cat() throws IOException;
    public File getEntity();
}
