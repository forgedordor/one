package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebkv extends eblk {
    private final String f;
    private final String g;
    private final String h;
    private final ebmr i;
    private final ebln j;
    private final dhip k;
    private final ekgb l;
    private final ebkr m;

    public ebkv(String str, String str2, String str3, ebmr ebmrVar, ebln eblnVar, dhip dhipVar, ekgb ekgbVar, ebkr ebkrVar) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = ebmrVar;
        this.j = eblnVar;
        this.k = dhipVar;
        this.l = ekgbVar;
        this.m = ebkrVar;
    }

    @Override // defpackage.eblf
    public final dhip a() {
        return this.k;
    }

    @Override // defpackage.eblf
    public final ebkr b() {
        return this.m;
    }

    @Override // defpackage.eblf
    public final ebln c() {
        return this.j;
    }

    @Override // defpackage.eblf
    public final ebmr d() {
        return this.i;
    }

    @Override // defpackage.eblf
    public final ekgb e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eblk) {
            eblk eblkVar = (eblk) obj;
            if (this.f.equals(eblkVar.h()) && this.g.equals(eblkVar.f()) && this.h.equals(eblkVar.g()) && this.i.equals(eblkVar.d()) && this.j.equals(eblkVar.c()) && this.k.equals(eblkVar.a()) && ekjz.h(this.l, eblkVar.e()) && this.m.equals(eblkVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eblf
    public final String f() {
        return this.g;
    }

    @Override // defpackage.eblf
    public final String g() {
        return this.h;
    }

    @Override // defpackage.eblf
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        ebkr ebkrVar = this.m;
        ekgb ekgbVar = this.l;
        dhip dhipVar = this.k;
        ebln eblnVar = this.j;
        return "SipStackStub{user=" + this.f + ", domain=" + this.g + ", sipInstance=" + this.h + ", transportProtocol=" + String.valueOf(this.i) + ", sipTransactionLayer=" + String.valueOf(eblnVar) + ", logTag=" + String.valueOf(dhipVar) + ", messageFilters=" + String.valueOf(ekgbVar) + ", addressFactory=" + String.valueOf(ebkrVar) + "}";
    }
}
