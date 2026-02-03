package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekki implements Iterator {
    int a;
    int b = -1;
    ekkn c;
    AtomicReferenceArray d;
    ekkj e;
    ekll f;
    ekll g;
    final /* synthetic */ eklm h;

    public ekki(eklm eklmVar) {
        this.h = eklmVar;
        this.a = eklmVar.d.length - 1;
        b();
    }

    final ekll a() {
        ekll ekllVar = this.f;
        if (ekllVar == null) {
            throw new NoSuchElementException();
        }
        this.g = ekllVar;
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
            eklm eklmVar = this.h;
            this.a = i - 1;
            ekkn ekknVar = eklmVar.d[i];
            this.c = ekknVar;
            if (ekknVar.b != 0) {
                this.d = this.c.e;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(ekkj ekkjVar) {
        boolean z;
        try {
            Object objC = ekkjVar.c();
            Object objD = ekkjVar.c() == null ? null : ekkjVar.d();
            if (objD != null) {
                this.f = new ekll(this.h, objC, objD);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.i();
        }
    }

    final boolean d() {
        ekkj ekkjVar = this.e;
        if (ekkjVar == null) {
            return false;
        }
        while (true) {
            this.e = ekkjVar.b();
            ekkj ekkjVar2 = this.e;
            if (ekkjVar2 == null) {
                return false;
            }
            if (c(ekkjVar2)) {
                return true;
            }
            ekkjVar = this.e;
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
            ekkj ekkjVar = (ekkj) atomicReferenceArray.get(i);
            this.e = ekkjVar;
            if (ekkjVar != null && (c(ekkjVar) || d())) {
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
        ekcw.b(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
