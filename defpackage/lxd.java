package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxd {
    private final lzc a = new lzc();

    public final void fA(String str, AutoCloseable autoCloseable) throws Exception {
        AutoCloseable autoCloseable2;
        lzc lzcVar = this.a;
        if (lzcVar.d) {
            lzc.a(autoCloseable);
            return;
        }
        synchronized (lzcVar.a) {
            autoCloseable2 = (AutoCloseable) lzcVar.b.put(str, autoCloseable);
        }
        lzc.a(autoCloseable2);
    }

    public final void fB() {
        lzc lzcVar = this.a;
        if (!lzcVar.d) {
            lzcVar.d = true;
            synchronized (lzcVar.a) {
                Iterator it = lzcVar.b.values().iterator();
                while (it.hasNext()) {
                    lzc.a((AutoCloseable) it.next());
                }
                Set set = lzcVar.c;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    lzc.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        fC();
    }

    public final AutoCloseable fy(String str) {
        AutoCloseable autoCloseable;
        lzc lzcVar = this.a;
        synchronized (lzcVar.a) {
            autoCloseable = (AutoCloseable) lzcVar.b.get(str);
        }
        return autoCloseable;
    }

    public final void fz(AutoCloseable autoCloseable) throws Exception {
        lzc lzcVar = this.a;
        if (lzcVar.d) {
            lzc.a(autoCloseable);
            return;
        }
        synchronized (lzcVar.a) {
            lzcVar.c.add(autoCloseable);
        }
    }

    protected void fC() {
    }
}
