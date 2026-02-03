package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class eajy implements deeq {
    @Override // defpackage.deeq
    public final Object a(defn defnVar) {
        Exception excH = defnVar.h();
        if (excH != null) {
            return degc.b(excH instanceof dcff ? (dcff) excH : excH instanceof fbtf ? eajd.a((fbtf) excH) : ((excH instanceof ExecutionException) && (excH.getCause() instanceof fbtf)) ? eajd.a((fbtf) excH.getCause()) : new dcff(new Status(13, excH.toString())));
        }
        return defnVar;
    }
}
