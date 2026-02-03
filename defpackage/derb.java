package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class derb extends denr implements dcfu {
    private final deqv a;

    public derb(deqv deqvVar) {
        this.a = deqvVar;
    }

    @Override // defpackage.denr
    public final InputStream a() {
        deqv deqvVar = this.a;
        if (deqvVar.c) {
            throw new IllegalStateException("Cannot access the input stream after release().");
        }
        if (deqvVar.a == null) {
            return null;
        }
        if (deqvVar.b == null) {
            deqvVar.b = new ParcelFileDescriptor.AutoCloseInputStream(deqvVar.a);
        }
        return deqvVar.b;
    }

    @Override // defpackage.dcfu
    public final void b() throws IOException {
        this.a.b();
    }
}
