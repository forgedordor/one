package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankc implements ajlw {
    public static final /* synthetic */ int c = 0;
    private static final eksp d = eksp.c("BugleSending");
    public final eosc a;
    public final eijt b = new eijt();
    private final fcsu e;
    private final fcsu f;
    private final Optional g;
    private final fcsu h;
    private final Optional i;
    private final fcsu j;
    private final fcsu k;

    public ankc(fcsu fcsuVar, fcsu fcsuVar2, Optional optional, fcsu fcsuVar3, eosc eoscVar, Optional optional2, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = optional;
        this.h = fcsuVar3;
        this.a = eoscVar;
        this.i = optional2;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
    }

    @Override // defpackage.ajlw
    public final eiju a(ajlx ajlxVar, Instant instant) {
        return !(ajlxVar instanceof amzg) ? eijx.d(new IllegalArgumentException("Unknown MessageEnvelope Type: ".concat(String.valueOf(String.valueOf(ajlxVar.getClass()))))) : ((cmcx) this.g.get()).a(((amzg) ajlxVar).g(), instant).h(new ejvr() { // from class: anjz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ankc.c;
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ajlw
    public final eiju b(ajlx ajlxVar) {
        fhaz fhazVarAJ;
        if (!(ajlxVar instanceof amzg)) {
            return eijx.d(new IllegalArgumentException("Unknown MessageEnvelope Type: ".concat(String.valueOf(String.valueOf(ajlxVar.getClass())))));
        }
        final amzg amzgVar = (amzg) ajlxVar;
        this.i.ifPresent(new Consumer() { // from class: anjy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                int i = ankc.c;
                ((ankf) obj).al(amzgVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        anaa anaaVarF = amzgVar.f();
        if (amzgVar.g().aJ() != null) {
            fhazVarAJ = amzgVar.g().aJ();
            fhazVarAJ.getClass();
        } else {
            fhazVarAJ = fhaz.a;
        }
        if (anaaVarF != null) {
            anhj anhjVar = anaaVarF.c == anhk.a ? anaaVarF.b : null;
            ajmp ajmpVar = (ajmp) this.j.b();
            MessageId messageId = anaaVarF.a;
            aoer aoerVarG = amzgVar.d().g();
            aoerVarG.getClass();
            ajmpVar.c(messageId, anhjVar, aoerVarG, fhazVarAJ);
        }
        fcsu fcsuVar = this.f;
        ((ajhd) fcsuVar.b()).S(amzgVar.h().a, fhazVarAJ, new ainn(amzgVar.b(), amzgVar.a()));
        ajhd ajhdVar = (ajhd) fcsuVar.b();
        amzgVar.g();
        amzgVar.d();
        ajhdVar.aq();
        eksp ekspVar = d;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = cqnc.t;
        ekslVar.X(ekrzVar, amzgVar.d().f());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/send/BugleMessageCourier", "send", 128, "BugleMessageCourier.java")).t("Sending prepared envelope: %s.", amzgVar);
        ajpu ajpuVar = (ajpu) this.e.b();
        aoer aoerVarG2 = amzgVar.d().g();
        aoerVarG2.getClass();
        ajpuVar.f(aoerVarG2, amzgVar.g(), amzgVar.b(), amzgVar.h());
        ((amst) this.k.b()).i();
        eieu eieuVarK = eiiy.k("MessageCourier::NotifySendMessageListeners");
        try {
            ekrw ekrwVarO = ekspVar.o();
            ekrwVarO.X(ekrzVar, amzgVar.d().f());
            eksl ekslVar2 = (eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/api/messaging/message/send/BugleMessageCourier", "notifySendMessageListeners", 153, "BugleMessageCourier.java");
            fcsu fcsuVar2 = this.h;
            ekslVar2.r("Notifying %d SendMessageListeners.", ((Set) fcsuVar2.b()).size());
            Stream map = Collection.EL.stream((Set) fcsuVar2.b()).map(new Function() { // from class: anka
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final anke ankeVar = (anke) obj;
                    eieu eieuVarA = ankeVar.a();
                    ankc ankcVar = this.a;
                    final amzg amzgVar2 = amzgVar;
                    try {
                        eiju eijuVarG = eiju.g(ankcVar.b.a(eiid.c(new eooy() { // from class: ankb
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                int i = ankc.c;
                                return ankeVar.b(amzgVar2);
                            }
                        }), ankcVar.a));
                        eieuVarA.b(eijuVarG);
                        eieuVarA.close();
                        return eijuVarG;
                    } catch (Throwable th) {
                        try {
                            eieuVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            if (!ekgbVar.isEmpty()) {
                eieu eieuVarK2 = eiiy.k("SendMessageNotify");
                try {
                    eiju eijuVarA = eijx.a(ekgbVar);
                    eieuVarK2.b(eijuVarA);
                    auvh.h(eijuVarA);
                    eieuVarK2.close();
                } finally {
                }
            }
            eieuVarK.close();
            return eijx.e(null);
        } finally {
        }
    }
}
