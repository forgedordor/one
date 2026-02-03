package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agag implements agaj {
    public final int a;
    public fcxy b;
    private final afzx c;
    private final String d = "DispatchedWithResultState";

    public agag(int i, afzx afzxVar) {
        this.a = i;
        this.c = afzxVar;
    }

    @Override // defpackage.afzu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.afzu
    public final /* synthetic */ afzy b() {
        return this.c;
    }

    @Override // defpackage.agaj
    public final String c() {
        return this.d;
    }

    @Override // defpackage.agaj
    public final void d(afzu afzuVar) {
        afzuVar.getClass();
        if (afzuVar instanceof agat) {
            agat agatVar = (agat) afzuVar;
            if (agatVar.a == this.a) {
                this.b = agatVar.b;
                return;
            }
        }
        throw new agai(afzuVar, this.d, this.c, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agag)) {
            return false;
        }
        agag agagVar = (agag) obj;
        return this.a == agagVar.a && fdbq.f(this.c, agagVar.c);
    }

    public final int hashCode() {
        return (this.a * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DispatchedWithResultState(requestId=" + this.a + ", target=" + this.c + ")";
    }
}
