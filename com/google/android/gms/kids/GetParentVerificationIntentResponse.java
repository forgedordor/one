package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddhr;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetParentVerificationIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetParentVerificationIntentResponse> CREATOR = new ddhr();
    public PendingIntent a;

    private GetParentVerificationIntentResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetParentVerificationIntentResponse) {
            return dclc.a(this.a, ((GetParentVerificationIntentResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.c(parcel, iA);
    }

    public GetParentVerificationIntentResponse(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }
}
