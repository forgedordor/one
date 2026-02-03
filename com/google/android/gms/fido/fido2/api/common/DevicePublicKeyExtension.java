package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcya;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DevicePublicKeyExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DevicePublicKeyExtension> CREATOR = new dcya();

    public final boolean equals(Object obj) {
        if (!(obj instanceof DevicePublicKeyExtension)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, false);
        dclw.c(parcel, iA);
    }
}
