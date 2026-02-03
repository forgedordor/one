package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaqy extends eaos {
    public static final Parcelable.Creator<eaqy> CREATOR = new eaqx();

    public eaqy(eatb eatbVar, eatb eatbVar2, eatb eatbVar3, eatb eatbVar4) {
        super(eatbVar, eatbVar2, eatbVar3, eatbVar4);
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
    }
}
