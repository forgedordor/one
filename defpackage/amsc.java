package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsc implements amst {
    public static final eksp a = eksp.c("BugleTyping");
    public final cmpy b;
    public final fdjx c;
    public final anpj d;
    public final anpj e;
    public fdlr g;
    private final asrh j;
    private final fcyh k;
    private final cogw l;
    private final cjpc m;
    private final fcsu n;
    private final fcsu o;
    private final BugleConversationId p;
    private cquc r;
    private final Object q = new Object();
    public Instant f = Instant.EPOCH;
    private final fctc s = fctd.a(new fdae() { // from class: amrp
        @Override // defpackage.fdae
        public final Object invoke() {
            eksp ekspVar = amsc.a;
            long j = fdhi.a;
            Duration durationOfSeconds = Duration.ofSeconds(fdhi.h(fdhk.g(fazq.a.get().a(), fdhl.c)), fdhi.d(r0));
            durationOfSeconds.getClass();
            return durationOfSeconds;
        }
    });
    private final fctc t = fctd.a(new fdae() { // from class: amrq
        @Override // defpackage.fdae
        public final Object invoke() {
            eksp ekspVar = amsc.a;
            long j = fdhi.a;
            return new fdhi(fdhk.g(fazq.a(), fdhl.c));
        }
    });
    public final AtomicReference h = new AtomicReference(null);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public amsc(cmpy cmpyVar, asrh asrhVar, fdjx fdjxVar, fcyh fcyhVar, cogw cogwVar, cjpc cjpcVar, fcsu fcsuVar, fcsu fcsuVar2, BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2) {
        this.b = cmpyVar;
        this.j = asrhVar;
        this.c = fdjxVar;
        this.k = fcyhVar;
        this.l = cogwVar;
        this.m = cjpcVar;
        this.n = fcsuVar;
        this.o = fcsuVar2;
        this.p = bugleConversationId;
        this.d = anpjVar;
        this.e = anpjVar2;
        if (((aqgz) fcsuVar2.b()).a()) {
            return;
        }
        k();
        a();
    }

    private final Duration k() {
        return (Duration) this.s.a();
    }

    public final long a() {
        return ((fdhi) this.t.a()).c;
    }

    @Override // defpackage.amst
    public final eiju b() {
        this.i.set(true);
        cquc cqucVar = this.r;
        if (cqucVar != null) {
            cqucVar.a();
        }
        if (this.g != null) {
            i();
            return d();
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.amst
    public final eiju c() {
        auvw.k(this.c, null, null, new amrt(this, null), 3);
        fdlr fdlrVar = this.g;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.g = null;
        Instant instantF = this.l.f();
        if (Duration.between(this.f, instantF).compareTo(k()) < 0) {
            j();
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        synchronized (this.q) {
            if (this.r == null) {
                cquc cqucVarA = this.e.a(new anpi() { // from class: amro
                    @Override // defpackage.anpi
                    public final eiju a() {
                        amsc amscVar = this.a;
                        return auvw.c(amscVar.c, fcyi.a, fdjz.a, new amsb(amscVar, null));
                    }
                });
                cqucVarA.getClass();
                this.r = cqucVarA;
            }
        }
        return cqnx.a(auvw.c(this.c, fcyi.a, fdjz.a, new amru(this, instantF, null)));
    }

    public final eiju d() {
        return cqnx.a(auvw.c(this.c, fcyi.a, fdjz.a, new amrx(this, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cmpx r9, j$.time.Instant r10, defpackage.ajts r11, defpackage.amlm r12, defpackage.aoer r13, defpackage.fcxy r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.amrs
            if (r0 == 0) goto L13
            r0 = r14
            amrs r0 = (defpackage.amrs) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            amrs r0 = new amrs
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.d
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.f
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L44
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.fctl.b(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r13 = r7.c
            java.lang.Object r12 = r7.b
            java.lang.Object r11 = r7.a
            j$.time.Instant r10 = r7.h
            cmpx r9 = r7.g
            defpackage.fctl.b(r14)
        L42:
            r6 = r10
            goto L78
        L44:
            defpackage.fctl.b(r14)
            ajna r14 = r12.e()
            boolean r14 = r14.g
            if (r14 == 0) goto Lbc
            ajli r14 = r12.d()
            ajli r1 = defpackage.ajli.NONE
            if (r14 == r1) goto L58
            goto Lbc
        L58:
            if (r13 == 0) goto Lb4
            fcyh r14 = r8.k
            fcyh r14 = defpackage.eicg.a(r14)
            amrr r1 = new amrr
            r1.<init>(r5, r8, r13)
            r7.g = r9
            r7.h = r10
            r7.a = r11
            r7.b = r12
            r7.c = r13
            r7.f = r4
            java.lang.Object r14 = defpackage.fdin.a(r14, r1, r7)
            if (r14 != r0) goto L42
            goto Lb2
        L78:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r10 = r14.booleanValue()
            if (r10 != 0) goto L92
            eksp r9 = defpackage.amsc.a
            ekrw r9 = r9.e()
            eksl r9 = (defpackage.eksl) r9
            java.lang.String r10 = "Not sending a typing indicator because we should not share our typing status"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        L92:
            amlm r12 = (defpackage.amlm) r12
            ekgb r4 = r12.s()
            int r10 = r13.b()
            r7.g = r5
            r7.h = r5
            r7.a = r5
            r7.b = r5
            r7.c = r5
            r7.f = r3
            r1 = r8
            r2 = r9
            r5 = r10
            r3 = r11
            java.lang.Object r9 = r1.f(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Lb3
        Lb2:
            return r0
        Lb3:
            return r9
        Lb4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        Lbc:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amsc.e(cmpx, j$.time.Instant, ajts, amlm, aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cmpx r8, defpackage.ajts r9, java.util.List r10, int r11, j$.time.Instant r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amsc.f(cmpx, ajts, java.util.List, int, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.amrz
            if (r0 == 0) goto L13
            r0 = r5
            amrz r0 = (defpackage.amrz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amrz r0 = new amrz
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
            anpj r5 = r4.e
            eiju r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto Lb9
        L43:
            amlm r5 = (defpackage.amlm) r5
            ajlj r0 = r5.o()
            ajlj r1 = defpackage.ajlj.ONE_ON_ONE
            if (r0 == r1) goto L5f
            fcsu r1 = r4.n
            java.lang.Object r1 = r1.b()
            ardi r1 = (defpackage.ardi) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto Lb6
            ajlj r1 = defpackage.ajlj.GROUP
            if (r0 != r1) goto Lb6
        L5f:
            ajna r0 = r5.e()
            boolean r0 = r0.g
            if (r0 == 0) goto Lb6
            ajli r0 = r5.d()
            ajli r1 = defpackage.ajli.NONE
            if (r0 == r1) goto L70
            goto Lb6
        L70:
            aoer r0 = r5.g()
            if (r0 != 0) goto L86
            eksp r5 = defpackage.amsc.a
            ekrw r5 = r5.j()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r0 = "Self identity is not present while sending a typing pre-warm."
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L86:
            fcsu r1 = r4.n
            java.lang.Object r1 = r1.b()
            ardi r1 = (defpackage.ardi) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto La0
            awjl r5 = r5.r()
            cjpc r1 = r4.m
            r1.d(r0, r5)
            fctx r5 = defpackage.fctx.a
            return r5
        La0:
            ekgb r5 = r5.s()
            java.lang.Object r5 = defpackage.fcva.X(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            alqm r5 = r5.g()
            cjpc r1 = r4.m
            r1.c(r0, r5)
            fctx r5 = defpackage.fctx.a
            return r5
        Lb6:
            fctx r5 = defpackage.fctx.a
            return r5
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amsc.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.amlm r9, defpackage.ajts r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.amsa
            if (r0 == 0) goto L13
            r0 = r11
            amsa r0 = (defpackage.amsa) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            amsa r0 = new amsa
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L77
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.fctl.b(r11)
            java.util.concurrent.atomic.AtomicReference r11 = r8.h
            java.lang.Object r11 = r11.get()
            amss r11 = (defpackage.amss) r11
            if (r11 != 0) goto L44
            goto L88
        L44:
            aoer r2 = r9.g()
            amlm r4 = r11.a
            aoer r5 = r4.g()
            if (r5 == 0) goto L88
            if (r2 == 0) goto L58
            boolean r2 = r5.z(r2)
            if (r2 != 0) goto L79
        L58:
            ajts r11 = r11.b
            fdjx r2 = r8.c
            amrw r5 = new amrw
            r6 = 0
            r5.<init>(r8, r11, r4, r6)
            eiju r11 = defpackage.auvw.h(r2, r5)
            eiju r11 = defpackage.cqnx.a(r11)
            r0.a = r9
            r0.b = r10
            r0.e = r3
            java.lang.Object r11 = defpackage.fdxs.c(r11, r0)
            if (r11 != r1) goto L77
            return r1
        L77:
            java.lang.Void r11 = (java.lang.Void) r11
        L79:
            java.util.concurrent.atomic.AtomicReference r11 = r8.h
            amss r0 = new amss
            amlm r9 = (defpackage.amlm) r9
            r0.<init>(r9, r10)
            r11.set(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L88:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amsc.h(amlm, ajts, fcxy):java.lang.Object");
    }

    @Override // defpackage.amst
    public final void i() {
        fdlr fdlrVar = this.g;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.g = null;
    }

    public final void j() {
        this.g = auvw.k(this.c, null, null, new amrv(this, null), 3);
    }
}
