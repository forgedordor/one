package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxa implements vxg {
    public final ajna a;
    public final ajlj b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final ajna l;
    private final vzz m;

    public vxa(boolean z, boolean z2, int i, ajna ajnaVar, boolean z3, ajlj ajljVar, boolean z4, String str, boolean z5, boolean z6, boolean z7) {
        ajljVar.getClass();
        this.f = z;
        this.g = z2;
        this.h = i;
        this.a = ajnaVar;
        this.i = z3;
        this.b = ajljVar;
        this.j = z4;
        this.k = str;
        this.c = z5;
        this.d = z6;
        this.e = z7;
        this.l = ajnaVar;
        this.m = z4 ? new vzz(djrr.dD, R.string.send_button_content_description_rcs, (Integer) null, (Integer) null, 28) : ajnaVar.h ? new vzz(djrr.dB, R.string.send_button_content_description_rcs_encrypted, (Integer) null, Integer.valueOf(R.string.send_button_content_description_rcs_encrypted_with_profile), 12) : new vzz(djrr.dA, R.string.send_button_content_description_rcs, (Integer) null, Integer.valueOf(R.string.send_button_content_description_rcs_with_profile), 12);
    }

    @Override // defpackage.vxg
    public final int a() {
        return this.h;
    }

    @Override // defpackage.vxg
    public final vzz b() {
        return this.m;
    }

    @Override // defpackage.vxg
    public final /* bridge */ /* synthetic */ waa c() {
        return null;
    }

    @Override // defpackage.vxg
    public final ajna d() {
        return this.a;
    }

    @Override // defpackage.vxg
    public final ajna e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxa)) {
            return false;
        }
        vxa vxaVar = (vxa) obj;
        return this.f == vxaVar.f && this.g == vxaVar.g && this.h == vxaVar.h && this.a == vxaVar.a && this.i == vxaVar.i && this.b == vxaVar.b && this.j == vxaVar.j && fdbq.f(this.k, vxaVar.k) && this.c == vxaVar.c && this.d == vxaVar.d && this.e == vxaVar.e;
    }

    @Override // defpackage.vxg
    public final String f() {
        return this.k;
    }

    @Override // defpackage.vxg
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.vxg
    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int iA = (((((((((((((vwz.a(this.f) * 31) + vwz.a(this.g)) * 31) + this.h) * 31) + this.a.hashCode()) * 31) + vwz.a(this.i)) * 31) + this.b.hashCode()) * 31) + vwz.a(this.j)) * 31) + this.k.hashCode();
        boolean z = this.e;
        return (((((iA * 31) + vwz.a(this.c)) * 31) + vwz.a(this.d)) * 31) + vwz.a(z);
    }

    public final String toString() {
        return "Rcs(mediaAttachmentsSupported=" + this.f + ", locationSharingSupported=" + this.g + ", attachmentCountLimit=" + this.h + ", bestAvailableTransportFeatureSet=" + this.a + ", hasAttachments=" + this.i + ", kind=" + this.b + ", isGeminiConversation=" + this.j + ", draftHint=" + this.k + ", editSupported=" + this.c + ", remoteDeleteSupported=" + this.d + ", h265DecodingSupported=" + this.e + ")";
    }
}
