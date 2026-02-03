package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        int iF = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                zD = dclv.D(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListZ = dclv.z(parcel, i, Scope.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CheckServerAuthResult(iF, zD, arrayListZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CheckServerAuthResult[i];
    }
}
