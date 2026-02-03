package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnf;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRestriction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRestriction> CREATOR = new dbnf();
    public final AppRestrictionState a;
    public final AppRestrictionInfo b;

    public AppRestriction(AppRestrictionState appRestrictionState, AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppRestrictionState appRestrictionState = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, appRestrictionState, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
