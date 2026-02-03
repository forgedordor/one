package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deqc implements dcfu, dcfx {
    public final OutputStream a;
    private final Status b;

    public deqc(Status status, OutputStream outputStream) {
        dclh.m(status);
        this.b = status;
        this.a = outputStream;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.dcfu
    public final void b() throws IOException {
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
