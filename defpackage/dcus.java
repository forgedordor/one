package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.SetupDuoRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcus implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        DuoId[] duoIdArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                duoIdArr = (DuoId[]) dclv.J(parcel, i, DuoId.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SetupDuoRequest(duoIdArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupDuoRequest[i];
    }
}
