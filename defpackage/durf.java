package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durf implements ecer {
    private final Uri a;

    public durf(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws IOException {
        ecev ecevVar = eceqVar.a;
        try {
            echh echhVar = new echh();
            echhVar.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(echhVar.a(eceqVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return null;
                    }
                    Uri uriBuild = this.a.buildUpon().appendPath(ebta.a(nextEntry)).build();
                    if (nextEntry.isDirectory()) {
                        ecevVar.d(uriBuild);
                    } else {
                        OutputStream outputStream = (OutputStream) ecevVar.c(uriBuild, new echm());
                        try {
                            elec.a(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            ecevVar.j(this.a);
            throw e;
        }
    }
}
