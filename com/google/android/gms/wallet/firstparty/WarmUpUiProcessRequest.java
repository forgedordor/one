package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deme;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WarmUpUiProcessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WarmUpUiProcessRequest> CREATOR = new deme();
    long a;

    public WarmUpUiProcessRequest(long j) {
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.j(parcel, 1, this.a);
        dclw.c(parcel, iA);
    }

    public WarmUpUiProcessRequest() {
        this(SystemClock.elapsedRealtime());
    }
}
