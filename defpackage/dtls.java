package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtls extends View.BaseSavedState {
    public static final Parcelable.Creator<dtls> CREATOR = new dtlr();
    public String a;
    public boolean b;

    public dtls(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readInt() == 1;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public dtls(Parcelable parcelable) {
        super(parcelable);
    }
}
