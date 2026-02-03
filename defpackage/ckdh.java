package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdh implements bayb {
    public final fcsu a;
    public Instant b;
    private final fdjx c;
    private final fcyh d;
    private final arvu e;
    private final fcsu f;
    private basd g;
    private MessageIdType h;

    public ckdh(fdjx fdjxVar, fcyh fcyhVar, arvu arvuVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        arvuVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = fdjxVar;
        this.d = fcyhVar;
        this.e = arvuVar;
        this.a = fcsuVar;
        this.f = fcsuVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ckdg
            if (r0 == 0) goto L13
            r0 = r14
            ckdg r0 = (defpackage.ckdg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ckdg r0 = new ckdg
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r14)
            goto L9a
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            java.lang.Object r13 = r0.a
            defpackage.fctl.b(r14)
            goto L5f
        L3a:
            defpackage.fctl.b(r14)
            r0.a = r13
            r0.d = r4
            basd r14 = r12.g
            if (r14 != 0) goto L47
        L45:
            r14 = r5
            goto L5d
        L47:
            java.lang.String r2 = r13.aB()
            if (r2 != 0) goto L4e
            goto L45
        L4e:
            fcyh r4 = r12.d
            fcyh r4 = defpackage.eicg.a(r4)
            ckdf r6 = new ckdf
            r6.<init>(r5, r12, r14, r2)
            java.lang.Object r14 = defpackage.fdin.a(r4, r6, r0)
        L5d:
            if (r14 == r1) goto L9d
        L5f:
            fcsu r2 = r12.f
            j$.time.Duration r14 = (j$.time.Duration) r14
            java.lang.Object r2 = r2.b()
            ckcp r2 = (defpackage.ckcp) r2
            ckcw r6 = new ckcw
            long r7 = r13.t()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9 = r12.h
            if (r14 != 0) goto L75
            j$.time.Duration r14 = j$.time.Duration.ZERO
        L75:
            r10 = r14
            r10.getClass()
            basd r11 = defpackage.ckdi.a(r13)
            r6.<init>(r7, r9, r10, r11)
            r0.a = r5
            r0.d = r3
            fcyh r13 = r2.a
            fcyh r13 = defpackage.eicg.a(r13)
            ckco r14 = new ckco
            r14.<init>(r5, r2, r6)
            java.lang.Object r13 = defpackage.fdin.a(r13, r14, r0)
            if (r13 == r1) goto L97
            fctx r13 = defpackage.fctx.a
        L97:
            if (r13 != r1) goto L9a
            goto L9d
        L9a:
            fctx r13 = defpackage.fctx.a
            return r13
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckdh.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (this.e.a()) {
            if (this.g == null && this.b == null) {
                return;
            }
            auvw.k(this.c, null, null, new ckde(this, messageCoreData, null), 3);
        }
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        if (!this.e.a()) {
            return;
        }
        eieu eieuVarH = eiiy.h("DeleteOnRcsMessageReceivedListener#beforeMessageInserted");
        try {
            basd basdVarA = ckdi.a(messageCoreData);
            this.g = basdVarA;
            if (basdVarA == null) {
                fczl.a(eieuVarH, null);
                return;
            }
            messageCoreData.bx(true);
            this.b = Instant.ofEpochMilli(messageCoreData.o());
            messageCoreData.bz(true);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        eieu eieuVarH = eiiy.h("DeleteOnRcsMessageReceivedListener#onInsertedInTransaction");
        try {
            ckdc ckdcVar = (ckdc) this.a.b();
            basd basdVar = this.g;
            if (basdVar == null) {
                fczl.a(eieuVarH, null);
                return;
            }
            String strAB = messageCoreData.aB();
            if (strAB == null) {
                fczl.a(eieuVarH, null);
            } else {
                this.h = ckdcVar.a(basdVar, strAB);
                fczl.a(eieuVarH, null);
            }
        } finally {
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
