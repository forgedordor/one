package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 2) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PseudonymousIdToken(strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PseudonymousIdToken[i];
    }
}
