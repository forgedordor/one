package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Integer numR = null;
        Double dP = null;
        Uri uri = null;
        ArrayList arrayListZ = null;
        ArrayList arrayListZ2 = null;
        ChannelIdValue channelIdValue = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    numR = dclv.r(parcel, i);
                    break;
                case 3:
                    dP = dclv.p(parcel, i);
                    break;
                case 4:
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 5:
                    arrayListZ = dclv.z(parcel, i, RegisterRequest.CREATOR);
                    break;
                case 6:
                    arrayListZ2 = dclv.z(parcel, i, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) dclv.n(parcel, i, ChannelIdValue.CREATOR);
                    break;
                case 8:
                    strT = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new RegisterRequestParams(numR, dP, uri, arrayListZ, arrayListZ2, channelIdValue, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequestParams[i];
    }
}
