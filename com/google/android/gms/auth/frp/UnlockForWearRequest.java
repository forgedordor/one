package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbvc;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class UnlockForWearRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockForWearRequest> CREATOR = new dbvc();
    public final boolean a;

    public UnlockForWearRequest(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.c(parcel, iA);
    }
}
