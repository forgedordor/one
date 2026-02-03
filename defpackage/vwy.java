package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwy implements vxf {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final ajna d;
    private final boolean e;
    private final String f;
    private final vzz g;

    public vwy(boolean z, boolean z2, int i, ajna ajnaVar, boolean z3, String str) {
        str.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = ajnaVar;
        this.e = z3;
        this.f = str;
        this.g = new vzz(djrr.dA, R.string.send_button_content_description_mms, Integer.valueOf(R.string.send_button_label_mms), (Integer) null, 24);
    }

    @Override // defpackage.vxg
    public final int a() {
        return this.c;
    }

    @Override // defpackage.vxg
    public final vzz b() {
        return this.g;
    }

    @Override // defpackage.vxg
    public final /* bridge */ /* synthetic */ waa c() {
        return null;
    }

    @Override // defpackage.vxg
    public final ajna d() {
        return this.d;
    }

    @Override // defpackage.vxg
    public final /* synthetic */ ajna e() {
        return ajna.SIMPLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwy)) {
            return false;
        }
        vwy vwyVar = (vwy) obj;
        return this.a == vwyVar.a && this.b == vwyVar.b && this.c == vwyVar.c && this.d == vwyVar.d && this.e == vwyVar.e && fdbq.f(this.f, vwyVar.f);
    }

    @Override // defpackage.vxg
    public final String f() {
        return this.f;
    }

    @Override // defpackage.vxg
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.vxg
    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((vwx.a(this.a) * 31) + vwx.a(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + vwx.a(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Mms(mediaAttachmentsSupported=" + this.a + ", locationSharingSupported=" + this.b + ", attachmentCountLimit=" + this.c + ", bestAvailableTransportFeatureSet=" + this.d + ", hasAttachments=" + this.e + ", draftHint=" + this.f + ")";
    }
}
