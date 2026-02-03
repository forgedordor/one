package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbis;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class PhraseAffinitySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhraseAffinitySpecification> CREATOR = new dbis();
    final PhraseAffinityCorpusSpec[] a;

    public PhraseAffinitySpecification(PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr) {
        this.a = phraseAffinityCorpusSpecArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, this.a, i);
        dclw.c(parcel, iA);
    }
}
