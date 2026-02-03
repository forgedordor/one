package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessRcsDeliveryReportAction.a) cqtf.a(ProcessRcsDeliveryReportAction.a.class)).hY().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessRcsDeliveryReportAction[i];
    }
}
