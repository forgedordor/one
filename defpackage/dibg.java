package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibg extends diaj {
    public dibg() {
        super(dbjt.FILE_DELETION, 10L);
    }

    private static void c(File file, FilenameFilter filenameFilter) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2, filenameFilter);
                } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                    Log.w("FILE_DELETION", "Unable to delete file: ".concat(String.valueOf(String.valueOf(file2))));
                }
            }
        }
    }

    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 1) {
            throw new IllegalArgumentException();
        }
        Context context = diapVar.b;
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbkg dbkgVar = dbkwVar.b == 1 ? (dbkg) dbkwVar.c : dbkg.a;
        int i = dbkgVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            evtg evtgVar = dbkgVar.c;
            File dataDir = context.getDataDir();
            if (dataDir == null) {
                throw new IllegalStateException("Context missing dataDir");
            }
            c(dataDir, new dibf(dataDir, evtgVar));
            return diapVar;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new UnsupportedOperationException("This storage type does not supported");
            }
            evtg evtgVar2 = dbkgVar.c;
            File externalFilesDir = context.getExternalFilesDir(null);
            c(externalFilesDir, new dibf(externalFilesDir, evtgVar2));
            return diapVar;
        }
        evtg evtgVar3 = dbkgVar.c;
        File dataDir2 = context.createDeviceProtectedStorageContext().getDataDir();
        if (dataDir2 == null) {
            throw new IllegalStateException("Context missing dataDir");
        }
        c(dataDir2, new dibf(dataDir2, evtgVar3));
        return diapVar;
    }

    @Override // defpackage.diaj
    public final String b() {
        return "FILE_DELETION";
    }
}
