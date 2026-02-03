package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhy efhyVar = new efhy();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhyVar.c(dclv.t(parcel, i));
            } else if (iD == 2) {
                efhyVar.b(dclv.t(parcel, i));
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                efhyVar.d(dclv.t(parcel, i));
            }
        }
        return efhyVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageExtensionHeader[i];
    }
}
