package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxe implements vxf {
    private final waa a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final ajna e;
    private final boolean f;
    private final vzy g;
    private final String h;
    private final vzz i;

    public vxe(waa waaVar, boolean z, boolean z2, int i, ajna ajnaVar, boolean z3, String str) {
        str.getClass();
        this.a = waaVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = ajnaVar;
        this.f = z3;
        this.g = null;
        this.h = str;
        this.i = new vzz(djrr.dA, R.string.send_button_content_description_sms, Integer.valueOf(R.string.send_button_label_sms), (Integer) null, 16);
    }

    public static final vxe i(vxe vxeVar, waa waaVar) {
        if (vxeVar.a == null) {
            waaVar = null;
        }
        return new vxe(waaVar, vxeVar.b, vxeVar.c, vxeVar.d, vxeVar.e, vxeVar.f, vxeVar.h);
    }

    @Override // defpackage.vxg
    public final int a() {
        return this.d;
    }

    @Override // defpackage.vxg
    public final vzz b() {
        return this.i;
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
    public final /* synthetic */ ajna e() {
        return ajna.SIMPLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxe)) {
            return false;
        }
        vxe vxeVar = (vxe) obj;
        if (!fdbq.f(this.a, vxeVar.a) || this.b != vxeVar.b || this.c != vxeVar.c || this.d != vxeVar.d || this.e != vxeVar.e || this.f != vxeVar.f) {
            return false;
        }
        vzy vzyVar = vxeVar.g;
        return fdbq.f(this.h, vxeVar.h);
    }

    @Override // defpackage.vxg
    public final String f() {
        return this.h;
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
        return ((((((((((((waaVar == null ? 0 : waaVar.hashCode()) * 31) + vxd.a(this.b)) * 31) + vxd.a(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + vxd.a(this.f)) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "Sms(textCounter=" + this.a + ", mediaAttachmentsSupported=" + this.b + ", locationSharingSupported=" + this.c + ", attachmentCountLimit=" + this.d + ", bestAvailableTransportFeatureSet=" + this.e + ", isMassSms=" + this.f + ", disabled=null, draftHint=" + this.h + ")";
    }
}
