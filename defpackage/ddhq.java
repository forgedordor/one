package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[] bArrE = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        byte[] bArrE2 = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 5:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 6:
                default:
                    dclv.C(parcel, i);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
                    break;
                case 8:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 9:
                    pendingIntent2 = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetParentVerificationIntentRequest(iF, iF2, strT, iF3, bArrE, pendingIntent, pendingIntent2, bArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetParentVerificationIntentRequest[i];
    }
}
