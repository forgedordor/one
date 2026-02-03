package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddts implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) dclv.n(parcel, i, ParcelFileDescriptor.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new OpenFileDescriptorResponse(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OpenFileDescriptorResponse[i];
    }
}
