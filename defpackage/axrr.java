package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((axrs) ((InsertRcsMessageInTelephonyAction.a) cqtf.a(InsertRcsMessageInTelephonyAction.a.class)).aW()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InsertRcsMessageInTelephonyAction[i];
    }
}
