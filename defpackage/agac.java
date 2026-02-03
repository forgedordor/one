package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agac implements agaj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/statemachine/CompletedWithResultState");
    public final Object b;
    public fcxy c;
    private final int d;
    private final afzx e;
    private final fdjx f;
    private final String g = "CompletedWithResultState";

    public agac(Object obj, int i, afzx afzxVar, fdjx fdjxVar) {
        this.b = obj;
        this.d = i;
        this.e = afzxVar;
        this.f = fdjxVar;
    }

    @Override // defpackage.afzu
    public final int a() {
        return this.d;
    }

    @Override // defpackage.afzu
    public final /* synthetic */ afzy b() {
        return this.e;
    }

    @Override // defpackage.agaj
    public final String c() {
        return this.g;
    }

    @Override // defpackage.agaj
    public final void d(afzu afzuVar) {
        afzuVar.getClass();
        if (!(afzuVar instanceof agag) || ((agag) afzuVar).a != this.d) {
            throw new agai(afzuVar, this.g, this.e, this.d);
        }
        auvw.k(this.f, null, null, new agab(this, afzuVar, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agac)) {
            return false;
        }
        agac agacVar = (agac) obj;
        return fdbq.f(this.b, agacVar.b) && this.d == agacVar.d && fdbq.f(this.e, agacVar.e) && fdbq.f(this.f, agacVar.f);
    }

    public final int hashCode() {
        return (((((fctk.a(this.b) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CompletedWithResultState(result=" + fctk.b(this.b) + ", requestId=" + this.d + ", target=" + this.e + ", coroutineScope=" + this.f + ")";
    }
}
