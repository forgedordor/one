package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cfib;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfib implements cfic {
    public static final cqce a = cqce.g("BugleNetwork", "CloudSyncGaiaBindManagerImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl");
    public final Context c;
    public final fcsu d;
    private final eosc e;
    private final axlf f;
    private final axky g;
    private final fcsu h;
    private final fcsu i;

    /* compiled from: PG */
    public interface a {
        cfze dE();
    }

    public cfib(Context context, eosc eoscVar, axlf axlfVar, axky axkyVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = context;
        this.e = eoscVar;
        this.f = axlfVar;
        this.g = axkyVar;
        this.d = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
    }

    private final eiju i(final ezol ezolVar) {
        final axlf axlfVar = this.f;
        eiju eijuVarG = eiju.g(axlfVar.a.c(ezolVar.c));
        eooz eoozVar = new eooz() { // from class: axld
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return axlfVar.b(((efwo) obj).a());
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.i(eoozVar, eoqgVar).e(egdj.class, new ejvr() { // from class: axle
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new axkg("Account is not valid", (egdj) obj);
            }
        }, eoqgVar).h(new ejvr() { // from class: cfia
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.of((efwo) obj);
            }
        }, eoqgVar).e(axkg.class, new ejvr() { // from class: cfhq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = cfib.a.e();
                cqbdVarE.I("Tachyon notification received for a non linked account");
                cqbdVarE.M("id", ezolVar.c);
                cqbdVarE.s((axkg) obj);
                return Optional.empty();
            }
        }, eoqgVar);
    }

    @Override // defpackage.cfic
    public final eiju a(final ezol ezolVar) {
        return i(ezolVar).i(new eooz() { // from class: cfhp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ezol ezolVar2 = ezolVar;
                Function function = new Function() { // from class: cfhv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cfze) obj2).b(ezolVar2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                return this.a.b((Optional) obj, null, function);
            }
        }, this.e);
    }

    public final eiju b(Optional optional, Object obj, Function function) {
        if (optional.isEmpty()) {
            return eijx.e(obj);
        }
        a.p("Starting to pull from Tachyon for GAIA account");
        return (eiju) function.apply(((a) ehlh.a(this.c, a.class, (efwo) optional.get())).dE());
    }

    @Override // defpackage.cfic
    public final eiju c(final ezol ezolVar) {
        return i(ezolVar).i(new eooz() { // from class: cfhr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                qam qamVar = new qam();
                final ezol ezolVar2 = ezolVar;
                Function function = new Function() { // from class: cfhs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cfze) obj2).c(ezolVar2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                return this.a.b((Optional) obj, qamVar, function);
            }
        }, this.e);
    }

    @Override // defpackage.cfic
    public final eiju d() {
        a.p("Start bind handler if there is a GAIA account associated with CMS");
        return this.g.a().i(new eooz() { // from class: cfht
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e(Optional.of((efwo) obj), false, "");
            }
        }, this.e).e(axlg.class, new ejvr() { // from class: cfhu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfib.a.p("No GAIA account is linked.");
                return null;
            }
        }, eoqg.a);
    }

    public final eiju e(Optional optional, boolean z, String str) {
        if (((apro) this.h.b()).a() && !((cqhz) this.i.b()).a()) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "startBindHandler", 193, "CloudSyncGaiaBindManagerImpl.java")).q("Device data over satellite, skipping start bind");
            return eijx.e(null);
        }
        if (!optional.isEmpty()) {
            a.p("Starting to bind to Tachyon for GAIA account");
            a aVar = (a) ehlh.a(this.c, a.class, (efwo) optional.get());
            return z ? aVar.dE().f(str) : aVar.dE().d();
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "startBindHandler", 197, "CloudSyncGaiaBindManagerImpl.java")).q("No Gaia account found, Skipping start bind");
        return eijx.e(null);
    }

    @Override // defpackage.cfic
    public final eiju f(ezol ezolVar, final String str) {
        return i(ezolVar).i(new eooz() { // from class: cfhx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e((Optional) obj, true, str);
            }
        }, this.e);
    }

    @Override // defpackage.cfic
    public final void g() {
        a.p("Start bind handler if there is a GAIA account associated with CMS multi-device");
        ((aurx) this.d.b()).r().i(new eooz() { // from class: cfhw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfib cfibVar = this.a;
                aurw aurwVar = ((aurx) cfibVar.d.b()).m;
                if (aurw.f((auml) obj)) {
                    cfib.a.p("CMS Multi-device enabled");
                    return cfibVar.d();
                }
                cfib.a.p("CMS Multi-device not enabled, skip binding");
                return eijx.e(null);
            }
        }, this.e);
    }

    @Override // defpackage.cfic
    public final void h() {
        this.g.a().i(new eooz() { // from class: cfhy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfib.a aVar;
                Optional optionalOf = Optional.of((efwo) obj);
                if (optionalOf.isEmpty()) {
                    ekrw ekrwVarJ = cfib.b.j();
                    ekrwVarJ.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "getAccountScopedInjector", 242, "CloudSyncGaiaBindManagerImpl.java")).q("No Gaia Account Found, skipping Account scoped injection");
                    aVar = null;
                } else {
                    aVar = (cfib.a) ehlh.a(this.a.c, cfib.a.class, (efwo) optionalOf.get());
                }
                if (aVar != null) {
                    ekrw ekrwVarH = cfib.b.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "stopBindHandler", 216, "CloudSyncGaiaBindManagerImpl.java")).q("stopping CMS tachyon bind handler for GAIA account");
                    aVar.dE().e();
                }
                return eijx.e(null);
            }
        }, this.e).e(axlg.class, new ejvr() { // from class: cfhz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) cfib.a.i().h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "stopBind", 143, "CloudSyncGaiaBindManagerImpl.java")).q("No GAIA account linked");
                return null;
            }
        }, eoqg.a);
    }
}
