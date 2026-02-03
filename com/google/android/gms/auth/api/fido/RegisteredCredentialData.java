package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpm;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.evqs;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisteredCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredCredentialData> CREATOR = new dbpm();
    final String a;
    final evqs b;
    final boolean c;

    public RegisteredCredentialData(String str, evqs evqsVar, boolean z) {
        dclh.n(str, "storage ID shouldn't be null");
        this.a = str;
        this.b = evqsVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisteredCredentialData)) {
            return false;
        }
        RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) obj;
        return this.c == registeredCredentialData.c && Objects.equals(this.a, registeredCredentialData.a) && Objects.equals(this.b, registeredCredentialData.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        evqs evqsVar = this.b;
        dclw.f(parcel, 2, evqsVar == null ? null : evqsVar.I(), false);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
