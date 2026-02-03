package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbja;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ResultClickInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResultClickInfo> CREATOR = new dbja();
    final String a;
    final DocumentId[] b;
    final int c;

    public ResultClickInfo(String str, DocumentId[] documentIdArr, int i) {
        this.a = str;
        this.b = documentIdArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
