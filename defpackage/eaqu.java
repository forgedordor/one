package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaqu extends eaoo {
    public static final Parcelable.Creator<eaqu> CREATOR = new eaqt();

    public eaqu(easo easoVar, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        super(easoVar, list, list2, list3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
        parcel.writeList(this.c);
        parcel.writeList(this.d);
        Boolean bool = this.e;
        if (bool == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Instant instant = this.f;
        if (instant == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(instant);
        }
        Instant instant2 = this.g;
        if (instant2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(instant2);
        }
    }
}
