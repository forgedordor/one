package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbno implements fbnq {
    @Override // defpackage.fbom
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    @Override // defpackage.fbnr
    public final OutputStream b(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // defpackage.fbnr, defpackage.fbom
    public final String c() {
        return "gzip";
    }
}
