package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dddv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new dddv();
    List a;

    UserAddressRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.n(parcel, 2, this.a, false);
        dclw.c(parcel, iA);
    }

    public UserAddressRequest(List list) {
        this.a = list;
    }
}
