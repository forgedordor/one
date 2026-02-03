package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaqe extends eaoe {
    public static final Parcelable.Creator<eaqe> CREATOR = new eaqd();

    public eaqe(easb easbVar, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        super(easbVar, d, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeDouble(this.b.doubleValue());
        parcel.writeInt(this.c.intValue());
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.e;
        if (num2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num2.intValue());
        }
        Instant instant = this.f;
        if (instant == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(instant);
        }
    }
}
