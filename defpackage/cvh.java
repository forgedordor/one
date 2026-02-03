package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cvh {
    public Object[] b;
    public int c;

    public cvh(int i) {
        this.b = i == 0 ? cvi.a : new Object[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cvh) {
            cvh cvhVar = (cvh) obj;
            int i = cvhVar.c;
            int i2 = this.c;
            if (i == i2) {
                Object[] objArr = this.b;
                Object[] objArr2 = cvhVar.b;
                fddq fddqVarR = fddu.r(0, i2);
                int i3 = fddqVarR.a;
                int i4 = fddqVarR.b;
                if (i3 > i4) {
                    return true;
                }
                while (fdbq.f(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int i = this.c;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int j(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.b;
            int i2 = this.c;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.b;
        int i3 = this.c;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object k() {
        if (o()) {
            cwh.d("ObjectList is empty.");
        }
        return this.b[0];
    }

    public final Object l(int i) {
        if (i < 0 || i >= this.c) {
            m(i);
        }
        return this.b[i];
    }

    public final void m(int i) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.c - 1);
        cwh.c(sb.toString());
    }

    public final boolean n(Object obj) {
        return j(obj) >= 0;
    }

    public final boolean o() {
        return this.c == 0;
    }

    public final boolean p() {
        return this.c != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        fdap fdapVar = new fdap() { // from class: cvg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return obj == this.a ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) fdapVar.invoke(obj));
            i2++;
        }
        return sb.toString();
    }
}
