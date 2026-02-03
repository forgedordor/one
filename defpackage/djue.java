package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djue {
    public final djrr a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final fdae f;

    public /* synthetic */ djue(djrr djrrVar, String str, String str2, boolean z, boolean z2, int i) {
        djrrVar.getClass();
        str.getClass();
        this.a = djrrVar;
        this.b = str;
        this.c = (i & 4) != 0 ? null : str2;
        this.d = ((i & 8) == 0) & z;
        this.e = ((i & 16) == 0) & z2;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djue)) {
            return false;
        }
        djue djueVar = (djue) obj;
        if (this.a != djueVar.a || !fdbq.f(this.b, djueVar.b) || !fdbq.f(this.c, djueVar.c) || this.d != djueVar.d || this.e != djueVar.e) {
            return false;
        }
        fdae fdaeVar = djueVar.f;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return ((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + djud.a(this.d)) * 31) + djud.a(this.e)) * 31;
    }

    public final String toString() {
        return "InfoBubbleUiData(icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", isIconHighlighted=" + this.d + ", isBackgroundTransparent=" + this.e + ", onClick=null)";
    }
}
