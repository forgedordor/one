package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.caki;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caki extends cayv {
    static final cczi a = cdag.f(cdag.b, "retry_delay_millis_cms_restore_messages_work_handler", 10000);
    public final Context b;
    public final eosc c;
    public final aukz d;
    public final bzag e;
    private final axlf f;
    private final byyn g;

    /* compiled from: PG */
    public interface a {
        byzz bI();

        capk cJ();
    }

    public caki(axlf axlfVar, Context context, eosc eoscVar, aukz aukzVar, byyn byynVar, bzag bzagVar) {
        this.b = context;
        this.f = axlfVar;
        this.c = eoscVar;
        this.d = aukzVar;
        this.g = byynVar;
        this.e = bzagVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.f(pza.a);
        caxzVarL.g(((Long) a.e()).longValue());
        caxzVarL.b(caze.FOREGROUND_SERVICE);
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.b = this.g.a();
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.l.get()).e()).booleanValue()) {
            pzhVar.c = true;
        }
        caxkVar.a = pzhVar.a();
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsRestoreMessagesWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cani.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final cani caniVar = (cani) evuhVar;
        eiju eijuVarB = this.f.b(caniVar.c);
        eooz eoozVar = new eooz() { // from class: cake
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                caki.a aVar = (caki.a) ehlh.a(this.a.b, caki.a.class, (efwo) obj);
                cayyVar.a();
                byzz byzzVarBI = aVar.bI();
                pzn pznVar = new pzn();
                cani caniVar2 = caniVar;
                pznVar.g("account_id", caniVar2.c);
                pznVar.g("cms_feature_id", caniVar2.e);
                evvp evvpVar = caniVar2.f;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                pznVar.h("restore_start_time_millis", evxc.a(evvpVar));
                return byzzVarBI.d(pznVar.a(), aVar.cJ(), true, cakd.a(caniVar2));
            }
        };
        eosc eoscVar = this.c;
        return eijuVarB.i(eoozVar, eoscVar).i(new eooz() { // from class: cakf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cbcw cbcwVar = (cbcw) obj;
                emdn emdnVar = emdn.RESTORE_MESSAGES_WORK;
                final cani caniVar2 = caniVar;
                caki cakiVar = this.a;
                cakiVar.e.b(cbcwVar, emdnVar, caniVar2);
                return (cbcwVar.e() && cbcwVar.c() == null) ? eijx.g(new Callable() { // from class: cakh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cbcv cbcvVarB = cbcwVar.b();
                        ((caxp) cbcvVarB).a = ekgb.r(casf.a(caniVar2));
                        return cbcvVarB.a();
                    }
                }, cakiVar.c) : eijx.e(cbcwVar);
            }
        }, eoscVar).e(axkg.class, new ejvr() { // from class: cakg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                caki cakiVar = this.a;
                cakiVar.d.e(emec.RESTORE_MESSAGE);
                cakiVar.e.c(emdn.RESTORE_MESSAGES_WORK, caniVar, 3);
                return cbcw.k();
            }
        }, eoqg.a);
    }
}
