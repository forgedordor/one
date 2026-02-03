package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddxg implements dduo {
    private final Status a;
    private final ParcelFileDescriptor b;

    public ddxg(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.dcfu
    public final void b() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.dduo
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}
