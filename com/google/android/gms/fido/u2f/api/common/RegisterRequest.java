package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dczy;
import defpackage.dczz;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new dczz();
    public final int a;
    public final byte[] b;
    public final String c;
    private final ProtocolVersion d;

    public RegisterRequest(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        try {
            this.d = ProtocolVersion.a(str);
            this.b = bArr;
            this.c = str2;
        } catch (dczy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.b, registerRequest.b) || this.d != registerRequest.d) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (registerRequest.c != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.b) + 31) * 31) + this.d.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.d.d, false);
        dclw.f(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.c(parcel, iA);
    }
}
