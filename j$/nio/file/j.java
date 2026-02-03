package j$.nio.file;

import java.net.URI;
import java.security.AccessController;

/* loaded from: classes9.dex */
public abstract class j {
    public static final FileSystem a = ((j$.nio.file.spi.d) AccessController.doPrivileged(new C0018i(0))).j(URI.create("file:///"));
}
