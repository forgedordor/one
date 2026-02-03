package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.Optional;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxep implements bxam {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin");
    static final cczi b = cdag.k(cdag.b, "transaction_watchdog_limit_ms", 5000);
    public static final Object c = new Object();
    public final cogw d;
    public final eosd e;
    public eosb f;
    public boolean g;
    private final eygg h;
    private final aprj i;

    public bxep(eosd eosdVar, aprj aprjVar, cogw cogwVar, eygg eyggVar) {
        this.e = eosdVar;
        this.i = aprjVar;
        this.d = cogwVar;
        this.h = eyggVar;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        int iOrdinal = ((dqov) dqtxVar).b.ordinal();
        if (iOrdinal == 6) {
            final Optional optional = (Optional) this.h.b();
            if (optional.isEmpty()) {
                return null;
            }
            return new Closeable() { // from class: bxen
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    final bxep bxepVar = this.a;
                    synchronized (bxep.c) {
                        bxepVar.g = true;
                    }
                    final Optional optional2 = optional;
                    final Thread threadCurrentThread = Thread.currentThread();
                    final StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
                    cogw cogwVar = bxepVar.d;
                    final long jA = cogwVar.a();
                    final long millis = cogwVar.d().toMillis();
                    bxepVar.f = bxepVar.e.schedule(new Runnable() { // from class: bxem
                        @Override // java.lang.Runnable
                        public final void run() {
                            bxep bxepVar2 = bxepVar;
                            Thread thread = threadCurrentThread;
                            StackTraceElement[] stackTraceElementArr = stackTrace;
                            Optional optional3 = optional2;
                            synchronized (bxep.c) {
                                if (bxepVar2.g) {
                                    cogw cogwVar2 = bxepVar2.d;
                                    long jA2 = cogwVar2.a() - jA;
                                    long millis2 = cogwVar2.d().toMillis() - millis;
                                    bxeo bxeoVar = new bxeo();
                                    try {
                                        bxeoVar.setStackTrace(thread.getStackTrace());
                                    } catch (RuntimeException e) {
                                        ekrw ekrwVarI = bxep.a.i();
                                        ekrwVarI.X(eksq.a, "BugleDatabasePerf");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin", "open", 133, "TransactionWatchDogPlugin.java")).q("unable to acquire stack trace from thread holding transaction");
                                    }
                                    bxeo bxeoVar2 = new bxeo(bxeoVar);
                                    bxeoVar2.setStackTrace(stackTraceElementArr);
                                    ekrw ekrwVarJ = bxep.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleDatabasePerf");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(bxeoVar2)).h("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin", "open", 141, "TransactionWatchDogPlugin.java")).z("transaction taking excessive time (%d total; %d in thread)", jA2, millis2);
                                    ((bxak) optional3.get()).a();
                                }
                            }
                        }
                    }, ((Long) bxep.b.e()).longValue(), TimeUnit.MILLISECONDS);
                }
            };
        }
        if (iOrdinal != 8) {
            return null;
        }
        synchronized (c) {
            if (this.g) {
                this.g = false;
                this.f.cancel(false);
            }
        }
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((eoth) ((aowl) this.i).a.b()).a("bugle.report_long_transactions");
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
