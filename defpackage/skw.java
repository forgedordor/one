package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<skw> CREATOR = new skx();
    public final ekgb a;
    public final ekgb b;

    public skw(List list, List list2) {
        this.a = ekgb.n(list);
        this.b = ekgb.n(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, ekgbVar);
        dclw.D(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
