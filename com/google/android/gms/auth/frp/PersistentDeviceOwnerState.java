package com.google.android.gms.auth.frp;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbuz;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class PersistentDeviceOwnerState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PersistentDeviceOwnerState> CREATOR = new dbuz();
    public final ComponentName a;
    public final String b;

    public PersistentDeviceOwnerState(ComponentName componentName, String str) {
        this.a = componentName;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}
