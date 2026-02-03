package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((axwy) ((ProcessFileTransferAction.a) cqtf.a(ProcessFileTransferAction.a.class)).be()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessFileTransferAction[i];
    }
}
