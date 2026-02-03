package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwg extends fdbr implements fdat {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwg(List list) {
        super(2);
        this.a = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                fdat fdatVar = (fdat) list.get(i);
                long jB = hmg.b(hmlVar);
                long j = jB ^ (jB >>> 32);
                fdae fdaeVar = jbb.b;
                hmlVar.M();
                hmlVar.x();
                if (hmlVar.H()) {
                    hmlVar.j(fdaeVar);
                } else {
                    hmlVar.z();
                }
                int i2 = (int) j;
                fdat fdatVar2 = jbb.f;
                if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                    Integer numValueOf = Integer.valueOf(i2);
                    hmlVar.y(numValueOf);
                    hmlVar.h(numValueOf, fdatVar2);
                }
                fdatVar.a(hmlVar, 0);
                hmlVar.n();
            }
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
