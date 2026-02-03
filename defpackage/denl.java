package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.ConnectionRestrictions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class denl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        int iF3 = 0;
        boolean zD4 = false;
        int iF4 = 0;
        int iF5 = 0;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        ArrayList arrayListY = null;
        ConnectionRestrictions connectionRestrictions = null;
        ConnectionDelayFilters connectionDelayFilters = null;
        boolean zD5 = true;
        boolean zD6 = true;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    iF = dclv.f(parcel, i);
                    break;
                case 5:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 8:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 9:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 10:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 11:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 12:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 13:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 14:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 15:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 16:
                    connectionRestrictions = (ConnectionRestrictions) dclv.n(parcel, i, ConnectionRestrictions.CREATOR);
                    break;
                case 17:
                    zD6 = dclv.D(parcel, i);
                    break;
                case 18:
                    connectionDelayFilters = (ConnectionDelayFilters) dclv.n(parcel, i, ConnectionDelayFilters.CREATOR);
                    break;
                case 19:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 20:
                    iF5 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ConnectionConfiguration(strT, strT2, iF, iF2, zD, zD2, strT3, zD3, strT4, strT5, iF3, arrayListY, zD4, zD5, connectionRestrictions, zD6, connectionDelayFilters, iF4, iF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
