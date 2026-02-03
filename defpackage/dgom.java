package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgom {
    private final fctc A;
    public final String d = "ProvisioningStateMachine";
    public final fdjx e;
    public final fcyh f;
    public final dfmk g;
    public final Deque h;
    public final ArrayList i;
    public final ArrayList j;
    public final Deque k;
    public final AtomicBoolean l;
    public final feav m;
    public final eizx n;
    public Object o;
    public final AtomicBoolean p;
    private final Map s;
    private final Map t;
    private final Map u;
    private final Deque v;
    private final AtomicReference w;
    private final ArrayList x;
    private List y;
    private List z;
    public static final dfny a = dfnv.b("enable_state_machine_v2");
    private static final dfny q = dfnv.b("crash_on_unhandled_state_machine_message");
    public static final dfny b = dfnv.b("is_state_machine_v2_executing");
    private static final dfny r = dfnv.b("crash_on_multiple_transitioning_requests");
    public static final ekrg c = ekrg.c("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2");

    public dgom(Map map, Map map2, fdjx fdjxVar, fcyh fcyhVar, dfmk dfmkVar) {
        this.s = map;
        this.t = map2;
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.g = dfmkVar;
        ekhx<Map.Entry> ekhxVarEntrySet = ((ekgp) map).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekhxVarEntrySet, 10)), 16));
        for (Map.Entry entry : ekhxVarEntrySet) {
            fcti fctiVar = new fcti(entry.getKey(), new dgny(entry.getKey(), (dgnu) entry.getValue()));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        this.u = linkedHashMap;
        this.v = new ConcurrentLinkedDeque();
        this.h = new ConcurrentLinkedDeque();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ConcurrentLinkedDeque();
        this.w = new AtomicReference(dgnw.a);
        this.l = new AtomicBoolean(false);
        this.m = new feaz();
        this.n = new eizx();
        this.x = new ArrayList();
        this.p = new AtomicBoolean(false);
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = fctd.a(new fdae() { // from class: dgnv
            @Override // defpackage.fdae
            public final Object invoke() {
                dfny dfnyVar = dgom.a;
                return (((Boolean) dfnyVar.a()).booleanValue() && ((Boolean) dgom.b.a()).booleanValue()) ? dgnx.a : (!((Boolean) dfnyVar.a()).booleanValue() || ((Boolean) dgom.b.a()).booleanValue()) ? dgnx.c : dgnx.b;
            }
        });
    }

    private final dgnx r() {
        return (dgnx) this.A.a();
    }

    private final dgny s() {
        return (dgny) this.v.peekLast();
    }

    public final dgnu a() {
        dgny dgnyVarS = s();
        if (dgnyVarS != null) {
            return dgnyVarS.b;
        }
        return null;
    }

    public final ListenableFuture b(Object obj, Object obj2) {
        obj.getClass();
        return fdxs.a(ejaa.a(this.e, this.n, new dgoa(this, obj, obj2, null)));
    }

    public final ListenableFuture c(Object obj, Object obj2) {
        obj.getClass();
        return fdxs.a(ejaa.a(this.e, this.n, new dgog(this, obj, obj2, null)));
    }

    public final ListenableFuture d(Object obj) {
        obj.getClass();
        fcti fctiVar = new fcti(e(), obj);
        Deque deque = this.k;
        deque.add(fctiVar);
        if (deque.size() > 1) {
            if (this.p.get() && ((Boolean) r.a()).booleanValue()) {
                throw new IllegalStateException("Current state " + e() + " and its parents requested to transition to more than 1 state. Requests: " + deque);
            }
            ((ekrd) c.j().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "transitionToAsync", 275, "StateMachineV2.kt")).D("Current state %s and its parents requested to transition to more than 1 state. Requests: %s", e(), deque);
        }
        return fdxs.a(ejaa.a(this.e, this.n, new dgol(this, obj, null)));
    }

    public final Object e() {
        dgny dgnyVarS = s();
        if (dgnyVarS != null) {
            return dgnyVarS.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.dgob
            if (r0 == 0) goto L13
            r0 = r9
            dgob r0 = (defpackage.dgob) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dgob r0 = new dgob
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2c:
            defpackage.fctl.b(r9)
        L2f:
            java.util.Deque r9 = r8.h
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L6d
            java.lang.Object r9 = r9.removeFirst()
            fcti r9 = (defpackage.fcti) r9
            ekrg r2 = defpackage.dgom.c
            ekrw r2 = r2.h()
            r4 = 420(0x1a4, float:5.89E-43)
            java.lang.String r5 = "StateMachineV2.kt"
            java.lang.String r6 = "com/google/android/ims/provisioning/engine/statemachine/StateMachineV2"
            java.lang.String r7 = "innerSendDeferredMessages"
            ekrw r2 = r2.h(r6, r7, r4, r5)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.Object r4 = r9.a
            dgny r5 = r8.s()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r5.a
            goto L5d
        L5c:
            r5 = 0
        L5d:
            java.lang.String r6 = "Sending deferred %s to %s"
            r2.D(r6, r4, r5)
            java.lang.Object r9 = r9.b
            r0.c = r3
            java.lang.Object r9 = r8.i(r4, r9, r0)
            if (r9 != r1) goto L2f
            return r1
        L6d:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgom.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dgoc
            if (r0 == 0) goto L13
            r0 = r6
            dgoc r0 = (defpackage.dgoc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dgoc r0 = new dgoc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "initialState"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            defpackage.fctl.b(r6)
            goto L60
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.p
            dfny r2 = defpackage.dgom.b
            java.lang.Object r2 = r2.a()
            r2.getClass()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r6.set(r2)
            java.util.concurrent.atomic.AtomicReference r6 = r5.w
            dgnw r2 = defpackage.dgnw.b
            r6.set(r2)
            java.lang.Object r6 = r5.o
            if (r6 != 0) goto L58
            defpackage.fdbq.c(r3)
            fctx r6 = defpackage.fctx.a
        L58:
            r0.c = r4
            java.lang.Object r6 = r5.j(r6, r0)
            if (r6 == r1) goto L8c
        L60:
            java.util.concurrent.atomic.AtomicReference r6 = r5.w
            dgnw r0 = defpackage.dgnw.c
            r6.set(r0)
            ekrg r6 = defpackage.dgom.c
            ekrw r6 = r6.h()
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r1 = "StateMachineV2.kt"
            java.lang.String r2 = "com/google/android/ims/provisioning/engine/statemachine/StateMachineV2"
            java.lang.String r4 = "innerStart"
            ekrw r6 = r6.h(r2, r4, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.Object r0 = r5.o
            if (r0 != 0) goto L84
            defpackage.fdbq.c(r3)
            fctx r0 = defpackage.fctx.a
        L84:
            java.lang.String r1 = "Initialized StateMachineV2 to %s"
            r6.t(r1, r0)
            fctx r6 = defpackage.fctx.a
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgom.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(3:(1:(5:14|124|15|111|112)(2:19|20))(9:21|122|22|94|(3:96|(2:99|97)|126)|100|(2:102|(1:104))(2:105|(1:107))|(3:110|111|112)|119)|117|118)(10:26|120|27|28|74|(4:77|(7:128|79|80|(1:82)(2:83|(1:85)(1:86))|87|(2:90|88)|131)(1:130)|129|75)|127|91|(6:93|94|(0)|100|(0)(0)|(0))|119))(1:31))(3:32|(1:34)|119)|123|35|36|(7:38|(1:40)(1:41)|42|(1:44)|50|111|112)|45|(2:47|(4:49|50|111|112)(9:51|(2:53|(2:137|135)(1:134))|132|57|(5:62|63|(2:65|141)(2:66|(2:68|142)(2:69|140))|70|58)|139|71|(6:73|74|(1:75)|127|91|(0))|119))(2:113|114)) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a6, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0273 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:22:0x004d, B:94:0x0237, B:96:0x0247, B:97:0x024d, B:99:0x0253, B:100:0x025f, B:102:0x0273, B:104:0x0279, B:105:0x027c, B:107:0x028d), top: B:122:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027c A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:22:0x004d, B:94:0x0237, B:96:0x0247, B:97:0x024d, B:99:0x0253, B:100:0x025f, B:102:0x0273, B:104:0x0279, B:105:0x027c, B:107:0x028d), top: B:122:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:27:0x005c, B:74:0x019b, B:75:0x01a7, B:77:0x01ad, B:79:0x01bb, B:82:0x01d0, B:87:0x021c, B:88:0x0222, B:90:0x0228, B:83:0x01e6, B:85:0x01ee, B:86:0x0207, B:91:0x0232), top: B:120:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0247 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:22:0x004d, B:94:0x0237, B:96:0x0247, B:97:0x024d, B:99:0x0253, B:100:0x025f, B:102:0x0273, B:104:0x0279, B:105:0x027c, B:107:0x028d), top: B:122:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Object r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgom.h(java.lang.Object, fcxy):java.lang.Object");
    }

    public final Object i(Object obj, Object obj2, fcxy fcxyVar) {
        if (this.g.a()) {
            Object objQ = q(obj, obj2);
            if (objQ == fcyl.a) {
                return objQ;
            }
        } else {
            Object objA = fdin.a(eicg.a(this.f), new dgof(null, this, obj, obj2), fcxyVar);
            if (objA == fcyl.a) {
                return objA;
            }
        }
        return fctx.a;
    }

    public final Object j(Object obj, fcxy fcxyVar) throws Throwable {
        if (this.g.a()) {
            Object objH = h(obj, fcxyVar);
            if (objH == fcyl.a) {
                return objH;
            }
        } else {
            Object objA = fdin.a(eicg.a(this.f), new dgok(null, this, obj), fcxyVar);
            if (objA == fcyl.a) {
                return objA;
            }
        }
        return fctx.a;
    }

    public final void k(Object obj, Object obj2) {
        obj.getClass();
        this.h.addLast(new fcti(obj, obj2));
        ((ekrd) c.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "deferMessageDeprecated", 383, "StateMachineV2.kt")).t("[deprecated] Added deferred %s", obj);
    }

    public final boolean l() {
        return this.l.get();
    }

    public final boolean m() {
        return r() == dgnx.b;
    }

    public final boolean n() {
        return m() || r() == dgnx.c;
    }

    public final boolean o() {
        return m() || p();
    }

    public final boolean p() {
        return r() == dgnx.a;
    }

    public final Object q(Object obj, Object obj2) {
        AtomicBoolean atomicBoolean = this.l;
        if (atomicBoolean.get()) {
            ((ekrd) c.j().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "innerSendMessage", 454, "StateMachineV2.kt")).t("Can't send message %s on a StateMachineV2 instance that has already quit.", obj);
            return fctx.a;
        }
        dgny dgnyVarS = s();
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((dgon) it.next()).a();
        }
        if (!this.p.get()) {
            ((ekrd) c.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "innerSendMessage", 464, "StateMachineV2.kt")).D("Pretend sent message %s to %s", obj, a());
            return fctx.a;
        }
        while (true) {
            if (dgnyVarS == null || dgnyVarS.b.v(obj, obj2)) {
                break;
            }
            ekrg ekrgVar = c;
            ekrd ekrdVar = (ekrd) ekrgVar.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "innerSendMessage", 469, "StateMachineV2.kt");
            Object obj3 = dgnyVarS.a;
            ekrdVar.D("Sent message %s to %s", obj, obj3);
            Object obj4 = this.t.get(obj3);
            dgnyVarS = obj4 == null ? null : (dgny) this.u.get(obj4);
            if (dgnyVarS == null && !atomicBoolean.get()) {
                if (((Boolean) q.a()).booleanValue()) {
                    throw new IllegalStateException("No state could handle the message: " + obj + ", current states: " + e());
                }
                ((ekrd) ekrgVar.j().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "innerSendMessage", 485, "StateMachineV2.kt")).D("No state could handle the message %s, current states: %s", obj, e());
            }
        }
        return fctx.a;
    }

    public final String toString() {
        dgnw dgnwVar = (dgnw) this.w.get();
        if (dgnwVar != null) {
            int iOrdinal = dgnwVar.ordinal();
            if (iOrdinal == 1) {
                return "name=" + this.d + " state=initializing";
            }
            if (iOrdinal == 2) {
                return "name=" + this.d + " state=" + e();
            }
        }
        return "name=" + this.d + " state=not_initialized";
    }
}
