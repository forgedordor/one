package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sr implements ux {
    public final sp a;
    public final zx b;
    public final ye f;
    public final List c = new ArrayList();
    public final IdentityHashMap d = new IdentityHashMap();
    public final List e = new ArrayList();
    private sq g = new sq();

    public sr(sp spVar, so soVar) {
        this.a = spVar;
        if (soVar.b) {
            this.b = new zt();
        } else {
            this.b = new zv();
        }
        this.f = new ye();
    }

    public final int a(uy uyVar) {
        uy uyVar2;
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (uyVar2 = (uy) it.next()) != uyVar) {
            i += uyVar2.d;
        }
        return i;
    }

    public final sq b(int i) {
        sq sqVar = this.g;
        if (sqVar.c) {
            sqVar = new sq();
        } else {
            sqVar.c = true;
        }
        Iterator it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uy uyVar = (uy) it.next();
            int i3 = uyVar.d;
            if (i3 > i2) {
                sqVar.a = uyVar;
                sqVar.b = i2;
                break;
            }
            i2 -= i3;
        }
        if (sqVar.a != null) {
            return sqVar;
        }
        throw new IllegalArgumentException(a.g(i, "Cannot find wrapper for "));
    }

    public final uy c(wv wvVar) {
        uy uyVar = (uy) this.d.get(wvVar);
        if (uyVar != null) {
            return uyVar;
        }
        throw new IllegalStateException(a.i(this, wvVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
    }

    public final void d() {
        int i;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            uy uyVar = (uy) it.next();
            int i2 = uyVar.b.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && uyVar.d == 0)) {
                break;
            }
        }
        sp spVar = this.a;
        if (i != spVar.c) {
            spVar.l(i);
        }
    }

    @Override // defpackage.ux
    public final void e(uy uyVar, int i, int i2, Object obj) {
        this.a.v(i + a(uyVar), i2, obj);
    }

    public final void f(sq sqVar) {
        sqVar.c = false;
        sqVar.a = null;
        sqVar.b = -1;
        this.g = sqVar;
    }
}
