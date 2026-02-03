package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AppTheme;
import defpackage.dclw;
import defpackage.dero;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAppThemeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAppThemeResponse> CREATOR = new dero();
    public final int a;
    public final AppTheme b;

    public GetAppThemeResponse(int i, AppTheme appTheme) {
        this.a = i;
        this.b = appTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
