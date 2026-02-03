package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbno;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Oauth2TokenMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Oauth2TokenMetadata> CREATOR = new dbno();
    public final Long a;
    public final List b;

    public Oauth2TokenMetadata(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iA = dclw.a(parcel);
        dclw.A(parcel, 1, l);
        dclw.D(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
