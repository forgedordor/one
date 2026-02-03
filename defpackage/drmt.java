package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drmt implements drod {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider");
    public static final drxz b = drxz.b;
    public final drng d;
    private final Context f;
    public final Object e = new Object();
    private File g = null;
    public final Executor c = drle.a().e;

    public drmt(Context context) {
        this.f = context.getApplicationContext();
        this.d = new drng(context);
    }

    public final File a() {
        if (this.g == null) {
            File file = new File(this.f.getFilesDir(), "emoji");
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath);
            if (!file2.exists() && !file2.mkdirs()) {
                ((ekrd) ((ekrd) drxz.a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createDirIfNotExists", 740, "FileOperationUtils.java")).t("Could not create the directory %s", absolutePath);
            }
            String absolutePath2 = file.getAbsolutePath();
            File file3 = new File(absolutePath2, "sticky_variant_prefs");
            if (!file3.exists()) {
                try {
                    if (!file3.createNewFile()) {
                        ((ekrd) ((ekrd) drxz.a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 752, "FileOperationUtils.java")).D("Could not create the file: %s/%s", absolutePath2, "sticky_variant_prefs");
                    }
                } catch (IOException e) {
                    ((ekrd) ((ekrd) ((ekrd) drxz.a.i()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 756, "FileOperationUtils.java")).D("Could not create the file: %s/%s", absolutePath2, "sticky_variant_prefs");
                }
            }
            this.g = new File(file, "sticky_variant_prefs");
        }
        return this.g;
    }

    public final void b(final drnj drnjVar) {
        Callable callable = new Callable() { // from class: drmq
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                boolean z;
                drmt drmtVar = this.a;
                Object obj = drmtVar.e;
                drnj drnjVar2 = drnjVar;
                synchronized (obj) {
                    drxz drxzVar = drmt.b;
                    File fileA = drmtVar.a();
                    File parentFile = fileA.getParentFile();
                    z = false;
                    if (parentFile != null && drxzVar.a(parentFile)) {
                        if (fileA.isDirectory()) {
                            ((ekrd) ((ekrd) drxz.a.i()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 721, "FileOperationUtils.java")).t("Cannot write bytes to directory %s", fileA.getPath());
                        } else {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                                try {
                                    drnjVar2.writeTo(fileOutputStream);
                                    fileOutputStream.close();
                                    z = true;
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException | IllegalStateException e) {
                                ((ekrd) ((ekrd) ((ekrd) drxz.a.i()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 730, "FileOperationUtils.java")).t("Failed to write to %s", fileA.getPath());
                            }
                        }
                    }
                }
                if (z) {
                    return null;
                }
                throw new IOException("Failed to write sticky preferences to disk");
            }
        };
        Executor executor = this.c;
        eork.r(eork.m(callable, executor), new drms(this, drnjVar), executor);
    }
}
