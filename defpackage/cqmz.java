package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Telephony;
import android.system.ErrnoException;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Predicate$CC;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmz {
    private final Context g;
    private final cqms h;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/file/UriUtil");
    public static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("sms", "mms", "smsto", "mmsto")));
    private static final Set d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("android.resource", "content", "file", "bugle")));
    private static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private static final ekhx f = ekhx.r("com.google.android.apps.messaging", "com.google.android.libraries.compose");
    public static final Uri c = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "directory_file_enterprise");

    public cqmz(Context context, cqms cqmsVar) {
        this.g = context;
        this.h = cqmsVar;
    }

    public static long b(Context context, Uri uri) {
        cqwg cqwgVar = new cqwg(context);
        try {
            if (uri == null) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMediaDurationMs", 420, "UriUtil.java")).q("Unable to extract duration from media file. Uri is null");
                return 0L;
            }
            try {
                cqwgVar.c(uri);
                return cqwgVar.d(0L);
            } catch (IOException | SecurityException e2) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMediaDurationMs", 428, "UriUtil.java")).t("Unable to extract duration from media file: %s", cqcv.b(uri.toString()));
                return 0L;
            }
        } finally {
            cqwgVar.b();
        }
    }

    public static long c(Context context, String str, String... strArr) {
        Long l = (Long) y(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "date_modified", new cqmv(), str, strArr);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri d(android.content.Context r8, java.io.InputStream r9, android.net.Uri r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "error trying to flush the outputStream"
            java.lang.String r1 = "copyContent"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r3 = "Bugle"
            defpackage.cqaz.h()
            java.lang.String r4 = "UriUtil.java"
            r5 = 592(0x250, float:8.3E-43)
            r6 = 0
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.io.OutputStream r8 = r8.openOutputStream(r10)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r8 != 0) goto L1b
            return r6
        L1b:
            defpackage.elec.a(r9, r8)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r8.flush()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r8.close()     // Catch: java.io.IOException -> L48
            return r10
        L25:
            r9 = move-exception
            goto Lc7
        L28:
            r9 = move-exception
            ekrg r6 = defpackage.cqmz.a     // Catch: java.lang.Throwable -> L25
            ekrw r6 = r6.i()     // Catch: java.lang.Throwable -> L25
            ekrz r7 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L25
            r6.X(r7, r3)     // Catch: java.lang.Throwable -> L25
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.Throwable -> L25
            ekrw r9 = r6.g(r9)     // Catch: java.lang.Throwable -> L25
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L25
            ekrw r9 = r9.h(r2, r1, r5, r4)     // Catch: java.lang.Throwable -> L25
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L25
            r9.q(r0)     // Catch: java.lang.Throwable -> L25
            r8.close()     // Catch: java.io.IOException -> L48
        L48:
            return r10
        L49:
            r9 = move-exception
            goto L9b
        L4b:
            r9 = move-exception
            goto L53
        L4d:
            r8 = move-exception
            r9 = r8
            goto L9c
        L50:
            r8 = move-exception
            r9 = r8
            r8 = r6
        L53:
            ekrg r10 = defpackage.cqmz.a     // Catch: java.lang.Throwable -> L49
            ekrw r10 = r10.i()     // Catch: java.lang.Throwable -> L49
            ekrz r7 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L49
            r10.X(r7, r3)     // Catch: java.lang.Throwable -> L49
            ekrd r10 = (defpackage.ekrd) r10     // Catch: java.lang.Throwable -> L49
            ekrw r9 = r10.g(r9)     // Catch: java.lang.Throwable -> L49
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L49
            r10 = 585(0x249, float:8.2E-43)
            ekrw r9 = r9.h(r2, r1, r10, r4)     // Catch: java.lang.Throwable -> L49
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L49
            java.lang.String r10 = "Error while copying content "
            r9.q(r10)     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L9a
            r8.flush()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L7c
        L78:
            r8.close()     // Catch: java.io.IOException -> L9a
            goto L9a
        L7c:
            r9 = move-exception
            ekrg r10 = defpackage.cqmz.a     // Catch: java.lang.Throwable -> L25
            ekrw r10 = r10.i()     // Catch: java.lang.Throwable -> L25
            ekrz r7 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L25
            r10.X(r7, r3)     // Catch: java.lang.Throwable -> L25
            ekrd r10 = (defpackage.ekrd) r10     // Catch: java.lang.Throwable -> L25
            ekrw r9 = r10.g(r9)     // Catch: java.lang.Throwable -> L25
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L25
            ekrw r9 = r9.h(r2, r1, r5, r4)     // Catch: java.lang.Throwable -> L25
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L25
            r9.q(r0)     // Catch: java.lang.Throwable -> L25
            goto L78
        L9a:
            return r6
        L9b:
            r6 = r8
        L9c:
            if (r6 == 0) goto Lcb
            r6.flush()     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La8
        La1:
            r6.close()     // Catch: java.io.IOException -> Lcb
            goto Lcb
        La5:
            r8 = move-exception
            r9 = r8
            goto Lc6
        La8:
            r8 = move-exception
            ekrg r10 = defpackage.cqmz.a     // Catch: java.lang.Throwable -> La5
            ekrw r10 = r10.i()     // Catch: java.lang.Throwable -> La5
            ekrz r7 = defpackage.eksq.a     // Catch: java.lang.Throwable -> La5
            r10.X(r7, r3)     // Catch: java.lang.Throwable -> La5
            ekrd r10 = (defpackage.ekrd) r10     // Catch: java.lang.Throwable -> La5
            ekrw r8 = r10.g(r8)     // Catch: java.lang.Throwable -> La5
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> La5
            ekrw r8 = r8.h(r2, r1, r5, r4)     // Catch: java.lang.Throwable -> La5
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> La5
            r8.q(r0)     // Catch: java.lang.Throwable -> La5
            goto La1
        Lc6:
            r8 = r6
        Lc7:
            r8.close()     // Catch: java.io.IOException -> Lca
        Lca:
            throw r9
        Lcb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqmz.d(android.content.Context, java.io.InputStream, android.net.Uri):android.net.Uri");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri e(android.content.Context r12, android.net.Uri r13, java.io.File r14, java.lang.String r15, java.lang.String r16, defpackage.cqmr r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqmz.e(android.content.Context, android.net.Uri, java.io.File, java.lang.String, java.lang.String, cqmr):android.net.Uri");
    }

    public static Object g(Context context, Uri uri, String str, cqmy cqmyVar) {
        return y(context, uri, str, cqmyVar, null, null);
    }

    public static String h(Context context, Uri uri) {
        String strI;
        try {
            String strD = (String) g(context, uri, "_display_name", new cqmw());
            if (strD == null && (strI = i(context, uri)) != null) {
                strD = cqmr.d(Uri.parse(a.v(strI, "file://")));
            }
            if (strD != null) {
                return new File(strD).getName();
            }
            return null;
        } catch (SecurityException e2) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "extractFileNameFromUri", 814, "UriUtil.java")).t("Unable to extract file name from uri: %s", cqcv.b(uri.toString()));
            return null;
        }
    }

    public static String i(Context context, Uri uri) {
        return (String) g(context, uri, "_data", new cqmw());
    }

    public static String j(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !o(uri)) {
            if (scheme.equals("content")) {
                return context.getContentResolver().getType(uri);
            }
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString()));
        } catch (Exception unused) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMimeTypeFromUri", 336, "UriUtil.java")).t("getMimeTypeFromUri failed on: %s", cqcv.b(uri.toString()));
            return null;
        }
    }

    public static void k(Context context, Uri uri, Uri uri2) throws IOException {
        InputStream bufferedInputStream = null;
        try {
            try {
                if (p(uri)) {
                    bufferedInputStream = context.getContentResolver().openInputStream(uri);
                } else if (u(uri)) {
                    bufferedInputStream = new BufferedInputStream(new URL(uri.toString()).openConnection().getInputStream());
                }
                if (bufferedInputStream != null) {
                    d(context, bufferedInputStream, uri2);
                } else {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", 476, "UriUtil.java")).q("Could not open sourceUri.");
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        ekrw ekrwVarJ2 = a.j();
                        ekrwVarJ2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 485, "UriUtil.java")).q("Error trying to close the inputStream.");
                    }
                }
            } catch (Exception e3) {
                ekrw ekrwVarJ3 = a.j();
                ekrwVarJ3.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e3)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", 479, "UriUtil.java")).q("Error while retrieving media.");
                if (0 != 0) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e4) {
                        ekrw ekrwVarJ4 = a.j();
                        ekrwVarJ4.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ4).g(e4)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 485, "UriUtil.java")).q("Error trying to close the inputStream.");
                    }
                }
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                bufferedInputStream.close();
                throw th;
            } catch (IOException e5) {
                ekrw ekrwVarJ5 = a.j();
                ekrwVarJ5.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ5).g(e5)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 485, "UriUtil.java")).q("Error trying to close the inputStream.");
                throw th;
            }
        }
    }

    public static boolean m(Uri uri) {
        return TextUtils.equals(uri.getScheme(), "android.resource");
    }

    @Deprecated
    public static boolean n(final Uri uri) {
        if (ashc.a()) {
            return cqmu.a(uri);
        }
        if ("content".equals(uri.getScheme())) {
            return Collection.EL.stream(f).noneMatch(new Predicate() { // from class: cqmx
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return cqmz.r(uri, (String) obj);
                }
            });
        }
        return false;
    }

    public static boolean o(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return TextUtils.equals(scheme.trim().toLowerCase(Locale.US), "file");
    }

    public static boolean p(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.equals(scheme, "android.resource") || TextUtils.equals(scheme, "content") || o(uri);
    }

    public static boolean q(Uri uri) {
        return d.contains(uri.getScheme());
    }

    @Deprecated
    public static boolean r(Uri uri, String str) {
        if (ashc.a()) {
            return cqmu.c(uri, str);
        }
        String authority = uri.getAuthority();
        return TextUtils.equals("content", uri.getScheme()) && authority != null && authority.startsWith(str);
    }

    public static boolean s(Uri uri) {
        return uri.toString().startsWith(Telephony.Mms.CONTENT_URI.toString());
    }

    public static boolean t(Uri uri) {
        return uri.toString().startsWith(Telephony.Sms.CONTENT_URI.toString());
    }

    public static boolean u(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.toLowerCase(Locale.US).startsWith("http");
    }

    public static boolean v(Uri uri) {
        if (uri == null) {
            return false;
        }
        return e.contains(ejwk.b(uri.getScheme()).toLowerCase(Locale.US)) && !TextUtils.isEmpty(uri.getHost());
    }

    public static boolean w(String str) {
        return !TextUtils.isEmpty(str) && v(Uri.parse(str));
    }

    public static Uri x(Context context) {
        return new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath("raw").appendPath("message_failure").build();
    }

    private static Object y(Context context, Uri uri, String str, cqmy cqmyVar, String str2, String[] strArr) {
        int columnIndex;
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{str}, str2, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex(str)) >= 0) {
                    Object objA = cqmyVar.a(cursorQuery, columnIndex);
                    cursorQuery.close();
                    return objA;
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

    public final long a(Uri uri) throws IOException {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.g.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 656, "UriUtil.java")).t("Failed to open asset for length of %s", cqcv.b(uri.toString()));
                    return 0L;
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return length;
                } catch (IOException unused) {
                    ekrw ekrwVarJ2 = a.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 670, "UriUtil.java")).t("Failed to close afd for %s", cqcv.b(uri.toString()));
                    return length;
                }
            } catch (FileNotFoundException e2) {
                ekrw ekrwVarJ3 = a.j();
                ekrwVarJ3.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 663, "UriUtil.java")).t("Failed to query length of %s", cqcv.b(uri.toString()));
                if (0 == 0) {
                    return 0L;
                }
                try {
                    assetFileDescriptor.close();
                    return 0L;
                } catch (IOException unused2) {
                    ekrw ekrwVarJ4 = a.j();
                    ekrwVarJ4.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 670, "UriUtil.java")).t("Failed to close afd for %s", cqcv.b(uri.toString()));
                    return 0L;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                    ekrw ekrwVarJ5 = a.j();
                    ekrwVarJ5.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ5).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 670, "UriUtil.java")).t("Failed to close afd for %s", cqcv.b(uri.toString()));
                }
            }
            throw th;
        }
    }

    @Deprecated
    public final InputStream f(Uri uri) throws IOException, ErrnoException {
        InputStream inputStreamB;
        if (ashc.a()) {
            return this.h.a(uri);
        }
        if (n(uri)) {
            inputStreamB = ebsv.b(this.g, uri, ebsu.a(uri.toString().contains("content://mms") ? "com.android.providers.telephony" : uri.toString().contains("contacts") ? "com.android.providers.contacts" : uri.toString().contains("content://com.google.android.gms.people.gal.provider/people_photo") ? "com.google.android.gms" : "com.android.providers."));
        } else {
            inputStreamB = ebsv.b(this.g, uri, ebsu.c);
        }
        if (inputStreamB != null) {
            return inputStreamB;
        }
        throw new FileNotFoundException("Could not open uri for upload: ".concat(String.valueOf(String.valueOf(uri))));
    }

    public final boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator it = ejxk.b(',').g("video/3gpp,video/3gp,video/3g2,video/3gpp2").iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
