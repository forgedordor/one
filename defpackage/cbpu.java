package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.diagnostics.DiagnosticsFileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpu extends bxld {
    private static final cqce a = cqce.f("BugleDiagnostics", DiagnosticsFileProvider.class);

    public static Uri d(Context context, String str) {
        return new Uri.Builder().authority(String.valueOf(context.getApplicationContext().getPackageName()).concat(".diagnostics.DiagnosticsFileProvider")).scheme("content").appendPath(str).build();
    }

    public static File e(Context context, String str) {
        return new File(f(context), str);
    }

    private static File f(Context context) {
        File file = new File(context.getCacheDir(), "diagnostics_files");
        file.mkdir();
        return file;
    }

    @Override // defpackage.bxld
    protected final File a(String str, String str2) {
        Context context = getContext();
        File file = new File(f(context), str);
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

    @Override // defpackage.bxld, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        String path = uri.getPath();
        path.getClass();
        File fileA = a(path, "");
        if (fileA != null) {
            return ParcelFileDescriptor.open(fileA, cqmr.a(str));
        }
        throw new FileNotFoundException();
    }
}
