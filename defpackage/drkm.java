package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drkm {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/cache/FileCache");
    public final HashMap b = new HashMap();
    public final drkn c;
    private final Supplier d;
    private drkh e;

    public drkm(Supplier supplier, drkn drknVar) {
        this.d = supplier;
        this.c = drknVar;
    }

    private final void e(String str, ListenableFuture listenableFuture, Executor executor) {
        eork.r(listenableFuture, new drkl(this, str, listenableFuture), executor);
    }

    public final drkh a() {
        if (this.e == null) {
            this.e = (drkh) this.d.get();
        }
        return this.e;
    }

    public final synchronized ListenableFuture b(final String str, eosc eoscVar) {
        HashMap map = this.b;
        ListenableFuture listenableFuture = (ListenableFuture) map.get(str);
        if (listenableFuture != null) {
            return eork.j(listenableFuture);
        }
        ListenableFuture listenableFutureSubmit = eoscVar.submit(new Callable() { // from class: drkk
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                RandomAccessFile randomAccessFile;
                drkm drkmVar = this.a;
                File file = new File(drkmVar.a().b, str);
                if (!file.isFile()) {
                    return null;
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                } catch (IOException unused) {
                }
                try {
                    long length = randomAccessFile.length() - 4;
                    randomAccessFile.seek(length);
                    long j = randomAccessFile.readInt();
                    randomAccessFile.close();
                    if (j != length) {
                        drxz.b.b(file);
                        ((ekrd) ((ekrd) drkm.a.i()).h("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 109, "FileCache.java")).t("Delete malformed file: %s", file);
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            long length2 = file.length() - 4;
                            int i = elec.a;
                            eleb elebVar = new eleb(fileInputStream, length2);
                            try {
                                Object objA = drkmVar.c.a(elebVar);
                                elebVar.close();
                                return objA;
                            } finally {
                            }
                        } catch (IOException e) {
                            ((ekrd) ((ekrd) ((ekrd) drkm.a.i()).g(e)).h("com/google/android/libraries/inputmethod/cache/FileCache", "getInternal", 117, "FileCache.java")).t("Failed to deserialize file: %s", file);
                        }
                    }
                    return null;
                } finally {
                }
            }
        });
        map.put(str, listenableFutureSubmit);
        e(str, listenableFutureSubmit, eoscVar);
        return eork.j(listenableFutureSubmit);
    }

    public final Object c(String str, Object obj) throws IOException {
        File file = a().b;
        if (!file.exists() && !drxz.b.a(file)) {
            ekrg ekrgVar = a;
            ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/inputmethod/cache/FileCache", "createFolderIfAbsent", 230, "FileCache.java")).t("Failed to create directory: %s", file);
            ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 163, "FileCache.java")).t("Failed to create folder for file: %s", str);
            return null;
        }
        File file2 = new File(a().b, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                this.c.b(fileOutputStream, obj);
                fileOutputStream.close();
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int length = (int) randomAccessFile.length();
                        randomAccessFile.seek(length);
                        randomAccessFile.writeInt(length);
                        randomAccessFile.close();
                        return obj;
                    } finally {
                    }
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 170, "FileCache.java")).t("File not found: %s", file2);
            return null;
        } catch (IOException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 173, "FileCache.java")).t("Error writing file: %s", file2);
            return null;
        }
    }

    public final synchronized void d(final String str, final Object obj, eosc eoscVar) {
        HashMap map = this.b;
        ListenableFuture listenableFuture = (ListenableFuture) map.get(str);
        ListenableFuture listenableFutureF = listenableFuture != null ? eooq.f(listenableFuture, new ejvr() { // from class: drki
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return this.a.c(str, obj);
            }
        }, eoscVar) : eoscVar.submit(new Callable() { // from class: drkj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(str, obj);
            }
        });
        map.put(str, listenableFutureF);
        e(str, listenableFutureF, eoscVar);
        eork.j(listenableFutureF);
    }
}
