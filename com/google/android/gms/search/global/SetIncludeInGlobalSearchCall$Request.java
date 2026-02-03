package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.decf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetIncludeInGlobalSearchCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetIncludeInGlobalSearchCall$Request> CREATOR = new decf();
    public String a;
    public String b;
    public boolean c;

    public SetIncludeInGlobalSearchCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.d(parcel, 2, this.c);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }

    public SetIncludeInGlobalSearchCall$Request(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
