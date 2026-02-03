package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        effe effeVarD = MessagingResult.d();
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                effeVarD.c(dclv.f(parcel, i));
            } else if (iD == 2) {
                effeVarD.b(dclv.f(parcel, i));
            } else if (iD == 3) {
                effeVarD.d(Duration.ofSeconds(dclv.i(parcel, i)));
            } else {
                dclv.C(parcel, i);
            }
        }
        return effeVarD.e();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessagingResult[i];
    }
}
