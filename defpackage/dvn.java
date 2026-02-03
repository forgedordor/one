package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvn {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (c(r7) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:19:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ire r7, defpackage.iru r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.dvl
            if (r0 == 0) goto L13
            r0 = r9
            dvl r0 = (defpackage.dvl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvl r0 = new dvl
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            iru r7 = r0.d
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.fctl.b(r9)
            boolean r9 = c(r7)
            if (r9 != 0) goto L65
        L3f:
            r0.a = r7
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r7.r(r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            irs r9 = (defpackage.irs) r9
            java.util.List r9 = r9.a
            int r2 = r9.size()
            r4 = 0
        L55:
            if (r4 >= r2) goto L65
            java.lang.Object r5 = r9.get(r4)
            ise r5 = (defpackage.ise) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L62
            goto L3f
        L62:
            int r4 = r4 + 1
            goto L55
        L65:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvn.a(ire, iru, fcxy):java.lang.Object");
    }

    public static final Object b(isn isnVar, fdat fdatVar, fcxy fcxyVar) {
        Object objQ = isnVar.q(new dvm(fcxyVar.u(), fdatVar, null), fcxyVar);
        return objQ == fcyl.a ? objQ : fctx.a;
    }

    public static final boolean c(ire ireVar) {
        List list = ireVar.p().a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ise) list.get(i)).d) {
                return false;
            }
        }
        return true;
    }
}
