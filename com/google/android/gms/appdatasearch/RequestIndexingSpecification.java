package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbiz;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestIndexingSpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestIndexingSpecification> CREATOR = new dbiz();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
