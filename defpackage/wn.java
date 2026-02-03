package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wn extends ljg {
    public static final Parcelable.Creator<wn> CREATOR = new wm();
    public Parcelable a;

    public wn(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? wb.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.ljg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public wn(Parcelable parcelable) {
        super(parcelable);
    }
}
