package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admk extends aivg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/label/analytics/AutoDeletedMessagesEventLogger");
    public final fcsu b;

    public admk(fcsu fcsuVar, fcsu fcsuVar2, admo admoVar, Executor executor) {
        super(fcsuVar, admoVar, executor);
        this.b = fcsuVar2;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: admh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enid enidVar = (enid) obj;
                enic enicVar = (enic) obj2;
                enidVar.copyOnWrite();
                enie enieVar = (enie) enidVar.instance;
                enie enieVar2 = enie.a;
                enicVar.getClass();
                enieVar.c = enicVar;
                enieVar.b = 5;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
