package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.canp;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canp extends cayv {
    static final cczi a = cdag.f(cdag.b, "retry_delay_millis_cms_restore_participants_work_handler", 10000);
    public final aukz b;
    public final Context c;
    public final bzag d;
    private final axlf e;
    private final eosc f;
    private final byyn g;

    /* compiled from: PG */
    public interface a {
        byzz bJ();

        capq cL();
    }

    public canp(axlf axlfVar, eosc eoscVar, aukz aukzVar, Context context, byyn byynVar, bzag bzagVar) {
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
        return eiiy.k("CmsRestoreParticipantsWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cani.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final cani caniVar = (cani) evuhVar;
        eiju eijuVarI = this.e.b(caniVar.c).i(new eooz() { // from class: canm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                efwo efwoVar = (efwo) obj;
                canp.a aVar = (canp.a) ehlh.a(this.a.c, canp.a.class, efwoVar);
                cayyVar.a();
                byzz byzzVarBJ = aVar.bJ();
                pzn pznVar = new pzn();
                pznVar.g("account_id", efwoVar.a());
                return byzzVarBJ.d(pznVar.a(), aVar.cL(), true, canl.a(caniVar));
            }
        }, this.f);
        ejvr ejvrVar = new ejvr() { // from class: cann
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bzag bzagVar = this.a.d;
                cbcw cbcwVar = (cbcw) obj;
                emdn emdnVar = emdn.RESTORE_PARTICIPANTS_WORK;
                cani caniVar2 = caniVar;
                bzagVar.b(cbcwVar, emdnVar, caniVar2);
                if (!cbcwVar.e() || cbcwVar.c() != null) {
                    return cbcwVar;
                }
                cbcv cbcvVarH = cbcw.h();
                cbcvVarH.b(true);
                cbcvVarH.c(false);
                ((caxp) cbcvVarH).a = ekgb.r(cajq.a(bzagVar.a(caniVar2)));
                return cbcvVarH.a();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).e(axkg.class, new ejvr() { // from class: cano
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                canp canpVar = this.a;
                canpVar.b.e(emec.RESTORE_PARTICIPANT);
                canpVar.d.c(emdn.RESTORE_PARTICIPANTS_WORK, caniVar, 3);
                return cbcw.k();
            }
        }, eoqgVar);
    }
}
