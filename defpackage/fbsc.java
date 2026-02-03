package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbsc implements fbsf {
    private final Object[] a;
    private final Object[] b;

    public fbsc(Object[] objArr, Object[] objArr2) {
        this.a = objArr;
        this.b = objArr2;
    }

    @Override // defpackage.fbsf
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.fbsf
    public final fbsf b(Object obj, Object obj2, int i, int i2) {
        int length;
        Object[] objArr = this.a;
        int i3 = 0;
        int iHashCode = objArr[0].hashCode();
        if (iHashCode != i) {
            return fbsd.d(new fbse(obj, obj2), i, this, iHashCode, i2);
        }
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (objArr[i3] == obj) {
                break;
            }
            i3++;
        }
        if (i3 != -1) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Object[] objArrCopyOf2 = Arrays.copyOf(this.b, length);
            objArrCopyOf[i3] = obj;
            objArrCopyOf2[i3] = obj2;
            return new fbsc(objArrCopyOf, objArrCopyOf2);
        }
        int i4 = length + 1;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf3 = Arrays.copyOf(objArr, i4);
        Object[] objArrCopyOf4 = Arrays.copyOf(objArr2, i4);
        objArrCopyOf3[length] = obj;
        objArrCopyOf4[length] = obj2;
        return new fbsc(objArrCopyOf3, objArrCopyOf4);
    }

    @Override // defpackage.fbsf
    public final Object c(Object obj, int i, int i2) {
        int i3 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return this.b[i3];
            }
            i3++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                sb.append(")");
                return sb.toString();
            }
            sb.append("(key=");
            sb.append(this.a[i]);
            sb.append(" value=");
            sb.append(objArr[i]);
            sb.append(") ");
            i++;
        }
    }
}
