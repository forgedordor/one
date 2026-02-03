package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbaj {
    public static final bbaj a;
    public static final bbaj b;
    public static final bbaj c;
    public final long d;
    public final long e;

    static {
        bbaj bbajVar = new bbaj(0L, 0L);
        a = bbajVar;
        bbaj bbajVar2 = new bbaj(-1L, -1L);
        b = bbajVar2;
        bbaj bbajVar3 = new bbaj(-2L, -2L);
        c = bbajVar3;
        fcva.g(bbajVar, bbajVar2, bbajVar3);
    }

    public bbaj(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbaj)) {
            return false;
        }
        bbaj bbajVar = (bbaj) obj;
        return this.d == bbajVar.d && this.e == bbajVar.e;
    }

    public final int hashCode() {
        return (bbai.a(this.d) * 31) + bbai.a(this.e);
    }

    public final String toString() {
        return "ModifiedByKey(amVersionCode=" + this.d + ", stackTraceHash=" + this.e + ")";
    }
}
