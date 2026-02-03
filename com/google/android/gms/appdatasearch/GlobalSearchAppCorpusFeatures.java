package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbih;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalSearchAppCorpusFeatures extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalSearchAppCorpusFeatures> CREATOR = new dbih();
    final String a;
    final Feature[] b;

    public GlobalSearchAppCorpusFeatures(String str, Feature[] featureArr) {
        this.a = str;
        this.b = featureArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.c(parcel, iA);
    }
}
