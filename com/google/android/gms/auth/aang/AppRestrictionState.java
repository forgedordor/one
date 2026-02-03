package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnd;
import defpackage.dclw;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRestrictionState> CREATOR = new dbnd();
    public final boolean a;
    public final boolean b;

    public AppRestrictionState(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRestrictionState)) {
            return false;
        }
        AppRestrictionState appRestrictionState = (AppRestrictionState) obj;
        return this.a == appRestrictionState.a && this.b == appRestrictionState.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
