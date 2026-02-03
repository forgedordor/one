package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.decg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetIncludeInGlobalSearchCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<SetIncludeInGlobalSearchCall$Response> CREATOR = new decg();
    public Status a;

    public SetIncludeInGlobalSearchCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.c(parcel, iA);
    }

    public SetIncludeInGlobalSearchCall$Response(Status status) {
        this.a = status;
    }
}
