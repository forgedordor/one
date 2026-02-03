package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebkt extends ebli {
    private final String g;
    private final String h;
    private final String i;
    private final ebmr j;
    private final ebln k;
    private final dhip l;
    private final ekgb m;
    private final ebkr n;

    public ebkt(String str, String str2, String str3, ebmr ebmrVar, ebln eblnVar, dhip dhipVar, ekgb ekgbVar, ebkr ebkrVar) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = ebmrVar;
        this.k = eblnVar;
        this.l = dhipVar;
        this.m = ekgbVar;
        this.n = ebkrVar;
    }

    @Override // defpackage.eblf
    public final dhip a() {
        return this.l;
    }

    @Override // defpackage.eblf
    public final ebkr b() {
        return this.n;
    }

    @Override // defpackage.eblf
    public final ebln c() {
        return this.k;
    }

    @Override // defpackage.eblf
    public final ebmr d() {
        return this.j;
    }

    @Override // defpackage.eblf
    public final ekgb e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebli) {
            ebli ebliVar = (ebli) obj;
            if (this.g.equals(ebliVar.h()) && this.h.equals(ebliVar.f()) && this.i.equals(ebliVar.g()) && this.j.equals(ebliVar.d()) && this.k.equals(ebliVar.c()) && this.l.equals(ebliVar.a()) && ekjz.h(this.m, ebliVar.e()) && this.n.equals(ebliVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eblf
    public final String f() {
        return this.h;
    }

    @Override // defpackage.eblf
    public final String g() {
        return this.i;
    }

    @Override // defpackage.eblf
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        ebkr ebkrVar = this.n;
        ekgb ekgbVar = this.m;
        dhip dhipVar = this.l;
        ebln eblnVar = this.k;
        return "SipStackImpl{user=" + this.g + ", domain=" + this.h + ", sipInstance=" + this.i + ", transportProtocol=" + String.valueOf(this.j) + ", sipTransactionLayer=" + String.valueOf(eblnVar) + ", logTag=" + String.valueOf(dhipVar) + ", messageFilters=" + String.valueOf(ekgbVar) + ", addressFactory=" + String.valueOf(ebkrVar) + "}";
    }
}
