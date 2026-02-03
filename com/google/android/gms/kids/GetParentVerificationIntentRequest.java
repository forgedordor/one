package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddhq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetParentVerificationIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetParentVerificationIntentRequest> CREATOR = new ddhq();
    public int a;
    public int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public PendingIntent g;
    public byte[] h;

    private GetParentVerificationIntentRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetParentVerificationIntentRequest) {
            GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) obj;
            if (dclc.a(Integer.valueOf(this.a), Integer.valueOf(getParentVerificationIntentRequest.a)) && dclc.a(Integer.valueOf(this.b), Integer.valueOf(getParentVerificationIntentRequest.b)) && dclc.a(this.c, getParentVerificationIntentRequest.c) && dclc.a(Integer.valueOf(this.d), Integer.valueOf(getParentVerificationIntentRequest.d)) && Arrays.equals(this.e, getParentVerificationIntentRequest.e) && dclc.a(this.f, getParentVerificationIntentRequest.f) && dclc.a(this.g, getParentVerificationIntentRequest.g) && Arrays.equals(this.h, getParentVerificationIntentRequest.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.i(parcel, 4, this.d);
        dclw.f(parcel, 5, this.e, false);
        dclw.k(parcel, 7, this.f, i, false);
        dclw.f(parcel, 8, this.h, false);
        dclw.k(parcel, 9, this.g, i, false);
        dclw.c(parcel, iA);
    }

    public GetParentVerificationIntentRequest(int i, int i2, String str, int i3, byte[] bArr, PendingIntent pendingIntent, PendingIntent pendingIntent2, byte[] bArr2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = pendingIntent2;
        this.h = bArr2;
    }
}
