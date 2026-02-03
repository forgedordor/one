package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxc implements vxg {
    private final waa a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final ajna e;
    private final String f;
    private final ajna g;
    private final vzz h = new vzz(djrr.dA, R.string.send_button_content_description_satellite, (Integer) null, (Integer) null, 28);

    public vxc(waa waaVar, boolean z, boolean z2, int i, ajna ajnaVar, String str) {
        this.a = waaVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = ajnaVar;
        this.f = str;
        this.g = ajnaVar;
    }

    @Override // defpackage.vxg
    public final int a() {
        return this.d;
    }

    @Override // defpackage.vxg
    public final vzz b() {
        return this.h;
    }

    @Override // defpackage.vxg
    public final waa c() {
        return this.a;
    }

    @Override // defpackage.vxg
    public final ajna d() {
        return this.e;
    }

    @Override // defpackage.vxg
    public final ajna e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxc)) {
            return false;
        }
        vxc vxcVar = (vxc) obj;
        return fdbq.f(this.a, vxcVar.a) && this.b == vxcVar.b && this.c == vxcVar.c && this.d == vxcVar.d && this.e == vxcVar.e && fdbq.f(this.f, vxcVar.f);
    }

    @Override // defpackage.vxg
    public final String f() {
        return this.f;
    }

    @Override // defpackage.vxg
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.vxg
    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        waa waaVar = this.a;
        return ((((((((((waaVar == null ? 0 : waaVar.hashCode()) * 31) + vxb.a(this.b)) * 31) + vxb.a(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Satellite(textCounter=" + this.a + ", mediaAttachmentsSupported=" + this.b + ", locationSharingSupported=" + this.c + ", attachmentCountLimit=" + this.d + ", bestAvailableTransportFeatureSet=" + this.e + ", draftHint=" + this.f + ")";
    }
}
