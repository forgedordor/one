package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalOf;
        Optional.empty();
        Optional optionalEmpty = Optional.empty();
        int i = new int[]{1, 2}[((Integer) efmp.d(parcel, 1).get()).intValue()];
        if (i == 0) {
            throw new NullPointerException("Null state");
        }
        if (efmp.s(parcel, 2)) {
            parcel.readInt();
            optionalOf = Optional.of(Duration.ofSeconds(parcel.readLong()));
        } else {
            optionalOf = Optional.empty();
        }
        Optional optionalOf2 = Optional.of(optionalOf.get());
        Optional optionalC = efmp.c(parcel, 3);
        if (optionalC.isPresent()) {
            optionalEmpty = Optional.of(optionalC.get());
        }
        efmp.j(parcel);
        return new efce(i, optionalOf2, optionalEmpty);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efem[i];
    }
}
