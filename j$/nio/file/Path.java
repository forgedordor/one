package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes9.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    H D(I i, F... fArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    H g(I i, F[] fArr, G... gArr);

    Path getFileName();

    FileSystem getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    Path h(Path path);

    Path i(k... kVarArr);

    boolean isAbsolute();

    Iterator iterator();

    int l(Path path);

    boolean m(Path path);

    boolean n(Path path);

    Path normalize();

    Path p(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path t(Path path);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();
}
