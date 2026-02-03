package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        if (efmp.a(parcel) == 1) {
            Optional optionalH = efmp.h(parcel, 1);
            if (optionalH.isPresent()) {
                optionalEmpty = Optional.of((String) optionalH.get());
            }
        }
        Optional optional = optionalEmpty;
        int iIntValue = ((Integer) efmp.d(parcel, 2).get()).intValue();
        efdf efdfVar = (efdf) efmp.f(parcel, 3, efli.a).get();
        String str = (String) efmp.h(parcel, 4).get();
        Object obj = efmp.c(parcel, 5).get();
        efmp.j(parcel);
        return new efbt(optional, iIntValue, efdfVar, str, (Instant) obj, optionalEmpty2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new efdo[0];
    }
}
