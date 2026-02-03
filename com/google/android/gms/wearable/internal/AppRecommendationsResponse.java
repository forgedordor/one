package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.depr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRecommendationsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRecommendationsResponse> CREATOR = new depr();
    public final int a;
    public final List b;
    public final WebIconParcelable c;

    public AppRecommendationsResponse(int i, List list, WebIconParcelable webIconParcelable) {
        this.a = i;
        this.b = list;
        this.c = webIconParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.n(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
