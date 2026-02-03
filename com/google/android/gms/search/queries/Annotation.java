package com.google.android.gms.search.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Annotation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Annotation> CREATOR = new decs();
    public final int a;
    public final byte[] b;

    public Annotation(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.f(parcel, 5, this.b, false);
        dclw.c(parcel, iA);
    }
}
