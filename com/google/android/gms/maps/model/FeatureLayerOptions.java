package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddri;
import defpackage.ekhx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FeatureLayerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureLayerOptions> CREATOR = new ddri();
    public final String a;
    public final String b;

    static {
        ekhx.v("ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "COUNTRY", "LOCALITY", "POSTAL_CODE", "SCHOOL_DISTRICT", "DATASET");
    }

    public FeatureLayerOptions(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
