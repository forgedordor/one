package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyz implements Parcelable {
    public static final Parcelable.Creator<dpyz> CREATOR = new dpyy();
    public final dpxe a;
    public final dpxp b;
    public final fdap c;

    public dpyz(dpxe dpxeVar, dpxp dpxpVar, fdap fdapVar) {
        dpxeVar.getClass();
        fdapVar.getClass();
        this.a = dpxeVar;
        this.b = dpxpVar;
        this.c = fdapVar;
    }

    public static /* synthetic */ dpyz a(dpyz dpyzVar, dpxp dpxpVar, fdap fdapVar, int i) {
        dpxe dpxeVar = (i & 1) != 0 ? dpyzVar.a : null;
        if ((i & 2) != 0) {
            dpxpVar = dpyzVar.b;
        }
        dpxeVar.getClass();
        return new dpyz(dpxeVar, dpxpVar, fdapVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpyz)) {
            return false;
        }
        dpyz dpyzVar = (dpyz) obj;
        return this.a == dpyzVar.a && fdbq.f(this.b, dpyzVar.b) && fdbq.f(this.c, dpyzVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dpxp dpxpVar = this.b;
        return ((iHashCode + (dpxpVar == null ? 0 : dpxpVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HugoScreenDisplay(category=" + this.a + ", configuration=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
    }

    public /* synthetic */ dpyz(dpxe dpxeVar, fdap fdapVar, int i) {
        this(dpxeVar, (dpxp) null, (i & 4) != 0 ? new fdap() { // from class: dpyx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Context) obj).getClass();
                return 0;
            }
        } : fdapVar);
    }
}
