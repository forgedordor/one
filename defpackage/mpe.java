package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpe {
    public final String a;
    public final mau b;
    public final mau c;
    public final int d;
    public final int e;

    public mpe(String str, mau mauVar, mau mauVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        mee.a(z);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        this.b = mauVar;
        mee.f(mauVar2);
        this.c = mauVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mpe mpeVar = (mpe) obj;
            if (this.d == mpeVar.d && this.e == mpeVar.e && this.a.equals(mpeVar.a) && this.b.equals(mpeVar.b) && this.c.equals(mpeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
