package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atns implements atnu {
    public final fcsu a;
    public final Optional b;
    public final Optional c;
    public final fcsu d;
    private final eosc e;
    private final eosc f;
    private final cogw g;

    public atns(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, Optional optional, Optional optional2, fcsu fcsuVar2, cogw cogwVar) {
        this.e = eoscVar;
        this.f = eoscVar2;
        this.a = fcsuVar;
        this.b = optional;
        this.c = optional2;
        this.d = fcsuVar2;
        this.g = cogwVar;
    }

    @Override // defpackage.atnu
    public final eiju a(final MessageCoreData messageCoreData) {
        messageCoreData.aX(Instant.ofEpochMilli(messageCoreData.cK() ? messageCoreData.o() : this.g.f().toEpochMilli()));
        return eijx.f(new Runnable() { // from class: atnq
            @Override // java.lang.Runnable
            public final void run() {
                atns atnsVar = this.a;
                baxe baxeVar = (baxe) atnsVar.a.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                baxeVar.U(messageCoreData2);
                atnsVar.b.ifPresent(new Consumer() { // from class: atno
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        messageCoreData3.u();
                        messageCoreData3.k();
                        ((cdzq) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, this.f).h(new ejvr() { // from class: atnr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atns atnsVar = this.a;
                atnsVar.c.ifPresent(new Consumer() { // from class: atnp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ((chtr) ((fcsu) obj2).b()).k(enxe.FILE_TRANSFER_CREDENTIALS_EXPIRED);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.e);
    }
}
