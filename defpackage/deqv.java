package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqv implements dcfx, dcfu {
    public volatile ParcelFileDescriptor a;
    public volatile InputStream b;
    public volatile boolean c = false;
    private final Status d;

    public deqv(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.d = status;
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.d;
    }

    @Override // defpackage.dcfu
    public final void b() throws IOException {
        if (this.a == null) {
            return;
        }
        if (this.c) {
            throw new IllegalStateException("releasing an already released result.");
        }
        try {
            if (this.b != null) {
                this.b.close();
            } else {
                this.a.close();
            }
            this.c = true;
            this.a = null;
            this.b = null;
        } catch (IOException unused) {
        }
    }
}
