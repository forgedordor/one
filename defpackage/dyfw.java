package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyfw implements lvz {
    final /* synthetic */ dyfx a;
    private final int b;

    public dyfw(dyfx dyfxVar, int i) {
        this.a = dyfxVar;
        this.b = i;
    }

    @Override // defpackage.lvz
    public final /* synthetic */ void a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            dyfx dyfxVar = this.a;
            int i = this.b;
            my myVar = dyfxVar.a;
            int iC = myVar.c(Integer.valueOf(i), myVar.a, myVar.c, 2);
            if (iC == -1) {
                return;
            }
            Object[] objArr = myVar.a;
            System.arraycopy(objArr, iC + 1, objArr, iC, (myVar.c - iC) - 1);
            int i2 = myVar.c - 1;
            myVar.c = i2;
            myVar.a[i2] = null;
            myVar.b.d(iC, 1);
            return;
        }
        dyfx dyfxVar2 = this.a;
        int i3 = this.b;
        my myVar2 = dyfxVar2.a;
        Integer numValueOf = Integer.valueOf(i3);
        int iC2 = myVar2.c(numValueOf, myVar2.a, myVar2.c, 1);
        if (iC2 == -1) {
            iC2 = 0;
        } else if (iC2 < myVar2.c) {
            Object obj2 = myVar2.a[iC2];
            mx mxVar = myVar2.b;
            if (mxVar.e(obj2, numValueOf)) {
                if (((Integer) obj2).equals(numValueOf)) {
                    myVar2.a[iC2] = numValueOf;
                    return;
                } else {
                    myVar2.a[iC2] = numValueOf;
                    mxVar.a(iC2, 1, null);
                    return;
                }
            }
        }
        int i4 = myVar2.c;
        if (iC2 > i4) {
            throw new IndexOutOfBoundsException("cannot add item to " + iC2 + " because size is " + myVar2.c);
        }
        int i5 = iC2 + 1;
        Object[] objArr2 = myVar2.a;
        int length = objArr2.length;
        if (i4 == length) {
            Object[] objArr3 = (Object[]) Array.newInstance((Class<?>) myVar2.d, length + 10);
            System.arraycopy(myVar2.a, 0, objArr3, 0, iC2);
            objArr3[iC2] = numValueOf;
            System.arraycopy(myVar2.a, iC2, objArr3, i5, myVar2.c - iC2);
            myVar2.a = objArr3;
        } else {
            System.arraycopy(objArr2, iC2, objArr2, i5, i4 - iC2);
            myVar2.a[iC2] = numValueOf;
        }
        myVar2.c++;
        myVar2.b.b(iC2, 1);
    }
}
