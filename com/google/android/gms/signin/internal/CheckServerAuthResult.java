package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dedq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckServerAuthResult> CREATOR = new dedq();
    final int a;
    final boolean b;
    final List c;

    public CheckServerAuthResult(int i, boolean z, List list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.n(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
