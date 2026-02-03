package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import defpackage.dclw;
import defpackage.dear;
import defpackage.esav;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppIndexingErrorInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppIndexingErrorInfo> CREATOR = new dear();
    public String a;
    public int b;
    public int c;
    public String d;
    public long e;
    public Thing f;
    public esav g;

    public AppIndexingErrorInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.j(parcel, 5, this.e);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.k(parcel, 7, this.g, i, false);
        dclw.c(parcel, iA);
    }

    public AppIndexingErrorInfo(String str, int i, int i2, String str2, long j, Thing thing, esav esavVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = thing;
        this.g = esavVar;
    }
}
