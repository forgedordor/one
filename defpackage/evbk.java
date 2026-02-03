package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<evbk> CREATOR = new evbl();
    public final String a;
    public final Rect b;
    public final List c;
    public final float d;
    public final float e;

    public evbk(String str, Rect rect, List list, float f, float f2) {
        this.a = str;
        this.b = rect;
        this.c = list;
        this.d = f;
        this.e = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.n(parcel, 3, this.c, false);
        dclw.h(parcel, 4, this.d);
        dclw.h(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}
