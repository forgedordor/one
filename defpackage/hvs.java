package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvs extends hvq implements Iterator, fdcn {
    public final hvr d;
    public int e;
    private Object f;
    private boolean g;

    public hvs(hvr hvrVar, hwh[] hwhVarArr) {
        super(hvrVar.b, hwhVarArr);
        this.d = hvrVar;
        this.e = hvrVar.d;
    }

    public final void b(int i, hwg hwgVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            hwh[] hwhVarArr = this.a;
            hwh hwhVar = hwhVarArr[i2];
            Object[] objArr = hwgVar.b;
            hwhVar.d(objArr, objArr.length, 0);
            while (!fdbq.f(hwhVarArr[i2].a(), obj)) {
                hwhVarArr[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int iA = 1 << hwk.a(i, i3);
        if (hwgVar.m(iA)) {
            int iB = hwgVar.b(iA);
            hwh hwhVar2 = this.a[i2];
            Object[] objArr2 = hwgVar.b;
            int iA2 = hwgVar.a();
            hwhVar2.d(objArr2, iA2 + iA2, iB);
            this.b = i2;
            return;
        }
        int iC = hwgVar.c(iA);
        hwg hwgVarI = hwgVar.i(iC);
        hwh hwhVar3 = this.a[i2];
        Object[] objArr3 = hwgVar.b;
        int iA3 = hwgVar.a();
        hwhVar3.d(objArr3, iA3 + iA3, iC);
        b(i, hwgVarI, obj, i2 + 1);
    }

    @Override // defpackage.hvq, java.util.Iterator
    public final Object next() {
        if (this.d.d != this.e) {
            throw new ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return super.next();
    }

    @Override // defpackage.hvq, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.c) {
            Object objA = a();
            hvr hvrVar = this.d;
            Object obj = this.f;
            fdcm.g(hvrVar);
            hvrVar.remove(obj);
            b(objA != null ? objA.hashCode() : 0, hvrVar.b, objA, 0);
        } else {
            hvr hvrVar2 = this.d;
            Object obj2 = this.f;
            fdcm.g(hvrVar2);
            hvrVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.d;
    }
}
