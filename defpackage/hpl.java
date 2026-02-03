package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpl<T> extends hrm<T> implements Parcelable {
    public static final Parcelable.Creator<hpl<Object>> CREATOR = new hpk();

    public hpl(Object obj, hrn hrnVar) {
        super(obj, hrnVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        hrn hrnVar = ((hrm) this).a;
        if (fdbq.f(hrnVar, hpb.a)) {
            i2 = 0;
        } else if (fdbq.f(hrnVar, hsi.a)) {
            i2 = 1;
        } else {
            if (!fdbq.f(hrnVar, hqr.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
