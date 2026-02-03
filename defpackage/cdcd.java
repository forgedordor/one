package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdcd implements cdbu {
    public static final cqce a = cqce.g("BugleNetwork", "DittoTachyonTickleHandler");
    public final eygg b;
    public final Optional c;
    private final ains d;
    private final fcsu e;
    private final Optional f;
    private final fcsu g;
    private final eygg h;
    private final eosc i;

    public cdcd(ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, eygg eyggVar, Optional optional, eygg eyggVar2, Optional optional2, eosc eoscVar) {
        this.d = ainsVar;
        this.g = fcsuVar;
        this.e = fcsuVar2;
        this.b = eyggVar;
        this.f = optional;
        this.h = eyggVar2;
        this.c = optional2;
        this.i = eoscVar;
    }

    @Override // defpackage.cdbu
    public final eiju a() {
        if (((Boolean) ccze.i.e()).booleanValue()) {
            return ((cedm) this.h.b()).B();
        }
        a.m("Skipping tachyon registration refresh because ditto is not enabled.");
        return eijx.e(null);
    }

    @Override // defpackage.cdbu
    public final void b(long j) {
        this.d.e("Bugle.Fcm.Tickle.Downgrade.Counts", cdbs.a(2));
        ((bvit) this.b.b()).i(j);
    }

    @Override // defpackage.cdbu
    public final void c(ezol ezolVar, final String str, int i, int i2, int i3) {
        if (this.c.isEmpty()) {
            a.p("Ignore received Firebase message because TachyonReceiverManager is not present.");
            return;
        }
        ceos ceosVar = (ceos) this.g.b();
        ((bvio) this.e.b()).e(str, i2, i);
        final boolean zB = cdei.b(i, i2);
        Optional optional = this.f;
        if (optional.isEmpty()) {
            a.r("Ditto tickle does not support in this device");
            return;
        }
        ((ceov) optional.get()).g(ceosVar);
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Handling firebase tickle for Ditto, ID:");
        cqbdVarC.I(str);
        cqbdVarC.r();
        this.d.c("Bugle.Ditto.FcmPush");
        eiju eijuVarH = eijx.h(new eooy() { // from class: cdbz
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ((bvit) this.a.b.b()).t();
                return eijx.e(null);
            }
        }, this.i);
        eooz eoozVar = new eooz() { // from class: cdca
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cfzf) this.a.c.get()).i(str);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarI = eijuVarH.i(eoozVar, eoqgVar);
        eika.l(eijuVarI, new cqob(new Consumer() { // from class: cdcb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarC2 = cdcd.a.c();
                cqbdVarC2.I("Successfully handled tickle with ID:");
                cqbdVarC2.I(str);
                cqbdVarC2.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cdcc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarE = cdcd.a.e();
                cqbdVarE.I("Failed to handle tickle with ID:");
                cqbdVarE.I(str);
                cqbdVarE.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoqgVar);
        eika.l(eijuVarI, ceosVar, eoqgVar);
    }
}
