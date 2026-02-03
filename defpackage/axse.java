package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axse implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((MarkConversationNotYetDeliveredAction.a) cqtf.a(MarkConversationNotYetDeliveredAction.a.class)).hP().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkConversationNotYetDeliveredAction[i];
    }
}
