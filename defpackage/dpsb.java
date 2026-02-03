package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpsb implements dppy {
    public final String a;
    public final boolean b;
    public final fdae c;
    public final boolean d;
    public final hox e;
    public final hsf f;
    private final Uri g;
    private final String h;
    private final String i;
    private final int j;
    private final int k;
    private final djse l;

    public dpsb(String str, Uri uri, String str2, String str3, int i, int i2, boolean z, fdae fdaeVar, boolean z2, djse djseVar) {
        uri.getClass();
        this.a = str;
        this.g = uri;
        this.h = str2;
        this.i = str3;
        this.j = i;
        this.k = i2;
        this.b = z;
        this.c = fdaeVar;
        this.d = z2;
        this.l = djseVar;
        hpl hplVar = new hpl(false, hsi.a);
        this.e = hplVar;
        this.f = hplVar;
    }

    @Override // defpackage.dppx
    public final String a() {
        return this.i;
    }

    @Override // defpackage.dppx
    public final String b() {
        return this.a;
    }

    @Override // defpackage.dppy
    public final int c() {
        return this.k;
    }

    @Override // defpackage.dppy
    public final int d() {
        return this.j;
    }

    @Override // defpackage.dppy
    public final Uri e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpsb)) {
            return false;
        }
        dpsb dpsbVar = (dpsb) obj;
        return fdbq.f(this.a, dpsbVar.a) && fdbq.f(this.g, dpsbVar.g) && fdbq.f(this.h, dpsbVar.h) && fdbq.f(this.i, dpsbVar.i) && this.j == dpsbVar.j && this.k == dpsbVar.k && this.b == dpsbVar.b && fdbq.f(this.c, dpsbVar.c) && this.d == dpsbVar.d && fdbq.f(this.l, dpsbVar.l);
    }

    @Override // defpackage.dppy
    public final djse f() {
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.g.hashCode();
        String str = this.h;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.j) * 31) + this.k) * 31) + dpsa.a(this.b)) * 31;
        fdae fdaeVar = this.c;
        int iHashCode4 = (((iHashCode3 + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31) + dpsa.a(this.d)) * 31;
        djse djseVar = this.l;
        return iHashCode4 + (djseVar != null ? djseVar.hashCode() : 0);
    }

    public final String toString() {
        return "LocalImageRendererUiData(id=" + this.a + ", uri=" + this.g + ", displayName=" + this.h + ", contentDescription=" + this.i + ", widthPx=" + this.j + ", heightPx=" + this.k + ", canZoom=" + this.b + ", onDeleteButtonClick=" + this.c + ", canToggleFocusMode=" + this.d + ", requestListener=" + this.l + ")";
    }
}
