package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atni implements atnu {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final cggg c;
    private final eosc d;
    private final eosc e;
    private final Optional f;
    private final cogw g;

    public atni(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, Optional optional, cggg cgggVar, cogw cogwVar) {
        this.d = eoscVar;
        this.e = eoscVar2;
        this.b = fcsuVar;
        this.f = optional;
        this.c = cgggVar;
        this.g = cogwVar;
    }

    @Override // defpackage.atnu
    public final eiju a(final MessageCoreData messageCoreData) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.s, messageCoreData.A());
        ekslVar.X(cqnc.b, messageCoreData.C());
        ekslVar.X(cqnc.f, messageCoreData.F());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/retry/NoRetryStrategy", "execute", 60, "NoRetryStrategy.java")).q("Failing file transfer with no retry.");
        messageCoreData.bb(messageCoreData.cK() ? messageCoreData.o() : this.g.f().toEpochMilli());
        this.f.ifPresent(new Consumer() { // from class: atnd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = atni.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                messageCoreData2.u();
                messageCoreData2.k();
                ((cdzq) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eiju eijuVarG = eijx.g(new Callable() { // from class: atne
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((baxe) this.a.b.b()).U(messageCoreData));
            }
        }, this.d);
        eooz eoozVar = new eooz() { // from class: atnf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.c.a();
            }
        };
        eosc eoscVar = this.e;
        return eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: atng
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cazi) obj).b();
            }
        }, eoscVar).h(new ejvr() { // from class: atnh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = atni.a;
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                MessageCoreData messageCoreData2 = messageCoreData;
                eksl ekslVar2 = (eksl) atni.a.j();
                ekslVar2.X(cqnc.s, messageCoreData2.A());
                ekslVar2.X(cqnc.b, messageCoreData2.C());
                ekslVar2.X(cqnc.f, messageCoreData2.F());
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/retry/NoRetryStrategy", "execute", 88, "NoRetryStrategy.java")).q("Couldn't refresh the failure notification for file transfer.");
                return null;
            }
        }, eoscVar);
    }
}
