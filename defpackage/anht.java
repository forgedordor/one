package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anht extends anhw {
    private final String a;
    private final Uri b;
    private final Size c;
    private final String d = "custom_sticker";
    private final String e;

    public anht(String str, Uri uri, Size size, String str2) {
        this.a = str;
        this.b = uri;
        this.c = size;
        this.e = str2;
    }

    @Override // defpackage.anhw, defpackage.amwb
    public final String a() {
        return this.e;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.anhw, defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anhw) {
            anhw anhwVar = (anhw) obj;
            if (this.a.equals(anhwVar.b()) && this.b.equals(anhwVar.e()) && this.c.equals(anhwVar.f())) {
                anhwVar.l();
                anhwVar.c();
                anhwVar.fm();
                if (this.d.equals(anhwVar.g()) && this.e.equals(anhwVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.amwm
    public final Size f() {
        return this.c;
    }

    @Override // defpackage.anhw, defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.anhw, defpackage.amwb
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1525764945) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.amwm
    public final String l() {
        return null;
    }

    public final String toString() {
        Size size = this.c;
        return "EmotifyReactionContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", size=" + size.toString() + ", caption=null, originalUri=null, progress=null, stickerSetId=" + this.d + ", stickerId=" + this.e + "}";
    }
}
