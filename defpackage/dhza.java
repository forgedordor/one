package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<dhza> CREATOR = new dhzb();
    public final Integer a;

    public dhza(Integer num) {
        this.a = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.a;
        int iA = dclw.a(parcel);
        dclw.x(parcel, 1, num);
        dclw.c(parcel, iA);
    }
}
