package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class FileSystem implements Closeable {
    public abstract Set C();

    public abstract Iterable g();

    public abstract Path getPath(String str, String... strArr);

    public abstract z h(String str);

    public abstract Iterable i();

    public abstract boolean isOpen();

    public abstract String l();

    public abstract j$.nio.file.attribute.F m();

    public abstract boolean n();

    public abstract I p();

    public abstract j$.nio.file.spi.d t();
}
