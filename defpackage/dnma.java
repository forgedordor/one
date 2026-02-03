package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnma extends dnmb {
    private final dnjr b;
    private final dnjw c;
    private final dnjw d;
    private final Set e;

    public dnma(dnjr dnjrVar, dnjw dnjwVar, dnjw dnjwVar2, Set set) {
        dnjwVar.getClass();
        dnjwVar2.getClass();
        this.b = dnjrVar;
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
        dnjw dnjwVar = g() ? dnjw.c : this.c;
        dnjw dnjwVar2 = g() ? dnjw.d : this.d;
        if (dnjzVar == dnjzVar2) {
            sb.append((String) dnmb.a.get(new fcti(dnjwVar, dnjwVar2)));
            dnml dnmlVar = dnjzVar.h;
            if (dnmlVar != null) {
                sb.append(dnmlVar.a());
            }
        } else {
            h(dnjzVar, dnjzVar2, dnjwVar, dnjwVar2, sb);
        }
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
        if (!(obj instanceof dnma)) {
            return false;
        }
        dnma dnmaVar = (dnma) obj;
        return fdbq.f(this.b, dnmaVar.b) && this.c == dnmaVar.c && this.d == dnmaVar.d && fdbq.f(this.e, dnmaVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.b + ", gender1=" + this.c + ", gender2=" + this.d + ", supportedSkinTones=" + this.e + ")";
    }
}
