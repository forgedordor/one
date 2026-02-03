package defpackage;

import j$.time.Duration;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisc extends aivg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger");
    public final cden b;
    private final fdjx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisc(fdjx fdjxVar, cden cdenVar, fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
        fdjxVar.getClass();
        cdenVar.getClass();
        fcsuVar.getClass();
        executor.getClass();
        this.d = fdjxVar;
        this.b = cdenVar;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: airw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emsm emsmVar = (emsm) obj2;
                eliuVar.getClass();
                emsmVar.getClass();
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                elivVar.d = emsmVar;
                elivVar.c = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final Integer b(Duration duration) {
        long millis = duration.toMillis();
        if (millis <= 0) {
            return null;
        }
        if (millis <= 2147483647L) {
            return Integer.valueOf((int) millis);
        }
        auvw.k(this.d, null, null, new aisb(this, millis, null), 3);
        return null;
    }

    public final void c(emsp emspVar, emsr emsrVar, emsh emshVar, Integer num, Duration duration) {
        emspVar.getClass();
        emsrVar.getClass();
        emshVar.getClass();
        auvw.k(this.d, null, null, new airy(this, emspVar, emshVar, num, duration, emsrVar, null), 3);
    }

    public final void d(emsp emspVar, emsr emsrVar, emsj emsjVar, emsl emslVar, Integer num, Duration duration) {
        emspVar.getClass();
        emsrVar.getClass();
        emsjVar.getClass();
        emslVar.getClass();
        auvw.k(this.d, null, null, new aisa(this, emspVar, emsjVar, num, duration, emslVar, emsrVar, null), 3);
    }
}
