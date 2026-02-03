package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffaa {
    public static final ffaa a = new ffaa(new fezy(new fezq(String.valueOf(fezr.e).concat(" TaskRunner"), true)));
    public static final Logger b;
    public boolean c;
    public long d;
    public final fezy h;
    private int i = 10000;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Runnable g = new fezz(this);

    static {
        Logger logger = Logger.getLogger(ffaa.class.getName());
        logger.getClass();
        b = logger;
    }

    public ffaa(fezy fezyVar) {
        this.h = fezyVar;
    }

    public final fezx a() {
        int i;
        synchronized (this) {
            i = this.i;
            this.i = i + 1;
        }
        return new fezx(this, a.g(i, "Q"));
    }

    public final void b(fezu fezuVar, long j) {
        byte[] bArr = fezr.a;
        fezx fezxVar = fezuVar.b;
        fezxVar.getClass();
        if (fezxVar.d != fezuVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = fezxVar.f;
        fezxVar.f = false;
        fezxVar.d = null;
        this.e.remove(fezxVar);
        if (j != -1 && !z && !fezxVar.c) {
            fezxVar.d(fezuVar, j, true);
        }
        if (fezxVar.e.isEmpty()) {
            return;
        }
        this.f.add(fezxVar);
    }

    public final void c(fezx fezxVar) {
        byte[] bArr = fezr.a;
        if (fezxVar.d == null) {
            if (fezxVar.e.isEmpty()) {
                this.f.remove(fezxVar);
            } else {
                List list = this.f;
                if (!list.contains(fezxVar)) {
                    list.add(fezxVar);
                }
            }
        }
        if (this.c) {
            notify();
        } else {
            this.h.a(this.g);
        }
    }
}
