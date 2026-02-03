package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiFunction$CC;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byej {
    public final eosd a;
    private final dqsn c;
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public byej(dqsn dqsnVar, eosd eosdVar) {
        this.c = dqsnVar;
        this.a = eosdVar;
    }

    public final Integer a(MessageIdType messageIdType) {
        if (messageIdType.c()) {
            return null;
        }
        return (Integer) this.b.get(messageIdType);
    }

    public final Integer b(basd basdVar) {
        if (basdVar.i()) {
            return null;
        }
        return (Integer) this.d.get(basdVar);
    }

    public final boolean c(basd basdVar, int i) {
        if (basdVar.i()) {
            return false;
        }
        return d(basdVar, this.d, i);
    }

    public final boolean d(final Object obj, final ConcurrentHashMap concurrentHashMap, final int i) {
        final AtomicInteger atomicInteger = new AtomicInteger(-999);
        Integer num = (Integer) ConcurrentMap.EL.merge(concurrentHashMap, obj, Integer.valueOf(i), new BiFunction() { // from class: byeg
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                Integer num2 = (Integer) obj2;
                atomicInteger.set(num2.intValue());
                return Integer.valueOf(Math.max(num2.intValue(), ((Integer) obj3).intValue()));
            }
        });
        if (num.intValue() == i) {
            this.c.g(new dqsm() { // from class: byeh
                @Override // defpackage.dqsm
                public final eieu a() {
                    return eiiy.k("StatusTracker::updateStatus");
                }
            }, null, new Runnable() { // from class: byei
                @Override // java.lang.Runnable
                public final void run() {
                    final ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    final Object obj2 = obj;
                    final int i2 = i;
                    auvh.e(this.a.a.schedule(eiid.k(new Runnable() { // from class: byef
                        @Override // java.lang.Runnable
                        public final void run() {
                            concurrentHashMap2.remove(obj2, Integer.valueOf(i2));
                        }
                    }), 3L, TimeUnit.SECONDS));
                }
            });
        }
        return atomicInteger.get() == -999 || atomicInteger.get() != num.intValue();
    }
}
