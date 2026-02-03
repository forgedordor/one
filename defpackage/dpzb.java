package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzb implements dpzi {
    public static final Parcelable.Creator<dpzb> CREATOR = new dpza();
    public final int a;
    public final doxc b;

    public dpzb(int i, doxc doxcVar) {
        this.a = i;
        this.b = doxcVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpzb)) {
            return false;
        }
        dpzb dpzbVar = (dpzb) obj;
        return this.a == dpzbVar.a && fdbq.f(this.b, dpzbVar.b);
    }

    public final int hashCode() {
        doxc doxcVar = this.b;
        return (this.a * 31) + (doxcVar == null ? 0 : doxcVar.hashCode());
    }

    public final String toString() {
        return "Shortcut(shortcut=" + this.a + ", configuration=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
