package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Intent intent = null;
        int iF = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                intent = (Intent) dclv.n(parcel, i, Intent.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new PostSignInData(iF, intent, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PostSignInData[i];
    }
}
