package defpackage;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class estr implements esrw {
    private static final fbrb a;
    private static final ekrg b;
    private final estu c;
    private ListenableFuture d;

    static {
        eryq eryqVar = eryq.a;
        evrr evrrVar = fcrj.a;
        fcri fcriVar = new fcri(eryqVar);
        int i = fbrb.d;
        a = new fbqy("x-goog-ext-202964622-bin", fcriVar);
        b = ekrg.c("com/google/frameworks/client/data/android/phenotype/PhenotypeServerTokensInterceptor");
    }

    public estr(estu estuVar) {
        this.c = estuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.esrw
    public final estb a(esrs esrsVar) {
        try {
            ekgb ekgbVarE = ekgb.E(ekno.a, ekgb.n(((Map) eork.q(this.d)).values()));
            eryq eryqVar = eryq.a;
            eryp erypVar = (eryp) eryqVar.createBuilder();
            int i = ((ekoe) ekgbVarE).c;
            for (int i2 = 0; i2 < i; i2++) {
                evqs evqsVarX = evqs.x(Base64.decode((String) ekgbVarE.get(i2), 8));
                erypVar.copyOnWrite();
                eryq eryqVar2 = (eryq) erypVar.instance;
                eryqVar2.a();
                eryqVar2.b.add(evqsVarX);
            }
            eryq eryqVar3 = (eryq) erypVar.build();
            fbrg fbrgVar = esrsVar.a;
            fbrb fbrbVar = a;
            if (fbrgVar.i(fbrbVar)) {
                eryqVar = (eryq) fbrgVar.c(fbrbVar);
                fbrgVar.n(fbrbVar, eryqVar);
            }
            eryp erypVar2 = (eryp) eryqVar3.toBuilder();
            evtg evtgVar = eryqVar.b;
            erypVar2.copyOnWrite();
            eryq eryqVar4 = (eryq) erypVar2.instance;
            eryqVar4.a();
            evpz.addAll(evtgVar, eryqVar4.b);
            fbrgVar.h(fbrbVar, (eryq) erypVar2.build());
        } catch (ExecutionException e) {
            ((ekrd) ((ekrd) ((ekrd) b.i()).g(e)).h("com/google/frameworks/client/data/android/phenotype/PhenotypeServerTokensInterceptor", "continueRequestHeaderProcessing", 'N', "PhenotypeServerTokensInterceptor.java")).q("Unable to get experiment token.");
        }
        return estb.a;
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        ListenableFuture listenableFutureA = this.c.a();
        this.d = listenableFutureA;
        return estb.c(listenableFutureA);
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb e() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void d(esrr esrrVar) {
    }
}
