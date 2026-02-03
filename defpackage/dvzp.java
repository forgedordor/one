package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzp extends dvyz {
    public final dwpx a;
    public final dwaw b;

    public dvzp(dwpx dwpxVar, dwaw dwawVar) {
        this.a = dwpxVar;
        this.b = dwawVar;
    }

    @Override // defpackage.dvyz
    public final dwaw a() {
        return this.b;
    }

    @Override // defpackage.dvyz
    public final dwpx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvyz) {
            dvyz dvyzVar = (dvyz) obj;
            if (this.a.equals(dvyzVar.b()) && this.b.equals(dvyzVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dwaw dwawVar = this.b;
        return "AddKickGroupUsers{conversationId=" + this.a.toString() + ", groupInfoChanges=" + dwawVar.toString() + "}";
    }
}
