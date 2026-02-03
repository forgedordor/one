package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ots {
    public final owd a;
    public final ouv b;
    public final fdpl c;
    public final fdae d;
    public final oql e;
    public final AtomicBoolean f;
    public final fdoa g;
    public final ott h;
    public final fdpl i;
    private final Object j;
    private final fdlt k;

    public ots(Object obj, owd owdVar, ouv ouvVar, fdpl fdplVar, fdae fdaeVar) {
        owdVar.getClass();
        this.j = obj;
        this.a = owdVar;
        this.b = ouvVar;
        this.c = fdplVar;
        this.d = fdaeVar;
        if (ouvVar.f != Integer.MIN_VALUE && !owdVar.d()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.e = new oql();
        this.f = new AtomicBoolean(false);
        this.g = fdod.a(-2, 0, 6);
        this.h = new ott(ouvVar);
        fdlt fdltVar = new fdlt(null);
        this.k = fdltVar;
        this.i = new fdqz(new otn(this, null), owq.a(new opa(fdltVar, new otm(this, null), null)));
    }

    private final ovx i(orr orrVar, Object obj) {
        int i = orrVar == orr.a ? this.b.d : this.b.a;
        ouv ouvVar = this.b;
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        boolean z = ouvVar.c;
        if (iOrdinal == 0) {
            return new ovw(obj, i, z);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new ovv(obj, i, z);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new fctg();
        }
        if (obj != null) {
            return new ovu(obj, i, z);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    private final Object j(otw otwVar, orr orrVar, int i, int i2) {
        int i3;
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            i3 = otwVar.e;
        } else {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            i3 = otwVar.f;
        }
        if (i != i3 || (otwVar.j.a(orrVar) instanceof orm) || i2 >= this.b.b) {
            return null;
        }
        return orrVar == orr.b ? ((owb) fcva.N(otwVar.c)).c : ((owb) fcva.S(otwVar.c)).d;
    }

    private final Object k(otw otwVar, orr orrVar, orm ormVar, fcxy fcxyVar) {
        orz orzVar = otwVar.j;
        if (!fdbq.f(orzVar.a(orrVar), ormVar)) {
            orzVar.d(orrVar, ormVar);
            Object objA = this.g.a(new ose(orzVar.b()), fcxyVar);
            if (objA == fcyl.a) {
                return objA;
            }
        }
        return fctx.a;
    }

    private final void l() {
        g();
        this.a.e();
    }

    private static final String m(orr orrVar, Object obj, owc owcVar) {
        return owcVar == null ? a.j(obj, orrVar, "End ", " with loadkey ", ". Load CANCELLED.") : a.t(owcVar, obj, orrVar, "End ", " with loadKey ", ". Returned ");
    }

    public final Object a(fdpl fdplVar, orr orrVar, fcxy fcxyVar) {
        Object objA = fdqc.a(oqf.a(oqf.b(fdplVar, new osv(null, this, orrVar)), new osw(orrVar, null))).a(new osx(this, orrVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.otb
            if (r0 == 0) goto L13
            r0 = r6
            otb r0 = (defpackage.otb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            otb r0 = new otb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            feaz r1 = r0.e
            ott r0 = r0.d
            defpackage.fctl.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            ott r6 = r5.h
            r0.d = r6
            feav r2 = r6.a
            r4 = r2
            feaz r4 = (defpackage.feaz) r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L60
            r0 = r6
            r1 = r2
        L4b:
            otw r6 = r0.b     // Catch: java.lang.Throwable -> L5b
            oql r0 = r5.e     // Catch: java.lang.Throwable -> L5b
            oxf r0 = r0.a()     // Catch: java.lang.Throwable -> L5b
            owe r6 = r6.e(r0)     // Catch: java.lang.Throwable -> L5b
            r1.d()
            return r6
        L5b:
            r6 = move-exception
            r1.d()
            throw r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ots.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[PHI: r2
      0x00e5: PHI (r2v8 feav) = (r2v5 feav), (r2v12 feav) binds: [B:42:0x00e3, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d A[PHI: r12
      0x011d: PHI (r12v12 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:47:0x011b, B:31:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150 A[Catch: all -> 0x01ca, TryCatch #6 {all -> 0x01ca, blocks: (B:52:0x0139, B:54:0x0150, B:55:0x0157, B:57:0x015b), top: B:123:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #6 {all -> 0x01ca, blocks: (B:52:0x0139, B:54:0x0150, B:55:0x0157, B:57:0x015b), top: B:123:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ots] */
    /* JADX WARN: Type inference failed for: r12v7, types: [owd] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ovx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ots.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x02cd, code lost:
    
        r4 = r6;
        r8 = r7;
        r11 = r17;
        r6 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x040f A[Catch: all -> 0x064a, TRY_LEAVE, TryCatch #4 {all -> 0x064a, blocks: (B:132:0x03f4, B:201:0x0573, B:204:0x0587, B:205:0x05b1, B:136:0x040f, B:228:0x0633, B:229:0x0645), top: B:293:0x03f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0483 A[Catch: all -> 0x0646, TryCatch #2 {all -> 0x0646, blocks: (B:183:0x04c7, B:185:0x04d3, B:189:0x04eb, B:191:0x04f2, B:192:0x0500, B:199:0x055f, B:193:0x051a, B:194:0x052e, B:195:0x052f, B:197:0x0536, B:198:0x053f, B:138:0x0413, B:141:0x041d, B:144:0x0424, B:147:0x042b, B:149:0x0431, B:151:0x0439, B:153:0x0442, B:155:0x0460, B:157:0x0469, B:159:0x046e, B:161:0x0475, B:165:0x0483, B:167:0x048c, B:169:0x049a, B:171:0x04a1, B:173:0x04ac, B:181:0x04c2, B:176:0x04b3, B:178:0x04b7, B:180:0x04c0, B:179:0x04bc, B:172:0x04a8, B:168:0x0497, B:158:0x046c, B:154:0x0454), top: B:289:0x04c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05d5 A[Catch: all -> 0x00bb, TryCatch #6 {all -> 0x00bb, blocks: (B:208:0x05c0, B:210:0x05d5, B:212:0x05df, B:214:0x05e3, B:216:0x05e8, B:215:0x05e6, B:217:0x05eb, B:19:0x0084, B:22:0x00b0), top: B:291:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a1 A[Catch: all -> 0x070b, TRY_LEAVE, TryCatch #5 {all -> 0x070b, blocks: (B:76:0x028e, B:78:0x02a1), top: B:294:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032a  */
    /* JADX WARN: Type inference failed for: r24v0, types: [ots] */
    /* JADX WARN: Type inference failed for: r4v0, types: [fcyl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r4v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [feav] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.orr r25, defpackage.oqg r26, defpackage.fcxy r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ots.d(orr, oqg, fcxy):java.lang.Object");
    }

    public final Object e(final orr orrVar, final oxh oxhVar, fcxy fcxyVar) throws Throwable {
        if (orrVar.ordinal() == 0) {
            Object objC = c(fcxyVar);
            return objC == fcyl.a ? objC : fctx.a;
        }
        if (oxhVar == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        oql oqlVar = this.e;
        orrVar.getClass();
        if (orrVar == orr.b || orrVar == orr.c) {
            oqlVar.a.a(null, new fdat() { // from class: oqi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    oqj oqjVar = (oqj) obj;
                    oqj oqjVar2 = (oqj) obj2;
                    oqjVar.getClass();
                    oqjVar2.getClass();
                    orr orrVar2 = orrVar;
                    oxh oxhVar2 = oxhVar;
                    if (orrVar2 == orr.b) {
                        oqjVar.a(oxhVar2);
                    } else {
                        oqjVar2.a(oxhVar2);
                    }
                    return fctx.a;
                }
            });
            return fctx.a;
        }
        Objects.toString(orrVar);
        throw new IllegalArgumentException("invalid load type for reset: ".concat(orrVar.toString()));
    }

    public final Object f(otw otwVar, orr orrVar, fcxy fcxyVar) {
        orz orzVar = otwVar.j;
        orp orpVarA = orzVar.a(orrVar);
        orn ornVar = orn.a;
        if (!fdbq.f(orpVarA, ornVar)) {
            orzVar.d(orrVar, ornVar);
            Object objA = this.g.a(new ose(orzVar.b()), fcxyVar);
            if (objA == fcyl.a) {
                return objA;
            }
        }
        return fctx.a;
    }

    public final void g() {
        this.k.t(null);
    }

    public final void h(fdjx fdjxVar) {
        if (this.b.f != Integer.MIN_VALUE) {
            fdil.d(fdjxVar, null, null, new otp(this, null), 3);
        }
        fdil.d(fdjxVar, null, null, new otq(this, null), 3);
        fdil.d(fdjxVar, null, null, new otr(this, null), 3);
    }
}
