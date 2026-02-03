package defpackage;

import android.net.Uri;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfy implements res {
    private final drfl b;
    private final int c;
    private final int d;
    private final drfx e;
    private String f;

    public drfy(drfl drflVar, int i, int i2, drfx drfxVar) {
        this.b = drflVar;
        this.c = i;
        this.d = i2;
        this.e = drfxVar;
    }

    private final synchronized String b() {
        if (this.f == null) {
            this.f = Uri.parse(this.e.a().b()).getPath();
        }
        return this.f;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        drgd drgdVar = this.b.c;
        messageDigest.update(b().getBytes(a));
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof drfy) {
            drfy drfyVar = (drfy) obj;
            if (this.b.equals(drfyVar.b) && this.c == drfyVar.c && this.d == drfyVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        int i = this.d;
        return rvk.f(this.b, rvk.e(this.c, rvk.d(i)));
    }

    public final String toString() {
        return "FifeUrlKey{fifeModel='" + String.valueOf(this.b) + "', width='" + this.c + "', height='" + this.d + "'}";
    }
}
