package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efiq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhj efhjVar = new efhj();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    efhjVar.e(dclv.t(parcel, i));
                    break;
                case 2:
                    efhjVar.f(dclv.f(parcel, i));
                    break;
                case 3:
                    efhjVar.c((ContentType) dclv.n(parcel, i, ContentType.CREATOR));
                    break;
                case 4:
                    efhjVar.g(dclv.t(parcel, i));
                    break;
                case 5:
                    efhjVar.h(efkv.a(parcel, i));
                    break;
                case 6:
                    int iF = dclv.f(parcel, i);
                    if (iF >= 0 && iF < efis.values().length) {
                        efhjVar.d(efis.values()[iF]);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    efhjVar.a = Optional.of(evqs.x(dclv.E(parcel, i)));
                    break;
                case 8:
                    efhjVar.b(Duration.ofSeconds(dclv.i(parcel, i)));
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        return efhjVar.i();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileInformation[i];
    }
}
