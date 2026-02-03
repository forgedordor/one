package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxk {
    public final sxe a;
    public final sty b;
    private final fcyh c;
    private final bxlc d;

    public sxk(fcyh fcyhVar, sxe sxeVar, bxlc bxlcVar, sty styVar) {
        fcyhVar.getClass();
        bxlcVar.getClass();
        this.c = fcyhVar;
        this.a = sxeVar;
        this.d = bxlcVar;
        this.b = styVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.sxp r6, defpackage.cayy r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.sxj
            if (r0 == 0) goto L13
            r0 = r8
            sxj r0 = (defpackage.sxj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sxj r0 = new sxj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.c
            fcyh r8 = defpackage.eicg.a(r8)
            sxi r2 = new sxi
            r4 = 0
            r2.<init>(r4, r6, r5, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxk.a(sxp, cayy, fcxy):java.lang.Object");
    }

    public final void b(sxp sxpVar, aonp aonpVar, String str) {
        String[] strArr = VmtTable.a;
        bvda bvdaVar = new bvda();
        bvdaVar.ap("SodaFileTranscriptionHandler#updateStatus");
        bvdaVar.d(aonpVar);
        if (str != null) {
            bvdaVar.c(str);
        }
        String str2 = sxpVar.b;
        bvdc bvdcVar = new bvdc();
        bvdcVar.b(str2);
        bvdaVar.aj(new bvdb(bvdcVar), "vmt-buildAndUpdateForPartId");
        this.d.l(barn.b(sxpVar.e), bary.b(sxpVar.f), new String[0]);
    }
}
