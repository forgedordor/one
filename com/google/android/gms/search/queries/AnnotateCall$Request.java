package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnnotateCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AnnotateCall$Request> CREATOR = new decq();
    public final String a;
    public final String b;
    public final int[] c;
    public final Bundle d;

    public AnnotateCall$Request(String str, String str2, int[] iArr, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = iArr;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.v(parcel, 3, this.c);
        dclw.p(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
