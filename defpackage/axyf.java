package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyf implements ayms {
    public final fcsu a;

    public axyf(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessRcsDeliveryReportAction c(Parcel parcel) {
        axye axyeVar = (axye) this.a.b();
        axyeVar.getClass();
        parcel.getClass();
        return new ProcessRcsDeliveryReportAction(axyeVar, parcel);
    }
}
