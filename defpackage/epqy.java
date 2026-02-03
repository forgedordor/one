package defpackage;

import android.os.Trace;
import com.google.communication.synapse.security.scytale.SqlTransactionInterface;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqy extends SqlTransactionInterface {
    private static final eksp a = eksp.c("SqlTransaction");
    private boolean b = false;
    private final bwlu c;

    public epqy(bwlu bwluVar) {
        this.c = bwluVar;
        ((eksl) a.n().h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "<init>", 46, "SqlTransaction.java")).q("executing sql: BEGIN TRANSACTION;");
        ((dqsy) bwluVar.a.b()).h().beginTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[Catch: all -> 0x0076, Exception -> 0x0078, TRY_LEAVE, TryCatch #3 {Exception -> 0x0078, blocks: (B:3:0x000b, B:5:0x0022, B:8:0x0039, B:15:0x006d, B:16:0x0072, B:14:0x0066, B:17:0x0073), top: B:32:0x000b, outer: #2 }] */
    @Override // com.google.communication.synapse.security.scytale.SqlTransactionInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.grpc.Status commit() {
        /*
            r6 = this;
            java.lang.String r0 = "commit"
            java.lang.String r1 = "com/google/communication/synapse/security/scytale/store/SqlTransaction"
            java.lang.String r2 = "SqlTransaction.commit"
            android.os.Trace.beginSection(r2)
            java.lang.String r2 = "SqlTransaction.java"
            eksp r3 = defpackage.epqy.a     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            ekrw r3 = r3.n()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r4 = 54
            ekrw r3 = r3.h(r1, r0, r4, r2)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            eksl r3 = (defpackage.eksl) r3     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.String r4 = "executing sql: COMMIT;"
            r3.q(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            boolean r3 = r6.b     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r3 != 0) goto L73
            bwlu r3 = r6.c     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            boolean r4 = r3.b()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r4 == 0) goto L73
            fcsu r3 = r3.a     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            dqsy r3 = (defpackage.dqsy) r3     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.sqlite.SQLiteDatabase r3 = r3.h()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            bwlu r3 = r6.c     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r3.a()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r3 = 1
            r6.b = r3     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            io.grpc.Status r0 = io.grpc.Status.b     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            goto L98
        L44:
            r3 = move-exception
            goto L6d
        L46:
            r3 = move-exception
            eksp r4 = defpackage.epqy.a     // Catch: java.lang.Throwable -> L44
            ekrw r4 = r4.j()     // Catch: java.lang.Throwable -> L44
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L44
            ekrw r4 = r4.g(r3)     // Catch: java.lang.Throwable -> L44
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L44
            r5 = 59
            ekrw r4 = r4.h(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L44
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "Error with setTransactionSuccessful."
            r4.q(r5)     // Catch: java.lang.Throwable -> L44
            io.grpc.Status r3 = defpackage.epqv.a(r3)     // Catch: java.lang.Throwable -> L44
            bwlu r4 = r6.c     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r4.a()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r0 = r3
            goto L98
        L6d:
            bwlu r4 = r6.c     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r4.a()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            throw r3     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
        L73:
            io.grpc.Status r0 = io.grpc.Status.d     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            goto L98
        L76:
            r0 = move-exception
            goto L9c
        L78:
            r3 = move-exception
            eksp r4 = defpackage.epqy.a     // Catch: java.lang.Throwable -> L76
            ekrw r4 = r4.j()     // Catch: java.lang.Throwable -> L76
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L76
            ekrw r4 = r4.g(r3)     // Catch: java.lang.Throwable -> L76
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L76
            r5 = 69
            ekrw r0 = r4.h(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L76
            eksl r0 = (defpackage.eksl) r0     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "Error committing transaction."
            r0.q(r1)     // Catch: java.lang.Throwable -> L76
            io.grpc.Status r0 = defpackage.epqv.a(r3)     // Catch: java.lang.Throwable -> L76
        L98:
            android.os.Trace.endSection()
            return r0
        L9c:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epqy.commit():io.grpc.Status");
    }

    protected final void finalize() {
        if (this.b) {
            return;
        }
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.i()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "finalize", 99, "SqlTransaction.java")).q("Transaction was not rolled back or committed before dereferencing this object. Rolling it back now");
        Trace.beginSection("SqlTransaction.rollback");
        try {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 81, "SqlTransaction.java")).q("executing sql: ROLLBACK;");
            if (!this.b) {
                bwlu bwluVar = this.c;
                if (bwluVar.b()) {
                    bwluVar.a();
                    this.b = true;
                    List list = Status.a;
                    return;
                }
            }
            List list2 = Status.a;
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 89, "SqlTransaction.java")).q("Error rolling back transaction.");
            epqv.a(e);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035 A[Catch: all -> 0x0038, Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:3:0x000b, B:5:0x0024, B:7:0x002c, B:8:0x0035), top: B:19:0x000b, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.google.communication.synapse.security.scytale.SqlTransactionInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.grpc.Status rollback() {
        /*
            r6 = this;
            java.lang.String r0 = "rollback"
            java.lang.String r1 = "com/google/communication/synapse/security/scytale/store/SqlTransaction"
            java.lang.String r2 = "SqlTransaction.rollback"
            android.os.Trace.beginSection(r2)
            java.lang.String r2 = "SqlTransaction.java"
            eksp r3 = defpackage.epqy.a     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            ekrw r3 = r3.h()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            eksl r3 = (defpackage.eksl) r3     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r4 = 81
            ekrw r3 = r3.h(r1, r0, r4, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            eksl r3 = (defpackage.eksl) r3     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.lang.String r4 = "executing sql: ROLLBACK;"
            r3.q(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            boolean r3 = r6.b     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r3 != 0) goto L35
            bwlu r3 = r6.c     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            boolean r4 = r3.b()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r4 == 0) goto L35
            r3.a()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3 = 1
            r6.b = r3     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            io.grpc.Status r0 = io.grpc.Status.b     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            goto L5a
        L35:
            io.grpc.Status r0 = io.grpc.Status.d     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            goto L5a
        L38:
            r0 = move-exception
            goto L5e
        L3a:
            r3 = move-exception
            eksp r4 = defpackage.epqy.a     // Catch: java.lang.Throwable -> L38
            ekrw r4 = r4.j()     // Catch: java.lang.Throwable -> L38
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L38
            ekrw r4 = r4.g(r3)     // Catch: java.lang.Throwable -> L38
            eksl r4 = (defpackage.eksl) r4     // Catch: java.lang.Throwable -> L38
            r5 = 89
            ekrw r0 = r4.h(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L38
            eksl r0 = (defpackage.eksl) r0     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "Error rolling back transaction."
            r0.q(r1)     // Catch: java.lang.Throwable -> L38
            io.grpc.Status r0 = defpackage.epqv.a(r3)     // Catch: java.lang.Throwable -> L38
        L5a:
            android.os.Trace.endSection()
            return r0
        L5e:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epqy.rollback():io.grpc.Status");
    }
}
