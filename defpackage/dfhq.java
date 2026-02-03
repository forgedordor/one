package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.UUID;
import java.util.function.Function;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfhq {
    public static final dfny a = dfod.a(151923431);

    public static long a(Uri uri, ContentResolver contentResolver) throws Throwable {
        Throwable th;
        InputStream inputStreamOpenInputStream;
        long j = -1;
        if (((Boolean) a.a()).booleanValue()) {
            Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return -1L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            if (columnIndex >= 0) {
                cursorQuery.moveToFirst();
                j = cursorQuery.getLong(columnIndex);
            }
            cursorQuery.close();
            return j;
        }
        try {
            try {
                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Input stream is null");
                    }
                    long jAvailable = inputStreamOpenInputStream.available();
                    l(inputStreamOpenInputStream);
                    return jAvailable;
                } catch (Throwable th2) {
                    th = th2;
                    l(inputStreamOpenInputStream);
                    throw th;
                }
            } catch (IOException e) {
                dhja.i(e, "Unable to get file size for %s", uri);
                return -1L;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public static Uri b(Context context, String str, File file, dgfu dgfuVar) throws IOException {
        Optional optionalD = d(dgfuVar);
        if (optionalD.isEmpty()) {
            throw new IOException("Unable to create target file for file name: ".concat(String.valueOf(str)));
        }
        File file2 = (File) optionalD.get();
        if (!file.renameTo(file2)) {
            throw new IOException("Unable to rename temp file to final file name");
        }
        dhja.c("Temp file: %s renamed to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        if ("com.google.android.ims".equals(context.getPackageName())) {
            Uri uriA = FileProvider.a(context, "com.google.android.ims.rcsfileprovider", file2);
            context.grantUriPermission("com.google.android.apps.messaging", uriA, 67);
            return uriA;
        }
        if (!"com.google.android.apps.messaging".equals(context.getPackageName())) {
            dhja.u("CS lib should be either running in bugle or cs.apk!", new Object[0]);
        }
        return FileProvider.a(context, "com.google.android.rcs.service.fileprovider", file2);
    }

    public static Duration c(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Retry-After");
        if (firstHeader == null) {
            return Duration.ZERO;
        }
        String strTrim = firstHeader.getValue().trim();
        try {
            return Duration.ofSeconds(Integer.parseInt(strTrim));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid retry after value: ".concat(String.valueOf(strTrim)), e);
        }
    }

    public static Optional d(dgfu dgfuVar) {
        String string = UUID.randomUUID().toString();
        String strD = dgfuVar.d();
        int i = 0;
        if (TextUtils.isEmpty(strD)) {
            dhja.q("Unable to obtain default target directory for %s", string);
            return Optional.empty();
        }
        if (!h(strD)) {
            dhja.q("Unable to create default target directory %s", strD);
            return Optional.empty();
        }
        File file = new File(strD);
        File file2 = new File(file, string);
        while (file2.exists()) {
            i++;
            file2 = new File(file, "(" + i + ")" + string);
        }
        return Optional.of(file2);
    }

    public static String e(String str) {
        if (!dfpe.n()) {
            return "";
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public static String f(HttpRequestBase httpRequestBase) {
        return !dfpe.n() ? "" : (String) Optional.ofNullable(httpRequestBase).map(new Function() { // from class: dfho
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((HttpRequestBase) obj).getURI();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dfhp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((URI) obj).getHost();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
    }

    public static String g(Uri uri, String str) {
        String scheme = uri.getScheme();
        if ("file".equals(scheme)) {
            return uri.getLastPathSegment();
        }
        if (!"content".equals(scheme) && !"android.resource".equals(scheme)) {
            throw new IllegalArgumentException("Illegal URI for RCS file transfer: ".concat(String.valueOf(String.valueOf(uri))));
        }
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("ext");
        if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(str)) {
            queryParameter = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        return TextUtils.isEmpty(queryParameter) ? lastPathSegment : a.q(queryParameter, lastPathSegment, ".");
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static FileTransferServiceResult[] i(int i, String str) {
        return new FileTransferServiceResult[]{new FileTransferServiceResult(0L, null, i, str)};
    }

    public static LocationSharingResult[] j(int i, String str) {
        return new LocationSharingResult[]{new LocationSharingResult(0L, null, i, str)};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int k(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 70454(0x11336, float:9.8727E-41)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 79599(0x136ef, float:1.11542E-40)
            if (r0 == r1) goto L20
            r1 = 2461856(0x2590a0, float:3.449795E-39)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "POST"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "PUT"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "GET"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L40
            if (r4 == r3) goto L3e
            if (r4 == r2) goto L3c
            return r3
        L3c:
            r4 = 4
            return r4
        L3e:
            r4 = 3
            return r4
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfhq.k(java.lang.String):int");
    }

    private static void l(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }
}
