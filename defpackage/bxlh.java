package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxlh extends bxld {
    private static final cqce a = cqce.g("Bugle", "MmsFileProvider");

    public static Uri d(Context context) {
        Uri uriA = c(context).a(String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.MmsFileProvider"), null);
        uriA.getClass();
        String path = uriA.getPath();
        path.getClass();
        File fileG = g(context, path);
        if (!c(context).i(fileG)) {
            String absolutePath = fileG != null ? fileG.getAbsolutePath() : "null file";
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("Failed to create temp file");
            cqbdVarB.I(absolutePath);
            cqbdVarB.r();
        }
        return uriA;
    }

    public static File e(Context context, Uri uri) {
        String path;
        if (uri == null || (path = uri.getPath()) == null) {
            return null;
        }
        return g(context, path);
    }

    private static File f(Context context) {
        return new File(context.getCacheDir(), "rawmms");
    }

    private static File g(Context context, String str) {
        File file = new File(f(context), String.valueOf(str).concat(".dat"));
        try {
            if (file.getCanonicalPath().startsWith(f(context).getCanonicalPath())) {
                return file;
            }
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("getFile: path");
            cqbdVarB.I(file.getCanonicalPath());
            cqbdVarB.I("does not start with");
            cqbdVarB.I(f(context).getCanonicalPath());
            cqbdVarB.r();
            return null;
        } catch (IOException e) {
            a.o("getCanonicalPath failed.", e);
            return null;
        }
    }

    @Override // defpackage.bxld
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            return g(context, str);
        }
        a.n("getFile null context");
        return null;
    }
}
