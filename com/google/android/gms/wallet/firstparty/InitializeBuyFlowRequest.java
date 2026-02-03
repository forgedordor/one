package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dema;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InitializeBuyFlowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<InitializeBuyFlowRequest> CREATOR = new dema();
    public final int a;
    final byte[][] b;

    public InitializeBuyFlowRequest(int i, byte[][] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.q(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
