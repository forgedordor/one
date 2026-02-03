package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.egsy;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsy extends egrv {
    public final Context a;
    public final egtw b;
    private final Executor c;
    private final efwo d;

    /* compiled from: PG */
    public interface a {
        egsq gj();
    }

    public egsy(Context context, egtw egtwVar, Executor executor, efwo efwoVar) {
        this.a = context;
        this.b = egtwVar;
        this.c = executor;
        this.d = efwoVar;
    }

    @Override // defpackage.egrv
    public final ListenableFuture a(egsn egsnVar) {
        return b(this.d, egsnVar);
    }

    @Override // defpackage.egrv
    public final ListenableFuture b(final efwo efwoVar, egsn egsnVar) {
        egus.d(egsnVar);
        egtw egtwVar = this.b;
        final egsn egsnVarG = egtwVar.g(egsnVar);
        final egsn egsnVarO = egsnVarG.o(ekhx.r("tiktok_account_work", eguk.c(efwoVar)));
        ejwi ejwiVar = ((egry) egsnVarO).h;
        if (ejwiVar.g()) {
            egsb egsbVar = new egsb("unique_" + ((egsb) ejwiVar.c()).a + eguk.c(efwoVar), ((egsb) ejwiVar.c()).b);
            egrx egrxVar = new egrx(egsnVarO);
            egrxVar.g(egsbVar);
            egsnVarO = egrxVar.h();
        }
        Executor executor = this.c;
        egsj egsjVarN = egsn.n(egui.class);
        egsjVarN.e(egsk.c(new egsa(3L, TimeUnit.DAYS), new egsa(1L, TimeUnit.DAYS)));
        egsjVarN.g(new egsb("tiktok_wipeout_worker", pzy.b));
        pzh pzhVar = new pzh();
        pzhVar.a = true;
        egsjVarN.d(pzhVar.a());
        ListenableFuture listenableFutureC = egtwVar.c(egsjVarN.h());
        eika.l(listenableFutureC, egui.b, executor);
        return eika.k(listenableFutureC, new eooz() { // from class: egsx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                efwo efwoVar2 = efwoVar;
                egsy egsyVar = this.a;
                return ((egsy.a) ehlh.a(egsyVar.a, egsy.a.class, efwoVar2)).gj().a(egsyVar.b.h(egsnVarO));
            }
        }, executor);
    }
}
