package com.google.android.ims.rcsservice.ims;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dezf;
import defpackage.dhdr;
import defpackage.dhds;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ImsRegistrationState implements Parcelable {
    public static final Parcelable.Creator<ImsRegistrationState> CREATOR = new dhdr();
    public final dhds a;
    public final dezf b;

    public ImsRegistrationState(dhds dhdsVar) {
        this.a = dhdsVar;
        this.b = dezf.UNKNOWN;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImsRegistrationState)) {
            return false;
        }
        ImsRegistrationState imsRegistrationState = (ImsRegistrationState) obj;
        return imsRegistrationState.b == this.b && imsRegistrationState.a == this.a;
    }

    public final int hashCode() {
        return this.a.l ^ 47;
    }

    public final String toString() {
        dezf dezfVar = this.b;
        return "RegistrationState " + this.a.name() + ", reason " + String.valueOf(dezfVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.l);
        parcel.writeInt(this.b.ordinal());
    }

    public ImsRegistrationState(dhds dhdsVar, dezf dezfVar) {
        this.a = dhdsVar;
        this.b = dezfVar;
    }

    public ImsRegistrationState(Parcel parcel) {
        this.a = dhds.a(parcel.readInt());
        this.b = dezf.a(parcel.readInt());
    }
}
