package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhr implements eqfo, eqhu, eqfb {
    public final eqei a;
    public final eqfh b;
    public final eqfy c;
    private final eqcl d;
    private final eqcb e;
    private final eqfw f;
    private final cnki g;
    private final cmyu h;

    public eqhr(eqcl eqclVar, eqfy eqfyVar, eqcb eqcbVar, eqei eqeiVar, cnki cnkiVar, cmyu cmyuVar, eqfw eqfwVar, eqfh eqfhVar) {
        eqclVar.getClass();
        eqfyVar.getClass();
        eqeiVar.getClass();
        eqfwVar.getClass();
        eqfhVar.getClass();
        this.d = eqclVar;
        this.c = eqfyVar;
        this.e = eqcbVar;
        this.a = eqeiVar;
        this.g = cnkiVar;
        this.h = cmyuVar;
        this.f = eqfwVar;
        this.b = eqfhVar;
    }

    public static final String p() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static final exzm q(eqcx eqcxVar) {
        exzk exzkVar = (exzk) eqcw.a(eqcxVar.a).toBuilder();
        exzkVar.getClass();
        int i = eqcxVar.b;
        if (i == 0) {
            throw null;
        }
        exzkVar.copyOnWrite();
        exzm exzmVar = (exzm) exzkVar.instance;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        exzmVar.d = i - 2;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(exzmVar.e)).getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (eqcxVar.getCause() instanceof fbtf) {
            Throwable cause = eqcxVar.getCause();
            cause.getClass();
            fbtf fbtfVar = (fbtf) cause;
            if (fbtfVar.getCause() instanceof NetworkException) {
                Throwable cause2 = fbtfVar.getCause();
                cause2.getClass();
                NetworkException networkException = (NetworkException) cause2;
                linkedHashMap.put("CRONET_NETWORK_ERROR", Integer.valueOf(networkException.getErrorCode()));
                linkedHashMap.put("CRONET_INTERNAL_ERROR", Integer.valueOf(networkException.getCronetInternalErrorCode()));
                if (networkException instanceof QuicException) {
                    linkedHashMap.put("CRONET_QUIC_ERROR", Integer.valueOf(((QuicException) networkException).getQuicDetailedErrorCode()));
                }
            }
        }
        exzkVar.copyOnWrite();
        exzm exzmVar2 = (exzm) exzkVar.instance;
        evub evubVar = exzmVar2.e;
        if (!evubVar.b) {
            exzmVar2.e = evubVar.a();
        }
        exzmVar2.e.putAll(linkedHashMap);
        return exzb.a(exzkVar);
    }

    public static final eqds t(ezrp ezrpVar, String str) throws eqfl {
        URI uriCreate;
        eqeb eqebVarA = eqec.a();
        ejvj ejvjVarFH = new eqgq().fH();
        felk felkVarB = felk.b(ezrpVar.f);
        if (felkVarB == null) {
            felkVarB = felk.UNRECOGNIZED;
        }
        Object objFM = ejvjVarFH.fM(felkVarB);
        objFM.getClass();
        eqebVarA.e((eqef) objFM);
        if (str == null) {
            ezoz ezozVar = ezrpVar.d;
            if (ezozVar == null) {
                ezozVar = ezoz.a;
            }
            str = ezozVar.b;
            str.getClass();
        }
        eqebVarA.d(str);
        ezoz ezozVar2 = ezrpVar.d;
        if (ezozVar2 == null) {
            ezozVar2 = ezoz.a;
        }
        String str2 = ezozVar2.c;
        eqebVarA.b(str2 != null ? new eqdp(str2) : eqdp.a);
        ezoz ezozVar3 = ezrpVar.d;
        if (ezozVar3 == null) {
            ezozVar3 = ezoz.a;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ezozVar3.g);
        mapUnmodifiableMap.getClass();
        eqebVarA.c(mapUnmodifiableMap);
        eqed eqedVarA = eqebVarA.a();
        eqdc eqdcVar = new eqdc();
        ezol ezolVar = ezrpVar.c;
        if (ezolVar == null) {
            ezolVar = ezol.a;
        }
        ezolVar.getClass();
        eqdcVar.c(ezolVar);
        String str3 = ezrpVar.g;
        str3.getClass();
        try {
            uriCreate = URI.create(str3);
        } catch (IllegalArgumentException unused) {
            eqej eqejVarD = new eqeg().d();
            ((eqeg) eqejVarD).a = "Failed to parse group conference URI.";
            cmyu.a(eqejVarD.a());
            uriCreate = null;
        }
        if (uriCreate != null) {
            eqdcVar.b(uriCreate);
        }
        eqef eqefVar = eqedVarA.b;
        ejvj ejvjVarFH2 = new eqgp(eqefVar).fH();
        evtg evtgVar = ezrpVar.e;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        Iterator<E> it = evtgVar.iterator();
        while (it.hasNext()) {
            Object objFM2 = ejvjVarFH2.fM((ezrs) it.next());
            objFM2.getClass();
            arrayList.add((eqea) objFM2);
        }
        ezse ezseVar = ezrpVar.h;
        if (ezseVar == null) {
            ezseVar = ezse.a;
        }
        ezseVar.getClass();
        eqdo eqdoVarA = eqft.a(ezseVar);
        if (eqefVar.a(eqdoVarA)) {
            return new eqds(eqdcVar.a(), eqedVarA, eqdoVarA, ekfv.f(arrayList));
        }
        throw new eqfl();
    }

    public static final List u(ezjv ezjvVar) {
        eznx eznxVar;
        evtg evtgVar = ezjvVar.c;
        evtgVar.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        Iterator it = evtgVar.iterator();
        while (it.hasNext()) {
            ezqd ezqdVar = (ezqd) it.next();
            ezol ezolVar = ezqdVar.b;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            ezolVar.getClass();
            evtg<ezpn> evtgVar2 = ezqdVar.c;
            evtgVar2.getClass();
            ArrayList arrayList2 = new ArrayList(fcva.p(evtgVar2, i));
            for (ezpn ezpnVar : evtgVar2) {
                ezpnVar.getClass();
                evqs evqsVar = ezpnVar.c;
                evqsVar.getClass();
                ezpb ezpbVar = ezpnVar.f;
                if (ezpbVar == null) {
                    ezpbVar = ezpb.a;
                }
                ezpb ezpbVar2 = ezpbVar;
                ezpbVar2.getClass();
                long j = ezpnVar.g;
                evtg<eznv> evtgVar3 = ezpnVar.e;
                evtgVar3.getClass();
                ArrayList arrayList3 = new ArrayList(fcva.p(evtgVar3, i));
                for (eznv eznvVar : evtgVar3) {
                    eznvVar.getClass();
                    eznx eznxVar2 = eznvVar.c;
                    if (eznxVar2 == null) {
                        eznxVar2 = eznx.a;
                    }
                    Iterator it2 = it;
                    String str = eznxVar2.b == 1 ? (String) eznxVar2.c : "";
                    str.getClass();
                    if ((eznvVar.b & 2) != 0) {
                        eznxVar = eznvVar.d;
                        if (eznxVar == null) {
                            eznxVar = eznx.a;
                        }
                    } else {
                        eznxVar = null;
                    }
                    arrayList3.add(new eqhv(str, eznxVar != null ? eznxVar.b == 1 ? (String) eznxVar.c : "" : null));
                    it = it2;
                }
                evsx evsxVar = ezpnVar.d;
                evsxVar.getClass();
                arrayList2.add(new eqhw(evqsVar, ezpbVar2, j, arrayList3, evsxVar));
                i = 10;
            }
            arrayList.add(new eqhy(ezolVar, arrayList2));
            it = it;
            i = 10;
        }
        return arrayList;
    }

    private static final void v(eqeq eqeqVar, String str) {
        eqej eqejVarC = new eqeg().c();
        eqeg eqegVar = (eqeg) eqejVarC;
        eqegVar.b = Optional.of(eqeqVar.a);
        eqegVar.a = str;
        cmyu.a(eqejVarC.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eqdr r12, java.lang.Iterable r13, defpackage.eqcz r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r2 = r15 instanceof defpackage.eqgw
            if (r2 == 0) goto L13
            r2 = r15
            eqgw r2 = (defpackage.eqgw) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.c = r3
            goto L18
        L13:
            eqgw r2 = new eqgw
            r2.<init>(r11, r15)
        L18:
            r8 = r2
            java.lang.Object r0 = r8.a
            fcyl r9 = defpackage.fcyl.a
            int r2 = r8.c
            r10 = 1
            if (r2 == 0) goto L30
            if (r2 != r10) goto L28
            defpackage.fctl.b(r0)
            goto L5a
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L30:
            defpackage.fctl.b(r0)
            boolean r0 = defpackage.fcva.ay(r13)
            if (r0 != 0) goto L3c
            fcvo r0 = defpackage.fcvo.a
            return r0
        L3c:
            java.lang.String r2 = p()
            eqgo r6 = new eqgo
            exzf r0 = defpackage.exzf.ADD_GROUP_USERS
            r6.<init>(r0, r2, r14)
            eqgx r0 = new eqgx
            r7 = 0
            r1 = r11
            r4 = r12
            r5 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.c = r10
            java.lang.Object r0 = r11.k(r6, r0, r8)
            if (r0 != r9) goto L5a
            return r9
        L5a:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.a(eqdr, java.lang.Iterable, eqcz, fcxy):java.lang.Object");
    }

    @Override // defpackage.eqfb
    public final Object b(eqdi eqdiVar, fcxy fcxyVar) {
        String strP = p();
        eqgo eqgoVar = new eqgo(exzf.CREATE_GROUP, strP, eqdiVar.d);
        return k(eqgoVar, new eqgy(this, strP, eqdiVar, eqgoVar, null), fcxyVar);
    }

    @Override // defpackage.eqfb
    public final Object c(eqdr eqdrVar, fcxy fcxyVar) {
        String strP = p();
        eqgo eqgoVar = new eqgo(exzf.GET_GROUP_INFO, strP);
        return k(eqgoVar, new eqhb(this, strP, eqdrVar, eqgoVar, null), fcxyVar);
    }

    @Override // defpackage.eqfb
    public final Object d(Iterable iterable, fcxy fcxyVar) {
        if (!fcva.ay(iterable)) {
            return fcvo.a;
        }
        String strP = p();
        eqgo eqgoVar = new eqgo(exzf.GET_GROUP_INFOS, strP);
        return k(eqgoVar, new eqhc(this, strP, iterable, eqgoVar, null), fcxyVar);
    }

    @Override // defpackage.eqfb
    public final Object e(fcxy fcxyVar) {
        String strP = p();
        eqgo eqgoVar = new eqgo(exzf.GET_GROUP_IDS, strP);
        return k(eqgoVar, new eqhd(this, strP, eqgoVar, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.eqdr r12, java.lang.Iterable r13, defpackage.eqcz r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r2 = r15 instanceof defpackage.eqhj
            if (r2 == 0) goto L13
            r2 = r15
            eqhj r2 = (defpackage.eqhj) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.c = r3
            goto L18
        L13:
            eqhj r2 = new eqhj
            r2.<init>(r11, r15)
        L18:
            r8 = r2
            java.lang.Object r0 = r8.a
            fcyl r9 = defpackage.fcyl.a
            int r2 = r8.c
            r10 = 1
            if (r2 == 0) goto L30
            if (r2 != r10) goto L28
            defpackage.fctl.b(r0)
            goto L5a
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L30:
            defpackage.fctl.b(r0)
            boolean r0 = defpackage.fcva.ay(r13)
            if (r0 != 0) goto L3c
            fcvo r0 = defpackage.fcvo.a
            return r0
        L3c:
            java.lang.String r2 = p()
            eqgo r6 = new eqgo
            exzf r0 = defpackage.exzf.KICK_GROUP_USERS
            r6.<init>(r0, r2, r14)
            eqhk r0 = new eqhk
            r7 = 0
            r1 = r11
            r4 = r12
            r5 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.c = r10
            java.lang.Object r0 = r11.k(r6, r0, r8)
            if (r0 != r9) goto L5a
            return r9
        L5a:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.f(eqdr, java.lang.Iterable, eqcz, fcxy):java.lang.Object");
    }

    @Override // defpackage.eqfb
    public final Object g(eqdr eqdrVar, eqee eqeeVar, fcxy fcxyVar) {
        if (eqeeVar.a()) {
            throw new IllegalArgumentException("Must provide at least one property to update.");
        }
        eqcz eqczVar = eqeeVar.d;
        String strP = p();
        eqgo eqgoVar = new eqgo(exzf.GROUP_PROFILE_UPDATED, strP, eqczVar);
        return k(eqgoVar, new eqhp(this, strP, eqeeVar, eqdrVar, eqgoVar, null), fcxyVar);
    }

    @Override // defpackage.eqfb
    public final Object h(eqdx eqdxVar, fcxy fcxyVar) {
        String strP = p();
        eqgo eqgoVar = new eqgo(exzf.UPDATE_INVITE_LINK, strP, eqdxVar.b);
        return k(eqgoVar, new eqhq(this, eqdxVar, strP, eqgoVar, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.eqeq r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.eqhl
            if (r0 == 0) goto L13
            r0 = r12
            eqhl r0 = (defpackage.eqhl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eqhl r0 = new eqhl
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r12)
            r5 = r10
            goto L52
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.fctl.b(r12)
            java.lang.String r12 = "Revoking message"
            v(r11, r12)
            java.lang.String r6 = p()
            eqgt r8 = new eqgt
            r8.<init>(r11, r6)
            eqhm r4 = new eqhm
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r12 = r10.k(r8, r4, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            ezlx r12 = (defpackage.ezlx) r12
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.i(eqeq, fcxy):java.lang.Object");
    }

    @Override // defpackage.eqfo
    public final Object j(eqdb eqdbVar, eqeq eqeqVar, fcxy fcxyVar) {
        v(eqeqVar, "Sending message");
        String strP = p();
        eqgs eqgsVar = new eqgs(eqeqVar, eqdbVar, strP, eqeqVar.g);
        return k(eqgsVar, new eqhn(this, strP, eqeqVar, eqdbVar, eqgsVar, null), fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.eqgk r5, defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.eqgv
            if (r0 == 0) goto L13
            r0 = r7
            eqgv r0 = (defpackage.eqgv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eqgv r0 = new eqgv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r7)     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            goto L43
        L29:
            r6 = move-exception
            goto L4d
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r7)
            r0.a = r5     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            r0.d = r3     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            java.lang.Object r7 = r6.invoke(r0)     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            if (r7 != r1) goto L43
            return r1
        L43:
            eqei r6 = r4.a     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            exzo r0 = r5.c()     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            r6.a(r0)     // Catch: defpackage.eqcx -> L29 io.grpc.StatusException -> L2b
            return r7
        L4d:
            eqei r7 = r4.a
            exzo r5 = r5.a(r6)
            r7.a(r5)
            throw r6
        L57:
            eqgc r7 = new eqgc
            io.grpc.Status r0 = r6.a
            r0.getClass()
            fbrg r1 = r6.b
            eqcs r1 = defpackage.eqfj.a(r0, r1)
            r0.getClass()
            java.lang.String r2 = "GRPC error in TachygramTransport"
            r7.<init>(r2, r1, r6, r0)
            eqei r6 = r4.a
            exzo r5 = r5.a(r7)
            r6.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.k(eqgk, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, defpackage.eqcz r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eqgz
            if (r0 == 0) goto L13
            r0 = r8
            eqgz r0 = (defpackage.eqgz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eqgz r0 = new eqgz
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r8)
            goto L41
        L36:
            defpackage.fctl.b(r8)
            r0.c = r4
            java.lang.Object r8 = r5.m(r6, r7, r0)
            if (r8 == r1) goto L56
        L41:
            eqcl r6 = r5.d
            ezpp r8 = (defpackage.ezpp) r8
            boolean r6 = r6.c
            if (r6 == 0) goto L55
            eqfw r6 = r5.f
            r0.c = r3
            java.lang.Object r6 = r6.b(r8, r0)
            if (r6 != r1) goto L54
            goto L56
        L54:
            return r6
        L55:
            return r8
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.l(java.lang.String, eqcz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r8, defpackage.eqcz r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.m(java.lang.String, eqcz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.eqdx r8, java.lang.String r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.eqho
            if (r0 == 0) goto L13
            r0 = r10
            eqho r0 = (defpackage.eqho) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eqho r0 = new eqho
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.a
            eykh r9 = r0.h
            eykh r2 = r0.g
            eykh r4 = r0.f
            eqdx r5 = r0.e
            defpackage.fctl.b(r10)
            r6 = r10
            r10 = r8
            r8 = r5
            r5 = r4
            r4 = r2
            r2 = r6
            goto L6f
        L46:
            defpackage.fctl.b(r10)
            eqfh r10 = r7.b
            ezqt r2 = defpackage.ezqt.a
            evsf r2 = r2.createBuilder()
            ezqs r2 = (defpackage.ezqs) r2
            eykh r2 = defpackage.eykg.a(r2)
            eqcz r5 = r8.b
            r0.e = r8
            r0.f = r2
            r0.g = r2
            r0.h = r2
            r0.a = r10
            r0.d = r4
            java.lang.Object r9 = r7.l(r9, r5, r0)
            if (r9 == r1) goto La4
            r4 = r2
            r5 = r4
            r2 = r9
            r9 = r5
        L6f:
            ezpp r2 = (defpackage.ezpp) r2
            r9.c(r2)
            eqdr r9 = r8.a
            ezol r9 = r9.a
            r4.b(r9)
            ezqs r9 = r4.a
            r9.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r9 = r9.instance
            ezqt r9 = (defpackage.ezqt) r9
            ezqt r2 = defpackage.ezqt.a
            int r8 = r8.c
            int r8 = r8 + (-2)
            r9.f = r8
            ezqt r8 = r5.a()
            r9 = 0
            r0.e = r9
            r0.f = r9
            r0.g = r9
            r0.h = r9
            r0.a = r9
            r0.d = r3
            r10.a()
            if (r8 != r1) goto La3
            goto La4
        La3:
            return r8
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.n(eqdx, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.ezol r12, int r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.eqhh
            if (r0 == 0) goto L13
            r0 = r14
            eqhh r0 = (defpackage.eqhh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eqhh r0 = new eqhh
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r14)
            r5 = r11
            goto L4f
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.fctl.b(r14)
            java.lang.String r6 = p()
            eqgu r9 = new eqgu
            r14 = 5
            r9.<init>(r14, r6)
            eqhi r4 = new eqhi
            r10 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.c = r3
            java.lang.Object r14 = r11.k(r9, r4, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            ezkd r14 = (defpackage.ezkd) r14
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhr.s(ezol, int, fcxy):java.lang.Object");
    }
}
