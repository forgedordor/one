package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.decr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnnotateCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<AnnotateCall$Response> CREATOR = new decr();
    public Status a;
    public List b;
    public Bundle c;

    public AnnotateCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.n(parcel, 2, this.b, false);
        dclw.p(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }

    public AnnotateCall$Response(Status status, List list, Bundle bundle) {
        this.a = status;
        this.b = list;
        this.c = bundle;
    }
}
