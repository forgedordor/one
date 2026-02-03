package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgd implements vdy {
    public final fdjx a;
    public final fduf b;
    private final fdjx c;
    private final ahax d;
    private final List e;
    private final fdpl f;
    private final Set g;

    public vgd(fdjx fdjxVar, Context context, fdjx fdjxVar2, cqky cqkyVar, ahax ahaxVar, List list) {
        fdjxVar.getClass();
        context.getClass();
        fdjxVar2.getClass();
        cqkyVar.getClass();
        ahaxVar.getClass();
        this.a = fdjxVar;
        this.c = fdjxVar2;
        this.d = ahaxVar;
        this.e = list;
        fduf fdufVarA = fdvf.a(false);
        this.b = fdufVarA;
        auvw.k(fdjxVar2, null, null, new vfw(this, cqkyVar, null), 3);
        this.f = new vgc(fdufVarA, context, this);
        this.g = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:19:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.vfz
            if (r0 == 0) goto L13
            r0 = r6
            vfz r0 = (defpackage.vfz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            vfz r0 = new vfz
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.fctl.b(r6)
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            java.util.List r6 = r5.e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r2
            r2 = r6
        L43:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r2.next()
            xtr r6 = (defpackage.xtr) r6
            fdpl r6 = r6.a()
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = defpackage.fdtc.c(r6, r0)
            if (r6 == r1) goto L67
        L5f:
            xtt r6 = (defpackage.xtt) r6
            if (r6 == 0) goto L43
            r4.add(r6)
            goto L43
        L67:
            return r1
        L68:
            ahax r6 = r5.d
            vfu r0 = new vfu
            r0.<init>()
            r6.b(r0)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vgd.c(fcxy):java.lang.Object");
    }
}
