package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcun;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LookupSingleRemoteReachabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSingleRemoteReachabilityResponse> CREATOR = new dcun();
    public RemoteUserReachability a;

    public LookupSingleRemoteReachabilityResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LookupSingleRemoteReachabilityResponse) {
            return dclc.a(this.a, ((LookupSingleRemoteReachabilityResponse) obj).a);
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

    public LookupSingleRemoteReachabilityResponse(RemoteUserReachability remoteUserReachability) {
        this.a = remoteUserReachability;
    }
}
