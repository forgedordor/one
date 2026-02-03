package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class waf {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public waf(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waf)) {
            return false;
        }
        waf wafVar = (waf) obj;
        return this.a == wafVar.a && this.b == wafVar.b && this.c == wafVar.c;
    }

    public final int hashCode() {
        return (((wae.a(this.a) * 31) + wae.a(this.b)) * 31) + wae.a(this.c);
    }

    public final String toString() {
        return "TransportDraftData(hasSubject=" + this.a + ", isUrgent=" + this.b + ", hasAttachments=" + this.c + ")";
    }
}
