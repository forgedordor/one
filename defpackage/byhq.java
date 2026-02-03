package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byhq extends cayv {
    public static final cqce a = cqce.g("BugleCms", "BlockOnInitialBackupPreconditionsWorkHandler");
    public static final cczi b = cdag.e(cdag.b, "cms_block_on_initial_backup_preconditions_max_retry", 3);
    public final aurx c;
    public final eosc d;
    public final eosc e;
    public final axlf f;
    public final cpmi g;
    public final aukz h;
    public final Optional i;

    public byhq(aurx aurxVar, cpmi cpmiVar, aukz aukzVar, eosc eoscVar, eosc eoscVar2, axlf axlfVar, Optional optional) {
        this.c = aurxVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.g = cpmiVar;
        this.h = aukzVar;
        this.f = axlfVar;
        this.i = optional;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) b.e()).intValue());
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.b);
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("BlockOnInitialBackupPreconditionsWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bzzx.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final bzzx bzzxVar = (bzzx) evuhVar;
        Runnable runnable = new Runnable() { // from class: byhm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h.t(emec.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS);
            }
        };
        eosc eoscVar = this.e;
        eiju eijuVarF = eijx.f(runnable, eoscVar);
        eooz eoozVar = new eooz() { // from class: byhn
            /* JADX WARN: Type inference failed for: r1v3, types: [cmfo, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarK;
                final byhq byhqVar = this.a;
                if (!cpyl.a()) {
                    return byhqVar.k();
                }
                cpyo cpyoVarB = cpyo.b(bzzxVar.d);
                if (cpyoVarB == null) {
                    cpyoVarB = cpyo.CMS_FEATURE_UNDEFINED;
                }
                if (cpyoVarB.equals(cpyo.CMS_FEATURE_BACKUP_AND_RESTORE)) {
                    aurx aurxVar = byhqVar.c;
                    eijuVarK = aurxVar.e.get().h().h(new ejvr() { // from class: aurb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(((aumq) obj2).x);
                        }
                    }, aurxVar.f).i(new eooz() { // from class: byhl
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final byhq byhqVar2 = byhqVar;
                            final Boolean bool = (Boolean) obj2;
                            return byhqVar2.c.k().h(new ejvr() { // from class: byhg
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    boolean zO = autx.o((aumq) obj3);
                                    aukz aukzVar = byhqVar2.h;
                                    Boolean bool2 = bool;
                                    boolean z = false;
                                    aukzVar.l(false, zO, cpyb.BACKUP_AND_RESTORE, Optional.of(bool2));
                                    if (bool2.booleanValue() && zO) {
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }, byhqVar2.e);
                        }
                    }, byhqVar.e);
                } else {
                    eijuVarK = byhqVar.k();
                }
                return eijuVarK.h(new ejvr() { // from class: byhk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            byhqVar.i.isPresent();
                        }
                        return bool;
                    }
                }, byhqVar.d);
            }
        };
        eosc eoscVar2 = this.d;
        return eijuVarF.i(eoozVar, eoscVar2).i(new eooz() { // from class: byho
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    byhq.a.p("Not starting initial backup. Preconditions are not yet satisfied.");
                    return eijx.e(cbcw.i());
                }
                final bzzx bzzxVar2 = bzzxVar;
                final byhq byhqVar = this.a;
                eiju eijuVarB = byhqVar.f.b(bzzxVar2.c);
                eooz eoozVar2 = new eooz() { // from class: byhh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cpyb cpybVar;
                        efwo efwoVar = (efwo) obj2;
                        byhq.a.p("Starting initial backup for linked account");
                        if (cpyl.a()) {
                            bzzx bzzxVar3 = bzzxVar2;
                            ejvj ejvjVarFH = new tny().fH();
                            cpyo cpyoVarB = cpyo.b(bzzxVar3.d);
                            if (cpyoVarB == null) {
                                cpyoVarB = cpyo.CMS_FEATURE_UNDEFINED;
                            }
                            cpybVar = (cpyb) ejvjVarFH.fM(cpyoVarB);
                        } else {
                            cpybVar = cpyb.MULTI_DEVICE;
                        }
                        return byhqVar.g.a(efwoVar, cpybVar);
                    }
                };
                eosc eoscVar3 = byhqVar.d;
                return eijuVarB.i(eoozVar2, eoscVar3).h(new ejvr() { // from class: byhi
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = byhq.a;
                        return cbcw.i();
                    }
                }, eoscVar3).e(axkg.class, new ejvr() { // from class: byhj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        byhqVar.h.e(emec.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS);
                        byhq.a.n("Could not start initial backup because account is not linked");
                        return cbcw.k();
                    }
                }, byhqVar.e);
            }
        }, eoscVar2).e(Exception.class, new ejvr() { // from class: byhp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                byhq.a.o("Could not check initial backup preconditions", exc);
                cayy cayyVar2 = cayyVar;
                this.a.h.n(emec.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS, ((caxm) cayyVar2.a()).c, exc);
                return cbcw.m();
            }
        }, eoscVar);
    }

    public final eiju k() {
        return this.c.k().h(new ejvr() { // from class: byhf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                boolean z = aumqVar.w;
                boolean zO = autx.o(aumqVar);
                this.a.h.l(z, zO, cpyb.MULTI_DEVICE, Optional.empty());
                boolean z2 = false;
                if (z && zO) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, this.e);
    }
}
