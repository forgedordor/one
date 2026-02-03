package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekrm extends ekte {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(ekrz ekrzVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(ekrzVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ekte
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ekte
    public final ekrz c(int i) {
        if (i < this.b) {
            return (ekrz) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ekte
    public final Object d(ekrz ekrzVar) {
        int iA = a(ekrzVar);
        if (iA != -1) {
            return ekrzVar.c(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.ekte
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(ekrz ekrzVar, Object obj) {
        int iA;
        if (!ekrzVar.b && (iA = a(ekrzVar)) != -1) {
            obj.getClass();
            this.a[iA + iA + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        ekrzVar.getClass();
        objArr2[i3] = ekrzVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
