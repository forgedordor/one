package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwpj implements Parcelable {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    DEVICE_ID(5);

    public static final Parcelable.Creator<dwpj> CREATOR = new Parcelable.Creator() { // from class: dwpi
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return dwpj.a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new dwpj[i];
        }
    };
    public final int f;

    dwpj(int i) {
        this.f = i;
    }

    public static dwpj a(final int i) {
        return (dwpj) ekeh.e(values()).a(new ejwm() { // from class: dwph
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                dwpj dwpjVar = dwpj.UNKNOWN;
                return ((dwpj) obj).f == i;
            }
        }).e(UNKNOWN);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
    }
}
