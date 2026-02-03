package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrc extends SQLiteOpenHelper {
    static final String[] a = {"id", "conversation_type", "conversation_group_id", "conversation_group_app_name", "other_contact_row_id", "update_timestamp_us", "owner_row_id", "conversation_app_data", "conversation_properties"};
    private final Context b;

    public dvrc(Context context, long j) {
        super(context, String.format("lighter_messaging_%d.db", Long.valueOf(j)), (SQLiteDatabase.CursorFactory) null, 27);
        dvie.b();
        ejwl.b(j >= 0, "registrationId is invalid; ensure AccountContext is valid");
        this.b = context;
    }

    private static ejwi a(byte[] bArr) {
        try {
            return ejwi.j((ezjj) evsn.parseFrom(ezjj.a, bArr, evrr.a()));
        } catch (evtj unused) {
            return ejud.a;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) throws SQLException {
        try {
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD COLUMN " + str2 + " " + str3 + ";");
        } catch (SQLException e) {
            Cursor cursorRawQuery = null;
            boolean z = false;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery(a.a(str, "select * from ", " limit 0"), null);
                    if (cursorRawQuery != null) {
                        if (cursorRawQuery.getColumnIndex(str2) != -1) {
                            z = true;
                        }
                    }
                } finally {
                    if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                }
            } catch (RuntimeException e2) {
                dvhv.d("Messaging SqliteHelper", a.d(str, str2, "failed to check column ", " in table ", "."), e2);
                if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                    throw e;
                }
            }
            if (!z) {
                throw e;
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(dvwt.b);
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
        sQLiteDatabase.execSQL("CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, local_update_timestamp_ms INT NOT NULL DEFAULT 0,owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)");
        sQLiteDatabase.execSQL("CREATE TABLE kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS deleted_conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_id_string TEXT,local_delete_timestamp_ms INT NOT NULL DEFAULT 0)");
    }

    private static void d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        dvtr.d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (i2 < 19) {
            d(sQLiteDatabase);
            return;
        }
        while (true) {
            i--;
            if (i < i2) {
                return;
            }
            if (i == 19) {
                dvtr.f(sQLiteDatabase, "messages", dvwt.b, dvwt.a);
                dvtr.f(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, local_update_timestamp_ms INT NOT NULL DEFAULT 0,owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", a);
                dvtr.f(sQLiteDatabase, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)", dvwm.a);
                dvtr.f(sQLiteDatabase, "participants", "CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)", dvwv.a);
                dvtr.f(sQLiteDatabase, "blocks", "CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)", dvwk.a);
                dvtr.f(sQLiteDatabase, "notifications", "CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)", dvwu.a);
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
            } else if (i == 20) {
                dvtr.f(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", a);
            } else if (i == 26) {
                sQLiteDatabase.execSQL("DROP TABLE deleted_conversations");
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        int i3;
        String str;
        String str2;
        String str3;
        boolean z;
        Cursor cursorQuery;
        String str4;
        ejwi ejwiVarA;
        String str5;
        dvrc dvrcVar = this;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str6 = "TEXT";
        String str7 = "blocks";
        dvyx dvyxVarA = dvyx.a(dvrcVar.b);
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        dwhpVarR.f(381);
        dvyxVarA.b(dwhpVarR.a());
        String str8 = "0";
        try {
        } catch (RuntimeException e) {
            e = e;
        }
        if (i < 11) {
            d(sQLiteDatabase2);
        } else {
            int i4 = i + 1;
            while (i4 <= i2) {
                switch (i4) {
                    case 12:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        dvtr.e(sQLiteDatabase2, "notifications");
                        sQLiteDatabase2.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY, notification_id TEXT UNIQUE NOT NULL, notification_type INTEGER NOT NULL, notification_metadata BLOB NOT NULL, notification_properties BLOB NOT NULL)");
                        dvrcVar = this;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 13:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        b(sQLiteDatabase2, "notifications", "notification_timestamp_received_ms", "INTEGER NOT NULL default 0");
                        dvrcVar = this;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 14:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        dvtr.g(sQLiteDatabase2, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL)");
                        dvtr.g(sQLiteDatabase2, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,owner_row_id INT,FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
                        dvrcVar = this;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 15:
                        i3 = i4;
                        str3 = str8;
                        int iC = (int) fbfm.c();
                        long jB = fbfm.b();
                        Random random = new Random();
                        String str9 = "contacts";
                        str = str6;
                        str2 = str7;
                        cursorQuery = sQLiteDatabase2.query("conversations", new String[]{"id", "conversation_properties"}, null, null, null, null, null);
                        while (true) {
                            try {
                                long jNextInt = -1;
                                if (cursorQuery.moveToNext()) {
                                    HashMap mapB = dvul.b(cursorQuery.getBlob(1));
                                    long jLongValue = ((Long) mapB.get("last_sync_date")).longValue();
                                    if (jLongValue != -1) {
                                        jNextInt = jLongValue + random.nextInt(iC) + jB;
                                    }
                                    mapB.put("expiration_time_ms", Long.valueOf(jNextInt));
                                    mapB.remove("last_sync_date");
                                    try {
                                        byte[] bArrI = dvhy.i(mapB);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("conversation_properties", bArrI);
                                        sQLiteDatabase2.update("conversations", contentValues, "id = ?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                                    } catch (IOException unused) {
                                        dvhv.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                    }
                                } else {
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    Random random2 = new Random();
                                    Cursor cursorQuery2 = sQLiteDatabase2.query("contacts", new String[]{"id", "contact_properties"}, null, null, null, null, null);
                                    while (cursorQuery2.moveToNext()) {
                                        try {
                                            HashMap mapG = dvhy.g(cursorQuery2.getBlob(1));
                                            long jLongValue2 = ((Long) mapG.get("last_sync_date")).longValue();
                                            mapG.put("expiration_time_ms", Long.valueOf(jLongValue2 == -1 ? -1L : jLongValue2 + random2.nextInt(iC) + jB));
                                            mapG.remove("last_sync_date");
                                            try {
                                                byte[] bArrI2 = dvhy.i(mapG);
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("contact_properties", bArrI2);
                                                try {
                                                    str4 = str9;
                                                    try {
                                                        sQLiteDatabase2.update(str4, contentValues2, "id = ?", new String[]{String.valueOf(cursorQuery2.getInt(0))});
                                                    } catch (IOException unused2) {
                                                        dvhv.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                                        str9 = str4;
                                                    }
                                                } catch (IOException unused3) {
                                                    str4 = str9;
                                                }
                                            } catch (IOException unused4) {
                                                str4 = str9;
                                            }
                                            str9 = str4;
                                        } finally {
                                            if (cursorQuery2 == null) {
                                                throw th;
                                            }
                                            try {
                                                cursorQuery2.close();
                                                throw th;
                                            } catch (Throwable th) {
                                                th.addSuppressed(th);
                                            }
                                        }
                                    }
                                    z = true;
                                    if (cursorQuery2 != null) {
                                        cursorQuery2.close();
                                    }
                                    dvrcVar = this;
                                    i4 = i3 + 1;
                                    str8 = str3;
                                    str7 = str2;
                                    str6 = str;
                                }
                            } finally {
                                if (cursorQuery == null) {
                                    throw th;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            e = e;
                            dvrcVar = this;
                            dvyx dvyxVarA2 = dvyx.a(dvrcVar.b);
                            dwhp dwhpVarR2 = dwhq.r();
                            dwhpVarR2.g(204);
                            dwhpVarR2.f(381);
                            dvyxVarA2.b(dwhpVarR2.a());
                            throw e;
                        }
                    case 16:
                        str3 = str8;
                        i3 = i4;
                        b(sQLiteDatabase2, str7, "lighter_id_normalized_id", str6);
                        sQLiteDatabase2.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                        b(sQLiteDatabase2, "contacts", "lighter_id_normalized_id", str6);
                        Cursor cursorQuery3 = sQLiteDatabase2.query("blocks", null, null, null, null, null, null);
                        if (cursorQuery3 != null) {
                            try {
                                if (cursorQuery3.moveToFirst()) {
                                    do {
                                        int i5 = cursorQuery3.getInt(dvwj.a(1));
                                        String string = cursorQuery3.getString(dvwj.a(3));
                                        int i6 = cursorQuery3.getInt(dvwj.a(2));
                                        ContentValues contentValues3 = new ContentValues();
                                        if (i6 == 2) {
                                            string = dvhq.a(string);
                                        }
                                        contentValues3.put("lighter_id_normalized_id", string);
                                        sQLiteDatabase2.update(str7, contentValues3, "id = ? ", new String[]{Integer.toString(i5)});
                                    } while (cursorQuery3.moveToNext());
                                }
                            } finally {
                                try {
                                    cursorQuery3.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                            }
                        }
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        cursorQuery3 = sQLiteDatabase2.query("contacts", null, null, null, null, null, null);
                        if (cursorQuery3 != null) {
                            try {
                                if (cursorQuery3.moveToFirst()) {
                                    do {
                                        int i7 = cursorQuery3.getInt(dvwl.a(1));
                                        String string2 = cursorQuery3.getString(dvwl.a(3));
                                        int i8 = cursorQuery3.getInt(dvwl.a(2));
                                        ContentValues contentValues4 = new ContentValues();
                                        if (i8 == 2) {
                                            string2 = dvhq.a(string2);
                                        }
                                        contentValues4.put("lighter_id_normalized_id", string2);
                                        sQLiteDatabase2.update("contacts", contentValues4, "id = ? ", new String[]{Integer.toString(i7)});
                                    } while (cursorQuery3.moveToNext());
                                }
                            } finally {
                            }
                        }
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        z = true;
                        dvrcVar = this;
                        str = str6;
                        str2 = str7;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 17:
                        i3 = i4;
                        str3 = str8;
                        b(sQLiteDatabase2, "messages", "needs_delivery_receipt", "INTEGER NOT NULL default 0");
                        z = true;
                        dvrcVar = this;
                        str = str6;
                        str2 = str7;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 18:
                        i3 = i4;
                        try {
                            b(sQLiteDatabase2, "conversations", "conversation_app_data", "BLOB NOT NULL default 0");
                            str3 = str8;
                            Cursor cursorQuery4 = sQLiteDatabase2.query("conversations", new String[]{"id", "conversation_properties"}, null, null, null, null, null);
                            while (cursorQuery4.moveToNext()) {
                                try {
                                    HashMap mapB2 = dvul.b(cursorQuery4.getBlob(1));
                                    HashMap map = (HashMap) mapB2.get("app_data");
                                    mapB2.remove("app_data");
                                    try {
                                        byte[] bArrI3 = dvhy.i(mapB2);
                                        ContentValues contentValues5 = new ContentValues();
                                        contentValues5.put("conversation_properties", bArrI3);
                                        contentValues5.put("conversation_app_data", dvul.d(map));
                                        sQLiteDatabase2.update("conversations", contentValues5, "id = ?", new String[]{String.valueOf(cursorQuery4.getInt(0))});
                                    } catch (IOException unused5) {
                                        dvhv.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                    }
                                } finally {
                                }
                            }
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            z = true;
                            dvrcVar = this;
                            str = str6;
                            str2 = str7;
                            i4 = i3 + 1;
                            str8 = str3;
                            str7 = str2;
                            str6 = str;
                        } catch (RuntimeException e2) {
                            e = e2;
                            dvrcVar = this;
                            break;
                        }
                    case 19:
                        i3 = i4;
                        b(sQLiteDatabase2, "messages", "capability", "INTEGER NOT NULL DEFAULT -1");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 20:
                        i3 = i4;
                        b(sQLiteDatabase2, "messages", "rendering_type", "INTEGER NOT NULL DEFAULT " + dwqv.DEFAULT_RENDERING_TYPE.f);
                        sQLiteDatabase2.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 21:
                        i3 = i4;
                        b(sQLiteDatabase2, "conversations", "last_deleted_timestamp_us", "INT NOT NULL DEFAULT 0");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 22:
                        i3 = i4;
                        b(sQLiteDatabase2, "messages", "filterable_flags", "INTEGER NOT NULL DEFAULT 0");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 23:
                        i3 = i4;
                        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 24:
                        i3 = i4;
                        String str10 = "messages";
                        cursorQuery = sQLiteDatabase2.query("messages", new String[]{"id", "message_properties"}, "capability <> ?", new String[]{"-1"}, null, null, null);
                        while (cursorQuery.moveToNext()) {
                            try {
                                HashMap mapC = dvuu.c(cursorQuery.getBlob(1));
                                byte[] bArr = (byte[]) mapC.get("message_content");
                                if (bArr.length != 0 && dwql.b(eonc.b((byte[]) mapC.get("content_type"))) == 1) {
                                    try {
                                        try {
                                            ejwiVarA = a(Base64.decode(bArr, 8));
                                            if (!ejwiVarA.g()) {
                                                ejwiVarA = a(bArr);
                                            }
                                        } catch (IOException unused6) {
                                            str5 = str10;
                                            dvhv.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                            str10 = str5;
                                        }
                                    } catch (IllegalArgumentException unused7) {
                                        ejwiVarA = a(bArr);
                                    }
                                    if (ejwiVarA.g()) {
                                        eysq eysqVar = (eysq) evsn.parseFrom(eysq.a, ((ezjj) ejwiVarA.c()).e, evrr.a());
                                        eynu eynuVar = (eynu) eynv.a.createBuilder();
                                        eynuVar.copyOnWrite();
                                        eynv eynvVar = (eynv) eynuVar.instance;
                                        eysqVar.getClass();
                                        eynvVar.c = eysqVar;
                                        eynvVar.b |= 1;
                                        mapC.put("message_content", evqs.x(Base64.encode(((eynv) eynuVar.build()).toByteArray(), 8)).I());
                                        byte[] bArrI4 = dvhy.i(mapC);
                                        ContentValues contentValues6 = new ContentValues();
                                        contentValues6.put("message_properties", bArrI4);
                                        str5 = str10;
                                        try {
                                            sQLiteDatabase2.update(str5, contentValues6, "id = ?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                                        } catch (IOException unused8) {
                                            dvhv.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                            str10 = str5;
                                        }
                                        str10 = str5;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                        break;
                    case 25:
                        i3 = i4;
                        Cursor cursorQuery5 = sQLiteDatabase2.query("contacts", new String[]{"id"}, "lighter_id_app_name = ?", new String[]{"GMM"}, null, null, null);
                        while (cursorQuery5.moveToNext()) {
                            int i9 = cursorQuery5.getInt(0);
                            Cursor cursor = cursorQuery5;
                            Cursor cursorQuery6 = sQLiteDatabase.query("messages", new String[]{"conversation_row_id"}, "sender_contact_row_id = ?  AND message_type = ? ", new String[]{String.valueOf(i9), str8}, null, null, null);
                            if (cursorQuery6.moveToNext()) {
                                Cursor cursorQuery7 = sQLiteDatabase.query("conversations", new String[]{"conversation_app_data"}, "id = ?  AND conversation_type = ?", new String[]{String.valueOf(cursorQuery6.getInt(0)), String.valueOf(dwpu.GROUP.c)}, null, null, null);
                                if (cursorQuery7.moveToNext()) {
                                    ejwi ejwiVarA2 = dwea.a(dvhy.h(cursorQuery7.getBlob(0)));
                                    if (ejwiVarA2.g()) {
                                        for (dwpk dwpkVar : ((dwaa) ejwiVarA2.c()).a) {
                                            if (dwpkVar.c().g() && ((String) dwpkVar.c().c()).equals("lfb")) {
                                                ContentValues contentValues7 = new ContentValues();
                                                contentValues7.put("lighter_id_type", Integer.valueOf(dwpkVar.b().f));
                                                contentValues7.put("lighter_id_id", dwpkVar.d());
                                                contentValues7.put("lighter_id_normalized_id", dwpkVar.b() == dwpj.EMAIL ? dvhq.a(dwpkVar.d()) : dwpkVar.d());
                                                contentValues7.put("lighter_handler_id", (String) dwpkVar.c().f());
                                                contentValues7.put("lighter_id_app_name", dwpkVar.e());
                                                sQLiteDatabase.update("contacts", contentValues7, "id = ? ", new String[]{String.valueOf(i9)});
                                            }
                                        }
                                        if (cursorQuery7 != null && !cursorQuery7.isClosed()) {
                                            cursorQuery7.close();
                                        }
                                        if (cursorQuery6 != null && !cursorQuery6.isClosed()) {
                                            cursorQuery6.close();
                                        }
                                    }
                                }
                            }
                            cursorQuery5 = cursor;
                        }
                        sQLiteDatabase2 = sQLiteDatabase;
                        Cursor cursor2 = cursorQuery5;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                        break;
                    case 26:
                        b(sQLiteDatabase2, "conversations", "local_update_timestamp_ms", "INT NOT NULL DEFAULT 0");
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 27:
                        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS deleted_conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_id_string TEXT,local_delete_timestamp_ms INT NOT NULL DEFAULT 0)");
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    default:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                }
            }
        }
        dvyx dvyxVarA3 = dvyx.a(dvrcVar.b);
        dwhp dwhpVarR3 = dwhq.r();
        dwhpVarR3.g(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        dwhpVarR3.f(381);
        dvyxVarA3.b(dwhpVarR3.a());
    }
}
