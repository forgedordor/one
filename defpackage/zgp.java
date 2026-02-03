package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgp implements ykp {
    public final ajlt a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final amvy e;
    public final boolean f;
    public final String g;
    private final boolean h;

    public zgp(ajlt ajltVar, boolean z, boolean z2, boolean z3, boolean z4, amvy amvyVar, boolean z5, String str) {
        this.a = ajltVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.h = z4;
        this.e = amvyVar;
        this.f = z5;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgp)) {
            return false;
        }
        zgp zgpVar = (zgp) obj;
        return fdbq.f(this.a, zgpVar.a) && this.b == zgpVar.b && this.c == zgpVar.c && this.d == zgpVar.d && this.h == zgpVar.h && fdbq.f(this.e, zgpVar.e) && this.f == zgpVar.f && fdbq.f(this.g, zgpVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        amvy amvyVar = this.e;
        boolean z = this.h;
        boolean z2 = this.d;
        return ((((((((((((iHashCode + zgo.a(this.b)) * 31) + zgo.a(this.c)) * 31) + zgo.a(z2)) * 31) + zgo.a(z)) * 31) + amvyVar.hashCode()) * 31) + zgo.a(this.f)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "VideoBubbleArgs(message=" + this.a + ", isOutgoing=" + this.b + ", isGroupConversation=" + this.c + ", isSpatulaSettingsEnabled=" + this.d + ", enableSwipeToShowTimestamps=" + this.h + ", content=" + this.e + ", isHighlighted=" + this.f + ", contentDescription=" + this.g + ")";
    }
}
