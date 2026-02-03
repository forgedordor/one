package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.deds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<RecordConsentByConsentResultResponse> CREATOR = new deds();
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, list);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
