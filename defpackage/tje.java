package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tje extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ tjf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tje(tjf tjfVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = tjfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        tje tjeVar = new tje(this.c, (fcxy) obj3);
        tjeVar.a = (ajlk) obj;
        tjeVar.b = (ekgb) obj2;
        return tjeVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r9 = this.a;
        Object obj2 = this.b;
        boolean z = false;
        if (r9.c() == ajlj.GROUP) {
            Map map = this.c.b;
            HashSet hashSet = new HashSet(map.keySet());
            ekqh it = ((ekgb) obj2).iterator();
            it.getClass();
            boolean z2 = false;
            while (it.hasNext()) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) it.next();
                if (resolvedRecipient.z() && !fdbq.f(map.get(resolvedRecipient.F()), true)) {
                    z2 = true;
                }
                map.put(resolvedRecipient.F(), Boolean.valueOf(resolvedRecipient.z()));
                hashSet.remove(resolvedRecipient.F());
            }
            Iterator it2 = hashSet.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                map.remove((anue) it2.next());
            }
            if (z2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
