package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgy implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws IOException {
        echf echfVar = new echf();
        echfVar.c();
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) eceqVar.a.c(eceqVar.f, echfVar), 805306368);
        try {
            parcelFileDescriptorOpen.getFd();
            if (parcelFileDescriptorOpen == null) {
                return null;
            }
            parcelFileDescriptorOpen.close();
            return null;
        } catch (Throwable th) {
            if (parcelFileDescriptorOpen != null) {
                try {
                    parcelFileDescriptorOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
