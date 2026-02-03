package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxl implements Closeable {
    public final Map a;
    public final int b;
    public final int c;
    private int d;

    public euxl(euxm euxmVar, int i, int i2) {
        HashMap map = new HashMap();
        this.a = map;
        map.put(euxmVar.a(), euxmVar);
        this.b = i;
        this.c = i2;
        this.d = 1;
    }

    public final euxm a() {
        return (euxm) this.a.values().iterator().next();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((euxm) it.next()).b();
            }
        }
    }
}
