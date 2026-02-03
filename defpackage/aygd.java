package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SelfParticipantsRefreshAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((SelfParticipantsRefreshAction.SelfParticipantsRefreshActionInjector) cqtf.a(SelfParticipantsRefreshAction.SelfParticipantsRefreshActionInjector.class)).ii().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SelfParticipantsRefreshAction[i];
    }
}
