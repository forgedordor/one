package defpackage;

import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crpc extends crnh {
    private final TelephonyManager a;

    public crpc(crpb crpbVar, crot crotVar, int i) {
        super(crpbVar.a(i));
        this.a = crotVar.a(i);
    }

    @Override // defpackage.crnh, defpackage.crou
    public final int b() {
        return this.a.getSimCarrierId();
    }
}
