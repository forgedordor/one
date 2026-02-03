package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ethk ethkVar;
        String string = parcel.readString();
        evhv evhvVar = null;
        try {
            ethkVar = (ethk) ProtoParsers.a(parcel, ethk.a, evrr.a());
        } catch (evtj e) {
            ((eksl) ((eksl) ((eksl) dsbi.b.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/common/PromoContext$1", "createFromParcel", (char) 129, "PromoContext.java")).q("Failed to read promotion from parcel");
            ethkVar = null;
        }
        long j = parcel.readLong();
        eksp ekspVar = dsbi.b;
        ekgi ekgiVar = new ekgi();
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            ekgiVar.i(etli.b(parcel.readInt()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()));
        }
        ekgp ekgpVarC = ekgiVar.c();
        String string2 = parcel.readString();
        if (parcel.readInt() > 0) {
            try {
                evhvVar = (evhv) ProtoParsers.a(parcel, evhv.a, evrr.a());
            } catch (evtj e2) {
                ((eksl) ((eksl) ((eksl) dsbi.b.i()).g(e2)).h("com/google/android/libraries/internal/growth/growthkit/internal/common/PromoContext$1", "createFromParcel", (char) 145, "PromoContext.java")).q("Failed to read versioned identifier from parcel");
            }
        }
        dsbh dsbhVarG = dsbi.g();
        dsbb dsbbVar = (dsbb) dsbhVarG;
        dsbbVar.a = string;
        dsbhVarG.c(ethkVar);
        dsbhVarG.d(j);
        dsbhVarG.b(ekgpVarC);
        dsbbVar.b = evhvVar;
        dsbbVar.c = string2;
        return dsbhVarG.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dsbi[i];
    }
}
