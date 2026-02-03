package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfu {
    public static final cqce a = cqce.g("Bugle", "ScratchUtil");
    private static final Object c = new Object();
    public final Context b;
    private final bxfs d;

    public bxfu(Context context, bxfs bxfsVar) {
        this.b = context;
        this.d = bxfsVar;
    }

    public final Uri a(String str, String str2) {
        long jAbs = Math.abs(this.d.a.nextLong());
        Uri.Builder builderScheme = new Uri.Builder().authority(str).scheme("content");
        builderScheme.appendPath(String.valueOf(jAbs));
        if (!TextUtils.isEmpty(str2)) {
            builderScheme.appendQueryParameter("ext", str2);
        }
        return builderScheme.build();
    }

    public final Uri b(String str) {
        Uri uriA = a(bxlg.a(this.b), str);
        String path = uriA.getPath();
        if (path != null && i(f(path, str))) {
            return uriA;
        }
        cqbd cqbdVarB = a.b();
        cqbdVarB.I("Failed to create temp file");
        cqbdVarB.I(path);
        cqbdVarB.r();
        return null;
    }

    public final Uri c(Uri uri) {
        return k(uri);
    }

    public final Uri d(InputStream inputStream, String str) {
        Uri uriB = b(str);
        if (uriB == null) {
            return null;
        }
        return cqmz.d(this.b, inputStream, uriB);
    }

    public final File e(Uri uri) {
        if (uri != null) {
            String path = !j(uri) ? null : uri.getPath();
            if (path != null) {
                return f(path, g(uri));
            }
        }
        return null;
    }

    public final File f(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = a.q(str2, str, ".");
        }
        File file = new File(this.b.getCacheDir(), "mediascratchspace");
        File file2 = new File(file, str);
        try {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                return file2;
            }
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("getFileWithExtension: path");
            cqbdVarB.I(file2.getCanonicalPath());
            cqbdVarB.I("does not start with");
            cqbdVarB.I(file.getCanonicalPath());
            cqbdVarB.r();
            return null;
        } catch (IOException e) {
            a.o("getCanonicalPath failed.", e);
            return null;
        }
    }

    public final String g(Uri uri) {
        return uri.getQueryParameter("ext");
    }

    public final void h(Context context, Uri uri) {
        ekrd ekrdVarI = a.i();
        ekrdVarI.Z(eksk.LARGE);
        ((ekrd) ekrdVarI.h("com/google/android/apps/messaging/shared/datamodel/media/cache/ScratchUtil", "deleteContent", 396, "ScratchUtil.java")).t("Deleting content from scratch directory: %s", uri);
        if (uri == null || !j(uri)) {
            return;
        }
        context.getContentResolver().delete(uri, null, null);
    }

    public final boolean i(File file) {
        File parentFile;
        if (file == null) {
            return false;
        }
        boolean z = true;
        if (file.exists()) {
            return true;
        }
        try {
            parentFile = file.getParentFile();
        } catch (IOException unused) {
        }
        if (parentFile != null && !parentFile.exists()) {
            synchronized (c) {
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    z = false;
                }
            }
            if (z) {
                return file.createNewFile();
            }
            return false;
        }
        return file.createNewFile();
    }

    public final boolean j(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (TextUtils.equals(uri.getScheme(), "content")) {
            Context context = this.b;
            if ((TextUtils.equals(uri.getAuthority(), bxlg.b(context)) || TextUtils.equals(uri.getAuthority(), bxlg.a(context))) && pathSegments.size() == 1 && cqmr.h(pathSegments.get(0))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri k(android.net.Uri r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "error trying to close the inputStream."
            r1 = 0
            boolean r2 = defpackage.cqmz.p(r7)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r2 == 0) goto L14
            android.content.Context r2 = r6.b     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            goto L30
        L14:
            r2 = 8962(0x2302, float:1.2558E-41)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.net.URLConnection r7 = r2.openConnection()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r7 = r2
        L30:
            if (r7 == 0) goto L5a
            android.net.Uri r1 = r6.d(r7, r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r7.close()     // Catch: java.io.IOException -> L3a
            goto L5a
        L3a:
            r7 = move-exception
            cqce r2 = defpackage.bxfu.a
            goto L57
        L3e:
            r1 = move-exception
            goto L5e
        L40:
            r2 = move-exception
            goto L47
        L42:
            r7 = move-exception
            goto L61
        L44:
            r7 = move-exception
            r2 = r7
            r7 = r1
        L47:
            cqce r3 = defpackage.bxfu.a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Error while retrieving media."
            r3.s(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r7 == 0) goto L5a
            r7.close()     // Catch: java.io.IOException -> L54
            goto L5a
        L54:
            r7 = move-exception
            cqce r2 = defpackage.bxfu.a
        L57:
            r2.o(r0, r7)
        L5a:
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L5e:
            r5 = r1
            r1 = r7
            r7 = r5
        L61:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6d
        L67:
            r1 = move-exception
            cqce r2 = defpackage.bxfu.a
            r2.o(r0, r1)
        L6d:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxfu.k(android.net.Uri):android.net.Uri");
    }
}
