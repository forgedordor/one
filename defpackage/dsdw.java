package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdw extends dseb {
    private final etht a;
    private final dsbi b;
    private final ekgp c;
    private final ekgp d;
    private final ekgp e;
    private final ekgp f;

    public dsdw(etht ethtVar, dsbi dsbiVar, ekgp ekgpVar, ekgp ekgpVar2, ekgp ekgpVar3, ekgp ekgpVar4) {
        if (ethtVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.a = ethtVar;
        if (dsbiVar == null) {
            throw new NullPointerException("Null clearcutLogContext");
        }
        this.b = dsbiVar;
        if (ekgpVar == null) {
            throw new NullPointerException("Null clearcutCounts");
        }
        this.c = ekgpVar;
        if (ekgpVar2 == null) {
            throw new NullPointerException("Null veCounts");
        }
        this.d = ekgpVar2;
        if (ekgpVar3 == null) {
            throw new NullPointerException("Null appStates");
        }
        this.e = ekgpVar3;
        if (ekgpVar4 == null) {
            throw new NullPointerException("Null permissionRequestCounts");
        }
        this.f = ekgpVar4;
    }

    @Override // defpackage.dseb
    public final dsbi a() {
        return this.b;
    }

    @Override // defpackage.dseb
    public final ekgp b() {
        return this.e;
    }

    @Override // defpackage.dseb
    public final ekgp c() {
        return this.c;
    }

    @Override // defpackage.dseb
    public final ekgp d() {
        return this.f;
    }

    @Override // defpackage.dseb
    public final ekgp e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dseb) {
            dseb dsebVar = (dseb) obj;
            dsebVar.g();
            if (this.a.equals(dsebVar.f()) && this.b.equals(dsebVar.a()) && this.c.equals(dsebVar.c()) && this.d.equals(dsebVar.e()) && this.e.equals(dsebVar.b()) && this.f.equals(dsebVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dseb
    public final etht f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        ekgp ekgpVar = this.f;
        ekgp ekgpVar2 = this.e;
        ekgp ekgpVar3 = this.d;
        ekgp ekgpVar4 = this.c;
        dsbi dsbiVar = this.b;
        return "TargetingRuleEvalContext{accountName=null, promoId=" + this.a.toString() + ", clearcutLogContext=" + dsbiVar.toString() + ", clearcutCounts=" + ekgpVar4.toString() + ", veCounts=" + ekgpVar3.toString() + ", appStates=" + ekgpVar2.toString() + ", permissionRequestCounts=" + ekgpVar.toString() + "}";
    }

    @Override // defpackage.dseb
    public final void g() {
    }
}
