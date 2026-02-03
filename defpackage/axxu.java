package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((axxv) ((ProcessMessageUpdateAsyncAction.a) cqtf.a(ProcessMessageUpdateAsyncAction.a.class)).bf()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessMessageUpdateAsyncAction[i];
    }
}
