package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkt {
    public final djrr a;
    public final String b;
    public final fdae c;
    private final int d;

    public dkkt(int i, djrr djrrVar, String str, fdae fdaeVar) {
        djrrVar.getClass();
        this.d = i;
        this.a = djrrVar;
        this.b = str;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkkt)) {
            return false;
        }
        dkkt dkktVar = (dkkt) obj;
        return this.d == dkktVar.d && this.a == dkktVar.a && fdbq.f(this.b, dkktVar.b) && fdbq.f(this.c, dkktVar.c);
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionShortcutUiData(type=");
        int i = this.d;
        sb.append((Object) (i != 2 ? i != 3 ? i != 4 ? i != 5 ? "DELETE" : "FORWARD" : "STAR" : "VIDEO_CALL" : "CALENDAR"));
        sb.append(", iconUiData=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
