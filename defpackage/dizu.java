package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizu {
    public final String a;
    public final dkpi b;
    public final boolean c;
    public final fdae d;
    public final dizv e;
    public final int f;
    private final boolean g = false;

    public dizu(String str, dkpi dkpiVar, boolean z, int i, fdae fdaeVar, dizv dizvVar) {
        this.a = str;
        this.b = dkpiVar;
        this.c = z;
        this.f = i;
        this.d = fdaeVar;
        this.e = dizvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dizu)) {
            return false;
        }
        dizu dizuVar = (dizu) obj;
        if (!fdbq.f(this.a, dizuVar.a) || !fdbq.f(this.b, dizuVar.b) || this.c != dizuVar.c) {
            return false;
        }
        boolean z = dizuVar.g;
        return this.f == dizuVar.f && fdbq.f(this.d, dizuVar.d) && fdbq.f(this.e, dizuVar.e);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + dizt.a(this.c)) * 31) + dizt.a(false)) * 31) + this.f) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipUiData(text=");
        sb.append(this.a);
        sb.append(", monogram=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(", selected=false, style=");
        sb.append((Object) (this.f != 1 ? "RICH" : "DEFAULT"));
        sb.append(", onCloseClick=");
        sb.append(this.d);
        sb.append(", flags=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
