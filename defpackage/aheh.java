package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aheh extends fcyz implements fdat {
    int a;
    final /* synthetic */ aher b;
    final /* synthetic */ ResolvedRecipient c;
    Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aheh(fcxy fcxyVar, aher aherVar, ResolvedRecipient resolvedRecipient) {
        super(2, fcxyVar);
        this.b = aherVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aheh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Map map;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.d;
            map = (Map) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            aher aherVar = this.b;
            ResolvedRecipient resolvedRecipient = this.c;
            ConcurrentHashMap concurrentHashMap = aherVar.j;
            anue anueVarF = resolvedRecipient.F();
            eiju eijuVarB = resolvedRecipient.E(2).b();
            eijuVarB.getClass();
            this.e = concurrentHashMap;
            this.d = anueVarF;
            this.a = 1;
            Object objC = fdxs.c(eijuVarB, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            map = concurrentHashMap;
            obj = objC;
            obj2 = anueVarF;
        }
        map.put(obj2, obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aheh ahehVar = new aheh(fcxyVar, this.b, this.c);
        ahehVar.e = obj;
        return ahehVar;
    }
}
