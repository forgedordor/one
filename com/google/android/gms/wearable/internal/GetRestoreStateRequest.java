package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRestoreStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRestoreStateRequest> CREATOR = new desh();
    public final String a;

    public GetRestoreStateRequest(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.c(parcel, iA);
    }
}
