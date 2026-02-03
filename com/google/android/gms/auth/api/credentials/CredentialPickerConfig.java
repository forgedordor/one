package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbot;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new dbot();
    final int a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        if (i < 2) {
            this.d = true == z3 ? 3 : 1;
        } else {
            this.d = i2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.d(parcel, 2, this.c);
        int i2 = this.d;
        dclw.d(parcel, 3, i2 == 3);
        dclw.i(parcel, 4, i2);
        dclw.i(parcel, 1000, this.a);
        dclw.c(parcel, iA);
    }

    public CredentialPickerConfig() {
        this(2, false, true, false, 1);
    }
}
