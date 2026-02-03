package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnp implements fbnq {
    public static final fbnq a = new fbnp();

    private fbnp() {
    }

    @Override // defpackage.fbnr, defpackage.fbom
    public final String c() {
        return "identity";
    }

    @Override // defpackage.fbom
    public final InputStream a(InputStream inputStream) {
        return inputStream;
    }

    @Override // defpackage.fbnr
    public final OutputStream b(OutputStream outputStream) {
        return outputStream;
    }
}
