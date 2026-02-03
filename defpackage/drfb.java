package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfb implements drev {
    private static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/database/GellerFileStorage");
    private final Context b;
    private final String c;
    private final eway d;

    public drfb(Context context, String str, eway ewayVar) {
        this.b = context;
        this.c = str;
        this.d = ewayVar;
    }

    public static void k(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                k(file2);
            }
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "deleteFileRecursively", 55, "GellerFileStorage.java")).t("Failed to delete file: %s", file);
        }
    }

    static byte[][] l(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, ejwi ejwiVar) throws GellerException {
        List listD = drfa.d(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, ejwi.j("timestamp_micro DESC"), ejwiVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ejwi ejwiVarP = p((String) it.next());
            if (ejwiVarP.g()) {
                arrayList.add(ejwiVarP.c());
            }
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    static long m(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, int i) {
        new ContentValues().put("delete_status", dres.a(i));
        return sQLiteDatabase.update("geller_file_table", r0, str, strArr);
    }

    private static long n(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        long jT = 0;
        for (String str2 : drfa.d(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, ejwi.j("timestamp_micro DESC"), ejud.a)) {
            if (r(str2)) {
                jT += t(sQLiteDatabase, new String[]{str2});
            }
        }
        return jT;
    }

    private final ejwi o(String str, String str2, long j, byte[] bArr) throws IOException {
        File filesDir = this.b.getFilesDir();
        String[] strArr = {"geller", this.c, str};
        int i = eooe.a;
        int length = 2;
        for (int i2 = 0; i2 < 3; i2++) {
            length += strArr[i2].length();
        }
        char[] cArr = new char[length];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            String str3 = strArr[i4];
            if (!str3.isEmpty()) {
                if (i3 > 0 && cArr[i3 - 1] != '/') {
                    cArr[i3] = '/';
                    i3++;
                }
                int length2 = str3.length();
                for (int i5 = 0; i5 < length2; i5++) {
                    char cCharAt = str3.charAt(i5);
                    if (cCharAt != '/') {
                        cArr[i3] = cCharAt;
                        i3++;
                    } else if (i3 <= 0 || cArr[i3 - 1] != '/') {
                        cCharAt = '/';
                        cArr[i3] = cCharAt;
                        i3++;
                    }
                }
            }
        }
        File file = new File(filesDir, new String(cArr, 0, i3));
        if (!file.exists() && !file.mkdirs()) {
            ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 666, "GellerFileStorage.java")).q("Unable to create file directory.");
            return ejud.a;
        }
        File file2 = new File(file, str2 + "_" + j);
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 671, "GellerFileStorage.java")).t("Writing to file %s.", file2.getAbsolutePath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return ejwi.j(file2.toString());
            } finally {
            }
        } catch (IOException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 675, "GellerFileStorage.java")).t("Filed to write file: %s", file2);
            return ejud.a;
        }
    }

    private static ejwi p(String str) throws GellerException {
        File file = new File(str);
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "readFile", 684, "GellerFileStorage.java")).t("Reading file %s.", file.getAbsolutePath());
        try {
            return file.exists() ? ejwi.j(eleh.b(file)) : ejud.a;
        } catch (IOException | IllegalArgumentException | OutOfMemoryError | SecurityException e) {
            throw new GellerException(11, e.getMessage(), (byte[]) null);
        }
    }

    private final boolean q(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, List list) throws IOException {
        Iterator it = list.iterator();
        boolean z2 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            z2 = r(str2) ? z2 & (t(sQLiteDatabase, new String[]{str2}) > 0) : false;
        }
        if (!z2) {
            return false;
        }
        ejwi ejwiVarO = o(str, strArr[0], j, bArr);
        if (!ejwiVarO.g()) {
            return false;
        }
        for (String str3 : strArr) {
            Object objC = ejwiVarO.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str3);
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", Long.valueOf(j));
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            contentValues.put("file_path", (String) objC);
            z2 &= sQLiteDatabase.insert("geller_file_table", null, contentValues) > 0;
        }
        return z2;
    }

    private static boolean r(String str) {
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "removeFile", 697, "GellerFileStorage.java")).t("Removing file: %s", str);
        File file = new File(str);
        try {
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "removeFile", 704, "GellerFileStorage.java")).t("Failed to remove file: %s", str);
            return false;
        }
    }

    private final boolean s(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, String str2, String str3, String[] strArr2) throws IOException {
        if (!r(str2)) {
            return false;
        }
        ejwi ejwiVarO = o(str, strArr[0], j, bArr);
        if (!ejwiVarO.g()) {
            return false;
        }
        Object objC = ejwiVarO.c();
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("sync_status", "SYNCED");
        } else {
            contentValues.putNull("sync_status");
        }
        contentValues.putNull("delete_status");
        contentValues.put("num_times_used", (Long) 0L);
        contentValues.put("file_path", (String) objC);
        return ((long) sQLiteDatabase.update("geller_file_table", contentValues, str3, strArr2)) > 0;
    }

    private static long t(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long jDelete = sQLiteDatabase.delete("geller_file_table", "file_path = ?", strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return jDelete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
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
                        jN += n((SQLiteDatabase) obj, "data_type = ? AND ".concat(String.valueOf(str3)), new String[]{str2});
                    }
                }
            } else {
                if (i == 2) {
                    ewad ewadVar = (ewad) ewaeVar.d;
                    eway ewayVar = this.d;
                    drfa.e(ewadVar, ewayVar);
                    jN = n((SQLiteDatabase) obj, (ewadVar.b.size() == 0 && ewadVar.c.size() == 0) ? "data_type = ?" : "data_type = ? AND " + drfa.f(ewadVar, ewayVar), new String[]{str2});
                } else if (i == 4 && ((Boolean) ewaeVar.d).booleanValue()) {
                    jN = n((SQLiteDatabase) obj, "data_type = ?", new String[]{str2});
                }
            }
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            return jN;
        } finally {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    @Override // defpackage.drev
    public final /* synthetic */ evzw b(ejwi ejwiVar, Set set) {
        return evzw.a;
    }

    @Override // defpackage.drev
    public final /* synthetic */ ewuu c() {
        return ewuu.CUSTOM_STORAGE_TYPE_UNKNOWN;
    }

    @Override // defpackage.drev
    public final byte[][] d(ejwi ejwiVar, ewbk ewbkVar) {
        ejwl.l(true);
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
            sb.append("AND key like ?");
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
                sb.append(" AND sync_status = ? ");
                arrayList.add("SYNCED");
            } else {
                sb.append(" AND sync_status IS NULL ");
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
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "read", 352, "GellerFileStorage.java")).t("Selection query is: %s", sb);
        return l((SQLiteDatabase) ((ejwt) ejwiVar).a, sb.toString(), (String[]) arrayList.toArray(new String[0]), (1 & ewbkVar.b) != 0 ? ejwi.j(Integer.valueOf(ewbkVar.e)) : ejud.a);
    }

    @Override // defpackage.drev
    public final String[] e(ejwi ejwiVar, String str) {
        ejwl.l(true);
        ejud ejudVar = ejud.a;
        return (String[]) drfa.d((SQLiteDatabase) ((ejwt) ejwiVar).a, "geller_file_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", new String[]{str}, ejudVar, ejudVar).toArray(new String[0]);
    }

    @Override // defpackage.drev
    public final long f(ejwi ejwiVar, String str, ewav ewavVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        String strB;
        ejwl.l(true);
        String strA = drfa.a(ejwiVar4);
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_type = ?");
        if (!strA.isEmpty()) {
            arrayList.add(strA);
        }
        int i = ewavVar.b;
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((ewavVar.b == 1 ? (ewas) ewavVar.c : ewas.a).b);
            arrayList.add(drfa.g(arrayList2));
            strB = new ejwc(" AND ").b(arrayList);
        } else {
            if (i != 2) {
                ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "updateElementStatus", 435, "GellerFileStorage.java")).q("Unexpected element_filtering in GellerElementSelectionParams.");
                return 0L;
            }
            ewau ewauVar = (ewau) ewavVar.c;
            if (ewauVar.b.size() != 0 || ewauVar.c.size() != 0) {
                arrayList.add(drfa.i(ewauVar.b, ewauVar.c));
            }
            strB = new ejwc(" AND ").b(arrayList);
        }
        ContentValues contentValues = new ContentValues();
        if (ejwiVar2.g()) {
            ((Boolean) ejwiVar2.c()).booleanValue();
            contentValues.put("sync_status", "SYNCED");
        }
        if (ejwiVar3.g()) {
            ((Boolean) ejwiVar3.c()).booleanValue();
            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
        }
        if (ejwiVar4.g()) {
            ejwiVar4.c();
            ejwiVar4.c();
            contentValues.put("delete_status", "PENDING_DELETE");
        }
        return ((SQLiteDatabase) ((ejwt) ejwiVar).a).update("geller_file_table", contentValues, strB, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.drev
    public final boolean g(ejwi ejwiVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws Throwable {
        String str2;
        String[] strArr2;
        ejud ejudVar;
        List listD;
        ?? r4;
        boolean zQ;
        ejwl.l(ejwiVar.g());
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ejwiVar.c();
        sQLiteDatabase.beginTransactionNonExclusive();
        boolean z2 = false;
        try {
            try {
                str2 = "data_type = ? AND " + drfa.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?";
                strArr2 = new String[]{str, String.valueOf(j)};
                ejwi ejwiVarJ = ejwi.j("timestamp_micro DESC");
                ejudVar = ejud.a;
                listD = drfa.d(sQLiteDatabase, "geller_file_table", "file_path", str2, strArr2, ejwiVarJ, ejudVar);
                r4 = 1;
                r4 = 1;
            } catch (Throwable th) {
                th = th;
            }
        } catch (IllegalStateException e) {
            e = e;
        }
        try {
            if (listD.size() == 1 && new HashSet(drfa.d(sQLiteDatabase, "geller_file_table", "key", "file_path = ?", new String[]{(String) listD.get(0)}, ejwi.j("timestamp_micro DESC"), ejudVar)).equals(new HashSet(Arrays.asList(strArr)))) {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                zQ = s(sQLiteDatabase2, str, strArr, j, z, bArr, (String) listD.get(0), str2, strArr2);
                sQLiteDatabase = sQLiteDatabase2;
                sQLiteDatabase.setTransactionSuccessful();
                r4 = sQLiteDatabase2;
            } else {
                SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
                zQ = q(sQLiteDatabase3, str, strArr, j, z, bArr, listD);
                sQLiteDatabase = sQLiteDatabase3;
                sQLiteDatabase.setTransactionSuccessful();
                r4 = sQLiteDatabase3;
            }
            z2 = zQ;
        } catch (IllegalStateException e2) {
            e = e2;
            sQLiteDatabase = r4;
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "write", 151, "GellerFileStorage.java")).q("Failed to write file.");
            sQLiteDatabase.endTransaction();
            return z2;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = r4;
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012d A[Catch: IllegalStateException -> 0x0197, all -> 0x0199, TryCatch #0 {IllegalStateException -> 0x0197, blocks: (B:11:0x00b4, B:13:0x00bf, B:14:0x00c3, B:16:0x00c9, B:17:0x0102, B:18:0x0121, B:19:0x0128, B:22:0x012d, B:24:0x014b, B:26:0x014e, B:27:0x0185, B:30:0x018f, B:31:0x0196), top: B:43:0x0066 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // defpackage.drev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ewcb h(defpackage.ejwi r25, java.lang.String r26, java.lang.String[] r27, long r28, boolean r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drfb.h(ejwi, java.lang.String, java.lang.String[], long, boolean, byte[]):ewcb");
    }

    @Override // defpackage.drev
    public final /* synthetic */ boolean i(ejwi ejwiVar, ewbx ewbxVar) {
        return dreu.a(this, ejwiVar, ewbxVar);
    }

    @Override // defpackage.drev
    public final /* synthetic */ byte[][] j(ejwi ejwiVar, ewbk ewbkVar) {
        return dreu.b(this, ejwiVar, ewbkVar);
    }
}
