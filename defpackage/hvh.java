package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvh extends huy implements ListIterator, fdcn {
    private final hvf c;
    private int d;
    private hvk e;
    private int f;

    public hvh(hvf hvfVar, int i) {
        super(i, hvfVar.d);
        this.c = hvfVar;
        this.d = hvfVar.b();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.b()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        hvf hvfVar = this.c;
        this.b = hvfVar.d;
        this.d = hvfVar.b();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final void f() {
        hvf hvfVar = this.c;
        Object[] objArr = hvfVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int iB = hvl.b(hvfVar.d);
        int iG = fddu.g(this.a, iB);
        int i = hvfVar.a / 5;
        hvk hvkVar = this.e;
        int i2 = i + 1;
        if (hvkVar == null) {
            this.e = new hvk(objArr, iG, iB, i2);
            return;
        }
        hvkVar.a = iG;
        hvkVar.b = iB;
        hvkVar.c = i2;
        if (hvkVar.d.length < i2) {
            hvkVar.d = new Object[i2];
        }
        hvkVar.d[0] = objArr;
        ?? r6 = iG == iB ? 1 : 0;
        hvkVar.e = r6;
        hvkVar.c(iG - r6, 1);
    }

    @Override // defpackage.huy, java.util.ListIterator
    public final void add(Object obj) {
        c();
        this.c.add(this.a, obj);
        this.a++;
        e();
    }

    @Override // defpackage.huy, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        hvk hvkVar = this.e;
        if (hvkVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i];
        }
        if (hvkVar.hasNext()) {
            this.a = i2;
            return hvkVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i - hvkVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        hvk hvkVar = this.e;
        if (hvkVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = hvkVar.b;
        if (i <= i3) {
            this.a = i2;
            return hvkVar.previous();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i2 - i3];
    }

    @Override // defpackage.huy, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.huy, java.util.ListIterator
    public final void set(Object obj) {
        c();
        d();
        hvf hvfVar = this.c;
        hvfVar.set(this.f, obj);
        this.d = hvfVar.b();
        f();
    }
}
