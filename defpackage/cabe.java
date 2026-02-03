package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabe implements caar {
    public static final int a;
    public final Map b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcyh f;

    static {
        Object objE = cpyl.C.e();
        objE.getClass();
        a = ((Number) objE).intValue();
    }

    public cabe(Map map, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcyhVar.getClass();
        this.b = map;
        this.d = fcsuVar;
        this.c = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcyhVar;
    }

    @Override // defpackage.caas
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        byit byitVar = ((byir) obj).c;
        if (byitVar == null) {
            byitVar = byit.a;
        }
        return byitVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [cmfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.byiq r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.caba
            if (r0 == 0) goto L13
            r0 = r8
            caba r0 = (defpackage.caba) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caba r0 = new caba
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L80
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r8)
            aumd r8 = defpackage.aumd.a
            evsf r8 = r8.createBuilder()
            aumc r8 = (defpackage.aumc) r8
            r8.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r8.instance
            aumd r2 = (defpackage.aumd) r2
            r2.c = r3
            int r4 = r2.b
            r4 = r4 | r3
            r2.b = r4
            evsn r8 = r8.build()
            r8.getClass()
            fcsu r2 = r6.d
            aumd r8 = (defpackage.aumd) r8
            java.lang.Object r2 = r2.b()
            aurx r2 = (defpackage.aurx) r2
            java.lang.String r7 = r7.name()
            ejxr r4 = r2.e
            java.lang.Object r4 = r4.get()
            auqg r5 = new auqg
            r5.<init>()
            eiju r7 = r4.j(r5)
            auqh r8 = new auqh
            r8.<init>()
            eosc r2 = r2.f
            eiju r7 = r7.h(r8, r2)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 != r1) goto L80
            return r1
        L80:
            cbcw r7 = defpackage.cbcw.i()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cabe.b(byiq, fcxy):java.lang.Object");
    }

    @Override // defpackage.caar
    public final /* bridge */ /* synthetic */ Object d(Object obj, cayy cayyVar, Object obj2, fcxy fcxyVar) {
        byir byirVar = (byir) obj2;
        byiq byiqVarB = byiq.b(byirVar.d);
        if (byiqVarB == null) {
            byiqVarB = byiq.UNSPECIFIED;
        }
        byiqVarB.getClass();
        byit byitVar = byirVar.c;
        if (byitVar == null) {
            byitVar = byit.a;
        }
        if (byitVar.f <= 0) {
            ((ains) this.e.b()).e("Bugle.Cms.Backfill.MissingFieldTask.Count", byiqVarB.e);
        }
        byit byitVar2 = byirVar.c;
        if (byitVar2 == null) {
            byitVar2 = byit.a;
        }
        int i = byitVar2.d;
        if (i != 1) {
            if (i == 2) {
                return fdin.a(eicg.a(this.f), new cabb(null, byirVar, this), fcxyVar);
            }
            if (i == 3) {
                return fdin.a(eicg.a(this.f), new cabd(null, byirVar, this), fcxyVar);
            }
            if (i != 5) {
                return cbcw.k();
            }
        }
        return fdin.a(eicg.a(this.f), new cabc(null, byirVar, this), fcxyVar);
    }
}
