package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbb {
    public final String a;
    public final String b;

    static {
        mgb.O(0);
        mgb.O(1);
    }

    public mbb(String str, String str2) {
        this.a = mgb.Q(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mbb mbbVar = (mbb) obj;
            if (Objects.equals(this.a, mbbVar.a) && Objects.equals(this.b, mbbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
