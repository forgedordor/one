package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum easo implements Parcelable {
    ACCESS,
    BREAKFAST,
    BRUNCH,
    DELIVERY,
    DINNER,
    DRIVE_THROUGH,
    HAPPY_HOUR,
    KITCHEN,
    LUNCH,
    ONLINE_SERVICE_HOURS,
    PICKUP,
    SENIOR_HOURS,
    TAKEOUT;

    public static final Parcelable.Creator<easo> CREATOR = new Parcelable.Creator() { // from class: easn
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return (easo) Enum.valueOf(easo.class, string);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new easo[i];
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
