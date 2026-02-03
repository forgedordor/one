package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhr extends afhp {
    final /* synthetic */ afhs a;
    private final eiju c;

    public afhr(afhs afhsVar, LatLng latLng) {
        this.a = afhsVar;
        if (latLng == null) {
            this.c = null;
            afhs.a.m("Cannot do reverse geocode query with empty map center.");
        } else {
            eiju eijuVarA = ((crpt) afhsVar.e.get()).a(latLng);
            this.c = eijuVarA;
            eora afhqVar = new afhq(this);
            eork.r(eijuVarA, ((Boolean) afhsVar.g.b()).booleanValue() ? afhqVar : auwc.a(afhqVar), afhsVar.f);
        }
    }

    @Override // defpackage.afhp
    public final void a() {
        super.a();
        eiju eijuVar = this.c;
        if (eijuVar != null) {
            eijuVar.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
