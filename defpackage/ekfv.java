package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfv {
    public static final /* synthetic */ ekgb a(Collection collection) {
        collection.getClass();
        ekgb ekgbVarN = ekgb.n(collection);
        ekgbVarN.getClass();
        return ekgbVarN;
    }

    public static final /* synthetic */ ekgb b(fdev fdevVar) {
        ekgb ekgbVarO = ekgb.o(fdevVar.a());
        ekgbVarO.getClass();
        return ekgbVarO;
    }

    public static final /* synthetic */ ekgb c(Object[] objArr) {
        ekgb ekgbVarP = ekgb.p(objArr);
        ekgbVarP.getClass();
        return ekgbVarP;
    }

    public static final /* synthetic */ ekgp d(Iterable iterable) {
        ekgi ekgiVar = new ekgi();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fcti fctiVar = (fcti) it.next();
            Object obj = fctiVar.a;
            Object obj2 = fctiVar.b;
            obj.getClass();
            obj2.getClass();
            ekgiVar.i(obj, obj2);
        }
        return ekgiVar.c();
    }

    public static final /* synthetic */ ekgp e(Map map) {
        map.getClass();
        ekgp ekgpVarJ = ekgp.j(map);
        ekgpVarJ.getClass();
        return ekgpVarJ;
    }

    public static final /* synthetic */ ekhx f(Collection collection) {
        collection.getClass();
        ekhx ekhxVarO = ekhx.o(collection);
        ekhxVarO.getClass();
        return ekhxVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(defpackage.fdpl r4, defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.ekft
            if (r0 == 0) goto L13
            r0 = r5
            ekft r0 = (defpackage.ekft) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ekft r0 = new ekft
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ekfw r4 = r0.c
            defpackage.fctl.b(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r5)
            int r5 = defpackage.ekgb.d
            ekfw r5 = new ekfw
            r5.<init>()
            ekfu r2 = new ekfu
            r2.<init>(r5)
            r0.c = r5
            r0.b = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            ekgb r4 = r4.g()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekfv.g(fdpl, fcxy):java.lang.Object");
    }
}
