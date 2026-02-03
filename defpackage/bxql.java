package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxql {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/richcard/common/RichCardMediaFileProviderUtil");

    public static final boolean a(Uri uri, Context context) {
        context.getClass();
        return fdbq.f(uri.getScheme(), "content") && fdbq.f(uri.getAuthority(), String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.richcard.RichCardMediaFileProvider")) && cqmr.h(uri.getPath());
    }

    public static final File b(Context context, String str, String str2) throws IOException {
        str.getClass();
        File fileC = c(context);
        if (str2 != null && str2.length() != 0) {
            str = a.q(str2, str, ".");
        }
        File file = new File(fileC, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            canonicalPath.getClass();
            String canonicalPath2 = c(context).getCanonicalPath();
            canonicalPath2.getClass();
            if (fdgn.t(canonicalPath, canonicalPath2)) {
                return file;
            }
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/datamodel/richcard/common/RichCardMediaFileProviderUtil", "getFileWithExtension", 58, "RichCardMediaFileProviderUtil.kt")).D("getFile: path %s does not start with %s", file.getCanonicalPath(), c(context).getCanonicalPath());
            return null;
        } catch (IOException e) {
            ekrw ekrwVarI2 = a.i();
            ekrwVarI2.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarI2.h("com/google/android/apps/messaging/shared/datamodel/richcard/common/RichCardMediaFileProviderUtil", "getFileWithExtension", 66, "RichCardMediaFileProviderUtil.kt")).t("getCanonicalPath failed.", e);
            return null;
        }
    }

    private static final File c(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        return cacheDir;
    }
}
