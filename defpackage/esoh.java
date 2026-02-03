package defpackage;

import io.grpc.Status;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esoh {
    static fbnd a(esof esofVar, CronetEngine cronetEngine, ejwi ejwiVar) {
        esmi esmiVar = (esmi) esofVar;
        Object objC = esmiVar.f;
        if (objC == null) {
            objC = ejwiVar.g() ? ejwiVar.c() : new CronetEngine.Builder(esmiVar.a).getDefaultUserAgent();
        }
        fbxn fbxnVarM = fbxn.m(esofVar.r(), esofVar.q(), cronetEngine);
        fbxnVarM.l((String) objC);
        fbxnVarM.g(esmiVar.d);
        fbxnVarM.k(esmiVar.c);
        fbxnVarM.h(esmiVar.k, TimeUnit.MILLISECONDS);
        int i = esmiVar.l;
        ejwl.b(i >= 0, "maxMessageSize must be >= 0");
        fbxnVarM.d = i;
        ScheduledExecutorService scheduledExecutorService = esmiVar.e;
        if (scheduledExecutorService != null) {
            fbxnVarM.a = scheduledExecutorService;
        }
        esmv esmvVar = esmiVar.h;
        if (esmvVar != null) {
            ekqg ekqgVarListIterator = esmvVar.a().listIterator();
            while (true) {
                if (!ekqgVarListIterator.hasNext()) {
                    break;
                }
                if (((esmu) ekqgVarListIterator.next()).a() != null) {
                    fbxnVarM.f();
                    int i2 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    ekqg ekqgVarListIterator2 = esmvVar.a().listIterator();
                    while (ekqgVarListIterator2.hasNext()) {
                        esmu esmuVar = (esmu) ekqgVarListIterator2.next();
                        ekgi ekgiVar = new ekgi();
                        ekgi ekgiVar2 = new ekgi();
                        ekgiVar2.i("service", esmuVar.b());
                        esmuVar.c();
                        ekgiVar.i("name", ekgb.r(ekgiVar2.c()));
                        esmt esmtVarA = esmuVar.a();
                        if (esmtVarA != null) {
                            esme esmeVar = (esme) esmtVarA;
                            if (esmeVar.a) {
                                ekgi ekgiVar3 = new ekgi();
                                ekgiVar3.i("maxAttempts", Double.valueOf(esmeVar.b));
                                ekgiVar3.i("initialBackoff", esmeVar.c + "s");
                                ekgiVar3.i("maxBackoff", esmeVar.d + "s");
                                ekgiVar3.i("backoffMultiplier", Double.valueOf(esmeVar.e));
                                ekgiVar3.i("retryableStatusCodes", ekjz.g(esmeVar.f, new ejvr() { // from class: esmr
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        return ((Status.Code) obj).name();
                                    }
                                }));
                                ekgiVar.g(ekgp.l("retryPolicy", ekgiVar3.c()));
                            }
                        }
                        ekfwVar.h(ekgiVar.c());
                    }
                    fbxnVarM.e(ekgp.l("methodConfig", ekfwVar.g()));
                }
            }
        }
        Integer num = esmiVar.i;
        if (num != null) {
            int iIntValue = num.intValue();
            fbxnVarM.g = true;
            fbxnVarM.h = iIntValue;
        }
        Integer num2 = esmiVar.j;
        if (num2 != null) {
            fbxnVarM.n(num2.intValue());
        }
        return fbnk.b(fbxnVarM.a(), new drgm(new drgt(esmiVar.g)));
    }
}
