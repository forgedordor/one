package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AppParcelable;
import com.google.android.gms.wearable.internal.AppRecommendationsResponse;
import com.google.android.gms.wearable.internal.WebIconParcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        int iF = 0;
        WebIconParcelable webIconParcelable = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                arrayListZ = dclv.z(parcel, i, AppParcelable.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                webIconParcelable = (WebIconParcelable) dclv.n(parcel, i, WebIconParcelable.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AppRecommendationsResponse(iF, arrayListZ, webIconParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRecommendationsResponse[i];
    }
}
