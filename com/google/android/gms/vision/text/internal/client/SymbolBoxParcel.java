package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deko;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SymbolBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SymbolBoxParcel> CREATOR = new deko();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
