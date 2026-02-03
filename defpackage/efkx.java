package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efie efieVar = new efie();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efieVar.b((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efieVar.c(efkv.a(parcel, i));
            }
        }
        return efieVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SubjectExtension[i];
    }
}
