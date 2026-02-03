package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker");
    public final Object b;
    public final AtomicLong c;
    public anaz d;
    public final List e;
    private final fdap f;

    public andz(List list, Object obj, AtomicLong atomicLong, fdap fdapVar) {
        this.b = obj;
        this.c = atomicLong;
        this.f = fdapVar;
        this.e = list;
    }

    public final long a() {
        return this.c.get();
    }

    public final anaz b() {
        anaz anazVar;
        synchronized (this.b) {
            anazVar = this.d;
        }
        return anazVar;
    }

    public final andk c(int i, long j, andk andkVar) {
        if (andkVar.b > 0) {
            return andkVar;
        }
        synchronized (this.b) {
            anaz anazVar = this.d;
            final Instant instantA = andh.a(andkVar.a);
            List list = this.e;
            final fdap fdapVar = new fdap() { // from class: andx
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ajlt ajltVar = (ajlt) obj;
                    ajltVar.getClass();
                    return Boolean.valueOf(ajltVar.o().compareTo(instantA) <= 0);
                }
            };
            Collection.EL.removeIf(list, new Predicate() { // from class: andy
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                }
            });
            if (!list.isEmpty()) {
                andkVar = d(andkVar, list, i);
            }
            if (anazVar != null) {
                long j2 = anazVar.b;
                if (j2 <= j) {
                    this.d = new anaz(i, j, andkVar);
                    ekrw ekrwVarH = a.h();
                    ekrwVarH.X(eksq.a, "BugleMapi");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 268, "OptimisticMessagePager.kt")).s("cache set to non null value at version %d.", j);
                } else {
                    ekrw ekrwVarH2 = a.h();
                    ekrwVarH2.X(eksq.a, "BugleMapi");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 272, "OptimisticMessagePager.kt")).z("cache is at a newer version, leaving as is. %d > %d", j2, j);
                }
            } else {
                this.d = new anaz(i, j, andkVar);
                ekrw ekrwVarH3 = a.h();
                ekrwVarH3.X(eksq.a, "BugleMapi");
                ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 268, "OptimisticMessagePager.kt")).s("cache set to non null value at version %d.", j);
            }
        }
        return andkVar;
    }

    public final andk d(andk andkVar, List list, int i) {
        long j;
        ekgb ekgbVar = andkVar.a;
        int iMin = list.size() > i ? Math.min(ekgbVar.size(), i) : Math.min(ekgbVar.size(), i - list.size());
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(list);
        ekfwVar.j(ekgbVar.subList(0, iMin));
        long size = andkVar.c + (ekgbVar.size() - iMin);
        if (size < 0) {
            ekrg ekrgVar = a;
            ekrw ekrwVarE = ekrgVar.e();
            ekrz ekrzVar = eksq.a;
            ekrwVarE.X(ekrzVar, "BugleMapi");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "merge", 333, "OptimisticMessagePager.kt")).I("Cached list size = %d, inFlights size = %d, endIndex = %d", Integer.valueOf(ekgbVar.size()), Integer.valueOf(list.size()), Integer.valueOf(iMin));
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleMapi");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "merge", 339, "OptimisticMessagePager.kt")).q("Paging results contain negative itemsAfter. Resetting to zero.");
            j = 0;
        } else {
            j = size;
        }
        if (andkVar.b != 0) {
            throw new IllegalStateException("Check failed.");
        }
        ekgb ekgbVarG = ekfwVar.g();
        ekgbVarG.getClass();
        return new andk(ekgbVarG, 0L, j, this.f);
    }
}
