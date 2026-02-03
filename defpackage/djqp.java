package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqp implements djqd {
    public final dkri a;
    public final String b;
    public final fdae c;
    public final dihd d;
    public final djqp e;

    public djqp(dkri dkriVar, String str, fdae fdaeVar, dihd dihdVar) {
        fdaeVar.getClass();
        this.a = dkriVar;
        this.b = str;
        this.c = fdaeVar;
        this.d = dihdVar;
        this.e = this;
    }

    @Override // defpackage.djqd
    public final djqp a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djqp)) {
            return false;
        }
        djqp djqpVar = (djqp) obj;
        return fdbq.f(this.a, djqpVar.a) && fdbq.f(this.b, djqpVar.b) && fdbq.f(this.c, djqpVar.c) && fdbq.f(this.d, djqpVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dihd dihdVar = this.d;
        return (iHashCode * 31) + (dihdVar == null ? 0 : dihdVar.hashCode());
    }

    public final String toString() {
        return "FavoriteUiData(monogram=" + this.a + ", text=" + this.b + ", onClick=" + this.c + ", onRemove=" + this.d + ")";
    }

    public /* synthetic */ djqp(dkri dkriVar, String str, fdae fdaeVar, dihd dihdVar, int i) {
        this(dkriVar, str, (i & 4) != 0 ? new fdae() { // from class: djqo
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar, (i & 8) != 0 ? null : dihdVar);
    }
}
