package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.caju;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caju extends cayv {
    static final cczi a = cdag.f(cdag.b, "retry_delay_millis_cms_restore_conversations_work_handler", 10000);
    public final aukz b;
    public final Context c;
    public final bzag d;
    private final axlf e;
    private final eosc f;
    private final byyn g;

    /* compiled from: PG */
    public interface a {
        byzz bH();

        caoq cH();
    }

    public caju(axlf axlfVar, aukz aukzVar, eosc eoscVar, Context context, byyn byynVar, bzag bzagVar) {
        this.e = axlfVar;
        this.f = eoscVar;
        this.b = aukzVar;
        this.c = context;
        this.g = byynVar;
        this.d = bzagVar;
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
        return eiiy.k("CmsRestoreConversationsWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cani.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final cani caniVar = (cani) evuhVar;
        eiju eijuVarI = this.e.b(caniVar.c).i(new eooz() { // from class: cajr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                caju.a aVar = (caju.a) ehlh.a(this.a.c, caju.a.class, (efwo) obj);
                cayyVar.a();
                byzz byzzVarBH = aVar.bH();
                pzn pznVar = new pzn();
                cani caniVar2 = caniVar;
                pznVar.g("account_id", caniVar2.c);
                return byzzVarBH.d(pznVar.a(), aVar.cH(), true, cajq.a(caniVar2));
            }
        }, this.f);
        ejvr ejvrVar = new ejvr() { // from class: cajs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bzag bzagVar = this.a.d;
                cbcw cbcwVar = (cbcw) obj;
                emdn emdnVar = emdn.RESTORE_CONVERSATIONS_WORK;
                cani caniVar2 = caniVar;
                bzagVar.b(cbcwVar, emdnVar, caniVar2);
                if (!cbcwVar.e() || cbcwVar.c() != null) {
                    return cbcwVar;
                }
                cbcv cbcvVarH = cbcw.h();
                cbcvVarH.b(true);
                cbcvVarH.c(false);
                ((caxp) cbcvVarH).a = ekgb.r(cakd.a(bzagVar.a(caniVar2)));
                return cbcvVarH.a();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).e(axkg.class, new ejvr() { // from class: cajt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                caju cajuVar = this.a;
                cajuVar.b.e(emec.RESTORE_CONVERSATION);
                cajuVar.d.c(emdn.RESTORE_CONVERSATIONS_WORK, caniVar, 3);
                return cbcw.k();
            }
        }, eoqgVar);
    }
}
