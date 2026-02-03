package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.libraries.geller.portable.GellerException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drex implements drev {
    private static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/database/GellerDataTableStorage");
    private final boolean b;
    private final eway c;

    public drex(boolean z, eway ewayVar) {
        this.b = z;
        this.c = ewayVar;
    }

    static String k(String str) {
        return "geller_data_table.".concat(str);
    }

    static byte[][] l(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr) {
        if (!z) {
            return u(sQLiteDatabase, false, str, strArr, -1);
        }
        String str2 = String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", k(GroupManagementRequest.DATA_TAG), String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "timestamp_micro"), "geller_data_table", "distinct_data_ids.data_id", k("_id"), "timestamp_micro");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str2, strArr);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(GroupManagementRequest.DATA_TAG);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getBlob(columnIndexOrThrow));
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static byte[][] m(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, eway ewayVar) {
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "readDataAsElementId", 752, "GellerDataTableStorage.java")).q("readDataAsElementId");
        if (!ewayVar.n && !z) {
            return u(sQLiteDatabase, false, str, strArr, -1);
        }
        String str2 = String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "timestamp_micro");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str2, strArr);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("data_id");
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("timestamp_micro");
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(columnIndexOrThrow);
                long j = cursorRawQuery.getLong(columnIndexOrThrow2);
                ewuv ewuvVar = (ewuv) ewuw.a.createBuilder();
                ewuvVar.copyOnWrite();
                ewuw ewuwVar = (ewuw) ewuvVar.instance;
                string.getClass();
                ewuwVar.b |= 4;
                ewuwVar.d = string;
                ewch ewchVar = (ewch) ewci.a.createBuilder();
                ewchVar.copyOnWrite();
                ewci ewciVar = (ewci) ewchVar.instance;
                ewciVar.b |= 1;
                ewciVar.c = j;
                ewci ewciVar2 = (ewci) ewchVar.build();
                ewuvVar.copyOnWrite();
                ewuw ewuwVar2 = (ewuw) ewuvVar.instance;
                ewciVar2.getClass();
                ewuwVar2.c = ewciVar2;
                ewuwVar2.b |= 1;
                arrayList.add(((ewuw) ewuvVar.build()).toByteArray());
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static long n(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long jDelete = sQLiteDatabase.delete("geller_data_table", str, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return jDelete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static long o(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        try {
            sQLiteDatabase.beginTransactionNonExclusive();
            sQLiteDatabase.execSQL(String.format("DELETE FROM %s WHERE %s IN (SELECT %s FROM %s WHERE %s)", "geller_data_table", "_id", "data_id", "geller_key_table", str), strArr);
            long jLongForQuery = DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
            sQLiteDatabase.setTransactionSuccessful();
            return jLongForQuery;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static long p(SQLiteDatabase sQLiteDatabase, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(GroupManagementRequest.DATA_TAG, bArr);
        return sQLiteDatabase.insertOrThrow("geller_data_table", null, contentValues);
    }

    private static long q(SQLiteDatabase sQLiteDatabase, String str, List list, long j, List list2, byte[] bArr) {
        long jP = p(sQLiteDatabase, bArr);
        Iterator it = list.iterator();
        long jUpdate = 0;
        while (it.hasNext()) {
            String[] strArr = {str, (String) it.next(), String.valueOf(j)};
            new ContentValues().put("data_id", Long.valueOf(jP));
            jUpdate += sQLiteDatabase.update("geller_key_table", r4, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
        }
        n(sQLiteDatabase, drfa.b("_id", "IN", list2), null);
        return jUpdate;
    }

    private static ContentValues r(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        ContentValues contentValues = new ContentValues();
        if (ejwiVar.g()) {
            ((Boolean) ejwiVar.c()).booleanValue();
            contentValues.put("sync_status", "SYNCED");
        }
        if (ejwiVar2.g()) {
            ((Boolean) ejwiVar2.c()).booleanValue();
            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
        }
        if (ejwiVar3.g()) {
            ejwiVar3.c();
            ejwiVar3.c();
            contentValues.put("delete_status", "PENDING_DELETE");
        }
        return contentValues;
    }

    private static drew s(ewbk ewbkVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("timestamp_micro >= 0");
        ArrayList arrayList = new ArrayList();
        if ((ewbkVar.b & 4) != 0) {
            sb.append(" AND data_type = ?");
            arrayList.add(ewbkVar.g);
        }
        int i = ewbkVar.c;
        if (i == 1) {
            sb.append(" AND key = ?");
            arrayList.add(ewbkVar.c == 1 ? (String) ewbkVar.d : "");
        } else if (i == 9) {
            sb.append(" AND key like ?");
            arrayList.add(String.valueOf(ewbkVar.c == 9 ? (String) ewbkVar.d : "").concat("%"));
        }
        if ((ewbkVar.b & 2) != 0) {
            sb.append(" AND timestamp_micro >= ? AND timestamp_micro <= ?");
            ewbj ewbjVar = ewbkVar.f;
            if (ewbjVar == null) {
                ewbjVar = ewbj.a;
            }
            arrayList.add(String.valueOf(ewbjVar.b));
            ewbj ewbjVar2 = ewbkVar.f;
            if (ewbjVar2 == null) {
                ewbjVar2 = ewbj.a;
            }
            arrayList.add(String.valueOf(ewbjVar2.c));
        }
        if ((ewbkVar.b & 8) != 0) {
            if (ewbkVar.h) {
                sb.append(" AND sync_status = ?");
                arrayList.add("SYNCED");
            } else {
                sb.append(" AND sync_status IS NULL");
            }
        }
        if ((ewbkVar.b & 16) != 0) {
            if (ewbkVar.i) {
                sb.append(" AND delete_status IS NOT NULL");
            } else {
                sb.append(" AND delete_status IS NULL");
            }
        }
        if ((ewbkVar.b & 64) != 0) {
            int iA = ewbh.a(ewbkVar.k);
            if (iA == 0) {
                iA = 1;
            }
            int i2 = iA - 1;
            if (i2 == 1) {
                sb.append(" AND ( delete_status = ? OR delete_status = ? )");
                arrayList.add("PENDING_DELETE");
                arrayList.add("DELETION_PROCESSED");
            } else if (i2 == 2) {
                sb.append(" AND delete_status = ?");
                arrayList.add("PENDING_DELETE");
            } else if (i2 == 3) {
                sb.append(" AND delete_status = ?");
                arrayList.add("DELETION_PROCESSED");
            } else if (i2 == 4) {
                sb.append(" AND delete_status IS NULL");
            }
        }
        if ((ewbkVar.b & 32) != 0) {
            if (ewbkVar.j) {
                sb.append(" AND deletion_sync_status = ?");
                arrayList.add("DELETION_SYNCED");
            } else {
                sb.append(" AND deletion_sync_status IS NULL");
            }
        }
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "getSelectionParams", 1298, "GellerDataTableStorage.java")).t("Selection query is: %s", sb);
        return new drew(sb.toString(), arrayList);
    }

    private static void t(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, ejwi ejwiVar, ejwi ejwiVar2) throws SQLException {
        long jP = p(sQLiteDatabase, bArr);
        for (String str2 : strArr) {
            ekrd ekrdVar = (ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "insertDataAndKey", 918, "GellerDataTableStorage.java");
            Long lValueOf = Long.valueOf(j);
            ekrdVar.I("inserting %s key: %s ts: %d", str, str2, lValueOf);
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str2);
            contentValues.put("data_id", Long.valueOf(jP));
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", lValueOf);
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            if (ejwiVar.g()) {
                if (((Boolean) ejwiVar.c()).booleanValue()) {
                    contentValues.put("deletion_sync_status", "DELETION_SYNCED");
                } else {
                    contentValues.putNull("deletion_sync_status");
                }
            }
            if (ejwiVar2.g()) {
                contentValues.put("delete_status", (String) ejwiVar2.c());
            }
            sQLiteDatabase.insertOrThrow("geller_key_table", null, contentValues);
        }
    }

    private static byte[][] u(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, int i) {
        char c;
        String strConcat;
        String[] strArr2 = strArr;
        ArrayList arrayList = new ArrayList();
        String strConcat2 = String.format("SELECT DISTINCT %s, %s FROM ( SELECT %s, %s, ROW_NUMBER() OVER ( PARTITION BY %s ORDER BY %s DESC ) row_index FROM %s  WHERE (%s))", "data_id", "timestamp_micro", "data_id", "timestamp_micro", "key", "timestamp_micro", "geller_key_table", str);
        if (i >= 0) {
            c = 2;
            strConcat2 = String.valueOf(strConcat2).concat(String.valueOf(String.format(" WHERE row_index <= %s", String.valueOf(i))));
        } else {
            c = 2;
        }
        String strValueOf = String.valueOf(String.format(" ORDER BY %s DESC", "timestamp_micro"));
        if (z) {
            String strValueOf2 = String.valueOf(i);
            Object[] objArr = new Object[14];
            objArr[0] = "data_id";
            objArr[1] = "timestamp_micro";
            objArr[c] = "timestamp_micro";
            objArr[3] = "geller_key_table";
            objArr[4] = str;
            objArr[5] = "data_id";
            objArr[6] = "data_id";
            objArr[7] = "geller_key_table";
            objArr[8] = str;
            objArr[9] = "key";
            objArr[10] = "key";
            objArr[11] = "timestamp_micro";
            objArr[12] = strValueOf2;
            objArr[13] = "timestamp_micro";
            strConcat = String.format("SELECT DISTINCT %s, %s as %s FROM %s T1 WHERE (%s) AND %s IN (SELECT %s FROM %s WHERE (%s) AND %s = T1.%s ORDER BY %s DESC LIMIT %s) ORDER BY %s DESC", objArr);
            int i2 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.i(strArr2);
            ekfwVar.i(strArr2);
            strArr2 = (String[]) ekfwVar.g().toArray(new String[0]);
        } else {
            strConcat = String.valueOf(strConcat2).concat(strValueOf);
        }
        String strK = k(GroupManagementRequest.DATA_TAG);
        String strK2 = k("_id");
        Object[] objArr2 = new Object[6];
        objArr2[0] = strK;
        objArr2[1] = strConcat;
        objArr2[c] = "geller_data_table";
        objArr2[3] = "distinct_data_ids.data_id";
        objArr2[4] = strK2;
        objArr2[5] = "timestamp_micro";
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", objArr2), strArr2);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(GroupManagementRequest.DATA_TAG);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getBlob(columnIndexOrThrow));
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } finally {
        }
    }

    private static List v(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = sQLiteDatabase.query(true, "geller_key_table", new String[]{"data_id"}, str, strArr, "data_id", null, "timestamp_micro DESC", null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("data_id"))));
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (IllegalArgumentException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "readNumberFromKeyTable", (char) 705, "GellerDataTableStorage.java")).q("Column doesn't exist");
            return arrayList;
        }
    }

    private static long w(SQLiteDatabase sQLiteDatabase, String[] strArr, String str) {
        ContentValues contentValues = new ContentValues();
        if (str != null) {
            contentValues.put("delete_status", str);
        } else {
            contentValues.putNull("delete_status");
        }
        return sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
    }

    private static long x(SQLiteDatabase sQLiteDatabase, String[] strArr, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("sync_status", "SYNCED");
        } else {
            contentValues.putNull("sync_status");
        }
        return sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
    }

    @Override // defpackage.drev
    public final long a(ejwi ejwiVar, String str, ewae ewaeVar) {
        if ((ewaeVar.b & 1) == 0) {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
        String str2 = ewaeVar.e;
        ejwl.l(true);
        Object obj = ((ejwt) ejwiVar).a;
        try {
            ((SQLiteDatabase) obj).beginTransactionNonExclusive();
            int i = ewaeVar.c;
            long jN = 0;
            if (i == 1) {
                for (String str3 : drfa.h(((evzz) ewaeVar.d).b)) {
                    if (!str3.isEmpty()) {
                        jN += o((SQLiteDatabase) obj, "data_type = ? AND ".concat(String.valueOf(str3)), new String[]{str2});
                    }
                }
            } else if (i == 2) {
                ewad ewadVar = (ewad) ewaeVar.d;
                eway ewayVar = this.c;
                String str4 = "data_type = ?";
                if (ewadVar.b.size() == 0 && ewadVar.c.size() == 0) {
                    drfa.e(ewadVar, ewayVar);
                } else {
                    str4 = "data_type = ? AND " + drfa.f(ewadVar, ewayVar);
                }
                jN = o((SQLiteDatabase) obj, str4, new String[]{str2});
            } else if (i == 4 && ((Boolean) ewaeVar.d).booleanValue()) {
                jN = n((SQLiteDatabase) obj, String.format("%s IN (SELECT %s FROM %s WHERE %s = ?)", "_id", "data_id", "geller_key_table", "data_type"), new String[]{str2});
            }
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            return jN;
        } finally {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    @Override // defpackage.drev
    public final evzw b(ejwi ejwiVar, Set set) {
        Cursor cursor;
        int i = 1;
        ejwl.l(true);
        char c = 3;
        int i2 = 0;
        int i3 = 2;
        StringBuilder sb = new StringBuilder(String.format("SELECT %s, COUNT(*), COUNT(DISTINCT %s) FROM %s", "data_type", "data_id", "geller_key_table"));
        if (!set.isEmpty()) {
            String strB = drfa.b("data_type", "IN", set);
            sb.append(" WHERE ");
            sb.append(strB);
        }
        sb.append(" GROUP BY data_type");
        Object obj = ((ejwt) ejwiVar).a;
        evzv evzvVar = (evzv) evzw.a.createBuilder();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery(sb.toString(), null);
            try {
                HashMap map = new HashMap();
                while (cursorRawQuery.moveToNext()) {
                    char c2 = c;
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("data_type"));
                    int i4 = i2;
                    int i5 = cursorRawQuery.getInt(i);
                    int i6 = i;
                    int i7 = cursorRawQuery.getInt(i3);
                    if (string != null) {
                        int i8 = i3;
                        evzt evztVar = (evzt) evzu.a.createBuilder();
                        evztVar.copyOnWrite();
                        evzu evzuVar = (evzu) evztVar.instance;
                        cursor = cursorRawQuery;
                        try {
                            evzuVar.b |= 1;
                            evzuVar.c = string;
                            evztVar.copyOnWrite();
                            evzu evzuVar2 = (evzu) evztVar.instance;
                            evzuVar2.b |= 4;
                            evzuVar2.e = i5;
                            evztVar.copyOnWrite();
                            evzu evzuVar3 = (evzu) evztVar.instance;
                            evzuVar3.b |= 8;
                            evzuVar3.f = i7;
                            map.put(string, evztVar);
                            c = c2;
                            i2 = i4;
                            i = i6;
                            cursorRawQuery = cursor;
                            i3 = i8;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (cursor == null) {
                                throw th2;
                            }
                            try {
                                cursor.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } else {
                        c = c2;
                        i2 = i4;
                        i = i6;
                    }
                }
                int i9 = i;
                cursor = cursorRawQuery;
                char c3 = c;
                int i10 = i2;
                int i11 = i3;
                String strK = k(GroupManagementRequest.DATA_TAG);
                String strK2 = k("_id");
                Object[] objArr = new Object[7];
                objArr[i10] = "data_type";
                objArr[i9] = strK;
                objArr[i11] = "geller_data_table";
                objArr[c3] = "data_id";
                objArr[4] = "data_type";
                objArr[5] = "geller_key_table";
                objArr[6] = strK2;
                StringBuilder sb2 = new StringBuilder(String.format("SELECT distinct_data_ids.%s, COUNT(*), SUM(LENGTH(%s)) FROM %s LEFT JOIN (SELECT DISTINCT %s, %s FROM %s) distinct_data_ids ON %s = distinct_data_ids.data_id", objArr));
                if (!set.isEmpty()) {
                    String strB2 = drfa.b("data_type", "IN", set);
                    sb2.append(" WHERE ");
                    sb2.append(strB2);
                }
                sb2.append(" GROUP BY distinct_data_ids.");
                sb2.append("data_type");
                Cursor cursorRawQuery2 = ((SQLiteDatabase) obj).rawQuery(sb2.toString(), null);
                while (cursorRawQuery2.moveToNext()) {
                    try {
                        int i12 = i10;
                        String string2 = cursorRawQuery2.getString(i12);
                        int i13 = cursorRawQuery2.getInt(i9);
                        long j = cursorRawQuery2.getLong(i11);
                        if (cursorRawQuery2.isNull(i12)) {
                            ewbd ewbdVar = (ewbd) ewbe.a.createBuilder();
                            ewbdVar.copyOnWrite();
                            ewbe ewbeVar = (ewbe) ewbdVar.instance;
                            ewbeVar.b |= 2;
                            ewbeVar.d = i13;
                            ewbdVar.copyOnWrite();
                            ewbe ewbeVar2 = (ewbe) ewbdVar.instance;
                            ewbeVar2.b |= 1;
                            ewbeVar2.c = j;
                            ewbe ewbeVar3 = (ewbe) ewbdVar.build();
                            evzvVar.copyOnWrite();
                            evzw evzwVar = (evzw) evzvVar.instance;
                            ewbeVar3.getClass();
                            evzwVar.d = ewbeVar3;
                            i9 = 1;
                            evzwVar.b |= 1;
                            i10 = i12;
                            i11 = 2;
                        } else {
                            i9 = 1;
                            if (TextUtils.isEmpty(string2)) {
                                i11 = 2;
                            } else {
                                evzt evztVar2 = (evzt) map.get(string2);
                                evztVar2.copyOnWrite();
                                evzu evzuVar4 = (evzu) evztVar2.instance;
                                evzu evzuVar5 = evzu.a;
                                i11 = 2;
                                evzuVar4.b |= 2;
                                evzuVar4.d = j;
                            }
                            i10 = i12;
                        }
                    } finally {
                    }
                }
                if (cursorRawQuery2 != null) {
                    cursorRawQuery2.close();
                }
                ((SQLiteDatabase) obj).setTransactionSuccessful();
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    evzvVar.a((evzu) ((evzt) it.next()).build());
                }
                evzw evzwVar2 = (evzw) evzvVar.build();
                if (cursor != null) {
                    cursor.close();
                }
                return evzwVar2;
            } catch (Throwable th4) {
                th = th4;
                cursor = cursorRawQuery;
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.drev
    public final /* synthetic */ ewuu c() {
        return ewuu.CUSTOM_STORAGE_TYPE_UNKNOWN;
    }

    @Override // defpackage.drev
    public final byte[][] d(ejwi ejwiVar, ewbk ewbkVar) {
        ejwl.l(true);
        drew drewVarS = s(ewbkVar);
        String[] strArr = (String[]) drewVarS.b.toArray(new String[0]);
        if ((1 & ewbkVar.b) != 0) {
            return u((SQLiteDatabase) ((ejwt) ejwiVar).a, this.b, drewVarS.a, strArr, ewbkVar.e);
        }
        return l((SQLiteDatabase) ((ejwt) ejwiVar).a, this.b, drewVarS.a, strArr);
    }

    @Override // defpackage.drev
    public final String[] e(ejwi ejwiVar, String str) {
        ejwl.l(true);
        ejud ejudVar = ejud.a;
        return (String[]) drfa.d((SQLiteDatabase) ((ejwt) ejwiVar).a, "geller_key_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", new String[]{str}, ejudVar, ejudVar).toArray(new String[0]);
    }

    @Override // defpackage.drev
    public final long f(ejwi ejwiVar, String str, ewav ewavVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        ejwl.l(true);
        String strA = drfa.a(ejwiVar4);
        int i = ewavVar.b;
        long jUpdate = 0;
        if (i != 1) {
            if (i != 2) {
                ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateElementStatus", 499, "GellerDataTableStorage.java")).q("Unexpected element_filtering in GellerElementSelectionParams.");
                return 0L;
            }
            ewau ewauVar = (ewau) ewavVar.c;
            String strConcat = (ewauVar.b.size() == 0 && ewauVar.c.size() == 0) ? "data_type = ?" : "data_type = ? AND ".concat(drfa.i(ewauVar.b, ewauVar.c));
            ArrayList arrayList = new ArrayList();
            arrayList.add(strConcat);
            if (!strA.isEmpty()) {
                arrayList.add(strA);
            }
            return ((SQLiteDatabase) ((ejwt) ejwiVar).a).update("geller_key_table", r(ejwiVar2, ejwiVar3, ejwiVar4), new ejwc(" AND ").b(arrayList), new String[]{str});
        }
        for (String str2 : drfa.h(((ewas) ewavVar.c).b)) {
            if (!str2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("data_type = ?");
                arrayList2.add(str2);
                if (!strA.isEmpty()) {
                    arrayList2.add(strA);
                }
                jUpdate += ((SQLiteDatabase) ((ejwt) ejwiVar).a).update("geller_key_table", r(ejwiVar2, ejwiVar3, ejwiVar4), new ejwc(" AND ").b(arrayList2), new String[]{str});
            }
        }
        return jUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.drev
    public final boolean g(ejwi ejwiVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws Throwable {
        List listV;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3 = "data_type = ? AND ";
        ejwl.l(ejwiVar.g());
        SQLiteDatabase sQLiteDatabase4 = (SQLiteDatabase) ejwiVar.c();
        if (bArr.length > 2000000) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 104, "GellerDataTableStorage.java")).r("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
            return false;
        }
        sQLiteDatabase4.beginTransactionNonExclusive();
        try {
            try {
                listV = v(sQLiteDatabase4, "data_type = ? AND " + drfa.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                try {
                    if (listV.size() == 1) {
                        String[] strArr2 = {String.valueOf(listV.get(0))};
                        ejud ejudVar = ejud.a;
                        List<String> listD = drfa.d(sQLiteDatabase4, "geller_key_table", "key", "data_id = ?", strArr2, ejudVar, ejudVar);
                        if (new HashSet(listD).equals(new HashSet(Arrays.asList(strArr)))) {
                            sQLiteDatabase2 = sQLiteDatabase4;
                            if (q(sQLiteDatabase2, str, listD, j, listV, bArr) <= 0) {
                                ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 141, "GellerDataTableStorage.java")).q("Failed to update data.");
                            } else {
                                for (String str2 : listD) {
                                    ekrg ekrgVar = a;
                                    ((ekrd) ((ekrd) ekrgVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 146, "GellerDataTableStorage.java")).D("write: updating %s : %s", str, str2);
                                    String[] strArr3 = {str, str2, String.valueOf(j)};
                                    if (x(sQLiteDatabase2, strArr3, z) <= 0 || w(sQLiteDatabase2, strArr3, null) <= 0) {
                                        ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 150, "GellerDataTableStorage.java")).q("Failed to update key.");
                                    }
                                }
                            }
                            sQLiteDatabase2.endTransaction();
                            return false;
                        }
                        sQLiteDatabase2 = sQLiteDatabase4;
                        n(sQLiteDatabase2, "_id = ?", strArr2);
                        t(sQLiteDatabase2, str, strArr, j, z, bArr, ejudVar, ejudVar);
                    } else {
                        sQLiteDatabase2 = sQLiteDatabase4;
                        if (listV.isEmpty()) {
                            ejud ejudVar2 = ejud.a;
                            t(sQLiteDatabase2, str, strArr, j, z, bArr, ejudVar2, ejudVar2);
                        } else {
                            n(sQLiteDatabase2, drfa.b("_id", "IN", listV), null);
                            ejud ejudVar3 = ejud.a;
                            t(sQLiteDatabase2, str, strArr, j, z, bArr, ejudVar3, ejudVar3);
                        }
                    }
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (IllegalStateException e) {
                    e = e;
                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 196, "GellerDataTableStorage.java")).q("Failed to write to data table.");
                    sQLiteDatabase = listV;
                    sQLiteDatabase.endTransaction();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase3.endTransaction();
                throw th;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            listV = sQLiteDatabase4;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase3 = sQLiteDatabase4;
            sQLiteDatabase3.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        return true;
    }

    @Override // defpackage.drev
    public final ewcb h(ejwi ejwiVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws GellerException {
        ejwl.l(true);
        int i = 0;
        if (bArr.length > 2000000) {
            throw new GellerException(String.format("Unable to write data: data size must be less than or equal to %s bytes", 2000000));
        }
        Object obj = ((ejwt) ejwiVar).a;
        ewby ewbyVar = (ewby) ewcb.a.createBuilder();
        ewbz ewbzVar = (ewbz) ewca.a.createBuilder();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            try {
                List listV = v((SQLiteDatabase) obj, "data_type = ? AND " + drfa.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                if (listV.size() == 1) {
                    String[] strArr2 = {String.valueOf(listV.get(0))};
                    ejud ejudVar = ejud.a;
                    List<String> listD = drfa.d((SQLiteDatabase) obj, "geller_key_table", "key", "data_id = ?", strArr2, ejudVar, ejudVar);
                    if (new HashSet(listD).equals(new HashSet(Arrays.asList(strArr)))) {
                        long j2 = 0;
                        if (q((SQLiteDatabase) obj, str, listD, j, listV, bArr) <= 0) {
                            throw new GellerException("Failed to update data.");
                        }
                        for (String str2 : listD) {
                            long j3 = j2;
                            ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "writeWithResult", 267, "GellerDataTableStorage.java")).D("write: updating %s : %s", str, str2);
                            String[] strArr3 = {str, str2, String.valueOf(j)};
                            if (x((SQLiteDatabase) obj, strArr3, z) <= j3 || w((SQLiteDatabase) obj, strArr3, null) <= j3) {
                                throw new GellerException("Failed to update key metadata.");
                            }
                            evzn evznVar = (evzn) evzo.a.createBuilder();
                            evznVar.copyOnWrite();
                            evzo evzoVar = (evzo) evznVar.instance;
                            str2.getClass();
                            evzoVar.b |= 2;
                            evzoVar.d = str2;
                            evznVar.copyOnWrite();
                            evzo evzoVar2 = (evzo) evznVar.instance;
                            evzoVar2.b |= 1;
                            evzoVar2.c = j;
                            ewbzVar.b((evzo) evznVar.build());
                            j2 = j3;
                        }
                    } else {
                        n((SQLiteDatabase) obj, "_id = ?", strArr2);
                        t((SQLiteDatabase) obj, str, strArr, j, z, bArr, ejudVar, ejudVar);
                        int length = strArr.length;
                        while (i < length) {
                            String str3 = strArr[i];
                            evzn evznVar2 = (evzn) evzo.a.createBuilder();
                            evznVar2.copyOnWrite();
                            evzo evzoVar3 = (evzo) evznVar2.instance;
                            str3.getClass();
                            evzoVar3.b |= 2;
                            evzoVar3.d = str3;
                            evznVar2.copyOnWrite();
                            evzo evzoVar4 = (evzo) evznVar2.instance;
                            evzoVar4.b |= 1;
                            evzoVar4.c = j;
                            ewbzVar.b((evzo) evznVar2.build());
                            i++;
                        }
                    }
                } else if (listV.isEmpty()) {
                    ejud ejudVar2 = ejud.a;
                    t((SQLiteDatabase) obj, str, strArr, j, z, bArr, ejudVar2, ejudVar2);
                    int length2 = strArr.length;
                    while (i < length2) {
                        String str4 = strArr[i];
                        evzn evznVar3 = (evzn) evzo.a.createBuilder();
                        evznVar3.copyOnWrite();
                        evzo evzoVar5 = (evzo) evznVar3.instance;
                        str4.getClass();
                        evzoVar5.b |= 2;
                        evzoVar5.d = str4;
                        evznVar3.copyOnWrite();
                        evzo evzoVar6 = (evzo) evznVar3.instance;
                        evzoVar6.b |= 1;
                        evzoVar6.c = j;
                        ewbzVar.a((evzo) evznVar3.build());
                        i++;
                    }
                } else {
                    n((SQLiteDatabase) obj, drfa.b("_id", "IN", listV), null);
                    ejud ejudVar3 = ejud.a;
                    t((SQLiteDatabase) obj, str, strArr, j, z, bArr, ejudVar3, ejudVar3);
                    int length3 = strArr.length;
                    while (i < length3) {
                        String str5 = strArr[i];
                        evzn evznVar4 = (evzn) evzo.a.createBuilder();
                        evznVar4.copyOnWrite();
                        evzo evzoVar7 = (evzo) evznVar4.instance;
                        str5.getClass();
                        evzoVar7.b |= 2;
                        evzoVar7.d = str5;
                        evznVar4.copyOnWrite();
                        evzo evzoVar8 = (evzo) evznVar4.instance;
                        evzoVar8.b |= 1;
                        evzoVar8.c = j;
                        ewbzVar.b((evzo) evznVar4.build());
                        i++;
                    }
                }
                ewbyVar.copyOnWrite();
                ewcb ewcbVar = (ewcb) ewbyVar.instance;
                ewca ewcaVar = (ewca) ewbzVar.build();
                ewcaVar.getClass();
                ewcbVar.e = ewcaVar;
                ewcbVar.b |= 2;
                ((SQLiteDatabase) obj).setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return (ewcb) ewbyVar.build();
            } catch (IllegalStateException e) {
                throw new GellerException(3, "Failed to write to DB.", e);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // defpackage.drev
    public final boolean i(ejwi ejwiVar, ewbx ewbxVar) {
        boolean z;
        boolean z2;
        String strName;
        ejwi ejwiVarJ;
        boolean z3;
        ejwl.l(ejwiVar.g());
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ejwiVar.c();
        sQLiteDatabase.beginTransactionNonExclusive();
        boolean z4 = true;
        try {
            try {
                for (ewbw ewbwVar : ewbxVar.b) {
                    int i = ewbwVar.b;
                    if ((i & 8) != 0 && ((i & 1) != 0 || (i & 64) != 0)) {
                        if ((i & 2) != 0) {
                            ewuw ewuwVar = ewbwVar.g;
                            if (ewuwVar == null) {
                                ewuwVar = ewuw.a;
                            }
                            byte[] byteArray = ewuwVar.toByteArray();
                            if ((ewbwVar.b & 64) != 0) {
                                strName = ewbwVar.j;
                            } else {
                                ewut ewutVarB = ewut.b(ewbwVar.c);
                                if (ewutVarB == null) {
                                    ewutVarB = ewut.UNKNOWN;
                                }
                                strName = ewutVarB.name();
                            }
                            String str = strName;
                            if (byteArray.length > 2000000) {
                                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 625, "GellerDataTableStorage.java")).r("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
                                z2 = false;
                            } else {
                                ejwi ejwiVarJ2 = (ewbwVar.b & 16) != 0 ? ejwi.j(Boolean.valueOf(ewbwVar.h)) : ejud.a;
                                if ((ewbwVar.b & 32) != 0) {
                                    int iA = ewcg.a(ewbwVar.i);
                                    ejwiVarJ = ejwi.j((iA == 0 || iA == z4) ? "DELETE_STATUS_UNSPECIFIED" : iA != 2 ? "DELETION_PROCESSED" : "PENDING_DELETE");
                                } else {
                                    ejwiVarJ = ejud.a;
                                }
                                ejwi ejwiVar2 = ejwiVarJ;
                                String[] strArr = (String[]) drfa.c(ewbwVar.d).toArray(new String[0]);
                                long j = ewbwVar.e;
                                boolean z5 = ewbwVar.f;
                                List listV = v(sQLiteDatabase, "data_type = ? AND " + drfa.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                                if (listV.size() == z4) {
                                    String[] strArr2 = {String.valueOf(listV.get(0))};
                                    ejud ejudVar = ejud.a;
                                    z2 = false;
                                    List listD = drfa.d(sQLiteDatabase, "geller_key_table", "key", "data_id = ?", strArr2, ejudVar, ejudVar);
                                    if (new HashSet(listD).equals(new HashSet(Arrays.asList(strArr)))) {
                                        String str2 = str;
                                        if (q(sQLiteDatabase, str2, listD, j, listV, byteArray) <= 0) {
                                            ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1162, "GellerDataTableStorage.java")).q("Failed to update data.");
                                        } else {
                                            String str3 = (String) ejwiVar2.f();
                                            Iterator it = listD.iterator();
                                            while (it.hasNext()) {
                                                String str4 = (String) it.next();
                                                ekrg ekrgVar = a;
                                                z = z4;
                                                try {
                                                    Iterator it2 = it;
                                                    ((ekrd) ((ekrd) ekrgVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1167, "GellerDataTableStorage.java")).D("write: updating %s : %s", str2, str4);
                                                    String[] strArr3 = {str2, str4, String.valueOf(j)};
                                                    if (x(sQLiteDatabase, strArr3, z5) <= 0 || w(sQLiteDatabase, strArr3, str3) <= 0) {
                                                        ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1172, "GellerDataTableStorage.java")).q("Failed to update key.");
                                                    } else if (ejwiVarJ2.g()) {
                                                        boolean zBooleanValue = ((Boolean) ejwiVarJ2.c()).booleanValue();
                                                        ContentValues contentValues = new ContentValues();
                                                        String str5 = str2;
                                                        if (zBooleanValue) {
                                                            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
                                                        } else {
                                                            contentValues.putNull("deletion_sync_status");
                                                        }
                                                        if (sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr3) > 0) {
                                                            it = it2;
                                                            z4 = z;
                                                            str2 = str5;
                                                        }
                                                    } else {
                                                        it = it2;
                                                        z4 = z;
                                                    }
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 655, "GellerDataTableStorage.java")).q("Failed to write to data table.");
                                                    return z;
                                                }
                                            }
                                        }
                                    } else {
                                        z3 = z4;
                                        n(sQLiteDatabase, "_id = ?", strArr2);
                                        t(sQLiteDatabase, str, strArr, j, z5, byteArray, ejwiVarJ2, ejwiVar2);
                                    }
                                } else {
                                    z3 = z4;
                                    if (listV.isEmpty()) {
                                        t(sQLiteDatabase, str, strArr, j, z5, byteArray, ejwiVarJ2, ejwiVar2);
                                    } else {
                                        n(sQLiteDatabase, drfa.b("_id", "IN", listV), null);
                                        t(sQLiteDatabase, str, strArr, j, z5, byteArray, ejwiVarJ2, ejwiVar2);
                                    }
                                }
                                z4 = z3;
                            }
                            return z2;
                        }
                    }
                    z2 = false;
                    ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 616, "GellerDataTableStorage.java")).q("Invalid write params");
                    return z2;
                }
                z = z4;
                sQLiteDatabase.setTransactionSuccessful();
            } catch (IllegalStateException e2) {
                e = e2;
                z = true;
            }
            return z;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.drev
    public final byte[][] j(ejwi ejwiVar, ewbk ewbkVar) {
        ejwl.l(true);
        drew drewVarS = s(ewbkVar);
        return m((SQLiteDatabase) ((ejwt) ejwiVar).a, this.b, drewVarS.a, (String[]) drewVarS.b.toArray(new String[0]), this.c);
    }
}
