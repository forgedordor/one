package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhv efhvVar = new efhv();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    efhvVar.d(dclv.t(parcel, i));
                    break;
                case 2:
                    efhvVar.i(efkv.a(parcel, i));
                    break;
                case 3:
                    efhvVar.c(efkv.a(parcel, i));
                    break;
                case 4:
                    efhvVar.e(dclv.t(parcel, i));
                    break;
                case 5:
                    efhvVar.a = Optional.of(dclv.t(parcel, i));
                    break;
                case 6:
                    efhvVar.g(dclv.b(parcel, i));
                    break;
                case 7:
                    efhvVar.f(dclv.b(parcel, i));
                    break;
                case 8:
                    efhvVar.h(dclv.b(parcel, i));
                    break;
                case 9:
                    efhvVar.b(dclv.t(parcel, i));
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        return efhvVar.j();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationInformation[i];
    }
}
