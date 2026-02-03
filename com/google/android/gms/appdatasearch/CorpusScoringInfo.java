package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbhy;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CorpusScoringInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusScoringInfo> CREATOR = new dbhy();
    public final CorpusId a;
    public final int b;
    public final int c;

    public CorpusScoringInfo(CorpusId corpusId, int i, int i2) {
        this.a = corpusId;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
