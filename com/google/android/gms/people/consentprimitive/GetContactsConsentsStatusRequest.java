package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvh;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetContactsConsentsStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetContactsConsentsStatusRequest> CREATOR = new ddvh();
    public final List a;
    public final int b;
    public final int c;

    public GetContactsConsentsStatusRequest(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
