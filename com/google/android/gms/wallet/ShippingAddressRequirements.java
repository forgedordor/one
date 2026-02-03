package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new delo();
    ArrayList a;

    private ShippingAddressRequirements() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, this.a);
        dclw.c(parcel, iA);
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.a = arrayList;
    }
}
