package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxs implements fdpm {
    final /* synthetic */ ctxu a;

    public ctxs(ctxu ctxuVar) {
        this.a = ctxuVar;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ctxu ctxuVar = this.a;
        cudx cudxVar = (cudx) obj;
        synchronized (ctxuVar.b) {
            Iterator it = cudxVar.e.iterator();
            while (it.hasNext()) {
                alqm alqmVar = ((ChipData) it.next()).a;
                Map map = ctxuVar.c;
                if (map.get(alqmVar) == null) {
                    map.put(alqmVar, ctxuVar.a(alqmVar));
                }
            }
        }
        return fctx.a;
    }
}
