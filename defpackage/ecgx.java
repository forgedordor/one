package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgx implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorB = echd.b(eceqVar);
        return new AssetFileDescriptor(parcelFileDescriptorB, 0L, parcelFileDescriptorB.getStatSize());
    }
}
