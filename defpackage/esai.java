package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esai> CREATOR = new esaj();
    public final String a;
    public final boolean b;

    public esai(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
