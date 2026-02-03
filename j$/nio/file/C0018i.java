package j$.nio.file;

import java.security.PrivilegedAction;

/* renamed from: j$.nio.file.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0018i implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                j$.nio.file.spi.d dVar = j$.adapter.c.a;
                String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
                if (property != null) {
                    for (String str : property.split(",")) {
                        try {
                            dVar = (j$.nio.file.spi.d) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.d.class).newInstance(dVar);
                            if (!dVar.l().equals("file")) {
                                throw new Error("Default provider must use scheme 'file'");
                            }
                        } catch (Exception e) {
                            throw new Error(e);
                        }
                    }
                }
                return dVar;
            case 1:
                String property2 = System.getProperty("file.encoding");
                if (property2 == null) {
                    return null;
                }
                return property2;
            case 2:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 3:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
