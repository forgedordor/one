package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjg extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sjg> CREATOR = new sjh();
    public final String a;
    public final String b;
    public final sjd c;

    public sjg(String str, String str2, sjd sjdVar) {
        this.a = str;
        this.b = str2;
        this.c = sjdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
