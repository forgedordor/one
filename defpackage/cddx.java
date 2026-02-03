package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddx implements cdbu {
    public static final /* synthetic */ int c = 0;
    public final eygg b;
    private final ains e;
    private final Optional f;
    private final cdei g;
    private final cddi h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final awlc l;
    private final fcsu m;
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler");
    static final cczv a = cdag.h(cdag.b, "open_bind_after_pull", true);

    public cddx(ains ainsVar, eygg eyggVar, Optional optional, cdei cdeiVar, cddi cddiVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, awlc awlcVar, fcsu fcsuVar4) {
        this.e = ainsVar;
        this.b = eyggVar;
        this.f = optional;
        this.g = cdeiVar;
        this.h = cddiVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = awlcVar;
        this.m = fcsuVar4;
    }

    private final boolean d() {
        return cezu.a();
    }

    @Override // defpackage.cdbu
    public final eiju a() {
        if (d()) {
            return ((dggw) this.j.b()).e().i(new eooz() { // from class: cddw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Stream stream = Collection.EL.stream((Set) obj);
                    final cddx cddxVar = this.a;
                    Stream map = stream.map(new Function() { // from class: cddq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((cejj) cddxVar.b.b()).e(((dggk) obj2).a, 10).i(new eooz() { // from class: cddv
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    int i = cddx.c;
                                    return ((cejg) obj3).m(cedo.FORCE_REFRESH);
                                }
                            }, eoqg.a);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = ekgb.d;
                    return eijx.j((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: cddr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i2 = cddx.c;
                            return null;
                        }
                    }, eoqg.a);
                }
            }, eoqg.a);
        }
        ekrw ekrwVarE = d.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler", "refreshToken", 149, "PhoneTachyonTickleHandler.java")).q("Skipping tachyon registration refresh because phone registration is not enabled.");
        return eijx.e(null);
    }

    @Override // defpackage.cdbu
    public final void b(long j) {
        this.e.e("Bugle.Fcm.Tickle.Downgrade.Counts", cdbs.a(3));
    }

    @Override // defpackage.cdbu
    public final void c(ezol ezolVar, String str, int i, int i2, int i3) {
        eieu eieuVarK = eiiy.k("PhoneTachyonTickleHandler::onTickleReceived");
        try {
            if (this.f.isEmpty()) {
                ekrw ekrwVarH = d.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler", "onTickleReceivedInSpan", 108, "PhoneTachyonTickleHandler.java")).q("Ignore received Firebase message because TachyonReceiverManager is not present.");
            } else if (d()) {
                if (((aryk) this.m.b()).a()) {
                    this.l.d(new Consumer() { // from class: cdds
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((cdce) obj).a();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                cgam cgamVar = (cgam) this.i.b();
                basd basdVarA = basd.a(str);
                febx febxVar = (febx) fecc.a.createBuilder();
                fhaz fhazVarA = cqdr.a();
                febxVar.copyOnWrite();
                fecc feccVar = (fecc) febxVar.instance;
                fhazVarA.getClass();
                feccVar.c = fhazVarA;
                feccVar.b |= 1;
                febxVar.copyOnWrite();
                ((fecc) febxVar.instance).e = fecb.a(5);
                febxVar.copyOnWrite();
                ((fecc) febxVar.instance).g = feca.a(47);
                febv febvVar = (febv) febw.a.createBuilder();
                febvVar.a(str);
                febw febwVar = (febw) febvVar.build();
                febxVar.copyOnWrite();
                fecc feccVar2 = (fecc) febxVar.instance;
                febwVar.getClass();
                feccVar2.d = febwVar;
                feccVar2.b |= 2;
                cgamVar.b(basdVarA, febxVar);
                this.e.c("Bugle.PhoneIdentity.FcmPush");
                cdei cdeiVar = this.g;
                final cddi cddiVar = this.h;
                cdeiVar.c(str, ezolVar, new ejvr() { // from class: cddt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cddiVar.c((ezol) obj);
                    }
                }, new ejvr() { // from class: cddu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cddiVar.d((ezol) obj);
                    }
                }, "Phone", cdei.b(i, i2), ((Boolean) a.e()).booleanValue(), ((Boolean) cmxp.a.e()).booleanValue(), ((Boolean) cmxp.b.e()).booleanValue(), ((Boolean) cmxp.c.e()).booleanValue(), i3);
            } else {
                ekrw ekrwVarH2 = d.h();
                ekrwVarH2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler", "onTickleReceivedInSpan", 114, "PhoneTachyonTickleHandler.java")).q("Ignore phone tickle when phone registration is not enabled.");
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
