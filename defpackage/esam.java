package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esam> CREATOR = new esan();
    public final List a;
    public final String b;
    public final String c;

    public esam(List list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, list);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
