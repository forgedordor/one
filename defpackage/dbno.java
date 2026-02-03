package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbno implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Long lS = null;
        ArrayList arrayListY = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                lS = dclv.s(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                arrayListY = dclv.y(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new Oauth2TokenMetadata(lS, arrayListY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Oauth2TokenMetadata[i];
    }
}
