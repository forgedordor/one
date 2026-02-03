package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpq implements ccpm {
    private final fcsu a;
    private final awyu b;
    private final awzf c;

    public ccpq(fcsu fcsuVar, awyu awyuVar, awzf awzfVar) {
        fcsuVar.getClass();
        awyuVar.getClass();
        awzfVar.getClass();
        this.a = fcsuVar;
        this.b = awyuVar;
        this.c = awzfVar;
    }

    private final aubq g(String str) {
        aubq aubqVarA = ((asqx) this.a.b()).a(str, false);
        aubqVarA.getClass();
        return aubqVarA;
    }

    @Override // defpackage.ccpm
    public final ccpl a(ccps ccpsVar) {
        String str = ccpsVar.b;
        str.getClass();
        return new ccpn(g(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ccpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccpp
            if (r0 == 0) goto L13
            r0 = r6
            ccpp r0 = (defpackage.ccpp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccpp r0 = new ccpp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            awzf r6 = r4.c
            r0.c = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            awyu r5 = r4.b
            awxn r6 = (defpackage.awxn) r6
            awyv r5 = r5.a(r6)
            j$.util.Optional r5 = r5.c()
            ccpo r6 = new ccpo
            r6.<init>()
            java.lang.Object r5 = r5.orElseThrow(r6)
            java.lang.String r5 = (java.lang.String) r5
            ccpn r6 = new ccpn
            r5.getClass()
            aubq r5 = r4.g(r5)
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccpq.b(axcm, fcxy):java.lang.Object");
    }

    @Override // defpackage.ccpm
    public final Object c(aubq aubqVar) {
        return new ccpn(aubqVar);
    }

    @Override // defpackage.ccpm
    public final Object d(aufh aufhVar) {
        aubq aubqVar = aufhVar.h;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubqVar.getClass();
        return new ccpn(aubqVar);
    }

    @Override // defpackage.ccpm
    public final Object e(MessageCoreData messageCoreData) {
        Optional optionalAg = messageCoreData.ag();
        optionalAg.getClass();
        return new ccpn((aubq) fdct.b(optionalAg));
    }

    @Override // defpackage.ccpm
    public final Object f(cbwd cbwdVar) {
        int i = cbwdVar.c;
        if (i == 2) {
            aufh aufhVar = (aufh) cbwdVar.d;
            aufhVar.getClass();
            return d(aufhVar);
        }
        if (i == 6) {
            ccps ccpsVar = ((cbug) cbwdVar.d).c;
            if (ccpsVar == null) {
                ccpsVar = ccps.a;
            }
            ccpsVar.getClass();
            return a(ccpsVar);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Missing transport context in MLS context for MLS identity.");
        }
        ccps ccpsVar2 = (ccps) cbwdVar.d;
        ccpsVar2.getClass();
        return a(ccpsVar2);
    }
}
