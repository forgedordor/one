package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.feedback.FileTeleporter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strT = null;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) dclv.n(parcel, i, ParcelFileDescriptor.CREATOR);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new FileTeleporter(parcelFileDescriptor, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
