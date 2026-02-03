package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ChangeParticipantsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ChangeParticipantsAction.a) cqtf.a(ChangeParticipantsAction.a.class)).hB().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChangeParticipantsAction[i];
    }
}
