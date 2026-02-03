package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((UpdateAttachmentAfterResizingAction.a) cqtf.a(UpdateAttachmentAfterResizingAction.a.class)).im().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateAttachmentAfterResizingAction[i];
    }
}
