package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetExperimentIdsCall$Request> CREATOR = new decd();
    public byte[] a;
    public boolean b;

    public SetExperimentIdsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, this.a, false);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}
