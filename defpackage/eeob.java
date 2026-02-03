package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeob extends ljg {
    public static final Parcelable.Creator<eeob> CREATOR = new eeoa();
    Bundle a;

    public eeob(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    @Override // defpackage.ljg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.a);
    }

    public eeob(Parcelable parcelable) {
        super(parcelable);
    }
}
