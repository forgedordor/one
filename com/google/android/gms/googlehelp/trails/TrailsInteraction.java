package com.google.android.gms.googlehelp.trails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dddq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TrailsInteraction extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TrailsInteraction> CREATOR = new dddq();
    public final String a;
    public final long b;
    public final String c;

    public TrailsInteraction(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.j(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
