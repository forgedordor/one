package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.poq;
import defpackage.pos;
import defpackage.pot;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new poq();
    private final pot a;

    public ParcelImpl(Parcel parcel) {
        this.a = new pos(parcel).f();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new pos(parcel).x(this.a);
    }
}
