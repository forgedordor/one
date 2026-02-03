package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpto implements dppy {
    public final String a;
    public final dptt b;
    public final String c;
    public final boolean d;
    public final fdae e;
    public final boolean f;
    private final Uri g;
    private final int h;
    private final int i;
    private final djse j;

    public dpto(String str, Uri uri, dptt dpttVar, String str2, int i, int i2, boolean z, fdae fdaeVar, boolean z2, djse djseVar) {
        uri.getClass();
        this.a = str;
        this.g = uri;
        this.b = dpttVar;
        this.c = str2;
        this.h = i;
        this.i = i2;
        this.d = z;
        this.e = fdaeVar;
        this.f = z2;
        this.j = djseVar;
    }

    @Override // defpackage.dppx
    public final String a() {
        return this.c;
    }

    @Override // defpackage.dppx
    public final String b() {
        return this.a;
    }

    @Override // defpackage.dppy
    public final int c() {
        return this.i;
    }

    @Override // defpackage.dppy
    public final int d() {
        return this.h;
    }

    @Override // defpackage.dppy
    public final Uri e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpto)) {
            return false;
        }
        dpto dptoVar = (dpto) obj;
        return fdbq.f(this.a, dptoVar.a) && fdbq.f(this.g, dptoVar.g) && fdbq.f(this.b, dptoVar.b) && fdbq.f(this.c, dptoVar.c) && this.h == dptoVar.h && this.i == dptoVar.i && this.d == dptoVar.d && fdbq.f(this.e, dptoVar.e) && this.f == dptoVar.f && fdbq.f(this.j, dptoVar.j);
    }

    @Override // defpackage.dppy
    public final djse f() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.g.hashCode()) * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.h) * 31) + this.i) * 31) + dptn.a(this.d)) * 31;
        fdae fdaeVar = this.e;
        int iHashCode3 = (((iHashCode2 + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31) + dptn.a(this.f)) * 31;
        djse djseVar = this.j;
        return iHashCode3 + (djseVar != null ? djseVar.hashCode() : 0);
    }

    public final String toString() {
        return "LocalVideoRendererUiData(id=" + this.a + ", uri=" + this.g + ", videoPlayer=" + this.b + ", contentDescription=" + this.c + ", widthPx=" + this.h + ", heightPx=" + this.i + ", canToggleFocusMode=" + this.d + ", onDeleteButtonClick=" + this.e + ", hideSeekBarWhenPaused=" + this.f + ", requestListener=" + this.j + ")";
    }
}
