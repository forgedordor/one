package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyj {
    public final jxx a;
    public final jxx b;
    public final jxx c;
    public final jxx d;

    public jyj() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jyj)) {
            return false;
        }
        jyj jyjVar = (jyj) obj;
        return fdbq.f(this.a, jyjVar.a) && fdbq.f(this.b, jyjVar.b) && fdbq.f(this.c, jyjVar.c) && fdbq.f(this.d, jyjVar.d);
    }

    public final int hashCode() {
        jxx jxxVar = this.a;
        int iHashCode = jxxVar != null ? jxxVar.hashCode() : 0;
        jxx jxxVar2 = this.b;
        int iHashCode2 = jxxVar2 != null ? jxxVar2.hashCode() : 0;
        int i = iHashCode * 31;
        jxx jxxVar3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (jxxVar3 != null ? jxxVar3.hashCode() : 0)) * 31;
        jxx jxxVar4 = this.d;
        return iHashCode3 + (jxxVar4 != null ? jxxVar4.hashCode() : 0);
    }

    public jyj(jxx jxxVar, jxx jxxVar2, jxx jxxVar3, jxx jxxVar4) {
        this.a = jxxVar;
        this.b = jxxVar2;
        this.c = jxxVar3;
        this.d = jxxVar4;
    }

    public /* synthetic */ jyj(jxx jxxVar, int i) {
        this(1 == (i & 1) ? null : jxxVar, null, null, null);
    }
}
