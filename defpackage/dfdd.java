package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdd extends SQLiteOpenHelper implements dfcs, dfcr {
    public static final ContentValues a;
    public final dfdk b;
    private final diep c;

    static {
        ContentValues contentValues = new ContentValues(1);
        a = contentValues;
        contentValues.put("deleted", (Integer) 1);
    }

    public dfdd(Context context, diep diepVar) {
        super(context, "subscribers.db", (SQLiteDatabase.CursorFactory) null, 18);
        this.b = new dfdk();
        this.c = diepVar;
    }

    public static void i(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
    }

    private static final String l(String str) {
        return a.a(str, "SELECT COUNT(DISTINCT contactId) FROM (SELECT contactId FROM Subscribers WHERE (", ") GROUP BY number)");
    }

    @Override // defpackage.dfcr
    public final int a(long j) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = getReadableDatabase().compileStatement(l("number NOT NULL AND ((date < ? AND state = 2) OR state != 2) AND deleted = 0"));
        sQLiteStatementCompileStatement.bindString(1, String.valueOf(this.c.f().toEpochMilli() - j));
        return (int) sQLiteStatementCompileStatement.simpleQueryForLong();
    }

    @Override // defpackage.dfcr
    public final int b() {
        try {
            return (int) getReadableDatabase().compileStatement(l("number NOT NULL AND date=0 AND deleted = 0")).simpleQueryForLong();
        } catch (SQLiteException e) {
            dhja.i(e, "Error getting number of untried entries", new Object[0]);
            return 0;
        }
    }

    @Override // defpackage.dfcr
    public final Cursor c(long j) {
        return g("number NOT NULL AND ((date < ? AND state = 2) OR state != 2) AND deleted = 0", new String[]{String.valueOf(this.c.f().toEpochMilli() - j)});
    }

    @Override // defpackage.dfcr
    public final Cursor d() {
        return g("number NOT NULL AND date=0 AND deleted = 0", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dfcr
    public final boolean e(final String str, int i, dgwx dgwxVar) throws Throwable {
        Cursor cursorQuery;
        int i2;
        boolean z;
        if (str == null) {
            throw new InvalidParameterException("Number must not be null");
        }
        String strC = dhiz.PHONE_NUMBER.c(str);
        Integer numValueOf = Integer.valueOf(i);
        dhja.o("Updating state for %s to %s with capabilities: %s", strC, numValueOf, dgwxVar);
        final String[] strArr = {str};
        String[] strArr2 = {"capabilities"};
        try {
            final SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                cursorQuery = writableDatabase.query("Subscribers", strArr2, "number = ? ", strArr, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        i2 = cursorQuery.getInt(0);
                        z = true;
                    } else {
                        i2 = 0;
                        z = false;
                    }
                    dhid.a(cursorQuery);
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("state", numValueOf);
                    contentValues.put("date", dhkl.a());
                    if (i == 1) {
                        contentValues.put("capabilities", (Integer) 0);
                    }
                    if (dgwxVar != null) {
                        contentValues.put("lastActive", Long.valueOf(dgwxVar.e));
                        contentValues.put("isOnline", Integer.valueOf(dgwxVar.c ? 1 : 0));
                        contentValues.put("responseCode", Integer.valueOf(dgwxVar.g));
                        boolean zU = dgwxVar.u();
                        boolean zC = dgwxVar.C();
                        Object[] objArr = dgwxVar.F() || dgwxVar.H();
                        boolean zH = dgwxVar.H();
                        boolean zB = dgwxVar.B();
                        boolean zA = dgwxVar.A();
                        boolean zD = dgwxVar.D();
                        boolean zJ = dgwxVar.J();
                        int iA = zU ? dfib.STICKERS.a(0) : 0;
                        if (zC) {
                            iA = dfib.LOCATION_PUSH.a(iA);
                        }
                        if (objArr != false) {
                            iA = dfib.IP_CALL.a(iA);
                        }
                        if (zH) {
                            iA = dfib.IP_VIDEO_CALL_ONLY.a(iA);
                        }
                        if (zB && i == 2 && (dgwxVar.c || dgwxVar.B())) {
                            iA = dfib.HTTP_FT.a(iA);
                        }
                        if (zA) {
                            iA = dfib.FILE_TRANSFER_VIA_SMS.a(iA);
                        }
                        if (zD) {
                            iA = dfib.LOCATION_VIA_SMS.a(iA);
                        }
                        if (zJ) {
                            iA = dfib.UP_2_0.a(iA);
                        }
                        int i3 = iA | i2;
                        if (i3 != i2) {
                            contentValues.put("capabilities", Integer.valueOf(i3));
                        }
                    }
                    final boolean z2 = z;
                    return ((Integer) dfdk.a(writableDatabase, new ejxr() { // from class: dfct
                        public final /* synthetic */ String d = "number = ? ";

                        @Override // defpackage.ejxr
                        public final Object get() {
                            ContentValues contentValues2 = dfdd.a;
                            boolean z3 = z2;
                            SQLiteDatabase sQLiteDatabase = writableDatabase;
                            ContentValues contentValues3 = contentValues;
                            if (z3) {
                                return Integer.valueOf(sQLiteDatabase.update("Subscribers", contentValues3, this.d, strArr));
                            }
                            contentValues3.put("number", str);
                            return Integer.valueOf(sQLiteDatabase.insert("Subscribers", null, contentValues3) != -1 ? 1 : 0);
                        }
                    }).orElse(0)).intValue() > 0;
                } catch (Throwable th) {
                    th = th;
                    dhid.a(cursorQuery);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
            }
        } catch (SQLiteException unused) {
            return false;
        }
    }

    @Override // defpackage.dfcs
    public final dfic f(String str) {
        if (str == null) {
            throw new InvalidParameterException("Number must not be null");
        }
        Cursor cursorQuery = getReadableDatabase().query("Subscribers", (String[]) dfcy.a.toArray(new String[0]), "number=?", new String[]{str}, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                int i = cursorQuery.getInt(0);
                long j = cursorQuery.getLong(2);
                int i2 = cursorQuery.getInt(1);
                boolean z = cursorQuery.getInt(3) == 1;
                int i3 = cursorQuery.getInt(4);
                if (i != 0) {
                    return new dfic(i, j, i2, z, i3);
                }
            } finally {
                dhid.a(cursorQuery);
            }
        }
        dhid.a(cursorQuery);
        return dfic.a;
    }

    public final Cursor g(String str, String[] strArr) {
        return getReadableDatabase().query("Subscribers", (String[]) dfdc.a.toArray(new String[0]), str, strArr, "number", null, "contactId");
    }

    public final dfda h(String str) {
        Cursor cursorQuery = getReadableDatabase().query("Subscribers", (String[]) dfdb.a.toArray(new String[0]), "number=?", new String[]{str}, null, null, "contactId ASC LIMIT 1");
        dfda dfdaVar = new dfda();
        try {
            if (cursorQuery.moveToFirst()) {
                dfdaVar.b = cursorQuery.getLong(0);
                dfdaVar.a = cursorQuery.getString(1);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return dfdaVar;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean j(String str, int i, dgwx dgwxVar) {
        if (TextUtils.isEmpty(str)) {
            dhja.c("Ignoring IMS state update for empty MSISDN", new Object[0]);
            return false;
        }
        if (e(str, i, dgwxVar)) {
            return true;
        }
        dhja.o("Updating last checked date only for %s", dhiz.PHONE_NUMBER.c(str));
        final ContentValues contentValues = new ContentValues();
        contentValues.put("date", Long.valueOf(this.c.f().toEpochMilli()));
        final String[] strArr = {str};
        try {
            final SQLiteDatabase writableDatabase = getWritableDatabase();
            dfdk.a(writableDatabase, new ejxr() { // from class: dfcw
                @Override // defpackage.ejxr
                public final Object get() {
                    ContentValues contentValues2 = dfdd.a;
                    return Integer.valueOf(writableDatabase.update("Subscribers", contentValues, "number=?", strArr));
                }
            });
        } catch (SQLiteException unused) {
        }
        return false;
    }

    public final boolean k(String str) {
        return j(str, 2, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Subscribers ( _id INTEGER PRIMARY KEY AUTOINCREMENT, phoneId BIGINT NOT NULL DEFAULT 0, contactId BIGINT NOT NULL DEFAULT 0, number TEXT, nativeNumber TEXT, state INTEGER NOT NULL, capabilities INTEGER NOT NULL DEFAULT 0, dataVersion INTEGER, date LONG NOT NULL,lastActive LONG,isOnline INTEGER,responseCode INTEGER,Availability TEXT, FreeText TEXT, FavouriteLink TEXT, Timestamp TEXT, PortraitIconLink TEXT, PortraitIconLinkEtag TEXT, Location TEXT, LocationLatitude REAL NOT NULL DEFAULT 0, LocationLongitude REAL NOT NULL DEFAULT 0, LocationRadius REAL NOT NULL DEFAULT 0, SharingState INTEGER NOT NULL DEFAULT 0, SharingFeatures TEXT, DisplayName TEXT, deleted INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PresenceContent ( _id INTEGER PRIMARY KEY AUTOINCREMENT, Url TEXT NOT NULL, Etag TEXT NOT NULL, Description TEXT, ContentType TEXT, Size INTEGER NOT NULL DEFAULT 0, Data BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(final SQLiteDatabase sQLiteDatabase, final int i, int i2) {
        dhja.k("Update %s database from version: %d to %d", "subscribers.db", Integer.valueOf(i), Integer.valueOf(i2));
        dfdk.b(sQLiteDatabase, new Runnable() { // from class: dfcv
            @Override // java.lang.Runnable
            public final void run() throws SQLException {
                int i3 = i;
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                if (i3 != 17) {
                    dfdd dfddVar = this.a;
                    dfdd.i(sQLiteDatabase2, "PresenceContent");
                    dfdd.i(sQLiteDatabase2, "Subscribers");
                    dfddVar.onCreate(sQLiteDatabase2);
                    return;
                }
                try {
                    sQLiteDatabase2.query("Subscribers", new String[]{"isOnline"}, null, null, null, null, null).close();
                } catch (SQLiteException unused) {
                    sQLiteDatabase2.execSQL("ALTER TABLE Subscribers ADD COLUMN isOnline INTEGER");
                    sQLiteDatabase2.execSQL("ALTER TABLE Subscribers ADD COLUMN responseCode INTEGER");
                }
            }
        });
    }
}
