package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skg extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<skg> CREATOR = new skh();
    public final ekgb a;
    public final int b;
    public final smg c;

    public skg(List list, int i, smg smgVar) {
        this.a = ekgb.n(list);
        this.b = i;
        this.c = smgVar == null ? smg.a : smgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ekgb ekgbVar = this.a;
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, ekgbVar);
        dclw.i(parcel, 2, this.b);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
