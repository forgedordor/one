package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drey extends SQLiteOpenHelper implements GellerDatabase {
    public static final ekrg c = ekrg.c("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl");
    private final boolean d;
    private final Context e;
    private final drex f;
    private final drfb g;
    private final drfc h;
    private final ejwi i;
    private final Map j;
    private final String k;
    private int l;
    private final eway m;

    public drey(Context context, String str, boolean z, boolean z2, int i, ejwi ejwiVar, Map map, eway ewayVar) {
        super(context, String.format("portable_geller_%s.db", str.replace(File.separator, "_")), (SQLiteDatabase.CursorFactory) null, 9);
        this.l = 9;
        this.e = context;
        this.k = str;
        setWriteAheadLoggingEnabled(z);
        d();
        this.d = z2;
        this.f = new drex(z2, ewayVar);
        this.g = new drfb(context, str, ewayVar);
        this.h = new drfc();
        this.i = ejwiVar;
        this.j = map;
        this.m = ewayVar;
        ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "<init>", 178, "GellerDatabaseImpl.java")).t("Setting isLegacySQLite mode to %s.", Boolean.valueOf(z2));
    }

    public static final boolean g(String str) {
        return a.contains(str);
    }

    private final int h(String str) throws SQLException, GellerException {
        exby exbyVarK = k();
        if (exbyVarK == null) {
            ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGcLimit", 1484, "GellerDatabaseImpl.java")).t("The GellerConfig is not present, defaulting getGCLimit for corpus %s to 0.", str);
            return 0;
        }
        exco excoVar = exbyVarK.c;
        if (excoVar == null) {
            excoVar = exco.a;
        }
        for (excn excnVar : excoVar.b) {
            ewut ewutVarB = ewut.b(excnVar.b);
            if (ewutVarB == null) {
                ewutVarB = ewut.UNKNOWN;
            }
            if (ejuf.e(ewutVarB.name(), str)) {
                exck exckVar = excnVar.c;
                if (exckVar == null) {
                    exckVar = exck.a;
                }
                return exckVar.b;
            }
        }
        ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGcLimit", 1495, "GellerDatabaseImpl.java")).t("The Geller StorageConfig is not present, defaulting getGCLimit for corpus %s to 0.", str);
        return 0;
    }

    private final long i(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            return 0L;
        }
        sQLiteDatabaseD.beginTransactionNonExclusive();
        try {
            long jDelete = sQLiteDatabaseD.delete("geller_metadata_table", str, strArr);
            sQLiteDatabaseD.setTransactionSuccessful();
            return jDelete;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [drev, java.lang.Object] */
    private final drev j(String str) {
        if (b.contains(str)) {
            ejwi ejwiVar = this.i;
            return ejwiVar.g() ? ejwiVar.c() : this.h;
        }
        Map map = this.j;
        return map.containsKey(str) ? (drev) map.get(str) : g(str) ? this.g : this.f;
    }

    private final exby k() throws SQLException, GellerException {
        byte[][] all;
        String strName = ewut.GELLER_CONFIG.name();
        ewbk ewbkVar = ewbk.a;
        ewbf ewbfVar = (ewbf) ewbkVar.createBuilder();
        ewbfVar.copyOnWrite();
        ewbk ewbkVar2 = (ewbk) ewbfVar.instance;
        ewbkVar2.b |= 1;
        ewbkVar2.e = 1;
        try {
            ewbk ewbkVar3 = (ewbk) evsn.parseFrom(ewbkVar, ((ewbk) ewbfVar.build()).toByteArray(), evrr.a());
            ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", 440, "GellerDatabaseImpl.java")).D("Reading %s params: %s", strName, ewbkVar3);
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                all = new byte[0][];
            } else {
                ewbf ewbfVar2 = (ewbf) ewbkVar3.toBuilder();
                ewbfVar2.copyOnWrite();
                ewbk ewbkVar4 = (ewbk) ewbfVar2.instance;
                strName.getClass();
                ewbkVar4.b |= 4;
                ewbkVar4.g = strName;
                int i = ewbkVar3.b;
                if ((i & 16) == 0 && (i & 64) == 0) {
                    ewbfVar2.copyOnWrite();
                    ewbk ewbkVar5 = (ewbk) ewbfVar2.instance;
                    ewbkVar5.b |= 16;
                    ewbkVar5.i = false;
                }
                try {
                    all = j(strName).d(ejwi.j(sQLiteDatabaseD), (ewbk) ewbfVar2.build());
                } catch (SQLiteException | IllegalStateException e) {
                    e(e);
                    throw new GellerException(11, e.getMessage(), e);
                }
            }
        } catch (evtj e2) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", (char) 442, "GellerDatabaseImpl.java")).q("Failed to parse GellerReadParams bytes");
            all = readAll(strName);
        }
        if (all.length == 0) {
            ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGellerConfigClientConfig", 1424, "GellerDatabaseImpl.java")).q("The GellerConfig is not present, returning null.");
            return null;
        }
        evrr evrrVarA = evrr.a();
        try {
            ewuw ewuwVar = (ewuw) evsn.parseFrom(ewuw.a, all[0], evrrVarA);
            evsl evslVarCheckIsLite = evsn.checkIsLite(exby.b);
            ewuwVar.d(evslVarCheckIsLite);
            if (ewuwVar.r.o(evslVarCheckIsLite.d)) {
                evsl evslVarCheckIsLite2 = evsn.checkIsLite(exby.b);
                ewuwVar.d(evslVarCheckIsLite2);
                Object objL = ewuwVar.r.l(evslVarCheckIsLite2.d);
                return (exby) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL));
            }
            try {
                evqe evqeVar = ewuwVar.e;
                if (evqeVar == null) {
                    evqeVar = evqe.a;
                }
                return (exby) evsn.parseFrom(exby.a, evqeVar.c, evrrVarA);
            } catch (evtj e3) {
                throw new IllegalStateException("Failed to unpack GellerClientConfig.", e3);
            }
        } catch (evtj e4) {
            throw new IllegalStateException("Failed to parse an element.", e4);
        }
    }

    private final boolean l(String str) throws SQLException, GellerException {
        exby exbyVarK = k();
        if (exbyVarK == null) {
            ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isUploadEnabled", 1459, "GellerDatabaseImpl.java")).t("The GellerConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
            return true;
        }
        excu excuVar = exbyVarK.d;
        if (excuVar == null) {
            excuVar = excu.a;
        }
        for (exct exctVar : excuVar.b) {
            ewut ewutVarB = ewut.b(exctVar.b);
            if (ewutVarB == null) {
                ewutVarB = ewut.UNKNOWN;
            }
            if (ejuf.e(ewutVarB.name(), str)) {
                excq excqVar = exctVar.c;
                if (excqVar == null) {
                    excqVar = excq.a;
                }
                excg excgVar = excqVar.b;
                if (excgVar == null) {
                    excgVar = excg.a;
                }
                return excgVar.b;
            }
        }
        ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isUploadEnabled", 1470, "GellerDatabaseImpl.java")).t("The Geller SyncConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
        return true;
    }

    private final long m(String str, String[] strArr, int i) {
        if (d() == null) {
            return 0L;
        }
        new ContentValues().put("delete_status", dres.a(i));
        return r0.update("geller_key_table", r1, str, strArr);
    }

    private static final String n(String str) {
        g(str);
        return "key";
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(java.lang.String r22, defpackage.ewbc r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drey.a(java.lang.String, ewbc):long");
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final /* bridge */ /* synthetic */ Map b() {
        ekgi ekgiVar = new ekgi();
        for (Map.Entry entry : this.j.entrySet()) {
            ewuu ewuuVarC = ((drev) entry.getValue()).c();
            if (ewuuVarC != ewuu.CUSTOM_STORAGE_TYPE_UNKNOWN) {
                ekgiVar.i((String) entry.getKey(), ewuuVarC);
            }
        }
        return ekgiVar.c();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final void c() {
        close();
    }

    public final synchronized SQLiteDatabase d() {
        try {
        } catch (SQLiteException e) {
            if (e.getMessage().contains("Can't upgrade read-only database")) {
                return null;
            }
            ((ekrd) ((ekrd) ((ekrd) c.j()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSQLiteDatabase", (char) 1637, "GellerDatabaseImpl.java")).q("Failed to get geller database.");
            return null;
        }
        return getWritableDatabase();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long delete(String str) {
        ekrg ekrgVar = c;
        ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 824, "GellerDatabaseImpl.java")).t("Deleting all data for %s", str);
        SQLiteDatabase sQLiteDatabaseD = d();
        long jA = 0;
        try {
            if (sQLiteDatabaseD == null) {
                ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 827, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0L;
            }
            try {
                sQLiteDatabaseD.beginTransactionNonExclusive();
                i("data_type = ?", new String[]{str});
                drev drevVarJ = j(str);
                ejwi ejwiVarJ = ejwi.j(sQLiteDatabaseD);
                String str2 = this.k;
                evzx evzxVar = (evzx) ewae.a.createBuilder();
                evzxVar.copyOnWrite();
                ewae ewaeVar = (ewae) evzxVar.instance;
                str.getClass();
                ewaeVar.b |= 1;
                ewaeVar.e = str;
                evzxVar.copyOnWrite();
                ewae.a((ewae) evzxVar.instance);
                jA = drevVarJ.a(ejwiVarJ, str2, (ewae) evzxVar.build());
                sQLiteDatabaseD.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 843, "GellerDatabaseImpl.java")).t("Delete %s failed", str);
                e(e);
            }
            return jA;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long deleteMetadata(String str, String str2) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "deleteMetadata", 902, "GellerDatabaseImpl.java")).D("deleting metadata %s : %s", str, str2);
        try {
            return i("data_type = ? AND key = ?", new String[]{str, str2});
        } catch (SQLiteException | IllegalStateException e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "deleteMetadata", 906, "GellerDatabaseImpl.java")).D("Delete metadata %s : %s failed", str, str2);
            e(e);
            return 0L;
        }
    }

    final void e(Exception exc) throws SQLException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "handleException", (char) 1530, "GellerDatabaseImpl.java")).q("An error occurred. No action was taken because the database was null.");
            return;
        }
        if ((exc instanceof IllegalStateException) || (exc instanceof SQLiteDatabaseLockedException) || (exc instanceof SQLiteDiskIOException) || (exc instanceof SQLiteFullException) || (exc instanceof SQLiteOutOfMemoryException) || (exc instanceof SQLiteTableLockedException)) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "handleException", (char) 1533, "GellerDatabaseImpl.java")).q("An error occurred. No action was taken because the exception was not actionable.");
            return;
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h("geller_key_table");
        ekfwVar.h("geller_data_table");
        if (this.l >= 5) {
            ekfwVar.h("geller_file_table");
        }
        if (this.l >= 8) {
            ekfwVar.h("geller_metadata_table");
        }
        ekgb ekgbVarG = ekfwVar.g();
        Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery(String.format("SELECT count(*) FROM %s WHERE %s", "sqlite_master", "type = ? AND ".concat(drfa.b("name", "IN", ekgbVarG))), new String[]{"table"});
        try {
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            int i3 = ((ekoe) ekgbVarG).c;
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (i2 == i3) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "validateTableSchema", (char) 1549, "GellerDatabaseImpl.java")).q("An error occurred. No action was taken because the error reason is unknown.");
            } else {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "validateTableSchema", (char) 1545, "GellerDatabaseImpl.java")).q("An error occurred. Dropping existing data and recreating all tables.");
                f(sQLiteDatabaseD);
            }
        } finally {
        }
    }

    final void f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    String string = cursorRawQuery.getString(0);
                    sQLiteDatabase.execSQL(a.v(string, "DROP TABLE IF EXISTS "));
                    ((ekrd) ((ekrd) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "dropAllTables", 1671, "GellerDatabaseImpl.java")).t("Dropped table %s", string);
                } finally {
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            drfb.k(new File(this.e.getFilesDir(), "geller"));
            onCreate(sQLiteDatabase);
        } catch (SQLiteException e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "recreateTables", (char) 1652, "GellerDatabaseImpl.java")).q("Failed to recreate tables");
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getCorpusStats() throws SQLException {
        HashMap map = new HashMap();
        map.put(this.g, new HashSet());
        map.put(this.f, new HashSet());
        ejwi ejwiVar = this.i;
        if (ejwiVar.g()) {
            map.put(ejwiVar.c(), new HashSet());
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            map.put((drev) it.next(), new HashSet());
        }
        evzv evzvVar = (evzv) evzw.a.createBuilder();
        ejwi ejwiVarJ = ejwi.j(d());
        try {
            for (Map.Entry entry : map.entrySet()) {
                Iterator<E> it2 = ((drev) entry.getKey()).b(ejwiVarJ, (Set) entry.getValue()).c.iterator();
                while (it2.hasNext()) {
                    evzvVar.a((evzu) it2.next());
                }
            }
            return ((evzw) evzvVar.build()).toByteArray();
        } catch (SQLiteException | IllegalStateException e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getCorpusStats", (char) 1074, "GellerDatabaseImpl.java")).q("GetCorpusStats failed");
            e(e);
            return new byte[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getSnapshot(String[] strArr, int i, boolean z) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        int i2;
        int i3;
        byte[][] bArr;
        byte[][] bArr2;
        String[] strArr2 = strArr;
        int i4 = 1;
        ewbp ewbpVar = i != 0 ? i != 1 ? null : ewbp.CREATE_REQUEST : ewbp.GELLER_SNAPSHOT_REASON_UNSPECIFIED;
        if (ewbpVar == null || ewbpVar != ewbp.CREATE_REQUEST) {
            ((ekrd) ((ekrd) c.i()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 697, "GellerDatabaseImpl.java")).q("Invalid geller snapshot reason.");
            return new byte[0];
        }
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 701, "GellerDatabaseImpl.java")).D("getting snapshot for %s reason: %s", Arrays.toString(strArr2), ewbpVar);
        ewbs ewbsVar = (ewbs) ewbt.a.createBuilder();
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            sQLiteDatabaseD.beginTransactionNonExclusive();
            try {
                try {
                    int length = strArr2.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        String str = strArr2[i5];
                        if (l(str)) {
                            ewbq ewbqVar = (ewbq) ewbr.a.createBuilder();
                            ewbqVar.copyOnWrite();
                            ewbr ewbrVar = (ewbr) ewbqVar.instance;
                            str.getClass();
                            ewbrVar.b |= i4;
                            ewbrVar.c = str;
                            ewce ewceVar = ewce.a;
                            ewcc ewccVar = (ewcc) ewceVar.createBuilder();
                            ewccVar.copyOnWrite();
                            ewce ewceVar2 = (ewce) ewccVar.instance;
                            ewceVar2.c = i4;
                            boolean z2 = i4;
                            ewceVar2.b |= 1;
                            drev drevVarJ = j(str);
                            ejwi ejwiVarJ = ejwi.j(sQLiteDatabaseD);
                            ewbk ewbkVar = ewbk.a;
                            ewbf ewbfVar = (ewbf) ewbkVar.createBuilder();
                            ewbfVar.copyOnWrite();
                            sQLiteDatabase = sQLiteDatabaseD;
                            try {
                                ewbk ewbkVar2 = (ewbk) ewbfVar.instance;
                                str.getClass();
                                i3 = length;
                                ewbkVar2.b |= 4;
                                ewbkVar2.g = str;
                                ewbfVar.copyOnWrite();
                                ewbk ewbkVar3 = (ewbk) ewbfVar.instance;
                                ewbkVar3.b |= 8;
                                ewbkVar3.h = z2;
                                ewbfVar.copyOnWrite();
                                ewbk ewbkVar4 = (ewbk) ewbfVar.instance;
                                ewbkVar4.b |= 16;
                                ewbkVar4.i = true;
                                ewbfVar.copyOnWrite();
                                ewbk ewbkVar5 = (ewbk) ewbfVar.instance;
                                ewbkVar5.b |= 32;
                                ewbkVar5.j = false;
                                byte[][] bArrD = drevVarJ.d(ejwiVarJ, (ewbk) ewbfVar.build());
                                int length2 = bArrD.length;
                                int i7 = 0;
                                while (i7 < length2) {
                                    byte[] bArr3 = bArrD[i7];
                                    if (z) {
                                        int length3 = bArr3.length + i6;
                                        bArr2 = bArrD;
                                        if (length3 <= 3500000) {
                                            ewccVar.a(evqs.x(bArr3));
                                            i6 = length3;
                                        }
                                    } else {
                                        bArr2 = bArrD;
                                        ewccVar.a(evqs.x(bArr3));
                                    }
                                    i7++;
                                    bArrD = bArr2;
                                }
                                ewcc ewccVar2 = (ewcc) ewceVar.createBuilder();
                                ewccVar2.copyOnWrite();
                                ewce ewceVar3 = (ewce) ewccVar2.instance;
                                ewceVar3.c = 4;
                                ewceVar3.b |= 1;
                                ewbf ewbfVar2 = (ewbf) ewbkVar.createBuilder();
                                ewbfVar2.copyOnWrite();
                                ewbk ewbkVar6 = (ewbk) ewbfVar2.instance;
                                str.getClass();
                                ewbkVar6.b |= 4;
                                ewbkVar6.g = str;
                                ewbfVar2.copyOnWrite();
                                ewbk ewbkVar7 = (ewbk) ewbfVar2.instance;
                                ewbkVar7.b |= 8;
                                ewbkVar7.h = false;
                                ewbfVar2.copyOnWrite();
                                ewbk ewbkVar8 = (ewbk) ewbfVar2.instance;
                                ewbkVar8.b |= 16;
                                ewbkVar8.i = false;
                                if (!this.m.g || h(str) <= 0) {
                                    i2 = 1;
                                } else {
                                    int iH = h(str);
                                    ewbfVar2.copyOnWrite();
                                    ewbk ewbkVar9 = (ewbk) ewbfVar2.instance;
                                    i2 = 1;
                                    ewbkVar9.b |= 1;
                                    ewbkVar9.e = iH;
                                }
                                byte[][] bArrD2 = j(str).d(ejwi.j(sQLiteDatabase), (ewbk) ewbfVar2.build());
                                int length4 = bArrD2.length;
                                int i8 = 0;
                                while (i8 < length4) {
                                    byte[] bArr4 = bArrD2[i8];
                                    if (z) {
                                        int length5 = bArr4.length + i6;
                                        bArr = bArrD2;
                                        if (length5 <= 3500000) {
                                            ewccVar2.a(evqs.x(bArr4));
                                            i6 = length5;
                                        }
                                    } else {
                                        bArr = bArrD2;
                                        ewccVar2.a(evqs.x(bArr4));
                                    }
                                    i8++;
                                    bArrD2 = bArr;
                                }
                                if (!DesugarCollections.unmodifiableList(((ewce) ewccVar.instance).d).isEmpty() || !DesugarCollections.unmodifiableList(((ewce) ewccVar2.instance).d).isEmpty()) {
                                    ewbqVar.a(ewccVar);
                                    ewbqVar.a(ewccVar2);
                                    String[] metadata = readMetadata(str, "_version_info");
                                    if (metadata.length > 0) {
                                        String str2 = metadata[0];
                                        ewbqVar.copyOnWrite();
                                        ewbr ewbrVar2 = (ewbr) ewbqVar.instance;
                                        str2.getClass();
                                        ewbrVar2.b |= 2;
                                        ewbrVar2.e = str2;
                                    }
                                    String[] metadata2 = readMetadata(str, "_sync_token");
                                    if (metadata2.length > 0) {
                                        String str3 = metadata2[0];
                                        ewbqVar.copyOnWrite();
                                        ewbr ewbrVar3 = (ewbr) ewbqVar.instance;
                                        str3.getClass();
                                        ewbrVar3.b |= 4;
                                        ewbrVar3.f = str3;
                                    }
                                    ewbsVar.copyOnWrite();
                                    ewbt ewbtVar = (ewbt) ewbsVar.instance;
                                    ewbr ewbrVar4 = (ewbr) ewbqVar.build();
                                    ewbrVar4.getClass();
                                    evtg evtgVar = ewbtVar.b;
                                    if (!evtgVar.c()) {
                                        ewbtVar.b = evsn.mutableCopy(evtgVar);
                                    }
                                    ewbtVar.b.add(ewbrVar4);
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 788, "GellerDatabaseImpl.java")).q("Get snapshot failed.");
                                e(e);
                                sQLiteDatabase.endTransaction();
                                return ((ewbt) ewbsVar.build()).toByteArray();
                            } catch (IllegalStateException e2) {
                                e = e2;
                                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 788, "GellerDatabaseImpl.java")).q("Get snapshot failed.");
                                e(e);
                                sQLiteDatabase.endTransaction();
                                return ((ewbt) ewbsVar.build()).toByteArray();
                            }
                        } else {
                            i2 = i4;
                            sQLiteDatabase = sQLiteDatabaseD;
                            i3 = length;
                        }
                        i5++;
                        strArr2 = strArr;
                        i4 = i2;
                        sQLiteDatabaseD = sQLiteDatabase;
                        length = i3;
                    }
                    sQLiteDatabase = sQLiteDatabaseD;
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                sQLiteDatabase = sQLiteDatabaseD;
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 788, "GellerDatabaseImpl.java")).q("Get snapshot failed.");
                e(e);
                sQLiteDatabase.endTransaction();
                return ((ewbt) ewbsVar.build()).toByteArray();
            } catch (IllegalStateException e4) {
                e = e4;
                sQLiteDatabase = sQLiteDatabaseD;
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 788, "GellerDatabaseImpl.java")).q("Get snapshot failed.");
                e(e);
                sQLiteDatabase.endTransaction();
                return ((ewbt) ewbsVar.build()).toByteArray();
            } catch (Throwable th2) {
                th = th2;
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabaseD;
                sQLiteDatabase2.endTransaction();
                throw th;
            }
            sQLiteDatabase.endTransaction();
        }
        return ((ewbt) ewbsVar.build()).toByteArray();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long markSyncStatus(String str, byte[] bArr) {
        try {
            return a(str, (ewbc) evsn.parseFrom(ewbc.a, bArr, evrr.a()));
        } catch (evtj e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", (char) 1089, "GellerDatabaseImpl.java")).q("Failed to parse GellerMarkSyncStatusParams.");
            return 0L;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_data_table (_id INTEGER PRIMARY KEY, data BLOB NOT NULL);");
        int i = this.l;
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else if (i <= 5) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        }
        sQLiteDatabase.execSQL("CREATE INDEX datatype_key_dataid ON geller_key_table (data_type, key, delete_status, data_id);");
        if (this.l >= 3) {
            sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
        }
        int i2 = this.l;
        if (i2 >= 5 && i2 <= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
        }
        if (this.l >= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
        }
        if (this.l >= 8) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, file_path TEXT NOT NULL);");
        }
        if (this.l >= 9) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_database_info_table (key TEXT NOT NULL, info TEXT NOT NULL);");
            sQLiteDatabase.execSQL(drez.a);
        }
        sQLiteDatabase.setVersion(this.l);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "onDowngrade", 273, "GellerDatabaseImpl.java")).u("Downgrading Geller database from version: %d to %d", i, i2);
        this.l = i2;
        f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "onUpgrade", 227, "GellerDatabaseImpl.java")).u("Upgrading Geller database from version: %d to %d", i, i2);
        while (i < i2) {
            switch (i) {
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN num_times_used INTEGER;");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
                    break;
                case 4:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
                    break;
                case 5:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN deletion_sync_status TEXT;");
                    break;
                case 6:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
                    break;
                case 7:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_file_table ADD COLUMN deletion_sync_status TEXT;");
                    break;
                case 8:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_database_info_table (key TEXT NOT NULL, info TEXT NOT NULL);");
                    sQLiteDatabase.execSQL(drez.a);
                    break;
            }
            i++;
        }
        this.l = i2;
        sQLiteDatabase.setVersion(i2);
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] read(String str, boolean z, boolean z2) throws SQLException, GellerException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", 501, "GellerDatabaseImpl.java")).I("reading data %s isSynced: %b isDeleted: %b", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            return new byte[0][];
        }
        try {
            drev drevVarJ = j(str);
            ejwi ejwiVarJ = ejwi.j(sQLiteDatabaseD);
            ewbf ewbfVar = (ewbf) ewbk.a.createBuilder();
            ewbfVar.copyOnWrite();
            ewbk ewbkVar = (ewbk) ewbfVar.instance;
            str.getClass();
            ewbkVar.b |= 4;
            ewbkVar.g = str;
            ewbfVar.copyOnWrite();
            ewbk ewbkVar2 = (ewbk) ewbfVar.instance;
            ewbkVar2.b |= 8;
            ewbkVar2.h = z;
            ewbfVar.copyOnWrite();
            ewbk ewbkVar3 = (ewbk) ewbfVar.instance;
            ewbkVar3.b |= 16;
            ewbkVar3.i = z2;
            return drevVarJ.d(ejwiVarJ, (ewbk) ewbfVar.build());
        } catch (SQLiteException | IllegalStateException e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readAll(String str) throws SQLException, GellerException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readAll", 526, "GellerDatabaseImpl.java")).t("reading all %s", str);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            return new byte[0][];
        }
        try {
            drev drevVarJ = j(str);
            ejwi ejwiVarJ = ejwi.j(sQLiteDatabaseD);
            ewbf ewbfVar = (ewbf) ewbk.a.createBuilder();
            ewbfVar.copyOnWrite();
            ewbk ewbkVar = (ewbk) ewbfVar.instance;
            str.getClass();
            ewbkVar.b |= 4;
            ewbkVar.g = str;
            return drevVarJ.d(ejwiVarJ, (ewbk) ewbfVar.build());
        } catch (SQLiteException | IllegalStateException e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readDatabaseInfo(String str) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readDatabaseInfo", 610, "GellerDatabaseImpl.java")).t("reading database info: %s", str);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                ejud ejudVar = ejud.a;
                return (String[]) drfa.d(sQLiteDatabaseD, "geller_database_info_table", "info", "key = ?", new String[]{str}, ejudVar, ejudVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readDatabaseInfo", (char) 625, "GellerDatabaseImpl.java")).q("Read database info failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readElementIds(String str, byte[] bArr) throws SQLException, GellerException {
        try {
            ewbk ewbkVar = (ewbk) evsn.parseFrom(ewbk.a, bArr, evrr.a());
            ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readElementIds", 472, "GellerDatabaseImpl.java")).D("Reading %s params: %s", str, ewbkVar);
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                return new byte[0][];
            }
            ewbf ewbfVar = (ewbf) ewbkVar.toBuilder();
            ewbfVar.copyOnWrite();
            ewbk ewbkVar2 = (ewbk) ewbfVar.instance;
            str.getClass();
            ewbkVar2.b |= 4;
            ewbkVar2.g = str;
            int i = ewbkVar.b;
            if ((i & 16) == 0 && (i & 64) == 0) {
                ewbfVar.copyOnWrite();
                ewbk ewbkVar3 = (ewbk) ewbfVar.instance;
                ewbkVar3.b |= 16;
                ewbkVar3.i = false;
            }
            try {
                return j(str).j(ejwi.j(sQLiteDatabaseD), (ewbk) ewbfVar.build());
            } catch (SQLiteException | IllegalStateException e) {
                e(e);
                throw new GellerException(11, e.getMessage(), e);
            }
        } catch (evtj e2) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readElementIds", (char) 474, "GellerDatabaseImpl.java")).q("Failed to parse GellerReadParams bytes");
            return readAll(str);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readKeys(String str) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readKeys", 546, "GellerDatabaseImpl.java")).t("reading keys for %s", str);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                return j(str).e(ejwi.j(sQLiteDatabaseD), str);
            } catch (SQLiteException | IllegalStateException e) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readKeys", (char) 552, "GellerDatabaseImpl.java")).q("Read keys failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readMetadata(String str, String str2) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadata", 562, "GellerDatabaseImpl.java")).D("reading metadata %s : %s", str, str2);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                ejud ejudVar = ejud.a;
                return (String[]) drfa.d(sQLiteDatabaseD, "geller_metadata_table", "metadata", "data_type = ? AND key = ?", new String[]{str, str2}, ejudVar, ejudVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadata", (char) 577, "GellerDatabaseImpl.java")).q("Read metadata failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] readMetadataForAllCorpora(String str) throws SQLException {
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadataForAllCorpora", 587, "GellerDatabaseImpl.java")).t("reading all metadata for corpora with key: %s", str);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                String[] strArr = {"data_type", "metadata"};
                evzp evzpVar = (evzp) evzq.a.createBuilder();
                try {
                    Cursor cursorQuery = sQLiteDatabaseD.query(true, "geller_metadata_table", strArr, "key = ?", new String[]{str}, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            evzr evzrVar = (evzr) evzs.a.createBuilder();
                            String string = cursorQuery.getString(0);
                            evzrVar.copyOnWrite();
                            evzs evzsVar = (evzs) evzrVar.instance;
                            string.getClass();
                            evzsVar.b |= 1;
                            evzsVar.c = string;
                            evzrVar.copyOnWrite();
                            evzs evzsVar2 = (evzs) evzrVar.instance;
                            str.getClass();
                            evzsVar2.b |= 2;
                            evzsVar2.d = str;
                            String string2 = cursorQuery.getString(1);
                            evzrVar.copyOnWrite();
                            evzs evzsVar3 = (evzs) evzrVar.instance;
                            string2.getClass();
                            evzsVar3.b |= 4;
                            evzsVar3.e = string2;
                            evzs evzsVar4 = (evzs) evzrVar.build();
                            evzpVar.copyOnWrite();
                            evzq evzqVar = (evzq) evzpVar.instance;
                            evzsVar4.getClass();
                            evtg evtgVar = evzqVar.b;
                            if (!evtgVar.c()) {
                                evzqVar.b = evsn.mutableCopy(evtgVar);
                            }
                            evzqVar.b.add(evzsVar4);
                        } finally {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (IllegalArgumentException e) {
                    ((ekrd) ((ekrd) ((ekrd) drfa.a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil", "readMetadataFromTable", '`', "GellerDatabaseUtil.java")).q("Column doesn't exist");
                }
                return ((evzq) evzpVar.build()).toByteArray();
            } catch (SQLiteException | IllegalStateException e2) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadataForAllCorpora", (char) 600, "GellerDatabaseImpl.java")).q("Read metadata failed");
                e(e2);
            }
        }
        return new byte[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readOutdatedData(String str) throws SQLException {
        drey dreyVar;
        drey dreyVar2;
        if (this.m.h) {
            ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", 1359, "GellerDatabaseImpl.java")).t("reading outdated data for %s", str);
            boolean zG = g(str);
            String str2 = "data_type = ? AND timestamp_micro >= 0 AND delete_status = ?";
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add("DELETION_PROCESSED");
            try {
                if (l(str)) {
                    arrayList.add("DELETION_SYNCED");
                    str2 = (str2 + " AND (( deletion_sync_status = ? )") + " OR ( deletion_sync_status IS NULL AND sync_status IS NULL ))";
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                SQLiteDatabase sQLiteDatabaseD = d();
                if (sQLiteDatabaseD != null) {
                    if (zG) {
                        try {
                            return drfb.l(sQLiteDatabaseD, str2, strArr, ejud.a);
                        } catch (SQLiteException | IllegalStateException e) {
                            e = e;
                            dreyVar2 = this;
                        }
                    } else {
                        dreyVar2 = this;
                        try {
                            return drex.m(sQLiteDatabaseD, dreyVar2.d, str2, strArr, dreyVar2.m);
                        } catch (SQLiteException e2) {
                            e = e2;
                        } catch (IllegalStateException e3) {
                            e = e3;
                        }
                    }
                    Exception exc = e;
                    ((ekrd) ((ekrd) ((ekrd) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", (char) 1404, "GellerDatabaseImpl.java")).q("Read outdated data failed.");
                    dreyVar2.e(exc);
                }
                return new byte[0][];
            } catch (IllegalStateException e4) {
                ((ekrd) ((ekrd) ((ekrd) c.j()).g(e4)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", 1374, "GellerDatabaseImpl.java")).t("There was an error determining whether corpus %s supports upload.", str);
                return new byte[0][];
            }
        }
        ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", 639, "GellerDatabaseImpl.java")).t("reading outdated data %s", str);
        boolean zG2 = g(str);
        String str3 = "data_type = ? AND timestamp_micro >= 0 AND delete_status = ?";
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        arrayList2.add("DELETION_PROCESSED");
        try {
            if (l(str)) {
                arrayList2.add("DELETION_SYNCED");
                str3 = (str3 + " AND (( deletion_sync_status = ? )") + " OR ( deletion_sync_status IS NULL AND sync_status IS NULL ))";
            }
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            SQLiteDatabase sQLiteDatabaseD2 = d();
            if (sQLiteDatabaseD2 != null) {
                if (zG2) {
                    try {
                        return drfb.l(sQLiteDatabaseD2, str3, strArr2, ejud.a);
                    } catch (SQLiteException | IllegalStateException e5) {
                        e = e5;
                        dreyVar = this;
                    }
                } else {
                    dreyVar = this;
                    try {
                        return drex.l(sQLiteDatabaseD2, dreyVar.d, str3, strArr2);
                    } catch (SQLiteException e6) {
                        e = e6;
                    } catch (IllegalStateException e7) {
                        e = e7;
                    }
                }
                Exception exc2 = e;
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(exc2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", (char) 683, "GellerDatabaseImpl.java")).q("Read outdated data failed.");
                dreyVar.e(exc2);
            }
            return new byte[0][];
        } catch (IllegalStateException e8) {
            ((ekrd) ((ekrd) ((ekrd) c.j()).g(e8)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", 654, "GellerDatabaseImpl.java")).t("There was an error determining whether corpus %s supports upload.", str);
            return new byte[0][];
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long setDeletionProcessed(byte[] bArr) {
        long j;
        long j2;
        long j3;
        Iterator it;
        long jM;
        long jM2;
        boolean z;
        List list;
        drdx drdxVar;
        drdx drdxVarA;
        SQLiteDatabase sQLiteDatabaseD = d();
        long j4 = 0;
        if (sQLiteDatabaseD == null) {
            ((ekrd) ((ekrd) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1171, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping setting DELETION_PROCESSED status.");
            return 0L;
        }
        try {
            try {
                ewak ewakVar = (ewak) evsn.parseFrom(ewak.a, bArr, evrr.a());
                try {
                    sQLiteDatabaseD.beginTransactionNonExclusive();
                    Iterator it2 = ewakVar.b.iterator();
                    long j5 = 0;
                    while (it2.hasNext()) {
                        try {
                            ewaj ewajVar = (ewaj) it2.next();
                            ewut ewutVarB = ewut.b(ewajVar.c);
                            if (ewutVarB == null) {
                                ewutVarB = ewut.UNKNOWN;
                            }
                            String strName = ewutVarB.name();
                            boolean zG = g(strName);
                            long j6 = j4;
                            if (ewajVar.d.size() != 0) {
                                g(strName);
                                n(strName);
                                ArrayList arrayList = new ArrayList();
                                for (ewai ewaiVar : ewajVar.d) {
                                    drdu drduVar = new drdu();
                                    Iterator it3 = it2;
                                    drduVar.b(ewaiVar.d);
                                    if ((ewaiVar.b & 1) != 0) {
                                        j3 = j5;
                                        try {
                                            drduVar.c(Long.valueOf(ewaiVar.c));
                                            drdxVarA = drduVar.a();
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = j3;
                                            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1231, "GellerDatabaseImpl.java")).q("Failed to set DELETION_PROCESSED status.");
                                            e(e);
                                            j2 = j;
                                            return j2;
                                        } catch (IllegalStateException e2) {
                                            e = e2;
                                            j = j3;
                                            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1231, "GellerDatabaseImpl.java")).q("Failed to set DELETION_PROCESSED status.");
                                            e(e);
                                            j2 = j;
                                            return j2;
                                        }
                                    } else {
                                        j3 = j5;
                                        drdxVarA = drduVar.a();
                                    }
                                    arrayList.add(drdxVarA);
                                    it2 = it3;
                                    j5 = j3;
                                }
                                it = it2;
                                long j7 = j5;
                                ArrayList<String> arrayList2 = new ArrayList();
                                Iterator it4 = ekjz.e(arrayList, 100).iterator();
                                while (it4.hasNext()) {
                                    List list2 = (List) it4.next();
                                    StringBuilder sb = new StringBuilder();
                                    int i = 0;
                                    Iterator it5 = it4;
                                    while (i < list2.size()) {
                                        String strConcat = "( ";
                                        if (i == 0) {
                                            sb.append("( ");
                                            z = zG;
                                        } else {
                                            z = zG;
                                            sb.append(" OR ");
                                        }
                                        drdx drdxVar2 = (drdx) list2.get(i);
                                        if (!drdxVar2.b().isEmpty() || drdxVar2.a().g()) {
                                            list = list2;
                                            if (!drdxVar2.a().g() || ((Long) drdxVar2.a().c()).longValue() < j6) {
                                                drdxVar = drdxVar2;
                                            } else {
                                                drdxVar = drdxVar2;
                                                strConcat = "( ".concat(drfa.b("timestamp_micro", "=", ekgb.r(drdxVar2.a().c())));
                                            }
                                            if (drdxVar.a().g() && ((Long) drdxVar.a().c()).longValue() >= j6 && !drdxVar.b().isEmpty()) {
                                                strConcat = strConcat.concat(" AND");
                                            }
                                            if (!drdxVar.b().isEmpty()) {
                                                strConcat = strConcat + " " + drfa.b("key", "=", ekgb.r(drdxVar.b()));
                                            }
                                            sb.append(strConcat.concat(" )"));
                                            if (i == list.size() - 1) {
                                                sb.append(" )");
                                            }
                                        } else {
                                            list = list2;
                                        }
                                        i++;
                                        zG = z;
                                        list2 = list;
                                    }
                                    arrayList2.add(sb.toString());
                                    it4 = it5;
                                    zG = zG;
                                }
                                boolean z2 = zG;
                                j5 = j7;
                                for (String str : arrayList2) {
                                    try {
                                        if (!str.isEmpty()) {
                                            String strQ = a.q(str, "data_type = ?", " AND ");
                                            if (z2) {
                                                ewut ewutVarB2 = ewut.b(ewajVar.c);
                                                if (ewutVarB2 == null) {
                                                    ewutVarB2 = ewut.UNKNOWN;
                                                }
                                                jM2 = drfb.m(sQLiteDatabaseD, strQ, new String[]{ewutVarB2.name()}, 2);
                                            } else {
                                                ewut ewutVarB3 = ewut.b(ewajVar.c);
                                                if (ewutVarB3 == null) {
                                                    ewutVarB3 = ewut.UNKNOWN;
                                                }
                                                jM2 = m(strQ, new String[]{ewutVarB3.name()}, 2);
                                            }
                                            j5 += jM2;
                                        }
                                    } catch (SQLiteException | IllegalStateException e3) {
                                        e = e3;
                                        j = j5;
                                        ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1231, "GellerDatabaseImpl.java")).q("Failed to set DELETION_PROCESSED status.");
                                        e(e);
                                        j2 = j;
                                        return j2;
                                    }
                                }
                            } else {
                                it = it2;
                                long j8 = j5;
                                if (zG) {
                                    ewut ewutVarB4 = ewut.b(ewajVar.c);
                                    if (ewutVarB4 == null) {
                                        ewutVarB4 = ewut.UNKNOWN;
                                    }
                                    jM = drfb.m(sQLiteDatabaseD, "data_type = ?", new String[]{ewutVarB4.name()}, 2);
                                } else {
                                    ewut ewutVarB5 = ewut.b(ewajVar.c);
                                    if (ewutVarB5 == null) {
                                        ewutVarB5 = ewut.UNKNOWN;
                                    }
                                    jM = m("data_type = ?", new String[]{ewutVarB5.name()}, 2);
                                }
                                j5 = j8 + jM;
                            }
                            j4 = j6;
                            it2 = it;
                        } catch (SQLiteException | IllegalStateException e4) {
                            e = e4;
                            j3 = j5;
                        }
                    }
                    j3 = j5;
                    sQLiteDatabaseD.setTransactionSuccessful();
                    j2 = j3;
                } catch (SQLiteException | IllegalStateException e5) {
                    e = e5;
                    j = 0;
                }
                return j2;
            } catch (evtj e6) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e6)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", (char) 1182, "GellerDatabaseImpl.java")).q("Failed to parse GellerDeletedElements bytes");
                return 0L;
            }
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(2:84|7)|(3:9|(1:11)(1:12)|13)(2:15|(2:21|(11:23|(4:25|(1:27)(1:28)|29|(2:31|(1:33)(2:34|35)))|36|(1:38)(1:39)|40|(1:42)|43|(1:45)(1:46)|47|(1:49)|50)(4:51|(1:53)(1:54)|55|(4:57|(1:59)(1:60)|61|(1:63)(1:64))(5:66|85|67|80|81)))(1:19))|20|85|67|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0235, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0237, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0240, code lost:
    
        ((defpackage.ekrd) ((defpackage.ekrd) ((defpackage.ekrd) defpackage.drey.c.i()).g(r0)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", 1029, "GellerDatabaseImpl.java")).q("Soft-deletion failed.");
        e(r0);
     */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long softDelete(java.lang.String r17, defpackage.ewae r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drey.softDelete(java.lang.String, ewae):long");
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr) throws SQLException {
        int length = strArr.length;
        if (length == 0) {
            ((ekrd) ((ekrd) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 305, "GellerDatabaseImpl.java")).q("Unable to write data: empty key list");
            return false;
        }
        ekrg ekrgVar = c;
        ekrd ekrdVar = (ekrd) ekrgVar.h();
        ekrdVar.V(1, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 309, "GellerDatabaseImpl.java")).J("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        ((ekrd) ((ekrd) ekrgVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 312, "GellerDatabaseImpl.java")).C("Specifically: keys: %s; ts: %d", Arrays.toString(strArr), j);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 316, "GellerDatabaseImpl.java")).q("Writing to geller db is null");
            return false;
        }
        try {
            return j(str).g(ejwi.j(sQLiteDatabaseD), str, strArr, j, z, bArr);
        } catch (SQLiteException e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", (char) 323, "GellerDatabaseImpl.java")).q("Failed to write data");
            e(e);
            return false;
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final boolean writeMetadata(String str, String str2, String str3) throws SQLException {
        ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeMetadata", 416, "GellerDatabaseImpl.java")).D("Writing metadata key: %s, corpus: %s", str2, str);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data_type", str);
                contentValues.put("key", str2);
                contentValues.put("metadata", str3);
                return sQLiteDatabaseD.insertOrThrow("geller_metadata_table", null, contentValues) >= 0;
            } catch (SQLiteException e) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeMetadata", (char) 426, "GellerDatabaseImpl.java")).q("Failed to write metadata");
                e(e);
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] writeWithResult(String str, String[] strArr, long j, boolean z, byte[] bArr) throws SQLException, GellerException {
        int length = strArr.length;
        if (length == 0) {
            throw new GellerException(11, "Unable to write data: empty key list.", (byte[]) null);
        }
        ekrg ekrgVar = c;
        ekrd ekrdVar = (ekrd) ekrgVar.h();
        ekrdVar.V(1, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeWithResult", 338, "GellerDatabaseImpl.java")).J("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        ((ekrd) ((ekrd) ekrgVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeWithResult", 341, "GellerDatabaseImpl.java")).C("Specifically: keys: %s; ts: %d", Arrays.toString(strArr), j);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            throw new GellerException(11, "Unable to write data: geller db is null.", (byte[]) null);
        }
        try {
            return j(str).h(ejwi.j(sQLiteDatabaseD), str, strArr, j, z, bArr).toByteArray();
        } catch (SQLiteException e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] write(byte[] bArr) throws SQLException, GellerException {
        String strName;
        try {
            ewbx ewbxVar = (ewbx) evsn.parseFrom(ewbx.a, bArr, evrr.a());
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (ewbw ewbwVar : ewbxVar.b) {
                if ((ewbwVar.b & 64) != 0) {
                    strName = ewbwVar.j;
                } else {
                    ewut ewutVarB = ewut.b(ewbwVar.c);
                    if (ewutVarB == null) {
                        ewutVarB = ewut.UNKNOWN;
                    }
                    strName = ewutVarB.name();
                }
                List listC = drfa.c(ewbwVar.d);
                if (!map.containsKey(strName)) {
                    map.put(strName, (ewbu) ewbx.a.createBuilder());
                }
                ewbu ewbuVar = (ewbu) map.get(strName);
                ewbuVar.copyOnWrite();
                ewbx ewbxVar2 = (ewbx) ewbuVar.instance;
                ewbwVar.getClass();
                evtg evtgVar = ewbxVar2.b;
                if (!evtgVar.c()) {
                    ewbxVar2.b = evsn.mutableCopy(evtgVar);
                }
                ewbxVar2.b.add(ewbwVar);
                if (!map2.containsKey(strName)) {
                    map2.put(strName, new ArrayList());
                }
                ((ArrayList) map2.get(strName)).addAll(listC);
            }
            ((ekrd) ((ekrd) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 388, "GellerDatabaseImpl.java")).t("Writing data for these Geller corpora: %s", TextUtils.join(",", map.keySet()));
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            SQLiteDatabase sQLiteDatabaseD = d();
            int size = 0;
            for (Map.Entry entry : map.entrySet()) {
                ewbx ewbxVar3 = (ewbx) ((ewbu) entry.getValue()).build();
                String str = (String) entry.getKey();
                if (j(str).i(ejwi.i(sQLiteDatabaseD), ewbxVar3)) {
                    ekfwVar.j((Iterable) map2.get(str));
                    size += ewbxVar3.b.size();
                }
            }
            ewby ewbyVar = (ewby) ewcb.a.createBuilder();
            ekgb ekgbVarG = ekfwVar.g();
            ewbyVar.copyOnWrite();
            ewcb ewcbVar = (ewcb) ewbyVar.instance;
            evtg evtgVar2 = ewcbVar.c;
            if (!evtgVar2.c()) {
                ewcbVar.c = evsn.mutableCopy(evtgVar2);
            }
            evpz.addAll(ekgbVarG, ewcbVar.c);
            ewbyVar.copyOnWrite();
            ewcb ewcbVar2 = (ewcb) ewbyVar.instance;
            ewcbVar2.b |= 1;
            ewcbVar2.d = size;
            return ((ewcb) ewbyVar.build()).toByteArray();
        } catch (evtj e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getCorpusStats(String[] strArr) throws SQLException {
        HashMap map = new HashMap();
        if (strArr.length == 0) {
            map.put(this.g, new HashSet());
            map.put(this.f, new HashSet());
            ejwi ejwiVar = this.i;
            if (ejwiVar.g()) {
                map.put(ejwiVar.c(), new HashSet());
            }
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                map.put((drev) it.next(), new HashSet());
            }
        } else {
            for (String str : strArr) {
                drev drevVarJ = j(str);
                if (!map.containsKey(drevVarJ)) {
                    map.put(drevVarJ, new HashSet());
                }
                ((Set) map.get(drevVarJ)).add(str);
            }
        }
        evzv evzvVar = (evzv) evzw.a.createBuilder();
        ejwi ejwiVarJ = ejwi.j(d());
        try {
            for (Map.Entry entry : map.entrySet()) {
                Iterator<E> it2 = ((drev) entry.getKey()).b(ejwiVarJ, (Set) entry.getValue()).c.iterator();
                while (it2.hasNext()) {
                    evzvVar.a((evzu) it2.next());
                }
            }
            return ((evzw) evzvVar.build()).toByteArray();
        } catch (SQLiteException | IllegalStateException e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getCorpusStats", (char) 1074, "GellerDatabaseImpl.java")).q("GetCorpusStats failed");
            e(e);
            return new byte[0];
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] read(String str, byte[] bArr) throws SQLException, GellerException {
        try {
            ewbk ewbkVar = (ewbk) evsn.parseFrom(ewbk.a, bArr, evrr.a());
            ((ekrd) ((ekrd) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", 440, "GellerDatabaseImpl.java")).D("Reading %s params: %s", str, ewbkVar);
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                return new byte[0][];
            }
            ewbf ewbfVar = (ewbf) ewbkVar.toBuilder();
            ewbfVar.copyOnWrite();
            ewbk ewbkVar2 = (ewbk) ewbfVar.instance;
            str.getClass();
            ewbkVar2.b |= 4;
            ewbkVar2.g = str;
            int i = ewbkVar.b;
            if ((i & 16) == 0 && (i & 64) == 0) {
                ewbfVar.copyOnWrite();
                ewbk ewbkVar3 = (ewbk) ewbfVar.instance;
                ewbkVar3.b |= 16;
                ewbkVar3.i = false;
            }
            try {
                return j(str).d(ejwi.j(sQLiteDatabaseD), (ewbk) ewbfVar.build());
            } catch (SQLiteException | IllegalStateException e) {
                e(e);
                throw new GellerException(11, e.getMessage(), e);
            }
        } catch (evtj e2) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", (char) 442, "GellerDatabaseImpl.java")).q("Failed to parse GellerReadParams bytes");
            return readAll(str);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long delete(String str, byte[] bArr) {
        ewad ewadVar;
        ewad ewadVar2;
        long j = 0;
        try {
            ewae ewaeVar = (ewae) evsn.parseFrom(ewae.a, bArr, evrr.a());
            ekrg ekrgVar = c;
            ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 863, "GellerDatabaseImpl.java")).t("Deleting with GellerDeleteParams:\n %s", ewaeVar);
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 867, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0L;
            }
            String[] strArr = {str};
            try {
                try {
                    sQLiteDatabaseD.beginTransactionNonExclusive();
                    if (ewaeVar.c == 2 && ((ewad) ewaeVar.d).b.size() == 0) {
                        if (ewaeVar.c == 2) {
                            ewadVar = (ewad) ewaeVar.d;
                        } else {
                            ewadVar = ewad.a;
                        }
                        if (ewadVar.c.size() == 0) {
                            if (ewaeVar.c == 2) {
                                ewadVar2 = (ewad) ewaeVar.d;
                            } else {
                                ewadVar2 = ewad.a;
                            }
                            drfa.e(ewadVar2, this.m);
                            i("data_type = ?", strArr);
                        }
                    }
                    drev drevVarJ = j(str);
                    ejwi ejwiVarJ = ejwi.j(sQLiteDatabaseD);
                    String str2 = this.k;
                    evzx evzxVar = (evzx) ewaeVar.toBuilder();
                    evzxVar.copyOnWrite();
                    ewae ewaeVar2 = (ewae) evzxVar.instance;
                    str.getClass();
                    ewaeVar2.b |= 1;
                    ewaeVar2.e = str;
                    long jA = drevVarJ.a(ejwiVarJ, str2, (ewae) evzxVar.build());
                    sQLiteDatabaseD.setTransactionSuccessful();
                    j = jA;
                } finally {
                    sQLiteDatabaseD.endTransaction();
                }
            } catch (SQLiteException | IllegalStateException e) {
                ((ekrd) ((ekrd) ((ekrd) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 891, "GellerDatabaseImpl.java")).q("Delete failed");
                e(e);
            }
            return j;
        } catch (evtj e2) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", (char) 860, "GellerDatabaseImpl.java")).q("Failed to parse GellerDeleteParams.");
            return 0L;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|96|9|(3:11|(1:13)(1:14)|15)(4:17|(3:97|19|(1:21)(2:23|(11:25|(4:27|(1:29)(1:30)|31|(2:33|(1:35)(2:36|37)))|38|(1:40)(1:41)|42|(1:44)|45|(1:47)(1:48)|49|(1:51)|52)(4:53|(1:55)(1:56)|57|(4:59|(1:61)(1:62)|63|(1:65)(1:66))(3:68|99|69))))(0)|70|88)|22|99|69|70|88) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0246, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0248, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[Catch: SQLiteException -> 0x024a, IllegalStateException -> 0x024c, all -> 0x024e, TryCatch #7 {all -> 0x024e, blocks: (B:9:0x0062, B:11:0x0069, B:13:0x0081, B:15:0x0088, B:69:0x023f, B:86:0x0257, B:14:0x0086, B:19:0x00c2, B:21:0x00cc, B:23:0x010f, B:25:0x0113, B:27:0x011f, B:29:0x0123, B:31:0x012a, B:33:0x0132, B:35:0x0138, B:36:0x0144, B:37:0x014b, B:30:0x0128, B:38:0x014c, B:40:0x0164, B:42:0x016b, B:44:0x017c, B:45:0x0182, B:47:0x018b, B:49:0x0192, B:51:0x01a3, B:52:0x01a9, B:48:0x0190, B:41:0x0169, B:55:0x01e0, B:57:0x01e7, B:59:0x01ec, B:61:0x020d, B:63:0x0214, B:65:0x0221, B:66:0x022f, B:62:0x0212, B:56:0x01e5), top: B:96:0x0062 }] */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long softDelete(java.lang.String r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drey.softDelete(java.lang.String, byte[]):long");
    }
}
