package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<evbe> CREATOR = new evbf();
    public final String a;
    public final Rect b;
    public final List c;
    public final String d;
    public final List e;
    public final float f;
    public final float g;

    public evbe(String str, Rect rect, List list, String str2, List list2, float f, float f2) {
        this.a = str;
        this.b = rect;
        this.c = list;
        this.d = str2;
        this.e = list2;
        this.f = f;
        this.g = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.n(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.n(parcel, 5, this.e, false);
        dclw.h(parcel, 6, this.f);
        dclw.h(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }
}
