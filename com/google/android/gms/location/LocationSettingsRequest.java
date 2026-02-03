package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddnz;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new ddnz();
    public final boolean a;
    public final boolean b;
    private final List c;

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.c = list;
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.c;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, DesugarCollections.unmodifiableList(list), false);
        dclw.d(parcel, 2, this.a);
        dclw.d(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
