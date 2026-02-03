package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnlz extends dnmb {
    private final dnjq b;
    private final dnjw c;
    private final dnjw d;
    private final Set e;

    public dnlz(dnjq dnjqVar, dnjw dnjwVar, dnjw dnjwVar2, Set set) {
        dnjwVar.getClass();
        dnjwVar2.getClass();
        this.b = dnjqVar;
        this.c = dnjwVar;
        this.d = dnjwVar2;
        this.e = set;
    }

    @Override // defpackage.dnmj
    public final /* synthetic */ dnjs a() {
        return this.b;
    }

    @Override // defpackage.dnmb
    public final dnjw b() {
        return this.c;
    }

    @Override // defpackage.dnmb
    public final dnjw c() {
        return this.d;
    }

    @Override // defpackage.dnmb
    public final dnka d(dnjz dnjzVar, dnjz dnjzVar2) {
        dnmm dnmmVar = dnmn.a;
        StringBuilder sb = dnmn.a.get();
        dnmb.h(dnjzVar, dnjzVar2, this.c, this.d, sb);
        return new dnka(sb.toString(), this.b, dnjzVar, dnjzVar2);
    }

    @Override // defpackage.dnmb
    public final Set e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnlz)) {
            return false;
        }
        dnlz dnlzVar = (dnlz) obj;
        return fdbq.f(this.b, dnlzVar.b) && this.c == dnlzVar.c && this.d == dnlzVar.d && fdbq.f(this.e, dnlzVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WithPersonComposedBase(base=" + this.b + ", gender1=" + this.c + ", gender2=" + this.d + ", supportedSkinTones=" + this.e + ")";
    }
}
