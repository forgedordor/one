package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slc extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<slc> CREATOR = new sld();
    public final ekgb a;
    public final shu b;
    public final float c;

    public slc(List list, shu shuVar, float f) {
        this.a = ekgb.n(list);
        this.b = shuVar;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.h(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
