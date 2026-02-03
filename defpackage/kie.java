package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kie implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object[] c;
    final /* synthetic */ hri d;

    public kie(String str, String str2, Object[] objArr, hri hriVar) {
        this.a = str;
        this.b = str2;
        this.c = objArr;
        this.d = hriVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Exception {
        egc egcVar = (egc) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egcVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            ics icsVarC = efy.c(ics.e, egcVar);
            String str = this.a;
            String str2 = this.b;
            Object[] objArr = this.c;
            hri hriVar = this.d;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            khy.a(str, str2, hmlVar, objArr[hriVar.c()]);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
