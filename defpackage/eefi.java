package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefi extends ljg {
    public static final Parcelable.Creator<eefi> CREATOR = new eefh();
    public boolean a;

    public eefi(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.ljg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public eefi(Parcelable parcelable) {
        super(parcelable);
    }
}
