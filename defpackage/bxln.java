package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxln extends bxld {
    private static final cqce a = cqce.g("Bugle", "VerifiedSmsBrandLogoFileProvider");

    @Override // defpackage.bxld
    protected final File a(String str, String str2) {
        if (byew.a().booleanValue()) {
            return null;
        }
        Context context = getContext();
        if (context == null) {
            a.r("context was null");
            return null;
        }
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        File file = new File(context.getFilesDir(), "verified-sms");
        if (!file.exists()) {
            cqce cqceVar = a;
            cqceVar.m("Verified SMS directory does not exist. Creating...");
            if (!file.mkdirs()) {
                cqceVar.n("Could not make Verified SMS file directory");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            str = a.q(str2, str, ".");
        }
        cqce cqceVar2 = a;
        cqbd cqbdVarA = cqceVar2.a();
        cqbdVarA.A("file name", str);
        cqbdVarA.r();
        File file2 = new File(file, str);
        try {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                return file2;
            }
            cqbd cqbdVarB = cqceVar2.b();
            cqbdVarB.I("getFile: path");
            cqbdVarB.I(file2.getCanonicalPath());
            cqbdVarB.I("does not start with");
            cqbdVarB.I(file.getCanonicalPath());
            cqbdVarB.r();
            return null;
        } catch (IOException e) {
            cqbd cqbdVarB2 = a.b();
            cqbdVarB2.I("File#getCanonicalPath failed");
            cqbdVarB2.s(e);
            return null;
        }
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (byew.a().booleanValue()) {
            throw new FileNotFoundException();
        }
        String path = uri.getPath();
        path.getClass();
        File fileA = a(path, "");
        if (fileA != null) {
            return ParcelFileDescriptor.open(fileA, cqmr.a(str));
        }
        throw new FileNotFoundException();
    }
}
