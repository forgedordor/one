package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deas;
import defpackage.esav;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIndexingUserActionInfo> CREATOR = new deas();
    public String a;
    public long b;
    public esav c;

    public AppIndexingUserActionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.j(parcel, 2, this.b);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }

    public AppIndexingUserActionInfo(String str, long j, esav esavVar) {
        this.a = str;
        this.b = j;
        this.c = esavVar;
    }
}
