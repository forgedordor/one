package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgaf implements fgah {
    final /* synthetic */ ParcelFileDescriptor a;

    public fgaf(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.fgah
    public final FileChannel a() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(String.valueOf(parcelFileDescriptor))));
    }
}
