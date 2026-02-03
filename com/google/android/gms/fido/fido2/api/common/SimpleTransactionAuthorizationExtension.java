package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcza;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SimpleTransactionAuthorizationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SimpleTransactionAuthorizationExtension> CREATOR = new dcza();
    public final String a;

    public SimpleTransactionAuthorizationExtension(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SimpleTransactionAuthorizationExtension) {
            return dclc.a(this.a, ((SimpleTransactionAuthorizationExtension) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.c(parcel, iA);
    }
}
