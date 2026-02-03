package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgu {
    public final dkkt a;
    public final dkgv b;
    public final dkkh c;
    public final boolean d;
    public final boolean e;
    public final dkly f;
    public final dirx g;
    public final dkzl h;
    public final fdap i;
    public final dkgt j;
    public final int k;

    /* JADX WARN: Multi-variable type inference failed */
    public dkgu() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkgu)) {
            return false;
        }
        dkgu dkguVar = (dkgu) obj;
        return fdbq.f(this.a, dkguVar.a) && this.b == dkguVar.b && this.c == dkguVar.c && this.d == dkguVar.d && this.e == dkguVar.e && this.k == dkguVar.k && fdbq.f(this.f, dkguVar.f) && fdbq.f(this.g, dkguVar.g) && fdbq.f(this.h, dkguVar.h) && fdbq.f(this.i, dkguVar.i) && fdbq.f(this.j, dkguVar.j);
    }

    public final int hashCode() {
        dkkt dkktVar = this.a;
        int iHashCode = ((((dkktVar == null ? 0 : dkktVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.d;
        boolean z2 = this.e;
        int i = this.k;
        dkly dklyVar = this.f;
        int iA = ((((((((iHashCode * 31) + dkgr.a(z)) * 31) + dkgr.a(z2)) * 31) + i) * 31) + (dklyVar == null ? 0 : dklyVar.hashCode())) * 31;
        dirx dirxVar = this.g;
        int iHashCode2 = (iA + (dirxVar == null ? 0 : dirxVar.hashCode())) * 31;
        dkzl dkzlVar = this.h;
        int iHashCode3 = (iHashCode2 + (dkzlVar == null ? 0 : dkzlVar.hashCode())) * 31;
        fdap fdapVar = this.i;
        return ((iHashCode3 + (fdapVar != null ? fdapVar.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageBubbleContextUiData(suggestionShortcutUiData=");
        sb.append(this.a);
        sb.append(", horizontalAlignment=");
        sb.append(this.b);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", animateShape=");
        sb.append(this.d);
        sb.append(", isExpandable=");
        sb.append(this.e);
        sb.append(", widthModifier=");
        int i = this.k;
        sb.append((Object) (i != 1 ? i != 2 ? "FILL_MAX_WIDTH" : "INTRINSIC_MIN" : "INTRINSIC_MAX"));
        sb.append(", topMetatext=");
        sb.append(this.f);
        sb.append(", badges=");
        sb.append(this.g);
        sb.append(", replySnippet=");
        sb.append(this.h);
        sb.append(", onBubbleMeasured=");
        sb.append(this.i);
        sb.append(", flags=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public dkgu(dkkt dkktVar, dkgv dkgvVar, dkkh dkkhVar, boolean z, boolean z2, int i, dkly dklyVar, dirx dirxVar, dkzl dkzlVar, fdap fdapVar, dkgt dkgtVar) {
        dkgvVar.getClass();
        dkkhVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = dkktVar;
        this.b = dkgvVar;
        this.c = dkkhVar;
        this.d = z;
        this.e = z2;
        this.k = i;
        this.f = dklyVar;
        this.g = dirxVar;
        this.h = dkzlVar;
        this.i = fdapVar;
        this.j = dkgtVar;
    }

    public /* synthetic */ dkgu(dkgv dkgvVar, dkkh dkkhVar, dirx dirxVar, int i) {
        this(null, (i & 2) != 0 ? dkgv.a : dkgvVar, (i & 4) != 0 ? dkkh.a : dkkhVar, false, (i & 16) != 0, (i & 32) != 0 ? 1 : 0, null, (i & 128) != 0 ? null : dirxVar, null, null, new dkgt(null));
    }
}
