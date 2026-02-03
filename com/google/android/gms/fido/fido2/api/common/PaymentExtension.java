package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcym;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentExtension> CREATOR = new dcym();
    public final boolean a;

    public PaymentExtension(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PaymentExtension) && this.a == ((PaymentExtension) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.c(parcel, iA);
    }
}
