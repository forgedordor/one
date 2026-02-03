package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpm extends dcko {
    public final cvw a;
    public final cvw v;
    private final cvw w;

    public ddpm(Context context, Looper looper, dcke dckeVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 23, dckeVar, dcgyVar, dciiVar);
        this.a = new cvw();
        this.v = new cvw();
        this.w = new cvw();
        new cvw();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void K() {
        System.currentTimeMillis();
        cvw cvwVar = this.a;
        synchronized (cvwVar) {
            cvwVar.clear();
        }
        cvw cvwVar2 = this.v;
        synchronized (cvwVar2) {
            cvwVar2.clear();
        }
        cvw cvwVar3 = this.w;
        synchronized (cvwVar3) {
            cvwVar3.clear();
        }
    }

    public final void M(dchz dchzVar, boolean z, defr defrVar) {
        cvw cvwVar = this.v;
        synchronized (cvwVar) {
            ddpi ddpiVar = (ddpi) cvwVar.remove(dchzVar);
            if (ddpiVar == null) {
                defrVar.b(Boolean.FALSE);
                return;
            }
            ((ddoz) ddpiVar.a).a.a();
            if (!z) {
                defrVar.b(Boolean.TRUE);
            } else if (N(ddnm.j)) {
                ((IGoogleLocationManagerService) w()).unregisterLocationClient(LocationReceiver.a(null, ddpiVar, "ILocationCallback@" + System.identityHashCode(ddpiVar)), new ddpa(Boolean.TRUE, defrVar));
            } else {
                ((IGoogleLocationManagerService) w()).updateLocationRequest(new LocationRequestUpdateData(2, null, null, ddpiVar, null, new ddpc(Boolean.TRUE, defrVar), null));
            }
        }
    }

    public final boolean N(Feature feature) {
        Feature feature2;
        Feature[] featureArrS = s();
        if (featureArrS != null) {
            int i = 0;
            while (true) {
                if (i >= featureArrS.length) {
                    feature2 = null;
                    break;
                }
                feature2 = featureArrS[i];
                if (feature.a.equals(feature2.a)) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.a() >= feature.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGoogleLocationManagerService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return ddnm.p;
    }
}
