package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsResponse> CREATOR = new demi();
    String[] a;
    int[] b;
    RemoteViews c;
    byte[] d;

    private GetSaveInstrumentDetailsResponse() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.C(parcel, 1, this.a);
        dclw.v(parcel, 2, this.b);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.f(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }
}
