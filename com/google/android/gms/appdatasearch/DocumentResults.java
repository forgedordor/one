package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbic;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentResults> CREATOR = new dbic();
    final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.p(parcel, 2, this.b);
        dclw.p(parcel, 3, this.c);
        dclw.p(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
