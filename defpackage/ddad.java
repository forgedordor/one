package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Integer numR = null;
        Double dP = null;
        Uri uri = null;
        byte[] bArrE = null;
        ArrayList arrayListZ = null;
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
                    bArrE = dclv.E(parcel, i);
                    break;
                case 6:
                    arrayListZ = dclv.z(parcel, i, RegisteredKey.CREATOR);
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
        return new SignRequestParams(numR, dP, uri, bArrE, arrayListZ, channelIdValue, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }
}
