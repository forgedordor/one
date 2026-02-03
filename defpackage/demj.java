package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Card card = null;
        ArrayList arrayListZ = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                card = (Card) dclv.n(parcel, i, Card.CREATOR);
            } else if (iD == 2) {
                arrayListZ = dclv.z(parcel, i, UserAddress.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SaveInstrumentRequest(card, arrayListZ, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveInstrumentRequest[i];
    }
}
