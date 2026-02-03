package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxz {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/utils/FileOperationUtils");
    public static final drxz b = new drxz();

    static {
        new BigDecimal(1024);
        new MathContext(2, RoundingMode.HALF_UP);
        new MathContext(4, RoundingMode.HALF_UP);
    }

    public final boolean a(File file) {
        if (!file.exists()) {
            if (file.mkdirs()) {
                if (!file.setWritable(true)) {
                    ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "mkdirs", 256, "FileOperationUtils.java")).t("Cannot set writable %s", file);
                    return false;
                }
            } else if (!file.exists()) {
                ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "mkdirs", 264, "FileOperationUtils.java")).t("Cannot create directory %s", file);
                return false;
            }
        }
        return true;
    }

    public final void b(File file) {
        c(file, null);
    }

    public final void c(final File file, FileFilter fileFilter) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(fileFilter);
            for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
                b(fileArrListFiles[i]);
            }
        }
        ((ekrd) ((ekrd) a.g()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "delete", 297, "FileOperationUtils.java")).t("Delete file: %s", new ekri() { // from class: drxy
            @Override // defpackage.ekri
            public final Object a() {
                return file.getAbsoluteFile();
            }
        });
        file.delete();
    }
}
