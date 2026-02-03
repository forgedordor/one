package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzu implements uzp {
    public final dzuc a;
    public final fcsu b;
    private final ejcf c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final ekrg j;
    private final cczi k;
    private String l;
    private final Map m;

    public uzu(ejcf ejcfVar, dzuc dzucVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        dzucVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.c = ejcfVar;
        this.a = dzucVar;
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteUiHandlerWithAccountImpl");
        this.k = cdag.n(280308823);
        this.m = new LinkedHashMap();
    }

    private final epis e(epis episVar) {
        if (!((Boolean) this.h.b()).booleanValue() || episVar.b.size() <= 0) {
            return episVar;
        }
        try {
            evtg evtgVar = episVar.b;
            evtgVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : evtgVar) {
                uwn uwnVar = (uwn) this.f.b();
                String str = ((epir) obj).b;
                str.getClass();
                if (!uwnVar.a(str)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                epip epipVar = (epip) epis.a.createBuilder();
                epipVar.getClass();
                epit.c(10, epipVar);
                return epit.a(epipVar);
            }
            epip epipVar2 = (epip) epis.a.createBuilder();
            epipVar2.getClass();
            DesugarCollections.unmodifiableList(((epis) epipVar2.instance).b).getClass();
            epit.b(arrayList, epipVar2);
            return epit.a(epipVar2);
        } catch (Exception e) {
            ekrw ekrwVarJ = this.j.j();
            ekrwVarJ.X(eksq.a, "BuglePenpal");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteUiHandlerWithAccountImpl", "filterSensitiveOutput", 255, "MagicRewriteUiHandlerWithAccountImpl.kt")).q("Exception running sensitive classifier");
            if (!((Boolean) this.i.b()).booleanValue()) {
                return episVar;
            }
            epip epipVar3 = (epip) epis.a.createBuilder();
            epipVar3.getClass();
            epit.c(10, epipVar3);
            return epit.a(epipVar3);
        }
    }

    @Override // defpackage.uzp
    public final eiju a(String str, epiv epivVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new uzt(this, str, epivVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, defpackage.epiv r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzu.b(java.lang.String, epiv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, defpackage.epiv r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.uzr
            if (r0 == 0) goto L13
            r0 = r15
            uzr r0 = (defpackage.uzr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uzr r0 = new uzr
            r0.<init>(r12, r15)
        L18:
            r9 = r0
            java.lang.Object r15 = r9.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r15)
            goto L8d
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            defpackage.fctl.b(r15)
            fcsu r15 = r12.b
            java.lang.Object r15 = r15.b()
            j$.util.Optional r15 = (j$.util.Optional) r15
            java.lang.Object r15 = r15.get()
            r1 = r15
            ejcj r1 = (defpackage.ejcj) r1
            cczi r15 = defpackage.crbf.bb
            java.lang.Object r15 = r15.e()
            java.lang.Number r15 = (java.lang.Number) r15
            long r3 = r15.longValue()
            int r4 = (int) r3
            fcsu r15 = r12.e
            java.lang.Object r15 = r15.b()
            java.lang.Number r15 = (java.lang.Number) r15
            long r5 = r15.longValue()
            int r5 = (int) r5
            cczi r15 = defpackage.crbf.bc
            java.lang.Object r3 = r15.e()
            java.lang.Number r3 = (java.lang.Number) r3
            long r6 = r3.longValue()
            r10 = 0
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 <= 0) goto L7f
            java.lang.Object r15 = r15.e()
            java.lang.Number r15 = (java.lang.Number) r15
            long r6 = r15.longValue()
            int r15 = (int) r6
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r15)
            goto L80
        L7f:
            r3 = 0
        L80:
            r6 = r3
            r9.c = r2
            r7 = 10
            r2 = r13
            r3 = r14
            java.lang.Object r15 = r1.c(r2, r3, r4, r5, r6, r7, r9)
            if (r15 == r0) goto Le1
        L8d:
            java.util.List r15 = (java.util.List) r15
            epis r13 = defpackage.epis.a
            evsf r13 = r13.createBuilder()
            epip r13 = (defpackage.epip) r13
            r13.getClass()
            defpackage.epit.d(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.fcva.p(r15, r0)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        Lac:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r15.next()
            ejce r0 = (defpackage.ejce) r0
            epir r1 = defpackage.epir.a
            evsf r1 = r1.createBuilder()
            epiq r1 = (defpackage.epiq) r1
            r1.getClass()
            java.lang.String r2 = r0.a
            defpackage.epiu.b(r2, r1)
            epiv r0 = r0.b
            int r0 = r0.a()
            defpackage.epiu.c(r0, r1)
            epir r0 = defpackage.epiu.a(r1)
            r14.add(r0)
            goto Lac
        Ld9:
            defpackage.epit.b(r14, r13)
            epis r13 = defpackage.epit.a(r13)
            return r13
        Le1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzu.c(java.lang.String, epiv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, defpackage.epiv r11, boolean r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzu.d(java.lang.String, epiv, boolean, fcxy):java.lang.Object");
    }
}
