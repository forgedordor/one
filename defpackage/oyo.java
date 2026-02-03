package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyo extends oyy {
    public static final Parcelable.Creator<oyo> CREATOR = new oyn();
    public String a;

    public oyo(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public oyo(Parcelable parcelable) {
        super(parcelable);
    }
}
