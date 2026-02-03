package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxlm extends bxld {
    private static final cqce a = cqce.g("Bugle", "RbmBusinessInfoFileProvider");

    /* compiled from: PG */
    public interface a {
        cogw y();
    }

    static final File d(Context context) {
        File file = new File(context.getFilesDir(), "rbm");
        if (file.exists()) {
            return file;
        }
        cqce cqceVar = a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.I("RBM Business file directory does not exist. Creating...");
        cqbdVarA.r();
        synchronized (bxlm.class) {
            if (!file.exists() && !file.mkdirs()) {
                cqceVar.n("Could not make RBM Business file directory");
            }
        }
        return file;
    }

    public static final Optional e(Context context, String str, bxll bxllVar, Uri uri) {
        File file = new File(d(context), f(str, bxllVar));
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileInputStream fileInputStream = new FileInputStream(bxlf.h(uri, context));
                    try {
                        cqce cqceVar = a;
                        cqbd cqbdVarC = cqceVar.c();
                        cqbdVarC.I("Copying RBM file");
                        cqbdVarC.A("file", file);
                        cqbdVarC.A("file name", str);
                        cqbdVarC.A("media type", bxllVar);
                        cqbdVarC.r();
                        elec.a(fileInputStream, fileOutputStream);
                        Uri uriBuild = new Uri.Builder().authority("com.google.android.apps.messaging.shared.datamodel.provider.RbmBusinessInfoFileProvider").scheme("content").appendPath(f(str, bxllVar)).appendQueryParameter("t", String.valueOf(((a) ehli.a(context, a.class)).y().f().toEpochMilli())).build();
                        cqbd cqbdVarA = cqceVar.a();
                        cqbdVarA.M("built file uri for RBM Business", uriBuild.toString());
                        cqbdVarA.r();
                        Optional optionalOf = Optional.of(uriBuild);
                        fileInputStream.close();
                        fileOutputStream.close();
                        cqbd cqbdVarC2 = cqceVar.c();
                        cqbdVarC2.I("Deleting provided temporary file");
                        cqbdVarC2.A("media type", bxllVar);
                        cqbdVarC2.r();
                        bxlf.i(context, uri);
                        return optionalOf;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                cqce cqceVar2 = a;
                cqbd cqbdVarE = cqceVar2.e();
                cqbdVarE.I("Unable to copy RBM file");
                cqbdVarE.A("name", str);
                cqbdVarE.A("file type", bxllVar);
                cqbdVarE.s(e);
                cqbd cqbdVarC3 = cqceVar2.c();
                cqbdVarC3.I("Deleting provided temporary file");
                cqbdVarC3.A("media type", bxllVar);
                cqbdVarC3.r();
                bxlf.i(context, uri);
                return Optional.empty();
            }
        } catch (Throwable th3) {
            cqbd cqbdVarC4 = a.c();
            cqbdVarC4.I("Deleting provided temporary file");
            cqbdVarC4.A("media type", bxllVar);
            cqbdVarC4.r();
            bxlf.i(context, uri);
            throw th3;
        }
    }

    private static String f(String str, bxll bxllVar) {
        return String.valueOf(bxllVar) + "_" + str;
    }

    @Override // defpackage.bxld
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            a.n("Context was null when retrieving file");
            return null;
        }
        File fileD = d(context);
        if (!TextUtils.isEmpty(str2)) {
            str = defpackage.a.q(str2, str, ".");
        }
        cqce cqceVar = a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.A("file name", str);
        cqbdVarA.r();
        File file = new File(fileD, str);
        try {
            if (file.getCanonicalPath().startsWith(fileD.getCanonicalPath())) {
                return file;
            }
            cqbd cqbdVarB = cqceVar.b();
            cqbdVarB.I("getFile: path");
            cqbdVarB.I(file.getCanonicalPath());
            cqbdVarB.I("does not start with");
            cqbdVarB.I(fileD.getCanonicalPath());
            cqbdVarB.r();
            return null;
        } catch (IOException e) {
            a.o("File#getCanonicalPath failed", e);
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
