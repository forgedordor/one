package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdx {
    public final eqdr a;
    public final eqcz b;
    public final int c;

    public eqdx(eqdr eqdrVar, int i, eqcz eqczVar) {
        if (i == 0) {
            throw null;
        }
        this.a = eqdrVar;
        this.c = i;
        this.b = eqczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqdx)) {
            return false;
        }
        eqdx eqdxVar = (eqdx) obj;
        return fdbq.f(this.a, eqdxVar.a) && this.c == eqdxVar.c && fdbq.f(this.b, eqdxVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupInviteLinkUpdateParameters(group=");
        sb.append(this.a);
        sb.append(", operation=");
        int i = this.c;
        sb.append((Object) (i != 3 ? i != 4 ? "DISABLE" : "REGENERATE" : "CREATE"));
        sb.append(", traceId=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
