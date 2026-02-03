package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtq extends amuv {
    private final String a;
    private final Uri b;
    private final amyb c;

    public amtq(String str, Uri uri, amyb amybVar) {
        this.a = str;
        this.b = uri;
        this.c = amybVar;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amuv, defpackage.amsv
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
        if (obj instanceof amuv) {
            amuv amuvVar = (amuv) obj;
            if (this.a.equals(amuvVar.b()) && this.b.equals(amuvVar.e())) {
                amuvVar.c();
                amyb amybVar = this.c;
                if (amybVar != null ? amybVar.equals(amuvVar.fm()) : amuvVar.fm() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.amuv, defpackage.amsv
    public final amyb fm() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        amyb amybVar = this.c;
        return (iHashCode * (-721379959)) ^ (amybVar == null ? 0 : amybVar.hashCode());
    }

    public final String toString() {
        amyb amybVar = this.c;
        return "BugleUnsupportedAttachmentContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", originalUri=null, progress=" + String.valueOf(amybVar) + "}";
    }
}
