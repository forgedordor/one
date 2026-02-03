package com.google.android.gms.fido.targetdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dczl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TargetDirectTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TargetDirectTransferResult> CREATOR = new dczl();
    public final Status a;
    public final List b;

    public TargetDirectTransferResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, status, i, false);
        dclw.n(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
