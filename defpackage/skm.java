package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skm extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<skm> CREATOR = new skn();
    public final shu a;

    public skm(shu shuVar) {
        this.a = shuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        shu shuVar = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, shuVar, i, false);
        dclw.c(parcel, iA);
    }
}
