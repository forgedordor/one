package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrd {
    private final fbra a;
    private final Object b;
    private volatile byte[] c;

    public fbrd(fbra fbraVar, Object obj) {
        this.a = fbraVar;
        this.b = obj;
    }

    public static fbra a(fbrb fbrbVar) {
        Object obj = fbrbVar.c;
        return (fbra) (fbra.class.isInstance(obj) ? fbra.class.cast(obj) : null);
    }

    public final InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = fbrg.l(b());
                }
            }
        }
        return this.c;
    }
}
