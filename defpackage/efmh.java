package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efmh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        Instant instant;
        String str2;
        efcj efcjVar = new efcj();
        efcjVar.d(efez.values()[((Integer) efmp.d(parcel, 1).get()).intValue()]);
        efcjVar.b = (String) efmp.h(parcel, 2).get();
        efcjVar.c = (Instant) efmp.c(parcel, 3).get();
        efcjVar.c((String) efmp.h(parcel, 4).get());
        efmp.j(parcel);
        if (efcjVar.b().isPresent()) {
            if (!efcjVar.a().g.contains(efcjVar.b().get())) {
                efcjVar.d(efez.UNKNOWN);
                efcjVar.c(efcjVar.a().f);
            }
        } else {
            efcjVar.c(efcjVar.a().f);
        }
        efez efezVar = efcjVar.a;
        if (efezVar != null && (str = efcjVar.b) != null && (instant = efcjVar.c) != null && (str2 = efcjVar.d) != null) {
            return new efck(efezVar, str, instant, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (efcjVar.a == null) {
            sb.append(" type");
        }
        if (efcjVar.b == null) {
            sb.append(" messageId");
        }
        if (efcjVar.c == null) {
            sb.append(" timestamp");
        }
        if (efcjVar.d == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new effa[i];
    }
}
