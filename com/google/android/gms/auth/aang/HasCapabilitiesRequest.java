package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnn;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HasCapabilitiesRequest> CREATOR = new dbnn();
    public final GoogleAccount a;
    public final List b;

    public HasCapabilitiesRequest(GoogleAccount googleAccount, List list) {
        this.a = googleAccount;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, googleAccount, i, false);
        dclw.D(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
