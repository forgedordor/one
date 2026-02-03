package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uid extends uin {
    private final String a;
    private final Uri b;
    private final elha c;
    private final amyb d;
    private final long e;

    public uid(String str, Uri uri, elha elhaVar, amyb amybVar, long j) {
        this.a = str;
        this.b = uri;
        this.c = elhaVar;
        this.d = amybVar;
        this.e = j;
    }

    @Override // defpackage.uin
    public final long a() {
        return this.e;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.uin, defpackage.amsv
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
        if (obj instanceof uin) {
            uin uinVar = (uin) obj;
            if (this.a.equals(uinVar.b()) && this.b.equals(uinVar.e()) && this.c.equals(uinVar.j())) {
                uinVar.c();
                amyb amybVar = this.d;
                if (amybVar != null ? amybVar.equals(uinVar.fm()) : uinVar.fm() == null) {
                    if (this.e == uinVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.uin, defpackage.amsv
    public final amyb fm() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        amyb amybVar = this.d;
        int iHashCode2 = amybVar == null ? 0 : amybVar.hashCode();
        long j = this.e;
        return (((iHashCode * (-721379959)) ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.uig
    public final elha j() {
        return this.c;
    }

    public final String toString() {
        amyb amybVar = this.d;
        elha elhaVar = this.c;
        return "VCardContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + elhaVar.toString() + ", originalUri=null, progress=" + String.valueOf(amybVar) + ", fileSize=" + this.e + "}";
    }
}
