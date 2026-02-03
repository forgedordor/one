package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sii extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sii> CREATOR = new sij();
    public final ParcelFileDescriptor a;
    public final String b;

    public sii(ParcelFileDescriptor parcelFileDescriptor, String str) {
        this.a = parcelFileDescriptor;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
