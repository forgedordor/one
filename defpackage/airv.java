package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class airv extends aivg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/compose/cuj/ComposeCuiLogger");
    public final fdjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airv(fdjx fdjxVar, fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
        fdjxVar.getClass();
        fcsuVar.getClass();
        executor.getClass();
        this.b = fdjxVar;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: airn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                ennd enndVar = (ennd) obj2;
                eliuVar.getClass();
                enndVar.getClass();
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                elivVar.e = enndVar;
                elivVar.b |= 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
