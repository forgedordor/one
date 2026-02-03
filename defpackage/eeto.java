package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeto extends ljg {
    public static final Parcelable.Creator<eeto> CREATOR = new eetn();
    public final int a;

    public eeto(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    @Override // defpackage.ljg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public eeto(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.a = sideSheetBehavior.c;
    }
}
