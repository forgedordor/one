package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfn implements echo {
    public final ecgd a;

    public ecfn(ecgd ecgdVar) {
        this.a = ecgdVar;
    }

    @Override // defpackage.echo
    public final long a(Uri uri) throws ecge {
        File fileA = ecfl.a(uri);
        if (fileA.isDirectory()) {
            return 0L;
        }
        return fileA.length();
    }

    @Override // defpackage.echo
    public final Pair b(Uri uri) {
        return ecfj.a(ParcelFileDescriptor.open(ecfl.a(uri), VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES));
    }

    @Override // defpackage.echo
    public final ecgd c() {
        return this.a;
    }

    @Override // defpackage.echo
    public final File d(Uri uri) {
        return ecfl.a(uri);
    }

    @Override // defpackage.echo
    public final InputStream e(Uri uri) throws ecge {
        File fileA = ecfl.a(uri);
        return new ecgi(new FileInputStream(fileA), fileA);
    }

    @Override // defpackage.echo
    public final OutputStream f(Uri uri) throws IOException {
        File fileA = ecfl.a(uri);
        eleh.a(fileA);
        return new ecgj(new FileOutputStream(fileA, true), fileA);
    }

    @Override // defpackage.echo
    public final OutputStream g(Uri uri) throws IOException {
        File fileA = ecfl.a(uri);
        eleh.a(fileA);
        return new ecgj(new FileOutputStream(fileA), fileA);
    }

    @Override // defpackage.echo
    public final Iterable h(Uri uri) throws IOException {
        File fileA = ecfl.a(uri);
        if (!fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] fileArrListFiles = fileA.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            builderPath.path(absolutePath);
            arrayList.add(ecfk.a(builderPath, ekfwVar));
        }
        return arrayList;
    }

    @Override // defpackage.echo
    public final String i() {
        return "file";
    }

    @Override // defpackage.echo
    public final void j(Uri uri) throws IOException {
        if (!ecfl.a(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.echo
    public final void k(Uri uri) throws IOException {
        File fileA = ecfl.a(uri);
        if (!fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!fileA.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.echo
    public final void l(Uri uri) throws IOException {
        File fileA = ecfl.a(uri);
        if (fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileA.delete()) {
            return;
        }
        if (!fileA.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.echo
    public final void m(Uri uri, Uri uri2) throws IOException {
        File fileA = ecfl.a(uri);
        File fileA2 = ecfl.a(uri2);
        eleh.a(fileA2);
        if (!fileA.renameTo(fileA2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.echo
    public final boolean n(Uri uri) {
        return ecfl.a(uri).exists();
    }

    @Override // defpackage.echo
    public final boolean o(Uri uri) {
        return ecfl.a(uri).isDirectory();
    }

    public ecfn() {
        this(new ecgd());
    }
}
