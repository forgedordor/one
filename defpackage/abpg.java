package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abpg implements Closeable {
    public abstract abpm a();

    public abstract abqi b();

    public abstract abqi c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b().close();
        c().close();
        ((eiju) e().get()).cancel(false);
        Enumeration enumerationKeys = f().keys();
        while (enumerationKeys.hasMoreElements()) {
            Closeable closeable = (Closeable) enumerationKeys.nextElement();
            if (((Boolean) f().remove(closeable)) != null) {
                closeable.close();
            }
        }
    }

    public abstract abto d();

    public abstract ejxr e();

    public abstract ConcurrentHashMap f();

    public abstract boolean g();

    public final boolean h() {
        return b().e() && c().e();
    }
}
