package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.SetupWizardInstrumentManagerParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                setupWizardInstrumentManagerParams = (SetupWizardInstrumentManagerParams) dclv.n(parcel, i, SetupWizardInstrumentManagerParams.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetSetupWizardIntentRequest(iF, setupWizardInstrumentManagerParams);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSetupWizardIntentRequest[i];
    }
}
