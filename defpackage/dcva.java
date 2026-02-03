package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcva implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        DuoId[] duoIdArr = null;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                duoIdArr = (DuoId[]) dclv.J(parcel, i, DuoId.CREATOR);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new StartGroupCreationFlowRequest(duoIdArr, strT, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StartGroupCreationFlowRequest[i];
    }
}
