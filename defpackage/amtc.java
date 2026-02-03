package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtc extends amtz {
    private final String a;
    private final Uri b;
    private final String c;
    private final long d;
    private final amyb e;

    public amtc(String str, Uri uri, String str2, long j, amyb amybVar) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = j;
        this.e = amybVar;
    }

    @Override // defpackage.amvp
    public final long a() {
        return this.d;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amtz, defpackage.amsv
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
        if (obj instanceof amtz) {
            amtz amtzVar = (amtz) obj;
            if (this.a.equals(amtzVar.b()) && this.b.equals(amtzVar.e()) && this.c.equals(amtzVar.g()) && this.d == amtzVar.a()) {
                amtzVar.c();
                amyb amybVar = this.e;
                if (amybVar != null ? amybVar.equals(amtzVar.fm()) : amtzVar.fm() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.amtz, defpackage.amsv
    public final amyb fm() {
        return this.e;
    }

    @Override // defpackage.amvp
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        amyb amybVar = this.e;
        int iHashCode2 = amybVar == null ? 0 : amybVar.hashCode();
        long j = this.d;
        return (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ iHashCode2;
    }

    public final String toString() {
        amyb amybVar = this.e;
        return "BugleFileContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", fileName=" + this.c + ", fileSize=" + this.d + ", originalUri=null, progress=" + String.valueOf(amybVar) + "}";
    }
}
