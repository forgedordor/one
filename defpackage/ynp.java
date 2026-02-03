package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynp implements ykp {
    public final ajlt a;
    public final amvp b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final dkpc f;
    private final boolean g;

    public ynp(ajlt ajltVar, amvp amvpVar, boolean z, String str, boolean z2, boolean z3, dkpc dkpcVar) {
        this.a = ajltVar;
        this.b = amvpVar;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.g = z3;
        this.f = dkpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynp)) {
            return false;
        }
        ynp ynpVar = (ynp) obj;
        return fdbq.f(this.a, ynpVar.a) && fdbq.f(this.b, ynpVar.b) && this.c == ynpVar.c && fdbq.f(this.d, ynpVar.d) && this.e == ynpVar.e && this.g == ynpVar.g && fdbq.f(this.f, ynpVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + yno.a(this.c)) * 31) + this.d.hashCode();
        dkpc dkpcVar = this.f;
        return (((((iHashCode * 31) + yno.a(this.e)) * 31) + yno.a(this.g)) * 31) + (dkpcVar == null ? 0 : dkpcVar.hashCode());
    }

    public final String toString() {
        return "FileBubbleArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ", enableSwipeToShowTimestamps=" + this.e + ", isOutgoing=" + this.g + ", statusUiData=" + this.f + ")";
    }
}
