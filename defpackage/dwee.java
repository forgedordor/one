package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwee {
    public static dwpx a(dwje dwjeVar, eyph eyphVar) {
        dwpk dwpkVarF = dwjeVar.c().f();
        int i = eyphVar.d;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c == 0 || c != 4) {
            List listG = ekjz.g((eyphVar.b == 101 ? (eyqf) eyphVar.c : eyqf.a).b, new ejvr() { // from class: dwed
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return dweg.a((eypt) obj);
                }
            });
            dwir dwirVar = new dwir();
            dwirVar.e((dwpk) ekis.g(listG, new ejwq(new ejwp(dwpkVarF))));
            dwirVar.c(dwjeVar.c().f());
            return dwirVar.a();
        }
        dwir dwirVar2 = new dwir();
        dwit dwitVar = new dwit();
        dwitVar.c((eyphVar.b == 103 ? (eypb) eyphVar.c : eypb.a).b);
        dwitVar.b((eyphVar.b == 103 ? (eypb) eyphVar.c : eypb.a).c);
        dwirVar2.d(dwitVar.a());
        dwirVar2.c(dwpkVarF);
        return dwirVar2.a();
    }

    public static eyph b(dwpx dwpxVar) {
        if (dwpxVar.e() != dwpu.GROUP) {
            eypt eyptVarB = dweg.b(dwpxVar.a());
            eypt eyptVarB2 = dweg.b(dwpxVar.c());
            eypg eypgVar = (eypg) eyph.a.createBuilder();
            eypgVar.copyOnWrite();
            ((eyph) eypgVar.instance).d = eyrd.a(3);
            eyqe eyqeVar = (eyqe) eyqf.a.createBuilder();
            eyqeVar.a(eyptVarB);
            eyqeVar.a(eyptVarB2);
            eypgVar.copyOnWrite();
            eyph eyphVar = (eyph) eypgVar.instance;
            eyqf eyqfVar = (eyqf) eyqeVar.build();
            eyqfVar.getClass();
            eyphVar.c = eyqfVar;
            eyphVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            return (eyph) eypgVar.build();
        }
        eypg eypgVar2 = (eypg) eyph.a.createBuilder();
        eypgVar2.copyOnWrite();
        ((eyph) eypgVar2.instance).d = eyrd.a(4);
        eypa eypaVar = (eypa) eypb.a.createBuilder();
        String strB = dwpxVar.d().b();
        eypaVar.copyOnWrite();
        ((eypb) eypaVar.instance).b = strB;
        String strA = dwpxVar.d().a();
        eypaVar.copyOnWrite();
        ((eypb) eypaVar.instance).c = strA;
        eypgVar2.copyOnWrite();
        eyph eyphVar2 = (eyph) eypgVar2.instance;
        eypb eypbVar = (eypb) eypaVar.build();
        eypbVar.getClass();
        eyphVar2.c = eypbVar;
        eyphVar2.b = 103;
        return (eyph) eypgVar2.build();
    }
}
