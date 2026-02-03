package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.depn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddSupervisedAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddSupervisedAccountRequest> CREATOR = new depn();
    public final String a;
    public final String b;
    public final boolean c;

    public AddSupervisedAccountRequest(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
