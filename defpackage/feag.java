package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feag {
    public final fdhz a;
    public final fdhx b;
    public final fdhx c;
    public final fdhx d;
    private final AtomicReferenceArray e = new AtomicReferenceArray(128);

    public feag() {
        fdia fdiaVar = fdia.a;
        this.a = new fdhz(null, fdiaVar);
        this.b = new fdhx(0, fdiaVar);
        this.c = new fdhx(0, fdiaVar);
        this.d = new fdhx(0, fdiaVar);
    }

    public final int a() {
        return this.b.c - this.c.c;
    }

    public final feac b(feac feacVar) {
        if (a() == 127) {
            return feacVar;
        }
        if (feacVar.h) {
            this.d.b();
        }
        fdhx fdhxVar = this.b;
        int i = 127 & fdhxVar.c;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, feacVar);
                fdhxVar.b();
                return null;
            }
            Thread.yield();
        }
    }

    public final feac c() {
        feac feacVar;
        while (true) {
            fdhx fdhxVar = this.c;
            fdhx fdhxVar2 = this.b;
            int i = fdhxVar.c;
            if (i - fdhxVar2.c == 0) {
                return null;
            }
            int i2 = i & 127;
            if (fdhxVar.c(i, i + 1) && (feacVar = (feac) this.e.getAndSet(i2, null)) != null) {
                if (feacVar.h) {
                    this.d.a();
                    boolean z = fdkb.a;
                }
                return feacVar;
            }
        }
    }

    public final feac d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        int i2 = i & 127;
        feac feacVar = (feac) atomicReferenceArray.get(i2);
        if (feacVar != null && feacVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, feacVar, null)) {
                if (atomicReferenceArray.get(i2) != feacVar) {
                }
            }
            if (z) {
                this.d.a();
            }
            return feacVar;
        }
        return null;
    }
}
