package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dboj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        ArrayList arrayListY3 = null;
        ArrayList arrayListY4 = null;
        ArrayList arrayListY5 = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 3:
                    arrayListY2 = dclv.y(parcel, i);
                    break;
                case 4:
                    arrayListY3 = dclv.y(parcel, i);
                    break;
                case 5:
                    arrayListY4 = dclv.y(parcel, i);
                    break;
                case 6:
                    arrayListY5 = dclv.y(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AccountTransferProgress(iF, arrayListY, arrayListY2, arrayListY3, arrayListY4, arrayListY5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferProgress[i];
    }
}
