package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayed implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RemoveSelfNumberFromConversationsAction.a) cqtf.a(RemoveSelfNumberFromConversationsAction.a.class)).bn().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoveSelfNumberFromConversationsAction[i];
    }
}
