package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.GetIidTokenRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Long lS = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                lS = dclv.s(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetIidTokenRequest(lS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetIidTokenRequest[i];
    }
}
