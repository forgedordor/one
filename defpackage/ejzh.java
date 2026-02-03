package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ejzh implements Iterator {
    int a;
    int b = -1;
    ejzq c;
    AtomicReferenceArray d;
    ekal e;
    ekaj f;
    ekaj g;
    final /* synthetic */ ekak h;

    public ejzh(ekak ekakVar) {
        this.h = ekakVar;
        this.a = ekakVar.f.length - 1;
        b();
    }

    final ekaj a() {
        ekaj ekajVar = this.f;
        if (ekajVar == null) {
            throw new NoSuchElementException();
        }
        this.g = ekajVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            ekak ekakVar = this.h;
            this.a = i - 1;
            ejzq ejzqVar = ekakVar.f[i];
            this.c = ejzqVar;
            if (ejzqVar.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(ekal ekalVar) {
        Object obj;
        boolean z;
        try {
            ekak ekakVar = this.h;
            long jA = ekakVar.p.a();
            Object objJ = ekalVar.j();
            Object obj2 = null;
            if (ekalVar.j() != null && (obj = ekalVar.d().get()) != null && !ekakVar.k(ekalVar, jA)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f = new ekaj(ekakVar, objJ, obj2);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.o();
        }
    }

    final boolean d() {
        ekal ekalVar = this.e;
        if (ekalVar == null) {
            return false;
        }
        while (true) {
            this.e = ekalVar.e();
            ekal ekalVar2 = this.e;
            if (ekalVar2 == null) {
                return false;
            }
            if (c(ekalVar2)) {
                return true;
            }
            ekalVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            ekal ekalVar = (ekal) atomicReferenceArray.get(i);
            this.e = ekalVar;
            if (ekalVar != null && (c(ekalVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ejwl.l(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
