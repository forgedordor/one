package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egnk implements egmr {
    public final evrr a;
    public final eosc b;
    public final ecmd c;
    public final diep d;
    public final evuh e;
    public final long f;

    public egnk(egmn egmnVar, diep diepVar, evrr evrrVar, eosc eoscVar, egmt egmtVar) {
        this.d = diepVar;
        this.a = evrrVar;
        this.b = eoscVar;
        egmp egmpVar = (egmp) egmtVar;
        this.e = egmpVar.a;
        long millis = TimeUnit.DAYS.toMillis(7L);
        ejwl.b(millis < 0 || egmpVar.c < 0 || millis > 0, "If expireAfterWriteDays and filterAfterWrite are both set, filterAfterWrite must be a shorter duration");
        if (millis > 0) {
            this.f = millis;
        } else {
            this.f = -1L;
        }
        ecno ecnoVar = new ecno("evict_full_cache_trigger");
        ecnoVar.c("AFTER INSERT ON cache_table");
        c(ecnoVar, egmtVar);
        ecno ecnoVar2 = new ecno("recursive_eviction_trigger");
        ecnoVar2.c("AFTER DELETE ON cache_table");
        c(ecnoVar2, egmtVar);
        ecnm ecnmVar = new ecnm();
        ecnl.a("recursive_triggers = 1", ecnmVar);
        ecnl.a("synchronous = 0", ecnmVar);
        ecnk ecnkVar = new ecnk();
        ecnkVar.c("CREATE TABLE cache_table(request_data BLOB PRIMARY KEY, response_data BLOB NOT NULL, write_ms INTEGER NOT NULL, access_ms INTEGER NOT NULL)");
        ecnkVar.c("ALTER TABLE cache_table ADD COLUMN invalid_flag INTEGER NOT NULL DEFAULT 0");
        ecnkVar.c("DELETE FROM cache_table WHERE LENGTH(response_data) >= 2000000");
        ecnkVar.b(new ecnq() { // from class: egnf
            @Override // defpackage.ecnq
            public final void a(ecoa ecoaVar) {
            }
        });
        ecnkVar.c("CREATE INDEX access ON cache_table(access_ms)");
        ecnkVar.d(ecnoVar.a());
        ecnkVar.d(ecnoVar2.a());
        ecnkVar.a = ecnmVar;
        ecnr ecnrVarA = ecnkVar.a();
        final ehve ehveVar = new ehve(egmpVar.d, 2);
        final egik egikVar = egmnVar.a;
        ecmf ecmfVar = egikVar.b;
        ejwl.a(!"SqliteKeyValueCache:ProfileCache".contains(File.separator));
        eooy eooyVar = new eooy() { // from class: egii
            public final /* synthetic */ String c = "SqliteKeyValueCache:ProfileCache";

            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final egih egihVarA = egikVar.a.a(ehveVar, this.c.concat(".db"));
                return eooq.f(egihVarA.b.submit(eiid.l(new Callable() { // from class: egig
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws FileNotFoundException {
                        File fileA = egihVarA.a.a();
                        File parentFile = fileA.getParentFile();
                        if (parentFile.mkdirs() || (parentFile.exists() && parentFile.isDirectory())) {
                            return fileA;
                        }
                        throw new FileNotFoundException("Cannot create parent directory.");
                    }
                })), eiid.a(new ejvr() { // from class: egij
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((File) obj).getAbsolutePath();
                    }
                }), eoqg.a);
            }
        };
        Context context = (Context) ecmfVar.a.b();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ecmfVar.b.b();
        scheduledExecutorService.getClass();
        ecnf ecnfVar = (ecnf) ecmfVar.c.b();
        ecnfVar.getClass();
        this.c = new ecmd(new ecng(context, scheduledExecutorService, ecnfVar, eooyVar, ecnrVarA));
    }

    private static final void c(ecno ecnoVar, egmt egmtVar) {
        ecnoVar.c(" WHEN (");
        int i = ((egmp) egmtVar).b;
        if (i > 0) {
            ecnoVar.c("(SELECT SUM(LENGTH(request_data) + LENGTH(response_data)) > ");
            ecnoVar.b(i);
            ecnoVar.c(" AND COUNT(*) > 1 FROM cache_table) ");
        } else {
            ecnoVar.c("(SELECT COUNT(*) > ");
            ecnoVar.b(0);
            ecnoVar.c(" FROM cache_table) ");
        }
        ecnoVar.c(") BEGIN DELETE FROM cache_table WHERE rowid=(SELECT rowid FROM cache_table ORDER BY access_ms LIMIT 1); END");
    }

    @Override // defpackage.egmr
    public final ListenableFuture a(final evuh evuhVar) {
        return this.c.c(new ecny() { // from class: egne
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) throws InterruptedException {
                Object objJ;
                ecnw ecnwVar = new ecnw();
                ecnwVar.b("SELECT response_data, write_ms FROM cache_table WHERE request_data=?");
                evuh evuhVar2 = evuhVar;
                ecnwVar.e(evuhVar2.toByteArray());
                egnk egnkVar = this.a;
                long j = egnkVar.f;
                if (j > 0) {
                    ecnwVar.b(" AND write_ms>=?");
                    ecnwVar.c(Long.valueOf(egnkVar.d.f().toEpochMilli() - j));
                }
                Cursor cursorD = ecoaVar.d(ecnwVar.a());
                try {
                    if (!cursorD.moveToFirst()) {
                        objJ = ejud.a;
                        if (cursorD != null) {
                        }
                        return objJ;
                    }
                    byte[] blob = cursorD.getBlob(cursorD.getColumnIndexOrThrow("response_data"));
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(cursorD.getLong(cursorD.getColumnIndexOrThrow("write_ms")));
                    ecnw ecnwVar2 = new ecnw();
                    ecnwVar2.b("UPDATE OR FAIL cache_table SET access_ms=?");
                    ecnwVar2.d(Long.toString(egnkVar.d.f().toEpochMilli()));
                    ecnwVar2.b(" WHERE request_data=?");
                    ecnwVar2.e(evuhVar2.toByteArray());
                    ecoaVar.g(ecnwVar2.a());
                    evuh evuhVar3 = egnkVar.e;
                    try {
                        objJ = ejwi.j(new egnd(evuhVar3.toBuilder().mergeFrom(blob, egnkVar.a).build(), instantOfEpochMilli));
                        if (cursorD == null) {
                            return objJ;
                        }
                    } catch (evtj e) {
                        throw new RuntimeException(e);
                    }
                    cursorD.close();
                    return objJ;
                } catch (Throwable th) {
                    if (cursorD != null) {
                        try {
                            cursorD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.egmr
    public final ListenableFuture b(final evuh evuhVar, ListenableFuture listenableFuture) {
        return eiju.g(listenableFuture).i(new eooz() { // from class: egnh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final evuh evuhVar2 = (evuh) obj;
                final egnk egnkVar = this.a;
                final evuh evuhVar3 = evuhVar;
                return egnkVar.c.d(new ecnz() { // from class: egng
                    @Override // defpackage.ecnz
                    public final void a(ecoa ecoaVar) throws InterruptedException {
                        evuh evuhVar4 = evuhVar2;
                        evuhVar4.getClass();
                        long epochMilli = egnkVar.d.f().toEpochMilli();
                        byte[] byteArray = evuhVar4.toByteArray();
                        ContentValues contentValues = new ContentValues(5);
                        int length = byteArray.length;
                        ejwl.d(length < 2000000, "Message exceeds 2MB limit. Was %s bytes", length);
                        contentValues.put("request_data", evuhVar3.toByteArray());
                        contentValues.put("response_data", byteArray);
                        Long lValueOf = Long.valueOf(epochMilli);
                        contentValues.put("write_ms", lValueOf);
                        contentValues.put("access_ms", lValueOf);
                        ecoaVar.c("cache_table", contentValues, 5);
                    }
                });
            }
        }, eoqg.a);
    }
}
