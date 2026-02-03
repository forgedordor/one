package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efia efiaVar = new efia();
        efiaVar.a = new dflp() { // from class: efke
            @Override // defpackage.dflp
            public final boolean a() {
                return dflq.a();
            }
        };
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    efiaVar.l(efkk.values()[dclv.f(parcel, i)]);
                    break;
                case 2:
                    efiaVar.i(dclv.t(parcel, i));
                    break;
                case 3:
                    efiaVar.k(efkv.a(parcel, i));
                    break;
                case 4:
                    efiaVar.j(dclv.t(parcel, i));
                    break;
                case 5:
                    efiaVar.g(evqs.x(dclv.E(parcel, i)));
                    break;
                case 6:
                    efiaVar.f(efkj.a(dclv.t(parcel, i)));
                    break;
                case 7:
                    efiaVar.e(efki.a(dclv.t(parcel, i)));
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        return efiaVar.m();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageReceipt[i];
    }
}
