package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andd extends fcyz implements fdat {
    final /* synthetic */ andf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public andd(andf andfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = andfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((andd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        andf andfVar = this.a;
        andz andzVar = andfVar.e;
        synchronized (andzVar.b) {
            anaz anazVar = andzVar.d;
            if (anazVar == null) {
                ekrw ekrwVarH = andz.a.h();
                ekrwVarH.X(eksq.a, "BugleMapi");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 282, "OptimisticMessagePager.kt")).q("dropping optimistic mutation for in flight messages, cache was null.");
            } else {
                List listA = andzVar.e;
                andk andkVar = anazVar.c;
                Instant instantA = andh.a(andkVar.a);
                Iterator it = listA.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((ajlt) it.next()).o().compareTo(instantA) <= 0) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    listA = ekfv.a(listA.subList(0, i));
                }
                if (listA.isEmpty()) {
                    ekrw ekrwVarH2 = andz.a.h();
                    ekrwVarH2.X(eksq.a, "BugleMapi");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 287, "OptimisticMessagePager.kt")).q("cache already includes all in flight messages.");
                } else {
                    AtomicLong atomicLong = andzVar.c;
                    long j = anazVar.b;
                    long j2 = 1 + j;
                    if (atomicLong.compareAndSet(j, j2)) {
                        int i2 = anazVar.a;
                        andk andkVarD = andzVar.d(andkVar, listA, i2);
                        ekrw ekrwVarH3 = andz.a.h();
                        ekrwVarH3.X(eksq.a, "BugleMapi");
                        ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 302, "OptimisticMessagePager.kt")).s("cache updated with in flight messages at version %d", j2);
                        andzVar.d = new anaz(i2, j2, andkVarD);
                        andfVar.f.c(false);
                    } else {
                        ekrw ekrwVarH4 = andz.a.h();
                        ekrwVarH4.X(eksq.a, "BugleMapi");
                        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 293, "OptimisticMessagePager.kt")).A("cache version is obsolete: cache: %d, current version: %d.", j, atomicLong);
                    }
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new andd(this.a, fcxyVar);
    }
}
