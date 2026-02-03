package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.debx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGlobalSearchSourcesCall$CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$CorpusInfo> CREATOR = new debx();
    public String a;
    public Feature[] b;
    public boolean c;
    public Bundle d;

    public GetGlobalSearchSourcesCall$CorpusInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.d(parcel, 3, this.c);
        dclw.p(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }

    public GetGlobalSearchSourcesCall$CorpusInfo(String str, Feature[] featureArr, boolean z, Bundle bundle) {
        this.a = str;
        this.b = featureArr;
        this.c = z;
        this.d = bundle;
    }
}
