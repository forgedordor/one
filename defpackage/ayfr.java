package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ResumeRcsFileTransferAction.a) cqtf.a(ResumeRcsFileTransferAction.a.class)).bp().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResumeRcsFileTransferAction[i];
    }
}
