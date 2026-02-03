package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            dclv.C(parcel, parcel.readInt());
        }
        dclv.B(parcel, iH);
        return new GetCurrentExperimentIdsCall$Request();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCurrentExperimentIdsCall$Request[i];
    }
}
