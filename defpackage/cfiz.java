package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfiz implements cfit {
    public final fcsu a;
    private final eosc b;
    private final Set c;

    public cfiz(eosc eoscVar, Set set, fcsu fcsuVar) {
        this.b = eoscVar;
        this.c = set;
        this.a = fcsuVar;
    }

    private static eznv b(String str) {
        eznt ezntVar = (eznt) eznv.a.createBuilder();
        eznx eznxVar = eznx.a;
        eznw eznwVar = (eznw) eznxVar.createBuilder();
        eznwVar.copyOnWrite();
        eznx eznxVar2 = (eznx) eznwVar.instance;
        eznxVar2.b = 1;
        eznxVar2.c = "+g.3gpp.iari-ref";
        ezntVar.copyOnWrite();
        eznv eznvVar = (eznv) ezntVar.instance;
        eznx eznxVar3 = (eznx) eznwVar.build();
        eznxVar3.getClass();
        eznvVar.c = eznxVar3;
        eznvVar.b |= 1;
        eznw eznwVar2 = (eznw) eznxVar.createBuilder();
        eznwVar2.copyOnWrite();
        eznx eznxVar4 = (eznx) eznwVar2.instance;
        eznxVar4.b = 1;
        eznxVar4.c = str;
        ezntVar.copyOnWrite();
        eznv eznvVar2 = (eznv) ezntVar.instance;
        eznx eznxVar5 = (eznx) eznwVar2.build();
        eznxVar5.getClass();
        eznvVar2.d = eznxVar5;
        eznvVar2.b |= 2;
        ezntVar.copyOnWrite();
        ((eznv) ezntVar.instance).e = eznu.a(3);
        return (eznv) ezntVar.build();
    }

    @Override // defpackage.cfit
    public final eiju a(ezny eznyVar, final alqm alqmVar) {
        if (ekgb.s(1, 3).contains(cozn.a.e())) {
            return eijx.e(eznyVar);
        }
        eznt ezntVar = (eznt) eznv.a.createBuilder();
        eznx eznxVar = eznx.a;
        eznw eznwVar = (eznw) eznxVar.createBuilder();
        eznwVar.copyOnWrite();
        eznx eznxVar2 = (eznx) eznwVar.instance;
        eznxVar2.b = 1;
        eznxVar2.c = "+g.3gpp.icsi-ref";
        ezntVar.copyOnWrite();
        eznv eznvVar = (eznv) ezntVar.instance;
        eznx eznxVar3 = (eznx) eznwVar.build();
        eznxVar3.getClass();
        eznvVar.c = eznxVar3;
        eznvVar.b |= 1;
        eznw eznwVar2 = (eznw) eznxVar.createBuilder();
        String strA = dhbr.a();
        eznwVar2.copyOnWrite();
        eznx eznxVar4 = (eznx) eznwVar2.instance;
        eznxVar4.b = 1;
        eznxVar4.c = strA;
        ezntVar.copyOnWrite();
        eznv eznvVar2 = (eznv) ezntVar.instance;
        eznx eznxVar5 = (eznx) eznwVar2.build();
        eznxVar5.getClass();
        eznvVar2.d = eznxVar5;
        eznvVar2.b |= 2;
        ezntVar.copyOnWrite();
        ((eznv) ezntVar.instance).e = eznu.a(3);
        eznyVar.b((eznv) ezntVar.build());
        eznyVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im"));
        eznyVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp"));
        eznyVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb"));
        eznyVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg"));
        eznyVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush"));
        if (dfpq.o()) {
            eznyVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms"));
        }
        if (dfpq.p()) {
            eznyVar.b(b("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms"));
        }
        eiju eijuVarE = eijx.e(eznyVar);
        for (final cfix cfixVar : this.c) {
            eijuVarE = eijuVarE.i(new eooz() { // from class: cfiy
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    aubq aubqVarA = ((asqx) this.a.a.b()).a(alqmVar.o(), false);
                    return cfixVar.a((ezny) obj, aubqVarA);
                }
            }, this.b);
        }
        return eijuVarE;
    }
}
