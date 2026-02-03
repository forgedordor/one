package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<evbg> CREATOR = new evbh();
    public final String a;
    public final List b;

    public evbg(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.n(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
