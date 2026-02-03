package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReceiveSmsMessageAction.a) cqtf.a(ReceiveSmsMessageAction.a.class)).mo80if().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReceiveSmsMessageAction[i];
    }
}
