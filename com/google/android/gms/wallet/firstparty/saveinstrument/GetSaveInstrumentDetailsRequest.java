package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetSaveInstrumentDetailsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsRequest> CREATOR = new demh();
    String a;
    long b;

    private GetSaveInstrumentDetailsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.j(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public GetSaveInstrumentDetailsRequest(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
