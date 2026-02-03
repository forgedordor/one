package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshStatefulNotificationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RefreshStatefulNotificationsAction.a) cqtf.a(RefreshStatefulNotificationsAction.a.class)).bl().b(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RefreshStatefulNotificationsAction[i];
    }
}
