package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaqw extends eaoq {
    public static final Parcelable.Creator<eaqw> CREATOR = new eaqv();

    public eaqw(eatb eatbVar, eatb eatbVar2, eatb eatbVar3, eatb eatbVar4, eatb eatbVar5, eatb eatbVar6, eatb eatbVar7) {
        super(eatbVar, eatbVar2, eatbVar3, eatbVar4, eatbVar5, eatbVar6, eatbVar7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
    }
}
