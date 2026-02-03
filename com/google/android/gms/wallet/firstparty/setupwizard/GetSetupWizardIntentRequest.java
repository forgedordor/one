package com.google.android.gms.wallet.firstparty.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetSetupWizardIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSetupWizardIntentRequest> CREATOR = new demk();
    final int a;
    final SetupWizardInstrumentManagerParams b;

    public GetSetupWizardIntentRequest(int i, SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams) {
        this.a = i;
        this.b = setupWizardInstrumentManagerParams;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
