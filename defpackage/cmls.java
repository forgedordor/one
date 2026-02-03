package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmls {
    public final fcsu a;
    private final cmlb b;

    public cmls(fcsu fcsuVar, fcsu fcsuVar2, cmlb cmlbVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cmlbVar.getClass();
        this.a = fcsuVar2;
        this.b = cmlbVar;
    }

    public final enpl a(dggn dggnVar) {
        String str;
        String str2 = dggo.a(dggnVar).a;
        cmlb cmlbVar = this.b;
        cmmh cmmhVar = (cmmh) cmlbVar.j(dggnVar).orElse(cmmh.a);
        cmmb cmmbVarA = cmlbVar.a();
        enpk enpkVar = (enpk) enpl.a.createBuilder();
        enpkVar.getClass();
        if (cmmhVar == null || (str = cmmhVar.p) == null) {
            str = "";
        }
        enpm.e(str, enpkVar);
        enpm.b(cmmbVarA.c.equals(str2), enpkVar);
        enpm.d(cmmbVarA.d.equals(str2), enpkVar);
        enpm.c(cmmbVarA.e.equals(str2), enpkVar);
        return enpm.a(enpkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ensj r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmls.b(ensj, fcxy):java.lang.Object");
    }

    public final void c(Set set, eoaz eoazVar, Set set2) {
        eoazVar.getClass();
        eoax eoaxVar = (eoax) eoba.a.createBuilder();
        eoaxVar.getClass();
        eoaxVar.copyOnWrite();
        eoba eobaVar = (eoba) eoaxVar.instance;
        eobaVar.c = eoazVar.a();
        eobaVar.b |= 1;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cmmh cmmhVar = (cmmh) it.next();
            ensk enskVar = (ensk) ensl.a.createBuilder();
            enskVar.getClass();
            int i = cmmhVar.d;
            enskVar.copyOnWrite();
            ensl enslVar = (ensl) enskVar.instance;
            enslVar.b |= 1;
            enslVar.c = i;
            int i2 = cmmhVar.e;
            enskVar.copyOnWrite();
            ensl enslVar2 = (ensl) enskVar.instance;
            enslVar2.b |= 2;
            enslVar2.d = i2;
            String str = cmmhVar.h;
            str.getClass();
            enskVar.copyOnWrite();
            ensl enslVar3 = (ensl) enskVar.instance;
            enslVar3.b |= 4;
            enslVar3.e = str;
            String str2 = cmmhVar.j;
            str2.getClass();
            String strAa = fdgn.aa(str2, 5);
            enskVar.copyOnWrite();
            ensl enslVar4 = (ensl) enskVar.instance;
            enslVar4.b |= 16;
            enslVar4.f = strAa;
            String str3 = cmmhVar.k;
            str3.getClass();
            enskVar.copyOnWrite();
            ensl enslVar5 = (ensl) enskVar.instance;
            enslVar5.b |= 32;
            enslVar5.g = str3;
            String str4 = cmmhVar.l;
            str4.getClass();
            enskVar.copyOnWrite();
            ensl enslVar6 = (ensl) enskVar.instance;
            enslVar6.b |= 64;
            enslVar6.h = str4;
            int i3 = cmmhVar.m;
            enskVar.copyOnWrite();
            ensl enslVar7 = (ensl) enskVar.instance;
            enslVar7.b |= 128;
            enslVar7.i = i3;
            boolean z = cmmhVar.o;
            enskVar.copyOnWrite();
            ensl enslVar8 = (ensl) enskVar.instance;
            enslVar8.b |= 256;
            enslVar8.j = z;
            String str5 = cmmhVar.p;
            str5.getClass();
            String strAa2 = fdgn.aa(str5, 5);
            enskVar.copyOnWrite();
            ensl enslVar9 = (ensl) enskVar.instance;
            enslVar9.b |= 512;
            enslVar9.k = strAa2;
            String str6 = cmmhVar.r;
            str6.getClass();
            enskVar.copyOnWrite();
            ensl enslVar10 = (ensl) enskVar.instance;
            enslVar10.b |= 1024;
            enslVar10.l = str6;
            String str7 = cmmhVar.s;
            str7.getClass();
            enskVar.copyOnWrite();
            ensl enslVar11 = (ensl) enskVar.instance;
            enslVar11.b |= 2048;
            enslVar11.m = str7;
            String str8 = cmmhVar.t;
            str8.getClass();
            enskVar.copyOnWrite();
            ensl enslVar12 = (ensl) enskVar.instance;
            enslVar12.b |= 4096;
            enslVar12.n = str8;
            String str9 = cmmhVar.u;
            str9.getClass();
            enskVar.copyOnWrite();
            ensl enslVar13 = (ensl) enskVar.instance;
            enslVar13.b |= 8192;
            enslVar13.o = str9;
            evsn evsnVarBuild = enskVar.build();
            evsnVarBuild.getClass();
            ensl enslVar14 = (ensl) evsnVarBuild;
            eoaxVar.copyOnWrite();
            eoba eobaVar2 = (eoba) eoaxVar.instance;
            evtg evtgVar = eobaVar2.d;
            if (!evtgVar.c()) {
                eobaVar2.d = evsn.mutableCopy(evtgVar);
            }
            eobaVar2.d.add(enslVar14);
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            eoay eoayVar = (eoay) it2.next();
            eoaxVar.copyOnWrite();
            eoba eobaVar3 = (eoba) eoaxVar.instance;
            eoayVar.getClass();
            evsx evsxVar = eobaVar3.e;
            if (!evsxVar.c()) {
                eobaVar3.e = evsn.mutableCopy(evsxVar);
            }
            eobaVar3.e.h(eoayVar.a());
        }
        eoas eoasVar = (eoas) eoat.a.createBuilder();
        eoasVar.getClass();
        eoau.b(8, eoasVar);
        evsn evsnVarBuild2 = eoaxVar.build();
        evsnVarBuild2.getClass();
        eoasVar.copyOnWrite();
        eoat eoatVar = (eoat) eoasVar.instance;
        eoatVar.f = (eoba) evsnVarBuild2;
        eoatVar.b |= 256;
        eoat eoatVarA = eoau.a(eoasVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.SIM_STATE_TRACKER_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.bB = eoatVarA;
        ellhVar2.g |= 8192;
        ((aimb) this.a.b()).a().h(ellgVar, aioj.LOG_SPEC_SIM_SUBSCRIPTION_INFOS_UPDATE_EVENT);
    }
}
