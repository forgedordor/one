package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvq implements Iterator, fdcn {
    public final hwh[] a;
    public int b;
    public boolean c = true;

    public hvq(hwg hwgVar, hwh[] hwhVarArr) {
        this.a = hwhVarArr;
        hwh hwhVar = hwhVarArr[0];
        Object[] objArr = hwgVar.b;
        int iA = hwgVar.a();
        hwhVar.c(objArr, iA + iA);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        hwh[] hwhVarArr = this.a;
        if (hwhVarArr[i].e()) {
            return i;
        }
        if (!hwhVarArr[i].f()) {
            return -1;
        }
        hwh hwhVar = hwhVarArr[i];
        hwhVar.f();
        Object obj = hwhVar.a[hwhVar.b];
        obj.getClass();
        hwg hwgVar = (hwg) obj;
        if (i == 6) {
            hwh hwhVar2 = hwhVarArr[7];
            Object[] objArr = hwgVar.b;
            hwhVar2.c(objArr, objArr.length);
        } else {
            hwh hwhVar3 = hwhVarArr[i + 1];
            Object[] objArr2 = hwgVar.b;
            int iA = hwgVar.a();
            hwhVar3.c(objArr2, iA + iA);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        hwh[] hwhVarArr = this.a;
        if (hwhVarArr[this.b].e()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iB = b(i);
            if (iB == -1) {
                if (hwhVarArr[i].f()) {
                    hwhVarArr[i].b();
                    iB = b(i);
                } else {
                    iB = -1;
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                hwhVarArr[i - 1].b();
            }
            hwhVarArr[i].c(hwg.a.b, 0);
        }
        this.c = false;
    }

    protected final Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        c();
        Object next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
