package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NodeMigratedEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NodeMigratedEventParcelable> CREATOR = new desv();
    public final String a;
    public final DataHolder b;

    public NodeMigratedEventParcelable(String str, DataHolder dataHolder) {
        this.a = str;
        this.b = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
