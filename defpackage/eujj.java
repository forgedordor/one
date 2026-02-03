package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujj {
    public static final eujj a = new eujj(new ecgx(), new echd());
    public final ecer b;
    private final ecer c;

    public eujj(ecer ecerVar, ecer ecerVar2) {
        this.c = ecerVar;
        this.b = ecerVar2;
    }

    public final euhk a(String str, dtma dtmaVar, ecev ecevVar) throws eujk {
        dtlw dtlwVar = null;
        for (dtlw dtlwVar2 : dtmaVar.h) {
            if (true == dtlwVar2.c.equals(str)) {
                dtlwVar = dtlwVar2;
            }
        }
        if (dtlwVar != null) {
            return euhk.a((AssetFileDescriptor) ecevVar.c(Uri.parse(dtlwVar.d), this.c));
        }
        throw new eujk(a.a(str, "Could not find ", " in MDD file group."));
    }
}
