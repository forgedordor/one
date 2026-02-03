package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetPhraseAffinityCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhraseAffinityCall$Request> CREATOR = new decv();
    public String[] a;
    public PhraseAffinityCorpusSpec[] b;
    public Bundle c;

    public GetPhraseAffinityCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.C(parcel, 1, this.a);
        dclw.E(parcel, 2, this.b, i);
        dclw.p(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }

    public GetPhraseAffinityCall$Request(String[] strArr, PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr, Bundle bundle) {
        this.a = strArr;
        this.b = phraseAffinityCorpusSpecArr;
        this.c = bundle;
    }
}
