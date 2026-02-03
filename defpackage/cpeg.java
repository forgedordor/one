package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpeg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((LegacyGroupProtocolSwitchAction.a) cqtf.a(LegacyGroupProtocolSwitchAction.a.class)).hO().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LegacyGroupProtocolSwitchAction[i];
    }
}
