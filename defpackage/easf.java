package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum easf implements Parcelable {
    FUEL_TYPE_UNSPECIFIED,
    DIESEL,
    REGULAR_UNLEADED,
    MIDGRADE,
    PREMIUM,
    SP91,
    SP91_E10,
    SP92,
    SP95,
    SP95_E10,
    SP98,
    SP99,
    SP100,
    LPG,
    E80,
    E85,
    METHANE,
    BIO_DIESEL,
    TRUCK_DIESEL;

    public static final Parcelable.Creator<easf> CREATOR = new Parcelable.Creator() { // from class: ease
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return (easf) Enum.valueOf(easf.class, string);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new easf[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
