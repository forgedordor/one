package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnp implements amsy, wnq {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Duration d;
    private final amji e;
    private final dqbw f;
    private final athh g;

    public wnp(String str, Uri uri, Duration duration, dqbw dqbwVar, athh athhVar) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = duration;
        this.e = null;
        this.f = dqbwVar;
        this.g = athhVar;
    }

    @Override // defpackage.amsy
    public final amji a() {
        return null;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnp)) {
            return false;
        }
        wnp wnpVar = (wnp) obj;
        if (!fdbq.f(this.a, wnpVar.a) || !fdbq.f(this.b, wnpVar.b)) {
            return false;
        }
        Uri uri = wnpVar.c;
        if (!fdbq.f(null, null) || !fdbq.f(this.d, wnpVar.d)) {
            return false;
        }
        amji amjiVar = wnpVar.e;
        return fdbq.f(null, null) && fdbq.f(this.f, wnpVar.f) && fdbq.f(this.g, wnpVar.g);
    }

    @Override // defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.amsv
    public final athh fn() {
        return this.g;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    @Override // defpackage.amsy
    public final dqbw g() {
        return this.f;
    }

    @Override // defpackage.amsy
    public final Duration h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 961) + this.f.hashCode();
        athh athhVar = this.g;
        return (iHashCode * 31) + (athhVar == null ? 0 : athhVar.hashCode());
    }

    public final String toString() {
        return "MapiAudioContent(contentType=" + this.a + ", uri=" + cqcy.d(this.b) + ", originalUri=null, duration=" + this.d + ", voiceTranscription=null, voiceMetadata=" + this.f + ",processingId=" + this.g + ")";
    }
}
