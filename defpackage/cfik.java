package defpackage;

import android.content.Context;
import defpackage.cfik;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfik implements cfic {
    public final Context a;
    public final fcyh b;
    public final fcsu c;
    public final bvll d;
    public final egej e;
    public final fcsu f;
    public final ekrg g;
    private final fdjx h;
    private final fcsu i;
    private final fcsu j;

    /* compiled from: PG */
    public interface a {
        cfze dF();
    }

    public cfik(Context context, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, bvll bvllVar, egej egejVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        bvllVar.getClass();
        egejVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.h = fdjxVar;
        this.c = fcsuVar;
        this.d = bvllVar;
        this.e = egejVar;
        this.f = fcsuVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.g = ekrg.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl");
    }

    private final eiju i(ezol ezolVar, Object obj, fdap fdapVar) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.h, eicg.a(fcyiVar), fdjzVar, new cfil(null, this, ezolVar, obj, fdapVar)));
    }

    @Override // defpackage.cfic
    public final eiju a(final ezol ezolVar) {
        ezolVar.getClass();
        ekrw ekrwVarH = this.g.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "pullMessages", 158, "GaiaDittoBindManagerImpl.kt")).q("Pull messages for GDitto");
        return i(ezolVar, null, new fdap() { // from class: cfid
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                Optional optionalOf = Optional.of(efwoVar);
                final ezol ezolVar2 = ezolVar;
                return this.a.b(optionalOf, null, new fdap() { // from class: cfii
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        cfze cfzeVar = (cfze) obj2;
                        cfzeVar.getClass();
                        return cfzeVar.b(ezolVar2);
                    }
                });
            }
        });
    }

    public final eiju b(Optional optional, Object obj, fdap fdapVar) {
        if (!optional.isEmpty()) {
            return (eiju) fdapVar.invoke(((a) ehlh.a(this.a, a.class, (efwo) optional.get())).dF());
        }
        ekrw ekrwVarH = this.g.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "pullMessages", 172, "GaiaDittoBindManagerImpl.kt")).q("Missing accountId in pullMessages for GDitto");
        eiju eijuVarE = eijx.e(obj);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfic
    public final eiju c(final ezol ezolVar) {
        ezolVar.getClass();
        ekrw ekrwVarH = this.g.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "pullMessagesFromWorker", 147, "GaiaDittoBindManagerImpl.kt")).q("Pull messages from worker for GDitto");
        return i(ezolVar, new qam(), new fdap() { // from class: cfij
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                Optional optionalOf = Optional.of(efwoVar);
                qam qamVar = new qam();
                final ezol ezolVar2 = ezolVar;
                return this.a.b(optionalOf, qamVar, new fdap() { // from class: cfih
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        cfze cfzeVar = (cfze) obj2;
                        cfzeVar.getClass();
                        return cfzeVar.c(ezolVar2);
                    }
                });
            }
        });
    }

    @Override // defpackage.cfic
    public final eiju d() {
        ekrw ekrwVarH = this.g.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandlerIfLinked", 80, "GaiaDittoBindManagerImpl.kt")).q("Start bind handler if Gaia pairing is enabled, and if at least one device is paired");
        return i(null, null, new fdap() { // from class: cfie
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                return this.a.e(Optional.of(efwoVar), false, "");
            }
        });
    }

    public final eiju e(Optional optional, boolean z, String str) {
        if (((apro) this.i.b()).a() && !((cqhz) this.j.b()).a()) {
            ekrw ekrwVarH = this.g.h();
            ekrwVarH.X(eksq.a, "BugleGDitto");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandler", 112, "GaiaDittoBindManagerImpl.kt")).q("Device data over satellite, skipping start bind");
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (!optional.isEmpty()) {
            a aVar = (a) ehlh.a(this.a, a.class, (efwo) optional.get());
            return z ? aVar.dF().f(str) : aVar.dF().d();
        }
        ekrw ekrwVarH2 = this.g.h();
        ekrwVarH2.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandler", 116, "GaiaDittoBindManagerImpl.kt")).q("Missing accountId in startBindHandler for GDitto");
        eiju eijuVarE2 = eijx.e(null);
        eijuVarE2.getClass();
        return eijuVarE2;
    }

    @Override // defpackage.cfic
    public final eiju f(ezol ezolVar, final String str) {
        ezolVar.getClass();
        str.getClass();
        ekrw ekrwVarH = this.g.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandlerFromTickle", 71, "GaiaDittoBindManagerImpl.kt")).q("Start bind handler from Tickle for GDitto if checks pass");
        return i(ezolVar, null, new fdap() { // from class: cfig
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                return this.a.e(Optional.of(efwoVar), true, str);
            }
        });
    }

    @Override // defpackage.cfic
    public final void g() {
        d();
    }

    @Override // defpackage.cfic
    public final void h() {
        i(null, null, new fdap() { // from class: cfif
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cfik.a aVar;
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                Optional optionalOf = Optional.of(efwoVar);
                boolean zIsEmpty = optionalOf.isEmpty();
                cfik cfikVar = this.a;
                if (zIsEmpty) {
                    ekrw ekrwVarJ = cfikVar.g.j();
                    ekrwVarJ.X(eksq.a, "BugleGDitto");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "getAccountScopedInjector", 227, "GaiaDittoBindManagerImpl.kt")).q("No Gaia Account Found, skipping Account scoped injection");
                    aVar = null;
                } else {
                    aVar = (cfik.a) ehlh.a(cfikVar.a, cfik.a.class, (efwo) optionalOf.get());
                }
                if (aVar != null) {
                    ekrw ekrwVarH = cfikVar.g.h();
                    ekrwVarH.X(eksq.a, "BugleGDitto");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "stopBindHandler", 135, "GaiaDittoBindManagerImpl.kt")).q("stop bind handler for Gaia pairing");
                    aVar.dF().e();
                    ((ains) cfikVar.c.b()).e("Bugle.Ditto.Binding.Stop.Counts", 2);
                }
                eiju eijuVarE = eijx.e(null);
                eijuVarE.getClass();
                return eijuVarE;
            }
        });
    }
}
