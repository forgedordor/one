package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agat implements agaj, afzz {
    public final int a;
    public final fcxy b;
    private final afzx c;
    private final String d = "RequestedWithResultState";

    public agat(int i, afzx afzxVar, fcxy fcxyVar) {
        this.a = i;
        this.c = afzxVar;
        this.b = fcxyVar;
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
        if (!(afzuVar instanceof agah)) {
            throw new agai(afzuVar, this.d, this.c, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agat)) {
            return false;
        }
        agat agatVar = (agat) obj;
        return this.a == agatVar.a && fdbq.f(this.c, agatVar.c) && fdbq.f(this.b, agatVar.b);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RequestedWithResultState(requestId=" + this.a + ", target=" + this.c + ", continuation=" + this.b + ")";
    }
}
