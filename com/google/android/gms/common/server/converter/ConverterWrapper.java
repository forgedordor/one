package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcml;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConverterWrapper extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConverterWrapper> CREATOR = new dcml();
    final int a;
    public final StringToIntConverter b;

    public ConverterWrapper(int i, StringToIntConverter stringToIntConverter) {
        this.a = i;
        this.b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }

    public ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.a = 1;
        this.b = stringToIntConverter;
    }
}
