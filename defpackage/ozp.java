package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozp extends oyy {
    public static final Parcelable.Creator<ozp> CREATOR = new ozo();
    public final int a;

    public ozp(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public ozp(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
