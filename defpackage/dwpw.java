package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dwpw implements Parcelable, Serializable {
    public static final Parcelable.Creator<dwpw> CREATOR = new dwpv();
    private static final long serialVersionUID = 0;

    public abstract dwpr a();

    public abstract dwpu b();

    public abstract dwpk c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(b(), i);
        int iOrdinal = b().ordinal();
        if (iOrdinal == 0) {
            parcel.writeParcelable(c(), i);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            parcel.writeParcelable(a(), i);
        }
    }
}
