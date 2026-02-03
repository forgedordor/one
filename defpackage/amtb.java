package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtb extends amtu {
    private final String a;
    private final Uri b;
    private final dqbw c;
    private final Duration d;
    private final amyb e;
    private final amji f;

    public amtb(String str, Uri uri, dqbw dqbwVar, Duration duration, amyb amybVar, amji amjiVar) {
        this.a = str;
        this.b = uri;
        this.c = dqbwVar;
        this.d = duration;
        this.e = amybVar;
        this.f = amjiVar;
    }

    @Override // defpackage.amtu, defpackage.amsy
    public final amji a() {
        return this.f;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amtu, defpackage.amsv
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
        if (obj instanceof amtu) {
            amtu amtuVar = (amtu) obj;
            if (this.a.equals(amtuVar.b()) && this.b.equals(amtuVar.e()) && this.c.equals(amtuVar.g()) && this.d.equals(amtuVar.h())) {
                amtuVar.c();
                amyb amybVar = this.e;
                if (amybVar != null ? amybVar.equals(amtuVar.fm()) : amtuVar.fm() == null) {
                    amji amjiVar = this.f;
                    if (amjiVar != null ? amjiVar.equals(amtuVar.a()) : amtuVar.a() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.amtu, defpackage.amsv
    public final amyb fm() {
        return this.e;
    }

    @Override // defpackage.amsy
    public final dqbw g() {
        return this.c;
    }

    @Override // defpackage.amsy
    public final Duration h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        amyb amybVar = this.e;
        int iHashCode2 = ((iHashCode * (-721379959)) ^ (amybVar == null ? 0 : amybVar.hashCode())) * 1000003;
        amji amjiVar = this.f;
        return iHashCode2 ^ (amjiVar != null ? amjiVar.hashCode() : 0);
    }

    public final String toString() {
        amji amjiVar = this.f;
        amyb amybVar = this.e;
        Duration duration = this.d;
        dqbw dqbwVar = this.c;
        return "BugleAudioContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", voiceMetadata=" + dqbwVar.toString() + ", duration=" + duration.toString() + ", originalUri=null, progress=" + String.valueOf(amybVar) + ", voiceTranscription=" + String.valueOf(amjiVar) + "}";
    }
}
