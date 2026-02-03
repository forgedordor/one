package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqz {
    public static final cqce a = cqce.g("BugleDataModel", "ForwardSyncBatchExecutor");
    public final eosc b;
    public final crqv c;
    public final cogw d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final cmsk o;
    public final bxlc p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    private final fcsu t;
    private final fcsu u;

    public cnqz(eosc eoscVar, crqv crqvVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, cmsk cmskVar, bxlc bxlcVar, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15) {
        this.b = eoscVar;
        this.c = crqvVar;
        this.d = cogwVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.m = fcsuVar9;
        this.n = fcsuVar10;
        this.o = cmskVar;
        this.p = bxlcVar;
        this.t = fcsuVar11;
        this.u = fcsuVar12;
        this.q = fcsuVar13;
        this.r = fcsuVar14;
        this.s = fcsuVar15;
    }

    public static void b(cnrx cnrxVar, ArrayList arrayList, ArrayList arrayList2, ctz ctzVar, long j, long j2) {
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            cmoc cmocVar = (cmoc) arrayList.get(i);
            if (!cmocVar.l) {
                cmocVar.l = e(cmocVar.k, cmocVar.f < j);
            }
            cnrxVar.a.add(cmocVar);
            i++;
        }
        if (j2 > Long.MIN_VALUE) {
            ejyb.a(arrayList2.size() == ctzVar.b());
            for (int i2 = 0; i2 < ctzVar.b(); i2++) {
                cmny cmnyVar = (cmny) arrayList2.get(i2);
                if (!cmnyVar.m) {
                    cmnyVar.m = e(cmnyVar.l, cmnyVar.g < j);
                }
                if (((Boolean) ((cczi) cnrt.h.get()).e()).booleanValue() && cmnyVar.l()) {
                    cnrxVar.c.add(cmnyVar);
                } else {
                    cnrxVar.b.add(cmnyVar);
                }
            }
        }
    }

    public static boolean e(boolean z, boolean z2) {
        return z2 || z;
    }

    public final Duration a(Instant instant) {
        return Duration.between(instant, this.d.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ctz r11, defpackage.cmsk r12) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.b()
            if (r1 >= r2) goto Ld6
            java.lang.Object r2 = r11.e(r1)
            cmny r2 = (defpackage.cmny) r2
            boolean r3 = r2.k()
            if (r3 != 0) goto Lcd
            cmmo r5 = defpackage.cmmo.c
            long r6 = r2.i
            java.lang.String r8 = r2.a
            int r3 = r2.q
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r4 = r12
            cmtz r12 = r4.a(r5, r6, r8, r9)
            defpackage.cqaz.l(r12)
            java.util.ArrayList r3 = r12.b
            boolean r5 = r3.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            defpackage.cqaz.k(r5)
            int r5 = r3.size()
            java.lang.String r7 = "uri"
            if (r5 != r6) goto L61
            java.lang.Object r3 = r3.get(r0)
            alqm r3 = (defpackage.alqm) r3
            boolean r3 = r3.D()
            if (r3 == 0) goto L61
            cqce r3 = defpackage.cnqz.a
            cqbd r3 = r3.e()
            java.lang.String r5 = "MMS message has unknown sender from thread data."
            r3.I(r5)
            java.lang.String r5 = r2.a
            r3.A(r7, r5)
            long r5 = r2.i
            java.lang.String r8 = "threadId"
            r3.z(r8, r5)
            r3.r()
        L61:
            fcsu r3 = r10.f
            java.lang.Object r3 = r3.b()
            cmqj r3 = (defpackage.cmqj) r3
            java.lang.String r5 = r2.a
            int r6 = r2.q
            j$.util.Optional r12 = r3.ah(r12, r5)
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto La0
            java.lang.Object r3 = r12.get()
            alqm r3 = (defpackage.alqm) r3
            cczv r5 = defpackage.alvx.a
            aluj r5 = new aluj
            r5.<init>()
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r3 = r3.k(r5)
            boolean r3 = defpackage.cssr.g(r3)
            if (r3 == 0) goto L99
            goto La0
        L99:
            java.lang.Object r12 = r12.get()
            alqm r12 = (defpackage.alqm) r12
            goto Lcf
        La0:
            cqce r12 = defpackage.cnqz.a
            cqbd r12 = r12.e()
            java.lang.String r3 = "Could not find sender of incoming MMS, using 'unknown sender'."
            r12.I(r3)
            java.lang.String r3 = r2.a
            r12.A(r7, r3)
            r12.r()
            fcsu r12 = r10.u
            java.lang.Object r12 = r12.b()
            alrj r12 = (defpackage.alrj) r12
            alqm r12 = r12.f()
            fcsu r3 = r10.t
            java.lang.Object r3 = r3.b()
            ains r3 = (defpackage.ains) r3
            java.lang.String r5 = "Bugle.Telephony.ForwardSync.NullOrEmptyMmsSender"
            r3.c(r5)
            goto Lcf
        Lcd:
            r4 = r12
            r12 = 0
        Lcf:
            r2.r = r12
            int r1 = r1 + 1
            r12 = r4
            goto L2
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqz.c(ctz, cmsk):void");
    }

    public final void d(ctz ctzVar) {
        eieu eieuVarK = eiiy.k("ForwardSync#setMmsSendersAndEnvelopes");
        for (int i = 0; i < ctzVar.b(); i++) {
            try {
                cmny cmnyVar = (cmny) ctzVar.e(i);
                if (cmnyVar.g() == null) {
                    a.r("MMS message found with null URI: " + cmnyVar.a);
                } else {
                    cmqj cmqjVar = (cmqj) this.f.b();
                    Uri uriG = cmnyVar.g();
                    uriG.getClass();
                    int i2 = cmnyVar.q;
                    cmqi cmqiVarAi = cmqjVar.ai(uriG);
                    cmnyVar.s = cmqiVarAi;
                    ekhx ekhxVar = ((cmmn) cmqiVarAi).d;
                    cmnyVar.r = (alqm) Collection.EL.stream(ekhxVar).findFirst().orElse(((alrj) this.u.b()).f());
                    if (ekhxVar.isEmpty()) {
                        cqbd cqbdVarE = a.e();
                        cqbdVarE.I("Could not find sender of incoming MMS, using 'unknown sender'.");
                        cqbdVarE.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, cmnyVar.a);
                        cqbdVarE.r();
                    }
                }
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieuVarK.close();
    }
}
