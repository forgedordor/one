package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cajm;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajm extends cayv {
    static final cczi a = cdag.f(cdag.b, "retry_delay_millis_cms_restore_backup_key_work_handler", 10000);
    public final aukz b;
    public final Context c;
    public final bzag d;
    private final axlf e;
    private final eosc f;

    /* compiled from: PG */
    public interface a {
        caof cG();
    }

    public cajm(aukz aukzVar, axlf axlfVar, eosc eoscVar, Context context, bzag bzagVar) {
        this.f = eoscVar;
        this.b = aukzVar;
        this.e = axlfVar;
        this.c = context;
        this.d = bzagVar;
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
        return eiiy.k("CmsRestoreBackupKeyWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cani.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final cani caniVar = (cani) evuhVar;
        eiju eijuVarI = this.e.b(caniVar.c).i(new eooz() { // from class: cajj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cajm.a aVar = (cajm.a) ehlh.a(this.a.c, cajm.a.class, (efwo) obj);
                final int i = ((caxm) cayyVar.a()).c;
                final caof caofVarCG = aVar.cG();
                eiju eijuVarB = caofVarCG.i.b("CmsRestoreBackupKeyWorkerAdapter#restore", new Runnable() { // from class: canz
                    @Override // java.lang.Runnable
                    public final void run() {
                        aurx aurxVar = caofVarCG.e;
                        aurxVar.Z(aumn.BACKUP_KEY);
                        aurxVar.F();
                    }
                });
                eooz eoozVar = new eooz() { // from class: caoa
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return caofVarCG.b.y();
                    }
                };
                eosc eoscVar = caofVarCG.f;
                return eijuVarB.i(eoozVar, eoscVar).i(new eooz() { // from class: caob
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ekgb ekgbVar = ((cpvs) obj2).a;
                        if (ekgbVar.isEmpty()) {
                            caof.a.r("Backup key missing in CMS. No other action needed for restore.");
                            return eijx.e(new qao());
                        }
                        if (ekgbVar.size() > 1) {
                            caof.a.r("More than 1 BACKUP_KEY got backed up");
                        }
                        final int i2 = i;
                        final caof caofVar = caofVarCG;
                        eqnd eqndVar = (eqnd) ekgbVar.get(0);
                        cqbd cqbdVarC = caof.a.c();
                        cqbdVarC.C("CMS backup key labels", eqndVar.h.toArray());
                        cqbdVarC.I("Got Backup key from CMS");
                        cqbdVarC.r();
                        return caofVar.c.d(eqndVar).h(new ejvr() { // from class: canv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return new qao();
                            }
                        }, caofVar.f).f(Throwable.class, new eooz() { // from class: canw
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                Throwable th = (Throwable) obj3;
                                caof.a.s("Restore of backup key from CMS failed.", th);
                                caofVar.h.n(emec.RESTORE_BACKUP_KEY, i2, th);
                                return th instanceof cpyv ? ((cpyv) th).b.equals(cpyz.RETRY) ? eijx.e(new qan()) : eijx.e(new qam()) : eijx.d(th);
                            }
                        }, caofVar.g);
                    }
                }, eoscVar).i(new eooz() { // from class: caoc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final qap qapVar = (qap) obj2;
                        return caofVarCG.e.w("RESTORE_DONE_PAGE_TOKEN").h(new ejvr() { // from class: canx
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return qapVar;
                            }
                        }, eoqg.a);
                    }
                }, eoscVar).f(cpyy.class, new eooz() { // from class: caod
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final cpyy cpyyVar = (cpyy) obj2;
                        int i2 = cpyyVar.a;
                        final caof caofVar = caofVarCG;
                        eiju eijuVarA = caofVar.d.a(i2);
                        final int i3 = i;
                        return eijuVarA.h(new ejvr() { // from class: cany
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    return new qao();
                                }
                                cpyy cpyyVar2 = cpyyVar;
                                caofVar.h.n(emec.RESTORE_BACKUP_KEY, i3, cpyyVar2);
                                return new qan();
                            }
                        }, caofVar.g);
                    }
                }, eoscVar).e(Throwable.class, new ejvr() { // from class: caoe
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        emec emecVar = emec.RESTORE_BACKUP_KEY;
                        int i2 = i;
                        caofVarCG.h.n(emecVar, i2, (Throwable) obj2);
                        return new qan();
                    }
                }, caofVarCG.g);
            }
        }, this.f);
        ejvr ejvrVar = new ejvr() { // from class: cajk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                qap qapVar = (qap) obj;
                boolean zEquals = new qao().equals(qapVar);
                cani caniVar2 = caniVar;
                cajm cajmVar = this.a;
                if (!zEquals) {
                    if (new qan().equals(qapVar)) {
                        return cbcw.m();
                    }
                    if (!new qam().equals(qapVar)) {
                        throw new IllegalArgumentException(String.format("Unknown Result type was found in CmsRestoreBackupKeyWorkHandler! Result is: [%s]", qapVar));
                    }
                    cajmVar.d.c(emdn.RESTORE_BACKUP_KEY_WORK, caniVar2, 3);
                    return cbcw.k();
                }
                bzag bzagVar = cajmVar.d;
                bzagVar.c(emdn.RESTORE_BACKUP_KEY_WORK, caniVar2, 2);
                cbcv cbcvVarH = cbcw.h();
                cbcvVarH.b(true);
                cbcvVarH.c(false);
                ((caxp) cbcvVarH).a = ekgb.r(cajx.a(bzagVar.a(caniVar2)));
                return cbcvVarH.a();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).e(axkg.class, new ejvr() { // from class: cajl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cajm cajmVar = this.a;
                cajmVar.b.e(emec.RESTORE_BACKUP_KEY);
                cajmVar.d.c(emdn.RESTORE_BACKUP_KEY_WORK, caniVar, 3);
                return cbcw.k();
            }
        }, eoqgVar);
    }
}
