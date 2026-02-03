package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.DeleteFileRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddta implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Uri uri = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new DeleteFileRequest(uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteFileRequest[i];
    }
}
