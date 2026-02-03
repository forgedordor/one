package defpackage;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deoa {
    public final denz a;

    private deoa(denv denvVar) {
        denz denzVarA;
        denvVar.a();
        denv denvVar2 = (denv) denvVar.d();
        byte[] bArrC = denvVar2.c();
        if (bArrC == null && !denvVar2.b().isEmpty()) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (bArrC == null) {
            denzVarA = new denz();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = denvVar2.b().size();
                for (int i = 0; i < size; i++) {
                    denw denwVar = (denw) denvVar2.b().get(Integer.toString(i));
                    if (denwVar == null) {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i + " for " + denvVar2.toString());
                    }
                    String strB = denwVar.b();
                    dclh.m(strB);
                    arrayList.add(new Asset(null, strB, null, null));
                }
                evrr evrrVar = evrr.a;
                evuq evuqVar = evuq.a;
                denzVarA = deur.a(new deuq((devb) evsn.parseFrom(devb.a, bArrC, evrr.a), arrayList));
            } catch (evtj | NullPointerException e) {
                Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + String.valueOf(denvVar2.a()) + ", data=" + Base64.encodeToString(bArrC, 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(String.valueOf(denvVar2.a()))), e);
            }
        }
        this.a = denzVarA;
    }

    public static deoa a(denv denvVar) {
        dcjr.a(denvVar, "dataItem must not be null");
        return new deoa(denvVar);
    }
}
