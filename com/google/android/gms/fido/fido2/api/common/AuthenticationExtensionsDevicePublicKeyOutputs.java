package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcxo;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationExtensionsDevicePublicKeyOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsDevicePublicKeyOutputs> CREATOR = new dcxo();
    private final evqs a;
    private final evqs b;

    public AuthenticationExtensionsDevicePublicKeyOutputs(evqs evqsVar, evqs evqsVar2) {
        this.a = evqsVar;
        this.b = evqsVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsDevicePublicKeyOutputs)) {
            return false;
        }
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) obj;
        return dclc.a(this.a, authenticationExtensionsDevicePublicKeyOutputs.a) && dclc.a(this.b, authenticationExtensionsDevicePublicKeyOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        evqs evqsVar = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, evqsVar == null ? null : evqsVar.I(), false);
        evqs evqsVar2 = this.b;
        dclw.f(parcel, 2, evqsVar2 != null ? evqsVar2.I() : null, false);
        dclw.c(parcel, iA);
    }
}
