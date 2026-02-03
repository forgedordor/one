package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdo implements dvqa {
    public final dwcm a;
    public final Context b;
    public final dvyx c;
    public final dwdd d;
    public final Map e;

    public dwdo(dwcm dwcmVar, Context context, Map map) {
        this.a = dwcmVar;
        this.b = context;
        this.c = dvyx.a(context);
        dvjj.c();
        this.d = new dwdd();
        this.e = map;
    }

    public static eypt d(dwpx dwpxVar) {
        if (dwpxVar.e() == dwpu.ONE_TO_ONE) {
            return dweg.b(dwpxVar.c());
        }
        eyps eypsVar = (eyps) eypt.a.createBuilder();
        eypsVar.copyOnWrite();
        ((eypt) eypsVar.instance).b = eyrf.a(6);
        String strB = dwpxVar.d().b();
        eypsVar.copyOnWrite();
        ((eypt) eypsVar.instance).c = strB;
        String strA = dwpxVar.d().a();
        eypsVar.copyOnWrite();
        ((eypt) eypsVar.instance).e = strA;
        return (eypt) eypsVar.build();
    }

    public static eyrx e(String str) {
        return (eyrx) evsn.parseFrom(eyrx.a, Base64.decode(str, 8), evrr.a());
    }

    @Override // defpackage.dvqa
    public final ejwi a(dwje dwjeVar, String str) {
        boolean z;
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10107);
        this.c.b(dwhpVarR.a());
        try {
            eyrx eyrxVarE = e(str);
            dvhv.a("TyMsgClient", a.E(eyrxVarE, "LighterConversationIntent: "));
            eypt eyptVar = eyrxVarE.c;
            if (eyptVar == null) {
                eyptVar = eypt.a;
            }
            int iB = eyrf.b(eyptVar.b);
            boolean z2 = true;
            if (iB == 0) {
                iB = 1;
            }
            dvhv.a("TyMsgClient", a.v(Integer.toString(iB - 2), "lighterId type: "));
            dwir dwirVar = new dwir();
            dwirVar.c(dwjeVar.c().f());
            int iB2 = eyrf.b(eyptVar.b);
            if (iB2 == 0) {
                iB2 = 1;
            }
            int i = iB2 - 2;
            if (i == 1 || i == 2) {
                dwirVar.e(dweg.a(eyptVar));
                z = z2;
            } else {
                z = false;
                if (i == 3) {
                    z2 = false;
                    dwirVar.e(dweg.a(eyptVar));
                    z = z2;
                } else {
                    if (i != 4) {
                        dvhv.c("TyMsgClient", "LighterId type is default.");
                        return ejud.a;
                    }
                    dwit dwitVar = new dwit();
                    dwitVar.c(eyptVar.c);
                    dwitVar.b(eyptVar.e);
                    dwirVar.d(dwitVar.a());
                }
            }
            dwpn dwpnVarR = dwpo.r();
            dwpnVarR.e(eyrxVarE.j);
            dwpnVarR.f(dwirVar.a());
            dwpnVarR.h(-1L);
            dwpnVarR.b(ekmi.l(DesugarCollections.unmodifiableMap(eyrxVarE.d), new ejvr() { // from class: dwdi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((evqe) obj).c.I();
                }
            }));
            dwpnVarR.c(z);
            return ejwi.j(dwpnVarR.a());
        } catch (evtj | IllegalArgumentException e) {
            dvyx dvyxVar = this.c;
            dwhp dwhpVarR2 = dwhq.r();
            dwhpVarR2.g(10108);
            dvyxVar.b(dwhpVarR2.a());
            dvhv.d("TyMsgClient", "Unable to parse intent args", e);
            return ejud.a;
        }
    }

    @Override // defpackage.dvqa
    public final ListenableFuture b(dwje dwjeVar, dwpx dwpxVar, evqs evqsVar, List list, dvxf dvxfVar) {
        return c(dwjeVar, dwpxVar, evqsVar, list, dvxfVar, false);
    }

    public final ListenableFuture c(dwje dwjeVar, dwpx dwpxVar, evqs evqsVar, List list, dvxf dvxfVar, boolean z) {
        if (list.size() <= 0) {
            return eorv.a;
        }
        dwfp dwfpVar = new dwfp(this.b, dwjeVar, dwpxVar, evqsVar, list, d(dwpxVar), z);
        dvyx dvyxVar = this.c;
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(18);
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(dwfpVar.a);
        dwhpVarR.d(dwpxVar);
        dvyxVar.b(dwhpVarR.a());
        dwcm dwcmVar = this.a;
        ListenableFuture listenableFutureB = dwcmVar.b(UUID.randomUUID(), dwfpVar, dwcmVar.d.b(), dwjeVar, dvxfVar, true);
        eork.r(listenableFutureB, new dwdk(this, dwjeVar, dwfpVar, dwpxVar), eoqg.a);
        return listenableFutureB;
    }
}
