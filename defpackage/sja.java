package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sja extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sja> CREATOR = new sjb();
    public final evbg a;
    public final shu b;

    public sja(evbg evbgVar, shu shuVar) {
        this.a = evbgVar;
        this.b = shuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        evbg evbgVar = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, evbgVar, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
