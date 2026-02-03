package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcyj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleTunnelServerIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleTunnelServerIdExtension> CREATOR = new dcyj();
    public final String a;

    public GoogleTunnelServerIdExtension(String str) {
        dclh.m(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GoogleTunnelServerIdExtension) {
            return this.a.equals(((GoogleTunnelServerIdExtension) obj).a);
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
