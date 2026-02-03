package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cakc;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakc extends cayv {
    static final cczi a = cdag.f(cdag.b, "retry_delay_millis_cms_restore_encryption_key_work_handler", 10000);
    public final eosc b;
    public final aukz c;
    public final Context d;
    public final bzag e;
    private final axlf f;

    /* compiled from: PG */
    public interface a {
        byzz bG();

        caos cI();
    }

    public cakc(axlf axlfVar, eosc eoscVar, aukz aukzVar, Context context, bzag bzagVar) {
        this.f = axlfVar;
        this.b = eoscVar;
        this.c = aukzVar;
        this.d = context;
        this.e = bzagVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.f(pza.a);
        caxzVarL.g(((Long) a.e()).longValue());
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.l.get()).e()).booleanValue()) {
            pzhVar.c = true;
        }
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsRestoreEncryptionKeyWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cani.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final cani caniVar = (cani) evuhVar;
        eiju eijuVarB = this.f.b(caniVar.c);
        eooz eoozVar = new eooz() { // from class: cajz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                efwo efwoVar = (efwo) obj;
                cakc.a aVar = (cakc.a) ehlh.a(this.a.d, cakc.a.class, efwoVar);
                cayyVar.a();
                byzz byzzVarBG = aVar.bG();
                pzn pznVar = new pzn();
                pznVar.g("account_id", efwoVar.a());
                return byzzVarBG.d(pznVar.a(), aVar.cI(), false, cajx.a(caniVar));
            }
        };
        eosc eoscVar = this.b;
        return eijuVarB.i(eoozVar, eoscVar).i(new eooz() { // from class: caka
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cakc cakcVar = this.a;
                bzag bzagVar = cakcVar.e;
                cbcw cbcwVar = (cbcw) obj;
                emdn emdnVar = emdn.RESTORE_ENCRYPTION_KEY_WORK;
                final cani caniVar2 = caniVar;
                bzagVar.b(cbcwVar, emdnVar, caniVar2);
                if (!cbcwVar.e() || cbcwVar.c() != null) {
                    return eijx.e(cbcwVar);
                }
                cani caniVarA = bzagVar.a(caniVar2);
                int i = ekgb.d;
                final ekfw ekfwVar = new ekfw();
                final cbcv cbcvVarH = cbcw.h();
                cbcvVarH.b(true);
                cbcvVarH.c(false);
                ekfwVar.h(canl.a(caniVarA));
                return eijx.g(new Callable() { // from class: cajy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cani caniVar3 = caniVar2;
                        cbcu cbcuVarF = cbcu.f("cms_key_sync", bznl.a(caniVar3.c, cpyb.a(caniVar3.e)));
                        ekfw ekfwVar2 = ekfwVar;
                        ekfwVar2.h(cbcuVarF);
                        ekgb ekgbVarG = ekfwVar2.g();
                        cbcv cbcvVar = cbcvVarH;
                        ((caxp) cbcvVar).a = ekgbVarG;
                        return cbcvVar.a();
                    }
                }, cakcVar.b);
            }
        }, eoscVar).e(axkg.class, new ejvr() { // from class: cakb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cakc cakcVar = this.a;
                cakcVar.c.e(emec.RESTORE_ENCRYPTION_KEY);
                cakcVar.e.c(emdn.RESTORE_ENCRYPTION_KEY_WORK, caniVar, 3);
                return cbcw.k();
            }
        }, eoqg.a);
    }
}
