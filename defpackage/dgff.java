package defpackage;

import android.os.Message;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgff extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgff(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "WaitForNetworkState";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r0.T.a(r0.o) != null) goto L17;
     */
    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            super.b()
            dgfg r0 = r8.b
            r1 = 0
            r0.w = r1
            r0.O()
            dezf r2 = defpackage.dezf.UNKNOWN
            r0.N(r2)
            dfny r2 = defpackage.dgfg.f
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L43
            java.lang.String r2 = r0.n
            dgcf r4 = r0.N
            dgcg r4 = r4.a
            dbho r4 = r4.d
            java.lang.Object r4 = r4.d()
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L34
            goto L43
        L34:
            dgfg r0 = r8.b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            dhip r2 = r0.m
            java.lang.String r3 = "Stale StateMachine. Stopping it."
            defpackage.dhja.r(r2, r3, r1)
            r0.n()
            return
        L43:
            boolean r2 = defpackage.dfpk.o()
            if (r2 == 0) goto L6e
            int r2 = r0.o
            dhks r0 = r0.T     // Catch: defpackage.dhkf -> L54
            android.telephony.SubscriptionInfo r0 = r0.a(r2)     // Catch: defpackage.dhkf -> L54
            if (r0 == 0) goto L54
            goto L6e
        L54:
            dgfg r0 = r8.b
            int r1 = r0.o
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r1
            dhip r1 = r0.m
            java.lang.String r3 = "SIM is not found for subId=%d"
            defpackage.dhja.r(r1, r3, r2)
            r1 = 17
            r0.q(r1)
            return
        L6e:
            dgfg r0 = r8.b
            boolean r2 = r0.l
            if (r2 == 0) goto Ld4
            android.net.NetworkRequest$Builder r2 = new android.net.NetworkRequest$Builder
            r2.<init>()
            r4 = 12
            android.net.NetworkRequest$Builder r2 = r2.addCapability(r4)
            r2.build()
            java.util.concurrent.atomic.AtomicReference r2 = r0.A
            java.util.concurrent.ScheduledExecutorService r4 = r0.R
            dgco r5 = new dgco
            dgfe r6 = new dgfe
            r6.<init>(r8)
            dhkr r7 = r0.r
            dhip r0 = r0.m
            r5.<init>(r4, r6, r7, r0)
            r2.set(r5)
            java.lang.String r4 = "Register NetworkCallback for Default Network"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: defpackage.dhkf -> Laa java.lang.RuntimeException -> Lac
            defpackage.dhja.l(r0, r4, r5)     // Catch: defpackage.dhkf -> Laa java.lang.RuntimeException -> Lac
            java.lang.Object r0 = r2.get()     // Catch: defpackage.dhkf -> Laa java.lang.RuntimeException -> Lac
            dgco r0 = (defpackage.dgco) r0     // Catch: defpackage.dhkf -> Laa java.lang.RuntimeException -> Lac
            if (r0 == 0) goto La9
            r7.g(r0)     // Catch: defpackage.dhkf -> Laa java.lang.RuntimeException -> Lac
        La9:
            return
        Laa:
            r0 = move-exception
            goto Lad
        Lac:
            r0 = move-exception
        Lad:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "Failed to register NetworkCallback."
            defpackage.dhja.i(r0, r3, r2)
            dfny r0 = defpackage.dgfg.k
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc9
            dgfg r0 = r8.b
            java.util.concurrent.atomic.AtomicReference r0 = r0.A
            r0.set(r1)
        Lc9:
            dgfg r0 = r8.b
            dgfc r1 = new dgfc
            r1.<init>()
            r0.F(r1)
            return
        Ld4:
            dgfg r0 = r8.b
            dgfd r1 = new dgfd
            r1.<init>()
            r0.F(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgff.b():void");
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            g();
            return true;
        }
        if (i == 8) {
            dgfg dgfgVar = this.b;
            dgfgVar.N(message.obj);
            dgfgVar.w(dgfgVar.W);
            return true;
        }
        if (i == 17) {
            dgfg dgfgVar2 = this.b;
            dgfgVar2.N(dezf.SIM_REMOVED);
            dgfgVar2.w(dgfgVar2.aj);
            return true;
        }
        switch (i) {
            case 20:
                dfzs dfzsVar = (dfzs) message.obj;
                dgfg dgfgVar3 = this.b;
                dgfgVar3.B = dfzsVar;
                dgfgVar3.w(dgfgVar3.Z);
                return true;
            case 21:
                dgfg dgfgVar4 = this.b;
                dhja.r(dgfgVar4.m, "Network is lost.", new Object[0]);
                dgfgVar4.O();
                dgfgVar4.w(dgfgVar4.ak);
                return true;
            case 22:
                dgfg dgfgVar5 = this.b;
                dhja.r(dgfgVar5.m, "Network is not available.", new Object[0]);
                dgfgVar5.A.set(null);
                dgfgVar5.w(dgfgVar5.ak);
                return true;
            default:
                return super.e(message);
        }
    }

    public final void g() {
        final dgfg dgfgVar = this.b;
        if (dgfgVar.l) {
            dhja.r(dgfgVar.m, "Do not use ImsNetworkInterface.", new Object[0]);
            return;
        }
        dhip dhipVar = dgfgVar.m;
        dhja.d(dhipVar, "Selecting Network Interface.", new Object[0]);
        dfzr dfzrVar = dgfgVar.q;
        dfzrVar.c();
        final dfyu dfyuVarA = dfzrVar.a();
        if (dfyuVarA == null) {
            dhja.d(dhipVar, "ImsNetworkInterface is not available.", new Object[0]);
            return;
        }
        dhja.d(dhipVar, "Registering over %s (%s)", dfyuVarA.g(), dfyuVarA);
        dgfgVar.w = dfyuVarA;
        dhja.d(dhipVar, "Notify ImsNetworkInterface selected. selected=%s", dfyuVarA);
        dgfgVar.R.execute(new Runnable() { // from class: dgdc
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(dgfgVar.P);
                final dfyu dfyuVar = dfyuVarA;
                stream.forEach(new Consumer() { // from class: dgdg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        dfny dfnyVar = dgfg.d;
                        ((dfyw) obj).h(dfyuVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
        dgfgVar.w(dgfgVar.Z);
    }
}
