package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agaa implements agaj {
    private final int a;
    private final afzv b;
    private final String c = "CompletedState";

    public agaa(int i, afzv afzvVar) {
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
        if (!(afzuVar instanceof agad) || ((agad) afzuVar).a != this.a) {
            throw new agai(afzuVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agaa)) {
            return false;
        }
        agaa agaaVar = (agaa) obj;
        return this.a == agaaVar.a && fdbq.f(this.b, agaaVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CompletedState(requestId=" + this.a + ", target=" + this.b + ")";
    }
}
