package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdx extends dsec {
    private final etht a;
    private final dsbi b;
    private final boolean c;

    public dsdx(etht ethtVar, dsbi dsbiVar, boolean z) {
        if (ethtVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.a = ethtVar;
        this.b = dsbiVar;
        this.c = z;
    }

    @Override // defpackage.dsec
    public final dsbi a() {
        return this.b;
    }

    @Override // defpackage.dsec
    public final etht b() {
        return this.a;
    }

    @Override // defpackage.dsec
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsec) {
            dsec dsecVar = (dsec) obj;
            dsecVar.d();
            if (this.a.equals(dsecVar.b()) && this.b.equals(dsecVar.a()) && this.c == dsecVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        dsbi dsbiVar = this.b;
        return "TriggeringConditionsEvalContext{accountName=null, promoId=" + this.a.toString() + ", clearcutLogContext=" + dsbiVar.toString() + ", hasPresentedPromos=" + this.c + "}";
    }

    @Override // defpackage.dsec
    public final void d() {
    }
}
