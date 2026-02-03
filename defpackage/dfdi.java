package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdi {
    public final ContentResolver a;
    public final dfcs b;
    public final dhgz c;
    public final crmx f;
    private final Context i;
    private ExecutorService j;
    private final ThreadFactory g = new dfdf();
    private final ContentObserver h = new dfdg(this);
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public dfdi(Context context, dfcs dfcsVar, dhgz dhgzVar, crmx crmxVar) {
        this.i = context;
        this.b = dfcsVar;
        this.c = dhgzVar;
        this.a = context.getContentResolver();
        this.f = crmxVar;
    }

    public static final boolean e(int i, SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.delete("Subscribers", "phoneId=?", new String[]{String.valueOf(i)}) > 0;
    }

    public final synchronized void a() {
        Context context = this.i;
        if ("com.google.android.ims".equals(context.getPackageName())) {
            if (!dhkg.a(context, "android.permission.READ_CONTACTS")) {
                dhja.c("Permission to read contacts is not granted to cs apk", new Object[0]);
                return;
            }
            dhja.c("Permission to read contacts is granted to cs apk", new Object[0]);
        }
        if (this.j != null) {
            dhja.c("IMS DB syncer has already started.", new Object[0]);
            return;
        }
        dhja.c("Starting NAB to IMS DB syncer", new Object[0]);
        this.j = Executors.newSingleThreadExecutor(this.g);
        this.a.registerContentObserver(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, true, this.h);
        c();
    }

    public final synchronized void b() {
        dhja.c("Stopping NAB to IMS DB syncer", new Object[0]);
        this.a.unregisterContentObserver(this.h);
        ExecutorService executorService = this.j;
        if (executorService != null) {
            executorService.shutdownNow();
            this.j = null;
        }
    }

    public final synchronized void c() {
        if (!this.e.compareAndSet(false, true)) {
            dhja.c("DB sync is already running", new Object[0]);
        } else if (Objects.isNull(this.j)) {
            dhja.g("Executor not initialized", new Object[0]);
        } else {
            this.j.submit(new Runnable() { // from class: dfde
                /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 550
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dfde.run():void");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.database.Cursor r11, android.database.sqlite.SQLiteDatabase r12) throws android.database.SQLException {
        /*
            r10 = this;
            r0 = 1
            long r1 = r11.getLong(r0)
            r3 = 0
            long r4 = r11.getLong(r3)
            r6 = 2
            java.lang.String r6 = r11.getString(r6)
            r7 = 3
            int r11 = r11.getInt(r7)
            android.content.ContentValues r7 = new android.content.ContentValues
            r8 = 8
            r7.<init>(r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "phoneId"
            r7.put(r5, r4)
            java.lang.String r4 = "nativeNumber"
            if (r6 == 0) goto L3b
            boolean r5 = defpackage.dfog.w()
            if (r5 == 0) goto L30
            r5 = r6
            goto L36
        L30:
            crmx r5 = r10.f
            java.lang.String r5 = r5.x(r6)
        L36:
            r7.put(r4, r6)
            r6 = r5
            goto L3e
        L3b:
            r7.putNull(r4)
        L3e:
            if (r6 == 0) goto L45
            boolean r4 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r6)
            goto L46
        L45:
            r4 = r3
        L46:
            java.lang.String r5 = "number"
            if (r4 == 0) goto L4e
            r7.put(r5, r6)
            goto L51
        L4e:
            r7.putNull(r5)
        L51:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "dataVersion"
            r7.put(r5, r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "contactId"
            r7.put(r1, r11)
            java.lang.String r11 = "Subscribers"
            r1 = 0
            if (r4 == 0) goto L97
            boolean r4 = j$.util.Objects.isNull(r6)
            if (r4 != 0) goto L97
            dfcs r4 = r10.b
            dfdd r4 = (defpackage.dfdd) r4
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()
            java.lang.String r5 = "SELECT COUNT(*) FROM Subscribers WHERE number=? AND phoneId = 0 AND contactId = 0"
            android.database.sqlite.SQLiteStatement r4 = r4.compileStatement(r5)
            r4.bindString(r0, r6)
            long r8 = r4.simpleQueryForLong()
            r4.close()
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L97
            java.lang.String[] r4 = new java.lang.String[]{r6}
            java.lang.String r5 = "number=?"
            int r11 = r12.update(r11, r7, r5, r4)
            long r11 = (long) r11
            goto Lb9
        L97:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "state"
            r7.put(r5, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r5 = "date"
            r7.put(r5, r4)
            r4 = 0
            long r11 = r12.insertOrThrow(r11, r4, r7)     // Catch: java.lang.Exception -> Laf
            goto Lb9
        Laf:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r4 = "Insert operation failed"
            defpackage.dhja.i(r11, r4, r12)
            r11 = -1
        Lb9:
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 <= 0) goto Lbe
            return r0
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfdi.d(android.database.Cursor, android.database.sqlite.SQLiteDatabase):boolean");
    }
}
