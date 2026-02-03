package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcuo;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoteUserReachability extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteUserReachability> CREATOR = new dcuo();
    public DuoId a;
    public int b;
    public int c;

    public RemoteUserReachability() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteUserReachability) {
            RemoteUserReachability remoteUserReachability = (RemoteUserReachability) obj;
            if (dclc.a(this.a, remoteUserReachability.a) && dclc.a(Integer.valueOf(this.b), Integer.valueOf(remoteUserReachability.b)) && dclc.a(Integer.valueOf(this.c), Integer.valueOf(remoteUserReachability.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }

    public RemoteUserReachability(DuoId duoId, int i, int i2) {
        this.a = duoId;
        this.b = i;
        this.c = i2;
    }
}
