package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.debq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisterCorpusInfoCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusInfoCall$Request> CREATOR = new debq();
    public String a;
    public String b;
    public RegisterCorpusInfo c;

    public RegisterCorpusInfoCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }

    public RegisterCorpusInfoCall$Request(String str, String str2, RegisterCorpusInfo registerCorpusInfo) {
        this.a = str;
        this.b = str2;
        this.c = registerCorpusInfo;
    }
}
