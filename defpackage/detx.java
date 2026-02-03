package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detx implements Callable {
    final /* synthetic */ ParcelFileDescriptor a;
    final /* synthetic */ byte[] b;

    public detx(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.a = parcelFileDescriptor;
        this.b = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws IOException {
        if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(String.valueOf(this.a))));
        }
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        try {
            try {
                autoCloseOutputStream.write(this.b);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", a.E(parcelFileDescriptor, "processAssets: wrote data: "));
                }
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                    }
                    autoCloseOutputStream.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                Log.w("WearableClient", "processAssets: writing data failed: " + String.valueOf(this.a));
                return false;
            }
        } finally {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                }
                autoCloseOutputStream.close();
            } catch (IOException unused3) {
            }
        }
    }
}
