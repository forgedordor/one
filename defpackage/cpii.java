package defpackage;

import android.net.Uri;
import android.provider.BlockedNumberContract;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpii {
    public static final /* synthetic */ int c = 0;
    private static final Uri d = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
    private static final String[] e = {"e164_number", "original_number"};
    public final fcsu a;
    public volatile boolean b;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fdjx q;
    private final eizx r;
    private volatile Set s;

    public cpii(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fdjxVar.getClass();
        this.f = fcsuVar;
        this.a = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = fcsuVar11;
        this.o = fcsuVar12;
        this.p = fcsuVar13;
        this.q = fdjxVar;
        this.r = new eizx();
        this.s = fcvq.a;
    }

    private final void f(Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e((String) it.next(), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.cpid
            if (r0 == 0) goto L13
            r0 = r11
            cpid r0 = (defpackage.cpid) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpid r0 = new cpid
            r0.<init>(r10, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            eieu r1 = r6.d
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L2b
            goto L69
        L2b:
            r0 = move-exception
            goto L99
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            defpackage.fctl.b(r11)
            java.lang.String r11 = "BlockListResolver#getUpdatedList#querySystem"
            eieu r11 = defpackage.eiiy.h(r11)
            fcsu r1 = r10.m     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L97
            egqi r1 = (defpackage.egqi) r1     // Catch: java.lang.Throwable -> L97
            r3 = r2
            android.net.Uri r2 = defpackage.cpii.d     // Catch: java.lang.Throwable -> L97
            r2.getClass()     // Catch: java.lang.Throwable -> L97
            r4 = r3
            java.lang.String[] r3 = defpackage.cpii.e     // Catch: java.lang.Throwable -> L97
            r5 = r4
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L97
            r4.<init>()     // Catch: java.lang.Throwable -> L97
            r8 = r5
            cpie r5 = new cpie     // Catch: java.lang.Throwable -> L97
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L97
            r6.d = r11     // Catch: java.lang.Throwable -> L97
            r6.c = r8     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L97
            if (r1 == r0) goto L96
            r9 = r1
            r1 = r11
            r11 = r9
        L69:
            ekgb r11 = (defpackage.ekgb) r11     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L2b
        L74:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Throwable -> L2b
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2b
            r3.getClass()     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L2b
            if (r3 <= 0) goto L74
            r0.add(r2)     // Catch: java.lang.Throwable -> L2b
            goto L74
        L8e:
            java.util.Set r11 = defpackage.fcva.av(r0)     // Catch: java.lang.Throwable -> L2b
            defpackage.fczl.a(r1, r7)
            return r11
        L96:
            return r0
        L97:
            r0 = move-exception
            r1 = r11
        L99:
            r11 = r0
            fcsu r0 = r10.l     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> Lad
            cden r0 = (defpackage.cden) r0     // Catch: java.lang.Throwable -> Lad
            eiju r11 = r0.b(r11)     // Catch: java.lang.Throwable -> Lad
            defpackage.auvh.h(r11)     // Catch: java.lang.Throwable -> Lad
            defpackage.fczl.a(r1, r7)
            return r7
        Lad:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            defpackage.fczl.a(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpii.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpii.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cpig
            if (r0 == 0) goto L13
            r0 = r5
            cpig r0 = (defpackage.cpig) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpig r0 = new cpig
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 == r1) goto L6c
        L3a:
            java.util.Set r5 = (java.util.Set) r5
            if (r5 != 0) goto L41
            fctx r5 = defpackage.fctx.a
            return r5
        L41:
            java.lang.String r0 = "BlockListResolver#resolve#transformNewBlockList"
            eieu r0 = defpackage.eiiy.h(r0)
            java.util.Set r1 = r4.s     // Catch: java.lang.Throwable -> L65
            r4.s = r5     // Catch: java.lang.Throwable -> L65
            java.util.Set r5 = r4.s     // Catch: java.lang.Throwable -> L65
            java.util.Set r5 = defpackage.fcva.at(r5, r1)     // Catch: java.lang.Throwable -> L65
            java.util.Set r2 = r4.s     // Catch: java.lang.Throwable -> L65
            java.util.Set r1 = defpackage.fcva.at(r1, r2)     // Catch: java.lang.Throwable -> L65
            r4.f(r5, r3)     // Catch: java.lang.Throwable -> L65
            r5 = 0
            r4.f(r1, r5)     // Catch: java.lang.Throwable -> L65
            r5 = 0
            defpackage.fczl.a(r0, r5)
            fctx r5 = defpackage.fctx.a
            return r5
        L65:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            defpackage.fczl.a(r0, r5)
            throw r1
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpii.c(fcxy):java.lang.Object");
    }

    public final void d() {
        auvh.h(auvw.a(ejaa.a(this.q, this.r, new cpih(this, null))));
    }

    public final void e(String str, boolean z) {
        ParticipantsTable.BindData bindDataD = ((bbca) this.j.b()).d(str);
        ConversationIdType conversationIdType = (ConversationIdType) ((avpc) this.i.b()).o(str).orElseGet(new Supplier() { // from class: cpia
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = cpii.c;
                return barn.a;
            }
        });
        cryl crylVarB = ((cryk) this.o.b()).b(bindDataD, ((bakt) this.p.b()).s(conversationIdType));
        str.getClass();
        ((cpjp) this.f.b()).b(cpim.a(z, str, true, true, crylVarB, 3, 8, 2, 4));
        if (z || bindDataD == null || !bindDataD.aa() || !csdm.a(bindDataD.o()).e()) {
            return;
        }
        if (!conversationIdType.b()) {
            ((cruf) this.h.b()).b(cruh.b(false, conversationIdType, bindDataD.R(), null, true, true, elka.CONVERSATION_FROM_UNBLOCK_ACTION, crylVarB, null, 3, 8, 2, 52));
            return;
        }
        String strR = bindDataD.R();
        if (strR == null || fdgn.H(strR)) {
            return;
        }
        csea cseaVar = (csea) this.k.b();
        String strR2 = bindDataD.R();
        strR2.getClass();
        cseaVar.j(new cspo(strR2), csdl.b, false);
    }
}
