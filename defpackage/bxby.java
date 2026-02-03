package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxby implements bxam {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin");
    static final cczi b = cdag.e(cdag.b, "max_expected_read_lock_wait_time_ms", 5000);
    static final cczi c = cdag.e(cdag.b, "max_expected_query_cpu_time", 250);
    static final cczi d = cdag.e(cdag.b, "max_non_severe_query_cpu_time", 2000);
    public final cogw g;
    private final aqml i;
    private final apsx j;
    public final Semaphore e = new Semaphore(4, true);
    public final ThreadLocal f = new ThreadLocal() { // from class: bxbx
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            ekrg ekrgVar = bxby.a;
            return false;
        }
    };
    private final AtomicLong h = new AtomicLong(0);

    public bxby(cogw cogwVar, aqml aqmlVar, apsx apsxVar) {
        this.g = cogwVar;
        this.i = aqmlVar;
        this.j = apsxVar;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        final bxby bxbyVar;
        final dqtx dqtxVar2;
        final Runnable runnable;
        cogw cogwVar = this.g;
        final long jA = cogwVar.a();
        final long millis = cogwVar.d().toMillis();
        final AtomicLong atomicLong = new AtomicLong(0L);
        aqml aqmlVar = this.i;
        final long andIncrement = this.h.getAndIncrement();
        if (((eoth) ((aqly) aqmlVar).a.b()).a("bugle.enable_slow_query_logging") && ((dqov) dqtxVar).b == dqus.QUERY) {
            bxbyVar = this;
            dqtxVar2 = dqtxVar;
            runnable = new Runnable() { // from class: bxbs
                @Override // java.lang.Runnable
                public final void run() {
                    cogw cogwVar2 = this.a.g;
                    long millis2 = cogwVar2.d().minusMillis(millis).toMillis();
                    long jIntValue = ((Integer) bxby.d.e()).intValue();
                    AtomicLong atomicLong2 = atomicLong;
                    long j = jA;
                    long j2 = andIncrement;
                    dqtx dqtxVar3 = dqtxVar2;
                    String str = "Unknown";
                    if (millis2 > jIntValue) {
                        ekrw ekrwVarI = bxby.a.i();
                        ekrwVarI.X(eksq.a, "BugleDatabasePerf");
                        ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarI).g(eiip.b(new Exception("SlowQueryException")))).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 126, "ReadLockPlugin.java");
                        dziq dziqVar = new dziq(millis2);
                        Object objE = bxby.c.e();
                        dqov dqovVar = (dqov) dqtxVar3;
                        dziu dziuVar = new dziu(dqovVar.b);
                        Long lValueOf = Long.valueOf(j2);
                        dzis dzisVarA = dqovVar.a.a();
                        dziq dziqVar2 = new dziq(cogwVar2.a() - j);
                        if (atomicLong2.get() > 0) {
                            str = cogwVar2.d().minusMillis(atomicLong2.get()).toMillis() + "ms";
                        }
                        ekrdVar.M("ReadLockPlugin query took %s ms, longer than the expected %d ms max. op=%s, opId=%s, tag=%s, wallDuration=%sms, postLockThreadDuration=%s", dziqVar, objE, dziuVar, lValueOf, dzisVarA, dziqVar2, str);
                        return;
                    }
                    cczi ccziVar = bxby.c;
                    if (millis2 > ((Integer) ccziVar.e()).intValue()) {
                        ekrw ekrwVarJ = bxby.a.j();
                        ekrwVarJ.X(eksq.a, "BugleDatabasePerf");
                        ekrd ekrdVar2 = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(eiip.b(new Exception("SlowQueryException")))).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 148, "ReadLockPlugin.java");
                        dziq dziqVar3 = new dziq(millis2);
                        Object objE2 = ccziVar.e();
                        dqov dqovVar2 = (dqov) dqtxVar3;
                        dziu dziuVar2 = new dziu(dqovVar2.b);
                        Long lValueOf2 = Long.valueOf(j2);
                        dzis dzisVarA2 = dqovVar2.a.a();
                        dziq dziqVar4 = new dziq(cogwVar2.a() - j);
                        if (atomicLong2.get() > 0) {
                            str = cogwVar2.d().minusMillis(atomicLong2.get()).toMillis() + "ms";
                        }
                        ekrdVar2.M("ReadLockPlugin query took %s ms, longer than the expected %d ms max. op=%s, opId=%s, tag=%s, wallDuration=%sms, postLockThreadDuration=%s", dziqVar3, objE2, dziuVar2, lValueOf2, dzisVarA2, dziqVar4, str);
                    }
                }
            };
        } else {
            bxbyVar = this;
            dqtxVar2 = dqtxVar;
            runnable = null;
        }
        dqov dqovVar = (dqov) dqtxVar2;
        int iOrdinal = dqovVar.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (!((Boolean) bxbyVar.f.get()).booleanValue() && (!((eoth) ((aoyw) bxbyVar.j).a.b()).a("bugle.enable_read_plugin_during_initialization_bugfix") || !((Boolean) dqovVar.j.get()).booleanValue())) {
                bxbyVar.e.acquireUninterruptibly();
                atomicLong.set(cogwVar.d().toMillis());
                long jA2 = cogwVar.a() - jA;
                cczi ccziVar = b;
                if (jA2 > ((Integer) ccziVar.e()).intValue()) {
                    if (cqbe.h()) {
                        ekrw ekrwVarH = a.h();
                        ekrwVarH.X(eksq.a, "BugleDatabasePerf");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 211, "ReadLockPlugin.java")).I("%s took > %d (%d ms) to acquire readLock", dqovVar.a, ccziVar.e(), Long.valueOf(jA2));
                    } else {
                        ekrw ekrwVarJ = a.j();
                        ekrwVarJ.X(eksq.a, "BugleDatabasePerf");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 215, "ReadLockPlugin.java")).I("%s took > %d (%d ms) to acquire readLock", dqovVar.a, ccziVar.e(), Long.valueOf(jA2));
                    }
                }
                return new Closeable() { // from class: bxbv
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        this.a.e.release();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
            }
        } else {
            if (iOrdinal == 6) {
                return new Closeable() { // from class: bxbt
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        ThreadLocal threadLocal = this.a.f;
                        ejwl.l(!((Boolean) threadLocal.get()).booleanValue());
                        threadLocal.set(true);
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
            }
            if (iOrdinal == 8) {
                return new Closeable() { // from class: bxbu
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        ThreadLocal threadLocal = this.a.f;
                        ejwl.l(((Boolean) threadLocal.get()).booleanValue());
                        threadLocal.set(false);
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
            }
            if (runnable != null) {
                return new Closeable() { // from class: bxbw
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        ekrg ekrgVar = bxby.a;
                        runnable.run();
                    }
                };
            }
        }
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return false;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
