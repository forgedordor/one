package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.car.app.hardware.info.EnergyProfile;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxaj implements bxam {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin");
    public final fcsu b;
    public final ReentrantReadWriteLock c;
    public final ThreadLocal d;
    private final aioy e;
    private final aqmk f;
    private final AtomicInteger g;

    public bxaj(fcsu fcsuVar, aioy aioyVar, aqmk aqmkVar) {
        fcsuVar.getClass();
        aioyVar.getClass();
        this.b = fcsuVar;
        this.e = aioyVar;
        this.f = aqmkVar;
        this.c = new ReentrantReadWriteLock(true);
        this.d = new ThreadLocal() { // from class: bxai
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Object initialValue() {
                return false;
            }
        };
        this.g = new AtomicInteger(0);
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    public final long f(fdae fdaeVar) {
        aioz aiozVarA = this.e.a();
        fdaeVar.invoke();
        return aiozVarA.a();
    }

    public final void g(final fdae fdaeVar) {
        long jF = f(new fdae() { // from class: bxad
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.c.writeLock().lock();
                return fctx.a;
            }
        });
        try {
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleDatabase");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "withMaintenanceWriteLock", 181, "DatabaseMaintenancePlugin.kt")).s("Took %dms acquire the lock for maintenance", jF);
            long jF2 = f(new fdae() { // from class: bxae
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdaeVar.invoke();
                    return fctx.a;
                }
            });
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleDatabase");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "withMaintenanceWriteLock", 183, "DatabaseMaintenancePlugin.kt")).s("Completed maintenance operations after %dms", jF2);
        } finally {
            this.c.writeLock().unlock();
        }
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        dqov dqovVar = (dqov) dqtxVar;
        int iOrdinal = dqovVar.b.ordinal();
        if (iOrdinal == 6) {
            this.d.set(true);
            return null;
        }
        if (iOrdinal == 8 || iOrdinal == 15) {
            this.d.set(false);
            return null;
        }
        if (((Boolean) this.d.get()).booleanValue()) {
            return null;
        }
        if (!this.c.readLock().tryLock()) {
            AtomicInteger atomicInteger = this.g;
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            ekrg ekrgVar = a;
            ekrw ekrwVarJ = ekrgVar.j();
            ekrz ekrzVar = eksq.a;
            ekrwVarJ.X(ekrzVar, "BugleDatabase");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "openBlockableOperation", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "DatabaseMaintenancePlugin.kt")).B("Blocking new DB operation %s for maintenance. Queue number %d", dqovVar.a, iIncrementAndGet);
            long jF = f(new fdae() { // from class: bxag
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.c.readLock().lock();
                    return fctx.a;
                }
            });
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(ekrzVar, "BugleDatabase");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "openBlockableOperation", 109, "DatabaseMaintenancePlugin.kt")).y("Maintenance operation blocked DB operation %s for %d ms.", jF, iIncrementAndGet);
            atomicInteger.decrementAndGet();
        }
        return new Closeable() { // from class: bxah
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.a.c.readLock().unlock();
            }
        };
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((eoth) ((aqlw) this.f).a.b()).a("bugle.enable_database_maintenance_plugin");
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
