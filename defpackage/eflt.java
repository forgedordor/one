package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional optionalEmpty3 = Optional.empty();
        Optional optionalEmpty4 = Optional.empty();
        Optional optionalEmpty5 = Optional.empty();
        Optional optionalEmpty6 = Optional.empty();
        int iA = efmp.a(parcel);
        boolean z = false;
        Optional optionalOf = optionalEmpty;
        Optional optionalOf2 = optionalEmpty2;
        Optional optionalOf3 = optionalEmpty3;
        Optional optionalOf4 = optionalEmpty4;
        Optional optionalOf5 = optionalEmpty5;
        Optional optionalOf6 = optionalEmpty6;
        String str = null;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 0.0d;
        int i = 0;
        while (iA != Integer.MIN_VALUE) {
            switch (iA) {
                case 1:
                    str = (String) efmp.h(parcel, iA).get();
                    break;
                case 2:
                    optionalOf = Optional.of(efmp.c(parcel, iA).get());
                    break;
                case 3:
                    optionalOf2 = Optional.of(efmp.c(parcel, iA).get());
                    break;
                case 4:
                    optionalOf3 = Optional.of((String) efmp.h(parcel, iA).get());
                    break;
                case 5:
                    optionalOf4 = Optional.of((String) efmp.h(parcel, iA).get());
                    break;
                case 6:
                    i |= 1;
                    dDoubleValue = ((Double) efmp.b(parcel, iA).get()).doubleValue();
                    break;
                case 7:
                    i |= 2;
                    dDoubleValue2 = ((Double) efmp.b(parcel, iA).get()).doubleValue();
                    break;
                case 8:
                    Double d = (Double) efmp.b(parcel, iA).get();
                    d.doubleValue();
                    optionalOf5 = Optional.of(d);
                    break;
                case 9:
                    optionalOf6 = Optional.of((String) efmp.h(parcel, iA).get());
                    break;
                default:
                    efmp.i(parcel, iA);
                    break;
            }
            iA = efmp.a(parcel);
        }
        ejwl.a(efmp.e(parcel).isPresent());
        if (i != 3 || str == null) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                sb.append(" id");
            }
            if ((i & 1) == 0) {
                sb.append(" longitude");
            }
            if ((i & 2) == 0) {
                sb.append(" latitude");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        efcg efcgVar = new efcg(optionalOf, str, optionalOf2, optionalOf3, optionalOf4, dDoubleValue, dDoubleValue2, optionalOf5, optionalOf6);
        double d2 = efcgVar.b;
        ejwl.m(d2 >= -180.0d && d2 <= 180.0d, "Latitude must be between -180 and 180.");
        double d3 = efcgVar.a;
        if (d3 >= -180.0d && d3 <= 180.0d) {
            z = true;
        }
        ejwl.m(z, "Longitude must be between -180 and 180.");
        efcgVar.c.ifPresent(new Consumer() { // from class: efeq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ejwl.m(((Double) obj).doubleValue() >= 0.0d, "Radius must be non-negative.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return efcgVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efer[i];
    }
}
