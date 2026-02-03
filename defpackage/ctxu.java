package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxu {
    public final cudy a;
    public final Object b;
    public final Map c;
    private final fdjx d;
    private final fcyh e;
    private final anty f;

    public ctxu(fdjx fdjxVar, fcyh fcyhVar, cudy cudyVar, anty antyVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        cudyVar.getClass();
        antyVar.getClass();
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.a = cudyVar;
        this.f = antyVar;
        this.b = new Object();
        this.c = new LinkedHashMap();
        auvw.k(fdjxVar, fcyhVar, null, new ctxt(this, null), 2);
    }

    public final ctxe a(alqm alqmVar) {
        Recipient recipientH = this.f.h(alqmVar);
        eiju eijuVarB = recipientH.E(1).b();
        eijuVarB.getClass();
        return new ctxe(recipientH, eijuVarB);
    }

    public final ctxe b(alqm alqmVar) {
        ctxe ctxeVar;
        alqmVar.getClass();
        synchronized (this.b) {
            Map map = this.c;
            Object objA = map.get(alqmVar);
            if (objA == null) {
                objA = a(alqmVar);
                map.put(alqmVar, objA);
            }
            ctxeVar = (ctxe) objA;
        }
        return ctxeVar;
    }
}
