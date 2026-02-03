package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agaq implements agaj, afzz {
    public final int a;
    private final afzv b;
    private final String c = "RequestedState";

    public agaq(int i, afzv afzvVar) {
        this.a = i;
        this.b = afzvVar;
    }

    @Override // defpackage.afzu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.afzu
    public final /* synthetic */ afzy b() {
        return this.b;
    }

    @Override // defpackage.agaj
    public final String c() {
        return this.c;
    }

    @Override // defpackage.agaj
    public final void d(afzu afzuVar) {
        afzuVar.getClass();
        if (!(afzuVar instanceof agah)) {
            throw new agai(afzuVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agaq)) {
            return false;
        }
        agaq agaqVar = (agaq) obj;
        return this.a == agaqVar.a && fdbq.f(this.b, agaqVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RequestedState(requestId=" + this.a + ", target=" + this.b + ")";
    }
}
