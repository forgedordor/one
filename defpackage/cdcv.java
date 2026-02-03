package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdcv implements cdbu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler");
    public final Map b;
    public final cdei c;
    public final eygg d;
    public final cdio e;
    public final Optional f;
    private final ains g;
    private final caxe h;
    private final eosc i;

    public cdcv(Map map, cdei cdeiVar, ains ainsVar, eygg eyggVar, Optional optional, caxe caxeVar, cdio cdioVar, eosc eoscVar) {
        this.b = map;
        this.c = cdeiVar;
        this.g = ainsVar;
        this.d = eyggVar;
        this.f = optional;
        this.h = caxeVar;
        this.e = cdioVar;
        this.i = eoscVar;
    }

    @Override // defpackage.cdbu
    public final eiju a() {
        return eijx.e(null);
    }

    @Override // defpackage.cdbu
    public final void b(long j) {
        this.g.e("Bugle.Fcm.Tickle.Downgrade.Counts", cdbs.a(4));
    }

    @Override // defpackage.cdbu
    public final void c(final ezol ezolVar, final String str, final int i, final int i2, final int i3) {
        Optional optional = this.f;
        optional.isPresent();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleGaia");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler", "handleTickleOverride", 92, "GaiaTachyonTickleHandler.java")).q("GAIA Tachyon Tickle: Received Tickle");
        abfd abfdVar = (abfd) optional.get();
        Object objB = abfdVar.c.b();
        objB.getClass();
        eiju eijuVarH = auvw.c((fdjx) objB, fcyi.a, fdjz.a, new abfc(abfdVar, null)).h(new ejvr() { // from class: cdcs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final String str2 = str;
                final cdcv cdcvVar = this.a;
                final ezol ezolVar2 = ezolVar;
                int i4 = i2;
                int i5 = i;
                if (zBooleanValue) {
                    ekrw ekrwVarE2 = cdcv.a.e();
                    ekrz ekrzVar = eksq.a;
                    ekrwVarE2.X(ekrzVar, "BugleGaia");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler", "handleTickleOverride", 100, "GaiaTachyonTickleHandler.java")).q("Gaia Tachyon Tickle: Handled by override");
                    Object obj2 = cdcvVar.f.get();
                    ezolVar2.getClass();
                    ekrw ekrwVarH = abfd.a.h();
                    ekrwVarH.X(ekrzVar, "DittoSatellite");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteGaiaTachyonTickleHandlerOverride", "handleTickle", 61, "SatelliteGaiaTachyonTickleHandlerOverride.kt")).q("Satellite override handling Gaia Tachyon FCM Tickle");
                    ((abfd) obj2).b.c(ezolVar2, str2, i5, i4, 1);
                    return null;
                }
                ekrw ekrwVarE3 = cdcv.a.e();
                ekrwVarE3.X(eksq.a, "BugleGaia");
                ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler", "handleTickleOverride", 105, "GaiaTachyonTickleHandler.java")).q("Gaia Tachyon Tickle: Default handling");
                if (!cdcvVar.e.a() || !ezolVar2.d.equals("GDitto")) {
                    cdcvVar.c.c(str2, ezolVar2, new ejvr() { // from class: cdcq
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj3) {
                            return cdcvVar.d((ezol) obj3, "");
                        }
                    }, new ejvr() { // from class: cdcr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj3) {
                            ezol ezolVar3 = (ezol) obj3;
                            cfic cficVar = (cfic) cdcvVar.b.get(ezolVar3.d);
                            return cficVar == null ? eijx.d(new cdcu(ezolVar3.d)) : cficVar.a(ezolVar3);
                        }
                    }, "GAIA", cdei.b(i5, i4), false, false, false, false, i3);
                    return null;
                }
                final cdco cdcoVar = (cdco) cdcvVar.d.b();
                final BiFunction biFunction = new BiFunction() { // from class: cdcp
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return cdcvVar.d((ezol) obj3, (String) obj4);
                    }
                };
                ceos ceosVar = (ceos) cdcoVar.f.b();
                ((bvio) cdcoVar.c.b()).e(str2, i4, i5);
                Optional optional2 = cdcoVar.d;
                if (optional2.isEmpty()) {
                    cdco.a.r("Ditto tickle is not supported on this device");
                    return null;
                }
                if (!((Boolean) cdip.a.e()).booleanValue() || ((bvkr) cdcoVar.g.b()).p(Optional.of(ezolVar2.c))) {
                    ((ceov) optional2.get()).g(ceosVar);
                }
                cqbd cqbdVarC = cdco.a.c();
                cqbdVarC.I("Handling firebase tickle for Ditto, ID:");
                cqbdVarC.I(str2);
                cqbdVarC.r();
                cdcoVar.b.c("Bugle.Ditto.FcmPush");
                eiju eijuVarH2 = eijx.h(new eooy() { // from class: cdck
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ((bvit) cdcoVar.e.b()).t();
                        return eijx.e(null);
                    }
                }, cdcoVar.h);
                eooz eoozVar = new eooz() { // from class: cdcl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        return (ListenableFuture) biFunction.apply(ezolVar2, str2);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eiju eijuVarI = eijuVarH2.i(eoozVar, eoqgVar);
                eika.l(eijuVarI, new cqob(new Consumer() { // from class: cdcm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        cqbd cqbdVarC2 = cdco.a.c();
                        cqbdVarC2.I("Successfully handled tickle with ID:");
                        cqbdVarC2.I(str2);
                        cqbdVarC2.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: cdcn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        cqbd cqbdVarE = cdco.a.e();
                        cqbdVarE.I("Failed to handle tickle with ID:");
                        cqbdVarE.I(str2);
                        cqbdVarE.s((Throwable) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), eoqgVar);
                eika.l(eijuVarI, ceosVar, eoqgVar);
                return null;
            }
        }, this.i);
        this.h.d(EnumSet.of(caxd.WAKELOCK), eijuVarH, new Supplier() { // from class: cdct
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        });
    }

    public final eiju d(ezol ezolVar, String str) {
        cfic cficVar = (cfic) this.b.get(ezolVar.d);
        return cficVar == null ? eijx.d(new cdcu(ezolVar.d)) : cficVar.f(ezolVar, str);
    }
}
