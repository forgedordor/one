package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxn {
    private final AtomicReference a = new AtomicReference(hxo.a);
    private final Object b = new Object();
    private Object c;

    public final Object a() {
        long jA = hxr.a();
        if (jA == hxq.a) {
            return this.c;
        }
        hxp hxpVar = (hxp) this.a.get();
        int iA = hxpVar.a(jA);
        if (iA >= 0) {
            return hxpVar.c[iA];
        }
        return null;
    }

    public final void b(Object obj) {
        long jA = hxr.a();
        if (jA == hxq.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            AtomicReference atomicReference = this.a;
            hxp hxpVar = (hxp) atomicReference.get();
            int iA = hxpVar.a(jA);
            if (iA >= 0) {
                hxpVar.c[iA] = obj;
                return;
            }
            int i = hxpVar.a;
            Object[] objArr = hxpVar.c;
            int i2 = 0;
            int i3 = 0;
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    i3++;
                }
            }
            int i4 = i3 + 1;
            long[] jArr = new long[i4];
            Object[] objArr2 = new Object[i4];
            if (i4 > 1) {
                int i5 = 0;
                while (true) {
                    if (i2 >= i4 || i5 >= i) {
                        break;
                    }
                    long j = hxpVar.b[i5];
                    Object obj3 = objArr[i5];
                    if (j > jA) {
                        jArr[i2] = jA;
                        objArr2[i2] = obj;
                        i2++;
                        break;
                    } else {
                        if (obj3 != null) {
                            jArr[i2] = j;
                            objArr2[i2] = obj3;
                            i2++;
                        }
                        i5++;
                    }
                }
                if (i5 == i) {
                    jArr[i3] = jA;
                    objArr2[i3] = obj;
                } else {
                    while (i2 < i4) {
                        long j2 = hxpVar.b[i5];
                        Object obj4 = objArr[i5];
                        if (obj4 != null) {
                            jArr[i2] = j2;
                            objArr2[i2] = obj4;
                            i2++;
                        }
                        i5++;
                    }
                }
            } else {
                jArr[0] = jA;
                objArr2[0] = obj;
            }
            atomicReference.set(new hxp(i4, jArr, objArr2));
        }
    }
}
