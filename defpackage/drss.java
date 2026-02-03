package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drss {
    private static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/search/SafeLibraryLoader");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114 A[Catch: IOException -> 0x0122, TRY_ENTER, TryCatch #3 {IOException -> 0x0122, blocks: (B:29:0x00ad, B:44:0x00e4, B:60:0x0114, B:62:0x0119, B:64:0x011e, B:65:0x0121), top: B:83:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[Catch: IOException -> 0x0122, TryCatch #3 {IOException -> 0x0122, blocks: (B:29:0x00ad, B:44:0x00e4, B:60:0x0114, B:62:0x0119, B:64:0x011e, B:65:0x0121), top: B:83:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e A[Catch: IOException -> 0x0122, TryCatch #3 {IOException -> 0x0122, blocks: (B:29:0x00ad, B:44:0x00e4, B:60:0x0114, B:62:0x0119, B:64:0x011e, B:65:0x0121), top: B:83:0x00ad }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drss.a(android.content.Context):void");
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 1;
        }
    }
}
