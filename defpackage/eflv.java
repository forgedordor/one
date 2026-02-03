package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = (String) efmp.h(parcel, 1).get();
        String str2 = (String) efmp.h(parcel, 2).get();
        String str3 = (String) efmp.h(parcel, 3).get();
        ejwl.a(efmp.j(parcel).isPresent());
        return new efci(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efev[i];
    }
}
