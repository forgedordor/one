package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciqt implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet");
    public final fdjx b;
    public final Context c;
    public final crnp d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final cmqj i;
    public final bbdl j;
    public final dqsn k;
    public final fcsu l;
    public final fcsu m;
    public final ecjh n;
    public final cogw o;
    public final fctc p;
    private final fcyh q;
    private final ains r;
    private final alrj s;
    private final avpc t;
    private final aofc u;
    private final fcsu v;
    private final fcsu w;
    private final cqba x;

    public ciqt(fdjx fdjxVar, fcyh fcyhVar, cqba cqbaVar, Context context, ains ainsVar, crnp crnpVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cmqj cmqjVar, alrj alrjVar, avpc avpcVar, bbdl bbdlVar, aofc aofcVar, dqsn dqsnVar, fcsu fcsuVar5, fcsu fcsuVar6, ecjh ecjhVar, cogw cogwVar, fcsu fcsuVar7, fcsu fcsuVar8) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        cqbaVar.getClass();
        context.getClass();
        ainsVar.getClass();
        crnpVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cmqjVar.getClass();
        alrjVar.getClass();
        avpcVar.getClass();
        bbdlVar.getClass();
        aofcVar.getClass();
        dqsnVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        ecjhVar.getClass();
        cogwVar.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        this.b = fdjxVar;
        this.q = fcyhVar;
        this.x = cqbaVar;
        this.c = context;
        this.r = ainsVar;
        this.d = crnpVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = cmqjVar;
        this.s = alrjVar;
        this.t = avpcVar;
        this.j = bbdlVar;
        this.u = aofcVar;
        this.k = dqsnVar;
        this.l = fcsuVar5;
        this.m = fcsuVar6;
        this.n = ecjhVar;
        this.o = cogwVar;
        this.v = fcsuVar7;
        this.w = fcsuVar8;
        this.p = fctd.a(new fdae() { // from class: cipn
            @Override // defpackage.fdae
            public final Object invoke() {
                Object systemService = this.a.c.getSystemService("batterymanager");
                systemService.getClass();
                return (BatteryManager) systemService;
            }
        });
    }

    public static final List i(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            ArrayList arrayList2 = new ArrayList(fcva.p(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ParticipantsTable.BindData) it.next()).R());
            }
            if (!arrayList2.contains(bindData.R())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ehwh
    public final /* bridge */ /* synthetic */ ListenableFuture a() throws IOException {
        eieu eieuVarH = eiiy.h("RepairForkedMmsGroupSynclet#sync");
        try {
            eiju eijuVarC = auvw.c(this.b, fcyi.a, fdjz.a, new ciqr(this, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        if (r1 != r3) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0252 A[LOOP:1: B:71:0x024c->B:73:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [ciqt] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0155 -> B:48:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.b(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ciqa
            if (r0 == 0) goto L13
            r0 = r7
            ciqa r0 = (defpackage.ciqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciqa r0 = new ciqa
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r7)
            goto L59
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            java.lang.String[] r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a
            brec r7 = new brec
            r7.<init>()
            r7.m(r6)
            r6 = 100
            r7.ae(r6)
            r7.ac()
            brdv r6 = new brdv
            r6.<init>(r7)
            fcyh r7 = r5.q
            ciqb r2 = new ciqb
            r2.<init>(r5, r6, r3)
            r0.c = r4
            java.lang.Object r7 = defpackage.eicj.a(r7, r2, r0)
            if (r7 == r1) goto L63
        L59:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r7
            if (r7 == 0) goto L62
            android.net.Uri r6 = r7.u()
            return r6
        L62:
            return r3
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ciqc
            if (r0 == 0) goto L13
            r0 = r6
            ciqc r0 = (defpackage.ciqc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciqc r0 = new ciqc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.q
            ciqf r2 = new ciqf
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.eicj.a(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ciqg
            if (r0 == 0) goto L13
            r0 = r5
            ciqg r0 = (defpackage.ciqg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciqg r0 = new ciqg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ecjh r5 = r4.n
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto Lae
        L43:
            ciqw r5 = (defpackage.ciqw) r5
            evub r5 = r5.d
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r5)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L5b
        L82:
            java.util.Set r5 = r0.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L95:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.barn.b(r1)
            r0.add(r1)
            goto L95
        La9:
            java.util.Set r5 = defpackage.fcva.av(r0)
            return r5
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bojh r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ciqi
            if (r0 == 0) goto L13
            r0 = r7
            ciqi r0 = (defpackage.ciqi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciqi r0 = new ciqi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r7)
            goto L6c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            java.lang.String r6 = r6.T()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6 = defpackage.aofa.c(r6)
            if (r6 != 0) goto L5e
            ekrg r6 = defpackage.ciqt.a
            ekrw r6 = r6.j()
            ekrz r7 = defpackage.eksq.a
            java.lang.String r0 = "BugleGroupManagement"
            r6.X(r7, r0)
            r7 = 325(0x145, float:4.55E-43)
            java.lang.String r0 = "RepairForkedMmsGroupSynclet.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet"
            java.lang.String r2 = "getSelfMessagingIdentity"
            ekrw r6 = r6.h(r1, r2, r7, r0)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "Current self id is not present."
            r6.q(r7)
            return r3
        L5e:
            aofc r7 = r5.u
            eiju r6 = r7.e(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L87
        L6c:
            r7.getClass()
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r6 = defpackage.fdct.b(r7)
            aoer r6 = (defpackage.aoer) r6
            if (r6 == 0) goto L86
            j$.util.Optional r6 = r6.o()
            if (r6 == 0) goto L86
            java.lang.Object r6 = defpackage.fdct.b(r6)
            alqm r6 = (defpackage.alqm) r6
            return r6
        L86:
            return r3
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.f(bojh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ciqk
            if (r0 == 0) goto L13
            r0 = r5
            ciqk r0 = (defpackage.ciqk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciqk r0 = new ciqk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ecjh r5 = r4.n
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L74
        L43:
            ciqw r5 = (defpackage.ciqw) r5
            evvp r5 = r5.c
            if (r5 != 0) goto L4b
            evvp r5 = defpackage.evvp.a
        L4b:
            r5.getClass()
            fcsu r0 = r4.v
            j$.time.Instant r5 = defpackage.evxd.d(r5)
            java.lang.Object r0 = r0.b()
            r0.getClass()
            evrj r0 = (defpackage.evrj) r0
            j$.time.Duration r0 = defpackage.evxd.c(r0)
            j$.time.Instant r5 = r5.plus(r0)
            cogw r0 = r4.o
            j$.time.Instant r0 = r0.f()
            boolean r5 = r5.isBefore(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0255, code lost:
    
        if (r0 == r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0287, code lost:
    
        if (r0 != r7) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.bojh r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.h(bojh, fcxy):java.lang.Object");
    }
}
