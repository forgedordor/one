package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erak extends erbr {
    public static final Set a = (Set) ergg.a(new ergf() { // from class: erae
        @Override // defpackage.ergf
        public final Object a() throws GeneralSecurityException {
            Set set = erak.a;
            HashSet hashSet = new HashSet();
            equi equiVar = new equi();
            equiVar.b();
            equiVar.c(16);
            equiVar.d();
            equj equjVar = equj.c;
            equiVar.a = equjVar;
            hashSet.add(equiVar.a());
            equi equiVar2 = new equi();
            equiVar2.b();
            equiVar2.c(32);
            equiVar2.d();
            equiVar2.a = equjVar;
            hashSet.add(equiVar2.a());
            eqtq eqtqVar = new eqtq();
            eqtqVar.b(16);
            eqtqVar.c(32);
            eqtqVar.e(16);
            eqtqVar.d(16);
            eqtr eqtrVar = eqtr.c;
            eqtqVar.a = eqtrVar;
            eqts eqtsVar = eqts.c;
            eqtqVar.b = eqtsVar;
            hashSet.add(eqtqVar.a());
            eqtq eqtqVar2 = new eqtq();
            eqtqVar2.b(32);
            eqtqVar2.c(32);
            eqtqVar2.e(32);
            eqtqVar2.d(16);
            eqtqVar2.a = eqtrVar;
            eqtqVar2.b = eqtsVar;
            hashSet.add(eqtqVar2.a());
            hashSet.add(new eqwu(eqwt.c));
            eqzi eqziVar = new eqzi();
            eqziVar.b(64);
            eqziVar.a = eqzj.c;
            hashSet.add(eqziVar.a());
            return DesugarCollections.unmodifiableSet(hashSet);
        }
    });
    public final erag b;
    public final erah c;
    public final erai d;
    public final eraj e;
    public final eqst f;
    public final erwn g;

    public erak(erag eragVar, erah erahVar, erai eraiVar, eqst eqstVar, eraj erajVar, erwn erwnVar) {
        this.b = eragVar;
        this.c = erahVar;
        this.d = eraiVar;
        this.f = eqstVar;
        this.e = erajVar;
        this.g = erwnVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.e != eraj.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erak)) {
            return false;
        }
        erak erakVar = (erak) obj;
        return Objects.equals(erakVar.b, this.b) && Objects.equals(erakVar.c, this.c) && Objects.equals(erakVar.d, this.d) && Objects.equals(erakVar.f, this.f) && Objects.equals(erakVar.e, this.e) && Objects.equals(erakVar.g, this.g);
    }

    public final int hashCode() {
        return Objects.hash(erak.class, this.b, this.c, this.d, this.f, this.e, this.g);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.b, this.c, this.d, this.f, this.e, this.g);
    }
}
