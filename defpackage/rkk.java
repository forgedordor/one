package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkk implements rfg {
    private final String a;
    private Object b;

    public rkk(String str) {
        this.a = str;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rfg
    public final void e() throws IOException {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            rffVar.c(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            rffVar.f(e);
        }
    }

    @Override // defpackage.rfg
    public final void d() {
    }
}
