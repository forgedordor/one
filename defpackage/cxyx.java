package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyx implements fdat {
    final /* synthetic */ daka a;
    final /* synthetic */ cxyz b;

    public cxyx(daka dakaVar, cxyz cxyzVar) {
        this.a = dakaVar;
        this.b = cxyzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cxyz cxyzVar;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarD = efy.d(icoVar, 10.0f);
            daka dakaVar = this.a;
            cxyz cxyzVar2 = this.b;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
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
            jyq jyqVar = glz.d(hmlVar).f;
            cxyz cxyzVar3 = cxyzVar2;
            dthx.b("Rows by CMS Life Cycle", efy.j(icoVar, 0.0f, 10.0f, 0.0f, 10.0f, 5), glz.a(hmlVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVar, hmlVar, 6, 0, 65528);
            hml hmlVar2 = hmlVar;
            fpf.a(efy.j(icoVar, 0.0f, 0.0f, 0.0f, 10.0f, 7), 0L, 0.0f, hmlVar2, 6, 14);
            if (dakaVar instanceof dajy) {
                hmlVar2.v(-855631303);
                dthx.b("Loading", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar2, 6, 0, 131070);
                hmlVar2 = hmlVar2;
                hmlVar2.o();
            } else if (dakaVar instanceof dajx) {
                hmlVar2.v(-855629346);
                Object obj3 = ((dajx) dakaVar).a;
                Objects.toString(obj3);
                dthx.b("Database lookup failed: ".concat(obj3.toString()), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar2, 0, 0, 131070);
                hmlVar2 = hmlVar2;
                hmlVar2.o();
            } else {
                if (!(dakaVar instanceof dajz)) {
                    hmlVar2.v(-855632866);
                    hmlVar2.o();
                    throw new fctg();
                }
                hmlVar2.v(-754602036);
                cpyi[] cpyiVarArrValues = cpyi.values();
                int length = cpyiVarArrValues.length;
                int i2 = 0;
                while (i2 < length) {
                    cpyi cpyiVar = cpyiVarArrValues[i2];
                    Map map = (Map) ((dajz) dakaVar).a;
                    if (map.containsKey(cpyiVar)) {
                        hmlVar2.v(879717007);
                        Object obj4 = map.get(cpyiVar);
                        obj4.getClass();
                        cxyzVar = cxyzVar3;
                        cxyzVar.d(cpyiVar, ((Number) obj4).intValue(), hmlVar2, 0);
                        hmlVar2.o();
                    } else {
                        cxyzVar = cxyzVar3;
                        hmlVar2.v(879832885);
                        cxyzVar.d(cpyiVar, 0, hmlVar2, 48);
                        hmlVar2.o();
                    }
                    i2++;
                    cxyzVar3 = cxyzVar;
                }
                hmlVar2.o();
            }
            hmlVar2.n();
        }
        return fctx.a;
    }
}
