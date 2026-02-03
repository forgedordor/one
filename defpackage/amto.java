package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amto extends amut {
    private final String a;
    private final Uri b;
    private final long c;
    private final boolean d;
    private final amyb e;

    public amto(String str, Uri uri, long j, boolean z, amyb amybVar) {
        this.a = str;
        this.b = uri;
        this.c = j;
        this.d = z;
        this.e = amybVar;
    }

    @Override // defpackage.amwk
    public final long a() {
        return this.c;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amut, defpackage.amsv
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
        if (obj instanceof amut) {
            amut amutVar = (amut) obj;
            if (this.a.equals(amutVar.b()) && this.b.equals(amutVar.e()) && this.c == amutVar.a() && this.d == amutVar.g()) {
                amutVar.c();
                amyb amybVar = this.e;
                if (amybVar != null ? amybVar.equals(amutVar.fm()) : amutVar.fm() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.amut, defpackage.amsv
    public final amyb fm() {
        return this.e;
    }

    @Override // defpackage.amwk
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        amyb amybVar = this.e;
        int iHashCode2 = amybVar == null ? 0 : amybVar.hashCode();
        long j = this.c;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959)) ^ iHashCode2;
    }

    public final String toString() {
        amyb amybVar = this.e;
        return "BugleUnknownPendingAttachmentContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", fileSize=" + this.c + ", canRedownload=" + this.d + ", originalUri=null, progress=" + String.valueOf(amybVar) + "}";
    }
}
