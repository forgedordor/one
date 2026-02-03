package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddbw extends ddbx {
    final /* synthetic */ defr a;

    public ddbw(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.ddbx, com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback
    public final void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        dcjb.c(status, gmsDeviceComplianceResponse, this.a);
    }
}
