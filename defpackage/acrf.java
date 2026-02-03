package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrf implements egps<Void, Boolean> {
    final /* synthetic */ acrt a;

    public acrf(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            ekrw ekrwVarE = acrt.a.e();
            ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer$23", "onSuccess", 3856, "HomeFragmentPeer.java")).q("HomeFragment gaiaPromoCallback onSuccess. Will launch Gaia Paring page.");
            ((Optional) this.a.I.b()).ifPresent(new Consumer() { // from class: acrd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    ((cyqs) obj3).d();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        ekrw ekrwVarE2 = acrt.a.e();
        ekrwVarE2.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$23", "onSuccess", 3862, "HomeFragmentPeer.java")).q("HomeFragment gaiaPromoCallback onSuccess. Will launch Gpp ESI");
        ((Optional) this.a.ap.b()).ifPresent(new Consumer() { // from class: acre
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj3) {
                acrt acrtVar = this.a.a;
                acrtVar.b.fg().getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 2);
                acbn.a((efxf) acrtVar.aq.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$23", "onFailure", (char) 3879, "HomeFragmentPeer.java")).q("Failed to get Gaia promo callback");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
