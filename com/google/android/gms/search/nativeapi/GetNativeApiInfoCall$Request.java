package com.google.android.gms.search.nativeapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deco;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetNativeApiInfoCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetNativeApiInfoCall$Request> CREATOR = new deco();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
