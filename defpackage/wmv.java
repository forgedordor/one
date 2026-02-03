package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmv {
    public static final wmu a = new wmu();
    public final doin b;
    public final doht c;
    public final Long d;
    public final boolean e;

    public wmv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmv)) {
            return false;
        }
        wmv wmvVar = (wmv) obj;
        return this.b == wmvVar.b && fdbq.f(this.c, wmvVar.c) && fdbq.f(this.d, wmvVar.d) && this.e == wmvVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        Long l = this.d;
        return (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ConvertOptions(quality=" + this.b + ", capabilities=" + this.c + ", maxAttachmentSizeBytes=" + this.d + ", download=" + this.e + ")";
    }

    public wmv(wnn wnnVar, boolean z) {
        this(wnnVar.a, wnnVar.b, wnnVar.c, z);
    }

    public wmv(doin doinVar, doht dohtVar, Long l, boolean z) {
        doinVar.getClass();
        this.b = doinVar;
        this.c = dohtVar;
        this.d = l;
        this.e = z;
    }

    public /* synthetic */ wmv(byte[] bArr) {
        this(doin.d, new doht(null, 7), null, false);
    }
}
