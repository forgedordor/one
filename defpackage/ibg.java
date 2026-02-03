package defpackage;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibg {
    public static final void a(Throwable th, fdae fdaeVar) {
        Collection collectionC;
        Object objInvoke;
        th.getClass();
        ibn ibnVar = null;
        if (fczi.a()) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            collectionC = fcur.c(suppressed);
        } else {
            Method method = fcze.b;
            collectionC = (method == null || (objInvoke = method.invoke(th, null)) == null) ? fcvo.a : fcur.c((Throwable[]) objInvoke);
        }
        if (!collectionC.isEmpty()) {
            Iterator it = collectionC.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof ibn) {
                    return;
                }
            }
        }
        try {
            List list = (List) fdaeVar.invoke();
            if (!list.isEmpty()) {
                ibnVar = new ibn(list);
            }
        } catch (Throwable th2) {
            ibnVar = th2;
        }
        if (ibnVar != null) {
            fcsw.a(th, ibnVar);
        }
    }
}
