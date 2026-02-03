package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbjj;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SuggestSpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SuggestSpecification> CREATOR = new dbjj();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
