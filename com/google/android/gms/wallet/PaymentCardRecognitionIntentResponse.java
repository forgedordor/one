package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deli;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new deli();
    PendingIntent a;

    PaymentCardRecognitionIntentResponse() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.c(parcel, iA);
    }

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }
}
