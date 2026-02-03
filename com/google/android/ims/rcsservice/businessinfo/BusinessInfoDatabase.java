package com.google.android.ims.rcsservice.businessinfo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.cqaz;
import defpackage.dfnr;
import defpackage.dhiz;
import defpackage.dhja;
import defpackage.ekgb;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoDatabase extends SQLiteOpenHelper {
    protected static final String BUSINESS_INFO_METADATA_SELECTION_ON_RBM_BOT_ID = "rbm_bot_id = ?";
    private static final String BUSINESS_INFO_METADATA_TABLE_DROP = "DROP TABLE IF EXISTS business_info_metadata";
    private static final String BUSINESS_INFO_METADATA_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    private static final String BUSINESS_INFO_METADATA_TABLE_V_3_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    protected static final String BUSINESS_INFO_PROPERTIES_SELECTION_ON_RBM_BOT_ID = "rbm_bot_id = ?";
    private static final String BUSINESS_INFO_PROPERTIES_TABLE_DROP = "DROP TABLE IF EXISTS business_info_properties";
    private static final String BUSINESS_INFO_PROPERTIES_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    private static final String BUSINESS_INFO_PROPERTIES_TABLE_V_3_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    public static final String BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID = "rbm_bot_id = ?";
    private static final String BUSINESS_INFO_TABLE_DROP = "DROP TABLE IF EXISTS business_info";
    private static final String BUSINESS_INFO_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL UNIQUE, name TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT, description TEXT, color TEXT, verification_status INTEGER NOT NULL DEFAULT 0, hero_image_remote_url TEXT, hero_image_local_uri TEXT, verifier_id TEXT );";
    private static final String BUSINESS_INFO_TABLE_V_3_COLUMNS = "_id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL UNIQUE, name TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT, description TEXT, color TEXT, verification_status INTEGER NOT NULL DEFAULT 0, hero_image_remote_url TEXT, hero_image_local_uri TEXT";
    private static final String BUSINESS_INFO_TABLE_V_3_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL UNIQUE, name TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT, description TEXT, color TEXT, verification_status INTEGER NOT NULL DEFAULT 0, hero_image_remote_url TEXT, hero_image_local_uri TEXT);";
    private static final String BUSINESS_INFO_WITH_VERIFIER_VIEW_DROP = "DROP VIEW IF EXISTS business_info_and_verifier_info";
    private static final String BUSINESS_INFO_WITH_VERIFIER_VIEW_HEAD_CREATE_SQL = "CREATE VIEW IF NOT EXISTS business_info_and_verifier_info AS SELECT " + qualifyWithBusinessInfoTable("rbm_bot_id") + ", " + qualifyWithBusinessInfoTable("name") + ", " + qualifyWithBusinessInfoTable("logo_image_remote_url") + ", " + qualifyWithBusinessInfoTable("logo_image_local_uri") + ", " + qualifyWithBusinessInfoTable("description") + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR) + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS) + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL) + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI) + ", " + qualifyWithVerifierInfoTable("verifier_id") + ", " + qualifyWithVerifierInfoTable("name") + " AS verifier_name, " + qualifyWithVerifierInfoTable("description") + " AS verifier_description, " + qualifyWithVerifierInfoTable("logo_image_remote_url") + " AS verifier_logo_image_remote_url, " + qualifyWithVerifierInfoTable("logo_image_local_uri") + " AS verifier_logo_image_local_uri FROM business_info LEFT JOIN business_verifier_info ON " + qualifyWithBusinessInfoTable("verifier_id") + " = " + qualifyWithVerifierInfoTable("verifier_id") + ";";
    protected static final String BUSINESS_VERIFIER_INFO_SELECTION_ON_RBM_BOT_ID = "verifier_id IN (SELECT verifier_id FROM business_info WHERE rbm_bot_id = ?)";
    private static final String BUSINESS_VERIFIER_INFO_TABLE_DROP = "DROP TABLE IF EXISTS business_verifier_info";
    private static final String BUSINESS_VERIFIER_INFO_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_verifier_info ( verifier_id TEXT PRIMARY KEY, name TEXT, description TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT);";
    private static final String DATABASE_NAME = "business_info";
    public static final int DATABASE_VERSION = 5;
    private static BusinessInfoDatabase instance;
    private final Context context;

    private BusinessInfoDatabase(Context context) {
        super(context, "business_info", (SQLiteDatabase.CursorFactory) null, 5);
        this.context = context;
    }

    public static void clearInstance() {
        BusinessInfoDatabase businessInfoDatabase = instance;
        if (businessInfoDatabase != null) {
            businessInfoDatabase.close();
        }
        instance = null;
    }

    private static void dropAllTables(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(BUSINESS_INFO_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_INFO_PROPERTIES_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_INFO_METADATA_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_VERIFIER_INFO_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_INFO_WITH_VERIFIER_VIEW_DROP);
    }

    public static synchronized BusinessInfoDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new BusinessInfoDatabase(context);
        }
        return instance;
    }

    private String getStringDatabaseColumn(String str, String str2) {
        Cursor cursorQuery = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.VIEW_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(str2));
                    cursorQuery.close();
                    return string;
                }
            } finally {
            }
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    private boolean insertBusinessInfoProperty(String str, int i, String str2, String str3, String str4, int i2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("rbm_bot_id", str);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i));
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, str2);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, str3);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, str4);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Integer.valueOf(i2));
        return writableDatabase.insert(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.TABLE_NAME, null, contentValues) > 0;
    }

    private boolean insertOrReplaceVerifierInfo(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("verifier_id", str);
        contentValues.put("name", str2);
        contentValues.put("logo_image_remote_url", str3);
        dhja.k("Insert-or-replacing verifier info for verifierId %s", dhiz.GENERIC.c(str));
        return getWritableDatabase().replace(BusinessInfoDatabaseConstants.BusinessVerifierInfoTableConstants.TABLE_NAME, null, contentValues) > 0;
    }

    private boolean insertOrUpdateBusinessInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        String[] strArr = {str};
        Cursor cursorQuery = writableDatabase.query("business_info", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.DEFAULT_PROJECTION, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, strArr, null, null, null);
        try {
            boolean zMoveToFirst = cursorQuery.moveToFirst();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("rbm_bot_id", str);
            contentValues.put("name", str2);
            contentValues.put("logo_image_remote_url", str3);
            contentValues.put("description", str4);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, str5);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(i));
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, str6);
            contentValues.put("verifier_id", str7);
            if (zMoveToFirst) {
                dhja.k("Business info already exists for botId %s, updating", dhja.a(str));
                return writableDatabase.update("business_info", contentValues, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, strArr) > 0;
            }
            dhja.k("Inserting new business info for botId %s", dhja.a(str));
            return writableDatabase.insert("business_info", null, contentValues) > 0;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static void logUpgradeProgress(int i, int i2) {
        dhja.k("Database upgraded to version %d. True database version is version %d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static void logUpgradeStart(int i, int i2) {
        dhja.k("Database upgrade started from version %d to %d.", Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static String qualifyWithBusinessInfoTable(String str) {
        return "business_info.".concat(String.valueOf(str));
    }

    private static String qualifyWithVerifierInfoTable(String str) {
        return "business_verifier_info.".concat(String.valueOf(str));
    }

    public static synchronized BusinessInfoDatabase recreateInstanceForTestsOnly(Context context, int i) {
        BusinessInfoDatabase businessInfoDatabase;
        clearInstance();
        businessInfoDatabase = new BusinessInfoDatabase(context, i);
        instance = businessInfoDatabase;
        return businessInfoDatabase;
    }

    private boolean removeBusinessInfoPropertiesInTransaction(String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        cqaz.k(writableDatabase.inTransaction());
        return writableDatabase.delete(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.TABLE_NAME, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}) > 0;
    }

    public void createV3Db(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(BUSINESS_INFO_TABLE_V_3_CREATE_SQL);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ejwi<java.lang.String> getBusinessInfoVersion(java.lang.String r10) {
        /*
            r9 = this;
            android.database.sqlite.SQLiteDatabase r0 = r9.getReadableDatabase()
            java.lang.String r8 = "version"
            java.lang.String[] r2 = new java.lang.String[]{r8}
            java.lang.String[] r4 = new java.lang.String[]{r10}
            java.lang.String r3 = "rbm_bot_id = ?"
            java.lang.String r1 = "business_info_metadata"
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L3b
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L22
            goto L3b
        L22:
            int r0 = r1.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L41
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L36
            ejud r0 = defpackage.ejud.a     // Catch: java.lang.Throwable -> L41
        L32:
            r1.close()     // Catch: java.lang.Exception -> L4e
            return r0
        L36:
            ejwi r0 = defpackage.ejwi.j(r0)     // Catch: java.lang.Throwable -> L41
            goto L32
        L3b:
            ejud r0 = defpackage.ejud.a     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L40
            goto L32
        L40:
            return r0
        L41:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Exception -> L4e
        L4d:
            throw r2     // Catch: java.lang.Exception -> L4e
        L4e:
            r0 = move-exception
            java.lang.String r10 = defpackage.dhja.a(r10)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            java.lang.String r10 = "Exception retrieving business info version for %s"
            defpackage.dhja.i(r0, r10, r1)
            ejud r10 = defpackage.ejud.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase.getBusinessInfoVersion(java.lang.String):ejwi");
    }

    public String getLocalMediaPath(String str, int i) {
        if (i == 0) {
            return getStringDatabaseColumn(str, "logo_image_local_uri");
        }
        if (i == 1) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
        }
        if (i == 2) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
        }
        dhja.q("Cannot get local media uri, incorrect media type for %s", dhja.a(str));
        return null;
    }

    public ekgb<String> getRbmBotIds() {
        Cursor cursorQuery = getReadableDatabase().query("business_info", new String[]{"rbm_bot_id"}, null, null, null, null, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            if (cursorQuery.getCount() > 0) {
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("rbm_bot_id"));
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
            ekgb<String> ekgbVarN = ekgb.n(arrayList);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return ekgbVarN;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public String getRemoteMediaPath(String str, int i) {
        if (i == 0) {
            return getStringDatabaseColumn(str, "logo_image_remote_url");
        }
        if (i == 1) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
        }
        if (i == 2) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
        }
        dhja.g("Cannot get remote media url, incorrect media type for %s", dhja.a(str));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public boolean insertOrUpdateBusinessInfoData(BusinessInfoData businessInfoData) throws Throwable {
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        if (businessInfoData == null) {
            dhja.g("Cannot insert or update null BusinessInfoData", new Object[0]);
            return false;
        }
        String rbmBotId = businessInfoData.getRbmBotId();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                try {
                    if (!insertOrUpdateBusinessInfo(rbmBotId, businessInfoData.getName(), businessInfoData.getLogoImageRemoteUrl(), businessInfoData.getDescription(), businessInfoData.getColor(), businessInfoData.getVerificationStatus(), businessInfoData.getHeroImageRemoteUrl(), businessInfoData.getVerifierId())) {
                        dhja.g("Unable to insert business info for rbmBotId %s", dhja.a(rbmBotId));
                    } else if (!dfnr.d() || insertOrReplaceVerifierInfo(businessInfoData.getVerifierId(), businessInfoData.getVerifierName(), businessInfoData.getVerifierLogoImageRemoteUrl())) {
                        removeBusinessInfoPropertiesInTransaction(rbmBotId);
                        Iterator<BusinessInfoProperty> it = businessInfoData.getProperties().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                writableDatabase.setTransactionSuccessful();
                                BusinessInfoContentProvider.BusinessInfoContentProviderInternal.notifyBusinessInfoChanged(this.context, rbmBotId);
                                BusinessInfoContentProvider.BusinessInfoContentProviderInternal.notifyBusinessInfoPropertiesChanged(this.context, rbmBotId);
                                r1 = 1;
                                break;
                            }
                            BusinessInfoProperty next = it.next();
                            if (!insertBusinessInfoProperty(rbmBotId, next.getPropertyType(), next.getHeader(), next.getSubHeader(), next.getValue(), next.getImportance())) {
                                dhja.g("Unable to insert business info property %s for rbmBotId %s", next, dhja.a(rbmBotId));
                                break;
                            }
                        }
                    } else {
                        dhja.g("Unable to insert verifier info for rbmBotId %s", dhja.a(rbmBotId));
                    }
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    Object[] objArr = new Object[2];
                    objArr[r1] = dhja.a(rbmBotId);
                    objArr[1] = exc;
                    dhja.g("Exception inserting business info for rbmBotId %s: %s", objArr);
                    writableDatabase.endTransaction();
                    return r1;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            writableDatabase.endTransaction();
            throw th22;
        }
        writableDatabase.endTransaction();
        return r1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean insertOrUpdateBusinessInfoMetadata(java.lang.String r15, java.lang.String r16, long r17) {
        /*
            r14 = this;
            java.lang.String r0 = defpackage.dhja.a(r15)
            java.lang.String r1 = defpackage.dhja.a(r16)
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r1 = 2
            r4[r1] = r2
            java.lang.String r1 = "Updating bot info metadata for bot id: {%s} with e-tag: {%s} and expiry %s."
            defpackage.dhja.k(r1, r4)
            android.database.sqlite.SQLiteDatabase r6 = r14.getWritableDatabase()
            java.lang.String[] r10 = new java.lang.String[]{r15}
            java.lang.String[] r8 = com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.DEFAULT_PROJECTION
            r12 = 0
            r13 = 0
            java.lang.String r7 = "business_info_metadata"
            java.lang.String r9 = "rbm_bot_id = ?"
            r11 = 0
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L47
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L47
            r4 = r0
            goto L48
        L3c:
            r0 = move-exception
            r15 = r0
            r1.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            r15.addSuppressed(r0)
        L46:
            throw r15
        L47:
            r4 = r5
        L48:
            if (r1 == 0) goto L4d
            r1.close()
        L4d:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>(r3)
            java.lang.String r3 = "rbm_bot_id"
            r1.put(r3, r15)
            java.lang.String r3 = "version"
            r7 = r16
            r1.put(r3, r7)
            java.lang.String r3 = "expiry_milliseconds"
            r1.put(r3, r2)
            java.lang.String r2 = "business_info_metadata"
            if (r4 == 0) goto L7c
            java.lang.String r15 = defpackage.dhja.a(r15)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r5] = r15
            java.lang.String r15 = "Bot info metadata already exists for bot id: {%s}. Updating row..."
            defpackage.dhja.k(r15, r3)
            int r15 = r6.update(r2, r1, r9, r10)
            if (r15 <= 0) goto L7b
            return r0
        L7b:
            return r5
        L7c:
            java.lang.String r15 = defpackage.dhja.a(r15)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r5] = r15
            java.lang.String r15 = "Inserting new bot info metadata for bot id: {%s}."
            defpackage.dhja.k(r15, r3)
            r15 = 0
            long r1 = r6.insert(r2, r15, r1)
            r3 = 0
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 <= 0) goto L95
            return r0
        L95:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase.insertOrUpdateBusinessInfoMetadata(java.lang.String, java.lang.String, long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isMediaLocallyAvailable(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.lang.String r11 = r9.getLocalMediaPath(r10, r11)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            r2 = 1
            android.content.Context r0 = r9.context     // Catch: java.lang.Exception -> L4d
            android.content.ContentResolver r3 = r0.getContentResolver()     // Catch: java.lang.Exception -> L4d
            android.net.Uri r4 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> L4d
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L4d
            r11.getClass()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3a
            java.lang.String r0 = "_size"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3f
            long r3 = r11.getLong(r0)     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r0 = r2
            goto L3b
        L3a:
            r0 = r1
        L3b:
            r11.close()     // Catch: java.lang.Exception -> L4d
            return r0
        L3f:
            r0 = move-exception
            r3 = r0
            if (r11 == 0) goto L4c
            r11.close()     // Catch: java.lang.Throwable -> L47
            goto L4c
        L47:
            r0 = move-exception
            r11 = r0
            r3.addSuppressed(r11)     // Catch: java.lang.Exception -> L4d
        L4c:
            throw r3     // Catch: java.lang.Exception -> L4d
        L4d:
            r0 = move-exception
            r11 = r0
            java.lang.String r10 = defpackage.dhja.a(r10)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r10
            java.lang.String r10 = "Cannot determine media file availability for botId %s."
            defpackage.dhja.i(r11, r10, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase.isMediaLocallyAvailable(java.lang.String, int):boolean");
    }

    public boolean isMetadataLocallyAvailable(String str) {
        try {
            Cursor cursorQuery = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.VIEW_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        if (cursorQuery.getCount() > 1) {
                            dhja.g("Multiple business info rows detected for %s", dhja.a(str));
                            cqaz.c("Multiple business info rows detected");
                            cursorQuery.close();
                            return true;
                        }
                        if (dfnr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1 && TextUtils.isEmpty(cursorQuery.getString(cursorQuery.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL)))) {
                            dhja.k("Historical business info is present for %s, but does not contain verifier information (and feature is enabled).", dhja.a(str));
                            cursorQuery.close();
                            return false;
                        }
                        dhja.k("Business info is locally available for bot id %s.", dhja.a(str));
                        cursorQuery.close();
                        return true;
                    }
                } finally {
                }
            }
            dhja.k("Business info not available for %s", dhja.a(str));
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return false;
        } catch (Exception e) {
            dhja.i(e, "Exception while determining business info availability for %s", dhja.a(str));
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(BUSINESS_INFO_TABLE_HEAD_CREATE_SQL);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sQLiteDatabase.execSQL(BUSINESS_VERIFIER_INFO_TABLE_HEAD_CREATE_SQL);
        sQLiteDatabase.execSQL(BUSINESS_INFO_WITH_VERIFIER_VIEW_HEAD_CREATE_SQL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        dhja.k("Beginning database upgrade procedure...", new Object[0]);
        if (i < 3) {
            logUpgradeStart(i, i2);
            dropAllTables(sQLiteDatabase);
            createV3Db(sQLiteDatabase);
            logUpgradeProgress(3, i2);
        }
        if (i < 4) {
            logUpgradeStart(i, i2);
            sQLiteDatabase.execSQL(BUSINESS_VERIFIER_INFO_TABLE_HEAD_CREATE_SQL);
            sQLiteDatabase.execSQL("ALTER TABLE business_info ADD COLUMN verifier_id TEXT ");
            logUpgradeProgress(4, i2);
        }
        if (i < 5) {
            logUpgradeStart(i, i2);
            sQLiteDatabase.execSQL(BUSINESS_INFO_WITH_VERIFIER_VIEW_HEAD_CREATE_SQL);
            logUpgradeProgress(5, i2);
        }
        dhja.k("Database upgrade completed. Database is now version %d.", Integer.valueOf(i2));
    }

    public Long queryExpiryMillisByBotId(String str) {
        Cursor cursorQuery = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.TABLE_NAME, new String[]{BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS}, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
        try {
            int columnIndex = cursorQuery.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
            Long lValueOf = null;
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(columnIndex)) {
                lValueOf = Long.valueOf(cursorQuery.getLong(columnIndex));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return lValueOf;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public boolean updateLocalUri(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            String[] strArr = {str};
            ContentValues contentValues = new ContentValues();
            String str3 = "logo_image_local_uri";
            String str4 = "business_info";
            String str5 = BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID;
            if (i != 0) {
                if (i == 1) {
                    str3 = BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI;
                } else {
                    if (i != 2) {
                        return false;
                    }
                    str5 = BUSINESS_VERIFIER_INFO_SELECTION_ON_RBM_BOT_ID;
                    str4 = BusinessInfoDatabaseConstants.BusinessVerifierInfoTableConstants.TABLE_NAME;
                }
            }
            contentValues.put(str3, str2);
            if (writableDatabase.update(str4, contentValues, str5, strArr) > 0) {
                return true;
            }
        }
        return false;
    }

    private BusinessInfoDatabase(Context context, int i) {
        super(context, "business_info", (SQLiteDatabase.CursorFactory) null, i);
        this.context = context;
    }
}
