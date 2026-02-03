package defpackage;

import android.telephony.satellite.wrapper.CarrierRoamingNtnModeListenerWrapper2;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clia implements CarrierRoamingNtnModeListenerWrapper2 {
    final /* synthetic */ clic a;
    final /* synthetic */ clhv b;
    final /* synthetic */ int c;

    public clia(clic clicVar, clhv clhvVar, int i) {
        this.a = clicVar;
        this.b = clhvVar;
        this.c = i;
    }

    public final void onCarrierRoamingNtnEligibleStateChanged(boolean z) throws IOException {
        eieh eiehVarA = this.a.b.a("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnEligibleStateChanged");
        try {
            this.b.a(z, this.c);
            fczl.a(eiehVarA, null);
        } finally {
        }
    }

    public final void onCarrierRoamingNtnModeChanged(boolean z) throws IOException {
        eieh eiehVarA = this.a.b.a("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnModeChangedEvent");
        try {
            this.b.b(z, this.c);
            fczl.a(eiehVarA, null);
        } finally {
        }
    }
}
