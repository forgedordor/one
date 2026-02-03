package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhu efhuVar = new efhu();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhuVar.c(efjm.values()[dclv.f(parcel, i)]);
            } else if (iD == 2) {
                efhuVar.b(Duration.ofSeconds(dclv.i(parcel, i)));
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                efhuVar.d(Instant.ofEpochMilli(dclv.i(parcel, i)));
            }
        }
        return efhuVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IsComposingMessage[i];
    }
}
