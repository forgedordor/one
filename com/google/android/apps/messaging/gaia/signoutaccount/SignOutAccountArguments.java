package com.google.android.apps.messaging.gaia.signoutaccount;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.accx;
import defpackage.efwo;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SignOutAccountArguments implements Parcelable {
    public static final Parcelable.Creator<SignOutAccountArguments> CREATOR = new accx();
    public final efwo a;

    public SignOutAccountArguments(efwo efwoVar) {
        this.a = efwoVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignOutAccountArguments) && fdbq.f(this.a, ((SignOutAccountArguments) obj).a);
    }

    public final int hashCode() {
        efwo efwoVar = this.a;
        if (efwoVar == null) {
            return 0;
        }
        return efwoVar.hashCode();
    }

    public final String toString() {
        return "SignOutAccountArguments(accountIdToSwitchTo=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
