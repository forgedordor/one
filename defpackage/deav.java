package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deav implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ClearDebugUiCacheCall$Response(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClearDebugUiCacheCall$Response[i];
    }
}
