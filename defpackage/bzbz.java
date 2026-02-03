package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzbz implements Serializable {
    public final String a;
    public final bzch b;
    public final int c;

    public bzbz(String str, int i, bzch bzchVar) {
        str.getClass();
        this.a = str;
        this.c = i;
        this.b = bzchVar;
    }

    public static /* synthetic */ bzbz a(bzbz bzbzVar, String str, bzch bzchVar, int i) {
        if ((i & 1) != 0) {
            str = bzbzVar.a;
        }
        int i2 = (i & 2) != 0 ? bzbzVar.c : 0;
        if ((i & 4) != 0) {
            bzchVar = bzbzVar.b;
        }
        str.getClass();
        if (i2 == 0) {
            throw null;
        }
        bzchVar.getClass();
        return new bzbz(str, i2, bzchVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzbz)) {
            return false;
        }
        bzbz bzbzVar = (bzbz) obj;
        return fdbq.f(this.a, bzbzVar.a) && this.c == bzbzVar.c && fdbq.f(this.b, bzbzVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CmsHandlerLoggingContext(bugleRowId=" + this.a + ", backupType=" + ((Object) cpxz.a(this.c)) + ", workHandlerContext=" + this.b + ")";
    }
}
