package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deck;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetIMEUpdatesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIMEUpdatesCall$Request> CREATOR = new deck();
    public int a;
    public byte[] b;

    public GetIMEUpdatesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.f(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }

    public GetIMEUpdatesCall$Request(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
