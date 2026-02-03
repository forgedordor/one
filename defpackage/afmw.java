package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afmw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ChipId.a aVar = (ChipId.a) cqtf.a(ChipId.a.class);
        Bundle bundle = parcel.readBundle(afmv.class.getClassLoader());
        if (bundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        alre alreVarK = aVar.K();
        Object objA = ih.a(bundle, "identity", evwl.class);
        if (objA != null) {
            return new ChipId.Identity(alreVarK.a((evwl) objA));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipId.Identity[i];
    }
}
