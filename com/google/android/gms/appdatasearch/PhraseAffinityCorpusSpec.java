package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbiq;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhraseAffinityCorpusSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhraseAffinityCorpusSpec> CREATOR = new dbiq();
    public final CorpusId a;
    final Bundle b;

    public PhraseAffinityCorpusSpec(CorpusId corpusId, Bundle bundle) {
        this.a = corpusId;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.p(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
