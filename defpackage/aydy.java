package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReloadCequintParticipantAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReloadCequintParticipantAction.a) cqtf.a(ReloadCequintParticipantAction.a.class)).bm().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReloadCequintParticipantAction[i];
    }
}
