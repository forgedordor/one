package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbry;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountInterruptControls extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountInterruptControls> CREATOR = new dbry();
    final boolean a;

    public AccountInterruptControls(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AccountInterruptControls) && ((AccountInterruptControls) obj).a == this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.c(parcel, iA);
    }
}
