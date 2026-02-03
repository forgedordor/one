package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axuj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessConversationUpdateAsyncAction.a) cqtf.a(ProcessConversationUpdateAsyncAction.a.class)).bd().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessConversationUpdateAsyncAction[i];
    }
}
