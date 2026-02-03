package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhx extends uhw {
    public final String a;
    public final Uri b;
    public final elha c;
    public final long d;
    public final dqbw e;

    public uhx(String str, Uri uri, elha elhaVar, long j, dqbw dqbwVar) {
        this.a = str;
        this.b = uri;
        this.c = elhaVar;
        this.d = j;
        this.e = dqbwVar;
    }

    @Override // defpackage.uhw
    public final long a() {
        return this.d;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.uhw, defpackage.amsv
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
        if (obj instanceof uhw) {
            uhw uhwVar = (uhw) obj;
            if (this.a.equals(uhwVar.b()) && this.b.equals(uhwVar.e()) && this.c.equals(uhwVar.j()) && this.d == uhwVar.a() && this.e.equals(uhwVar.h())) {
                uhwVar.c();
                uhwVar.fm();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uhw, defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.uhw
    public final dqbw h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * (-721379959);
    }

    @Override // defpackage.uig
    public final elha j() {
        return this.c;
    }

    public final String toString() {
        dqbw dqbwVar = this.e;
        elha elhaVar = this.c;
        return "AudioContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + elhaVar.toString() + ", duration=" + this.d + ", voiceMetadata=" + dqbwVar.toString() + ", originalUri=null, progress=null}";
    }
}
