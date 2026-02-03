package defpackage;

import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddor implements dcir, ddpe {
    public dcib a;
    public boolean b = true;
    final /* synthetic */ ddos c;

    public ddor(ddos ddosVar, dcib dcibVar) {
        this.c = ddosVar;
        this.a = dcibVar;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dchz dchzVar;
        boolean z;
        ddpm ddpmVar = (ddpm) obj;
        synchronized (this) {
            dchzVar = this.a.b;
            z = this.b;
            this.a.a();
        }
        if (dchzVar == null) {
            ((defr) obj2).b(false);
            return;
        }
        cvw cvwVar = ddpmVar.a;
        synchronized (cvwVar) {
            ddpl ddplVar = (ddpl) cvwVar.remove(dchzVar);
            if (ddplVar == null) {
                ((defr) obj2).b(Boolean.FALSE);
                return;
            }
            ddplVar.a.b().a();
            if (!z) {
                ((defr) obj2).b(Boolean.TRUE);
            } else if (ddpmVar.N(ddnm.j)) {
                ((IGoogleLocationManagerService) ddpmVar.w()).unregisterLocationClient(LocationReceiver.b(null, ddplVar, "ILocationListener@" + System.identityHashCode(ddplVar)), new ddpa(Boolean.TRUE, (defr) obj2));
            } else {
                ((IGoogleLocationManagerService) ddpmVar.w()).updateLocationRequest(new LocationRequestUpdateData(2, null, ddplVar, null, null, new ddpc(Boolean.TRUE, (defr) obj2), null));
            }
        }
    }

    @Override // defpackage.ddpe
    public final synchronized dcib b() {
        return this.a;
    }

    @Override // defpackage.ddpe
    public final synchronized void c(dcib dcibVar) {
        dcib dcibVar2 = this.a;
        if (dcibVar2 != dcibVar) {
            dcibVar2.a();
            this.a = dcibVar;
        }
    }
}
