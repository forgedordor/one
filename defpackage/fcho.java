package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcho implements fcmo {
    private InputStream a;

    public fcho(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.fcmo
    public final InputStream g() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
