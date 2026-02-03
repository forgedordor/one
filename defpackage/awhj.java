package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhj implements cfit {
    private final Map a;

    public awhj(Map map, fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = map;
    }

    @Override // defpackage.cfit
    public final eiju a(ezny eznyVar, alqm alqmVar) {
        eznyVar.getClass();
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            eznt ezntVar = (eznt) eznv.a.createBuilder();
            ezntVar.getClass();
            eznx eznxVar = eznx.a;
            eznw eznwVar = (eznw) eznxVar.createBuilder();
            eznwVar.getClass();
            eykf.b((String) entry.getKey(), eznwVar);
            eyke.b(eykf.a(eznwVar), ezntVar);
            eznw eznwVar2 = (eznw) eznxVar.createBuilder();
            eznwVar2.getClass();
            eykf.b((String) entry.getValue(), eznwVar2);
            eyke.c(eykf.a(eznwVar2), ezntVar);
            eyke.d(4, ezntVar);
            arrayList.add(eyke.a(ezntVar));
        }
        eznyVar.a(arrayList);
        eiju eijuVarE = eijx.e(eznyVar);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
