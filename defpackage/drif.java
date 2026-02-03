package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drif extends View.BaseSavedState {
    public static final Parcelable.Creator<drif> CREATOR = new drie();
    public int a;
    public int b;

    public drif(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public drif(Parcelable parcelable) {
        super(parcelable);
    }
}
