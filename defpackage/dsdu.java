package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdu implements dsdm {
    public static final eksp a = eksp.c("GnpSdk");
    public final dxmn b;
    public final eygg c;
    public final Context d;
    public final diep e;
    public final dxml f;
    public final dxml g;
    public final dxml h;
    public final dxml i;
    private final fcyh j;

    public dsdu(dxmn dxmnVar, eygg eyggVar, fcyh fcyhVar, Context context, Map map, diep diepVar) {
        dxmnVar.getClass();
        eyggVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        diepVar.getClass();
        this.b = dxmnVar;
        this.c = eyggVar;
        this.j = fcyhVar;
        this.d = context;
        this.e = diepVar;
        Object obj = map.get("GK_ONEOFF_SYNC");
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f = (dxml) obj;
        Object obj2 = map.get("GK_PERIODIC_SYNC");
        if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.g = (dxml) obj2;
        Object obj3 = map.get("GK_STORAGE_CLEANUP");
        if (obj3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.h = (dxml) obj3;
        this.i = (dxml) map.get("GK_PERMISSIONS_STATE_LOGGING");
    }

    @Override // defpackage.dsdm
    public final Object a(fcxy fcxyVar) {
        Object objA = fdin.a(this.j, new dsdq(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dsdm
    public final Object b(fcxy fcxyVar) {
        Object objA = fdin.a(this.j, new dsdr(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dsds
            if (r0 == 0) goto L13
            r0 = r8
            dsds r0 = (defpackage.dsds) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsds r0 = new dsds
            r0.<init>(r7, r8)
        L18:
            r5 = r0
            java.lang.Object r8 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r8)
            goto L50
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            defpackage.fctl.b(r8)
            fbdp r8 = defpackage.fbdp.a
            fbdq r8 = r8.get()
            boolean r8 = r8.g()
            if (r8 == 0) goto L54
            dxmn r1 = r7.b
            r8 = r2
            dxml r2 = r7.f
            r5.c = r8
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r8 = defpackage.dxmm.b(r1, r2, r3, r4, r5, r6)
            if (r8 == r0) goto L53
        L50:
            dxft r8 = (defpackage.dxft) r8
            goto L54
        L53:
            return r0
        L54:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsdu.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dsdt
            if (r0 == 0) goto L13
            r0 = r10
            dsdt r0 = (defpackage.dsdt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsdt r0 = new dsdt
            r0.<init>(r9, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r7 = 3
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L3a
            if (r1 == r8) goto L36
            if (r1 != r7) goto L2e
            defpackage.fctl.b(r10)
            goto L7c
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            defpackage.fctl.b(r10)
            goto L64
        L3a:
            defpackage.fctl.b(r10)
            goto L52
        L3e:
            defpackage.fctl.b(r10)
            dxmn r1 = r9.b
            r10 = r2
            dxml r2 = r9.g
            r5.c = r10
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.dxmm.b(r1, r2, r3, r4, r5, r6)
            if (r10 == r0) goto L81
        L52:
            dxft r10 = (defpackage.dxft) r10
            dxmn r1 = r9.b
            dxml r2 = r9.h
            r5.c = r8
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.dxmm.b(r1, r2, r3, r4, r5, r6)
            if (r10 == r0) goto L81
        L64:
            dxft r10 = (defpackage.dxft) r10
            dxml r2 = r9.i
            if (r2 == 0) goto L7e
            boolean r10 = defpackage.dske.a
            if (r10 == 0) goto L7e
            dxmn r1 = r9.b
            r5.c = r7
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.dxmm.b(r1, r2, r3, r4, r5, r6)
            if (r10 == r0) goto L81
        L7c:
            dxft r10 = (defpackage.dxft) r10
        L7e:
            fctx r10 = defpackage.fctx.a
            return r10
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsdu.d(fcxy):java.lang.Object");
    }
}
