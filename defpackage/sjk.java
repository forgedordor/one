package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjk extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sjk> CREATOR = new sjl();
    public final ekgb a;
    public final smg b;

    public sjk(List list, smg smgVar) {
        this.a = ekgb.n(list);
        this.b = smgVar == null ? smg.a : smgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, ekgbVar, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
