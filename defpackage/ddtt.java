package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.RenameRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Uri uri = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                uri2 = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new RenameRequest(uri, uri2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RenameRequest[i];
    }
}
