package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echd implements ecer {
    public static final ParcelFileDescriptor b(eceq eceqVar) throws IOException {
        Pair pairB = eceqVar.b.b(eceqVar.f);
        try {
            if (eceqVar.b()) {
                throw new ecgh(a.E(eceqVar.e, "Accessing file descriptor directly would skip transforms for "));
            }
            Uri uri = (Uri) pairB.first;
            if (!uri.getScheme().equals("fd")) {
                throw new ecge("Scheme must be 'fd'");
            }
            try {
                return ParcelFileDescriptor.fromFd(Integer.parseInt(uri.getSchemeSpecificPart()));
            } catch (NumberFormatException e) {
                throw new ecge(e);
            }
        } finally {
            ((Closeable) pairB.second).close();
        }
    }

    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) {
        return b(eceqVar);
    }
}
