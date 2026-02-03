package defpackage;

import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coaw implements cnyi {
    public final fcsu a;
    public final cogw b;
    public final fcyh c;
    public boolean d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fdjx l;
    private final cnvv m;
    private final fcsu n;
    private final fcsu o;
    private final cqce p;
    private final ekrg q;
    private final fdue r;
    private final List s;
    private final feav t;
    private final coaf u;

    public coaw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcyh fcyhVar, fdjx fdjxVar, cnvv cnvvVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) throws IOException {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cogwVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.a = fcsuVar4;
        this.b = cogwVar;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
        this.c = fcyhVar;
        this.l = fdjxVar;
        this.m = cnvvVar;
        this.n = fcsuVar9;
        this.o = fcsuVar12;
        this.p = cqce.g("Bugle", "MergingForwardSyncWorkOrganizer");
        this.q = ekrg.c("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer");
        eieu eieuVarH = eiiy.h("MergingForwardSyncWorkOrganizer::init");
        try {
            auvw.k(fdjxVar, null, null, new cnzt(this, null), 3);
            fczl.a(eieuVarH, null);
            this.r = fdun.d(0, 100, 2);
            this.s = new ArrayList();
            this.t = new feaz();
            this.u = new coaf(fcsuVar11, this);
        } finally {
        }
    }

    private final fcti w(Collection collection) {
        Object objB = this.e.b();
        objB.getClass();
        cnyz cnyzVar = (cnyz) fcva.U(collection, (Comparator) objB);
        List listAq = fcva.aq(collection);
        fdcm.f(listAq);
        listAq.remove(cnyzVar);
        return new fcti(cnyzVar, listAq);
    }

    private final void x(String str, cnyz cnyzVar) {
        cqbd cqbdVarC = this.p.c();
        cqbdVarC.I(str);
        coay.c(cqbdVarC, cnyzVar, "syncId");
        cqbdVarC.A("syncParams", coay.a(cnyzVar));
        cqbdVarC.r();
    }

    private final boolean y(cnyx cnyxVar, cnyy cnyyVar) {
        cnyx cnyxVar2 = cnyyVar.c;
        if (cnyxVar2 == null) {
            cnyxVar2 = cnyx.a;
        }
        if (!fdbq.f(cnyxVar, cnyxVar2)) {
            return false;
        }
        ekrg ekrgVar = this.q;
        ((ekrd) ekrgVar.j().h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer", "noChangeAfterRetry", 609, "MergingForwardSyncWorkOrganizer.kt")).q("Detected the same out-of-sync messages after retrying sync");
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer", "noChangeAfterRetry", 612, "MergingForwardSyncWorkOrganizer.kt")).u("Telephony message count: [%d], Bugle message count: [%d]", cnyxVar.b, cnyxVar.c);
        return true;
    }

    private static final boolean z(cnxt cnxtVar) {
        return !fcva.g(cnxu.a, cnxu.b).contains(cnxtVar.a) || cnxtVar.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f4, code lost:
    
        if (a(r2, r0, r3) != r4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0319, code lost:
    
        if (r2.a(r0, r5, r3) == r4) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0297 A[PHI: r0 r5 r6
      0x0297: PHI (r0v24 cobx) = (r0v18 cobx), (r0v21 cobx), (r0v26 cobx) binds: [B:57:0x01d9, B:83:0x0295, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r5v49 cnyz) = (r5v44 cnyz), (r5v47 cnyz), (r5v50 cnyz) binds: [B:57:0x01d9, B:83:0x0295, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r6v8 enqq) = (r6v4 enqq), (r6v6 enqq), (r6v9 enqq) binds: [B:57:0x01d9, B:83:0x0295, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fc  */
    @Override // defpackage.cnyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cnyz r17, defpackage.enqq r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.a(cnyz, enqq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:381:0x092a, code lost:
    
        r5 = r6;
        r9 = r7;
        r6 = r10;
        r4 = r15;
        r7 = r21;
        r10 = r26;
        r15 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:280:0x082a, B:288:0x08bd], limit reached: 394 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0375 A[Catch: all -> 0x03e6, TryCatch #7 {all -> 0x03e6, blocks: (B:101:0x0368, B:103:0x0375, B:105:0x037f, B:104:0x037b), top: B:352:0x0368 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037b A[Catch: all -> 0x03e6, TryCatch #7 {all -> 0x03e6, blocks: (B:101:0x0368, B:103:0x0375, B:105:0x037f, B:104:0x037b), top: B:352:0x0368 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0402 A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0419 A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0427 A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x048f A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0587 A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05de A[Catch: all -> 0x0951, TryCatch #14 {all -> 0x0951, blocks: (B:206:0x05d5, B:208:0x05de, B:210:0x05e4, B:223:0x061f, B:235:0x0652, B:237:0x066f, B:238:0x0671, B:240:0x068c, B:241:0x068e, B:260:0x0742, B:262:0x074b, B:265:0x0757, B:267:0x075d, B:269:0x078b, B:271:0x07a6, B:272:0x07a8, B:274:0x07b1, B:275:0x07cf, B:277:0x081d, B:278:0x0821, B:280:0x082a, B:282:0x0840, B:283:0x0842, B:285:0x084b, B:286:0x0868, B:288:0x08bd, B:226:0x0626, B:228:0x062a, B:230:0x0630, B:232:0x063a, B:234:0x0646, B:213:0x05eb, B:214:0x05ef, B:216:0x05f5, B:218:0x0606, B:220:0x060e, B:221:0x061b, B:313:0x094b, B:314:0x0950), top: B:365:0x05d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x061b A[Catch: all -> 0x0951, TryCatch #14 {all -> 0x0951, blocks: (B:206:0x05d5, B:208:0x05de, B:210:0x05e4, B:223:0x061f, B:235:0x0652, B:237:0x066f, B:238:0x0671, B:240:0x068c, B:241:0x068e, B:260:0x0742, B:262:0x074b, B:265:0x0757, B:267:0x075d, B:269:0x078b, B:271:0x07a6, B:272:0x07a8, B:274:0x07b1, B:275:0x07cf, B:277:0x081d, B:278:0x0821, B:280:0x082a, B:282:0x0840, B:283:0x0842, B:285:0x084b, B:286:0x0868, B:288:0x08bd, B:226:0x0626, B:228:0x062a, B:230:0x0630, B:232:0x063a, B:234:0x0646, B:213:0x05eb, B:214:0x05ef, B:216:0x05f5, B:218:0x0606, B:220:0x060e, B:221:0x061b, B:313:0x094b, B:314:0x0950), top: B:365:0x05d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x066f A[Catch: all -> 0x0951, TryCatch #14 {all -> 0x0951, blocks: (B:206:0x05d5, B:208:0x05de, B:210:0x05e4, B:223:0x061f, B:235:0x0652, B:237:0x066f, B:238:0x0671, B:240:0x068c, B:241:0x068e, B:260:0x0742, B:262:0x074b, B:265:0x0757, B:267:0x075d, B:269:0x078b, B:271:0x07a6, B:272:0x07a8, B:274:0x07b1, B:275:0x07cf, B:277:0x081d, B:278:0x0821, B:280:0x082a, B:282:0x0840, B:283:0x0842, B:285:0x084b, B:286:0x0868, B:288:0x08bd, B:226:0x0626, B:228:0x062a, B:230:0x0630, B:232:0x063a, B:234:0x0646, B:213:0x05eb, B:214:0x05ef, B:216:0x05f5, B:218:0x0606, B:220:0x060e, B:221:0x061b, B:313:0x094b, B:314:0x0950), top: B:365:0x05d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x068c A[Catch: all -> 0x0951, TryCatch #14 {all -> 0x0951, blocks: (B:206:0x05d5, B:208:0x05de, B:210:0x05e4, B:223:0x061f, B:235:0x0652, B:237:0x066f, B:238:0x0671, B:240:0x068c, B:241:0x068e, B:260:0x0742, B:262:0x074b, B:265:0x0757, B:267:0x075d, B:269:0x078b, B:271:0x07a6, B:272:0x07a8, B:274:0x07b1, B:275:0x07cf, B:277:0x081d, B:278:0x0821, B:280:0x082a, B:282:0x0840, B:283:0x0842, B:285:0x084b, B:286:0x0868, B:288:0x08bd, B:226:0x0626, B:228:0x062a, B:230:0x0630, B:232:0x063a, B:234:0x0646, B:213:0x05eb, B:214:0x05ef, B:216:0x05f5, B:218:0x0606, B:220:0x060e, B:221:0x061b, B:313:0x094b, B:314:0x0950), top: B:365:0x05d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06cf A[Catch: all -> 0x0942, TRY_LEAVE, TryCatch #2 {all -> 0x0942, blocks: (B:245:0x06c9, B:247:0x06cf), top: B:342:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x074b A[Catch: all -> 0x0951, TryCatch #14 {all -> 0x0951, blocks: (B:206:0x05d5, B:208:0x05de, B:210:0x05e4, B:223:0x061f, B:235:0x0652, B:237:0x066f, B:238:0x0671, B:240:0x068c, B:241:0x068e, B:260:0x0742, B:262:0x074b, B:265:0x0757, B:267:0x075d, B:269:0x078b, B:271:0x07a6, B:272:0x07a8, B:274:0x07b1, B:275:0x07cf, B:277:0x081d, B:278:0x0821, B:280:0x082a, B:282:0x0840, B:283:0x0842, B:285:0x084b, B:286:0x0868, B:288:0x08bd, B:226:0x0626, B:228:0x062a, B:230:0x0630, B:232:0x063a, B:234:0x0646, B:213:0x05eb, B:214:0x05ef, B:216:0x05f5, B:218:0x0606, B:220:0x060e, B:221:0x061b, B:313:0x094b, B:314:0x0950), top: B:365:0x05d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0964 A[Catch: all -> 0x0220, TRY_LEAVE, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0266 A[Catch: all -> 0x0209, TryCatch #9 {all -> 0x0209, blocks: (B:47:0x01f4, B:70:0x0279, B:50:0x0205, B:66:0x0262, B:68:0x0266), top: B:339:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029c A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:298:0x091b, B:73:0x0298, B:75:0x029c, B:77:0x02b0, B:79:0x02d2, B:80:0x02d4, B:82:0x02e6, B:83:0x02e8, B:86:0x02fb, B:88:0x0308, B:89:0x030a, B:91:0x0312, B:93:0x031a, B:94:0x031c, B:96:0x032a, B:98:0x0331, B:126:0x03f8, B:128:0x0402, B:130:0x040a, B:132:0x0419, B:133:0x041b, B:135:0x0427, B:137:0x042b, B:138:0x042d, B:139:0x0447, B:141:0x044d, B:143:0x045a, B:145:0x0461, B:144:0x045f, B:146:0x046d, B:148:0x047c, B:149:0x047e, B:196:0x0574, B:198:0x0587, B:199:0x0589, B:291:0x08c7, B:304:0x0932, B:305:0x0935, B:311:0x0947, B:312:0x094a, B:324:0x0960, B:325:0x0963, B:150:0x048f, B:152:0x0498, B:153:0x049a, B:158:0x04aa, B:160:0x04b0, B:161:0x04b2, B:162:0x04d2, B:163:0x04d3, B:165:0x04d7, B:166:0x04d9, B:168:0x04de, B:170:0x04e5, B:172:0x04e9, B:173:0x04eb, B:175:0x04f8, B:177:0x0502, B:179:0x0506, B:180:0x0508, B:192:0x0558, B:194:0x0564, B:195:0x0566, B:181:0x0519, B:183:0x051f, B:184:0x0521, B:187:0x052f, B:189:0x0535, B:190:0x0537, B:191:0x0557, B:169:0x04e3, B:174:0x04f3, B:123:0x03ee, B:124:0x03f1, B:97:0x032f, B:326:0x0964, B:18:0x0085, B:21:0x00b1, B:44:0x01d7, B:72:0x027c, B:331:0x097c, B:332:0x097f, B:55:0x0219, B:60:0x022c, B:322:0x095e), top: B:339:0x0028, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v38, types: [cnxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [coaw] */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v94, types: [cnxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:296:0x090e -> B:361:0x0919). Please report as a decompilation issue!!! */
    @Override // defpackage.cnyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cnxb r32, defpackage.fcxy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.b(cnxb, fcxy):java.lang.Object");
    }

    @Override // defpackage.cnyi
    public final void c(Instant instant) {
        if (this.d) {
            this.p.p(a.h(instant, "New message inserted at timestamp [", "] while sync in progress"));
            this.s.add(instant);
        }
    }

    @Override // defpackage.cnyi
    public final boolean d() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cnzw
            if (r0 == 0) goto L13
            r0 = r5
            cnzw r0 = (defpackage.cnzw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnzw r0 = new cnzw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            coaf r5 = r4.u
            cnzp r2 = new cnzp
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            cnza r5 = (defpackage.cnza) r5
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        if (defpackage.fdxs.c(r2, r3) != r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        if (defpackage.fdxs.c(r2, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015f, code lost:
    
        if (q(r1, r5, r3) != r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cnyk r17, defpackage.cnxu r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.f(cnyk, cnxu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fe, code lost:
    
        if (r3 == r6) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cnyk r21, defpackage.cobo r22, defpackage.cnxt r23, java.util.UUID r24, defpackage.cnxb r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.g(cnyk, cobo, cnxt, java.util.UUID, cnxb, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d8, code lost:
    
        if (s(r10, r11, r0) != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cnyk r9, defpackage.cnxb r10, j$.time.Instant r11, java.util.UUID r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.h(cnyk, cnxb, j$.time.Instant, java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.coah
            if (r0 == 0) goto L13
            r0 = r5
            coah r0 = (defpackage.coah) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coah r0 = new coah
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            coaf r5 = r4.u
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L51
        L3c:
            r0 = r5
            cnza r0 = (defpackage.cnza) r0
            int r0 = r0.b
            r0 = r0 & r3
            r1 = 0
            if (r3 == r0) goto L46
            r5 = r1
        L46:
            cnza r5 = (defpackage.cnza) r5
            if (r5 == 0) goto L51
            cnyk r5 = r5.d
            if (r5 != 0) goto L50
            cnyk r5 = defpackage.cnyk.a
        L50:
            return r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.coai
            if (r0 == 0) goto L13
            r0 = r5
            coai r0 = (defpackage.coai) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coai r0 = new coai
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            coaf r5 = r4.u
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L52
        L3c:
            r0 = r5
            cnza r0 = (defpackage.cnza) r0
            int r0 = r0.b
            r0 = r0 & 2
            r1 = 0
            if (r0 != 0) goto L47
            r5 = r1
        L47:
            cnza r5 = (defpackage.cnza) r5
            if (r5 == 0) goto L52
            cnyp r5 = r5.e
            if (r5 != 0) goto L51
            cnyp r5 = defpackage.cnyp.a
        L51:
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.j(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.cnyk r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.k(cnyk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.coak
            if (r0 == 0) goto L13
            r0 = r7
            coak r0 = (defpackage.coak) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coak r0 = new coak
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.fctl.b(r7)
            goto L54
        L39:
            defpackage.fctl.b(r7)
            goto L48
        L3d:
            defpackage.fctl.b(r7)
            r0.c = r5
            java.lang.Object r7 = r6.j(r0)
            if (r7 == r1) goto L64
        L48:
            cnyp r7 = (defpackage.cnyp) r7
            if (r7 == 0) goto L5a
            r0.c = r4
            java.lang.Object r7 = r6.u(r7, r0)
            if (r7 == r1) goto L64
        L54:
            cnyk r7 = (defpackage.cnyk) r7
            if (r7 != 0) goto L59
            goto L5a
        L59:
            return r7
        L5a:
            r0.c = r3
            java.lang.Object r7 = r6.m(r0)
            if (r7 != r1) goto L63
            goto L64
        L63:
            return r7
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.l(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (defpackage.fdxs.c(r11, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.m(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.coam
            if (r0 == 0) goto L13
            r0 = r5
            coam r0 = (defpackage.coam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coam r0 = new coam
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            coaf r5 = r4.u
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            cnza r5 = (defpackage.cnza) r5
            evtg r5 = r5.c
            int r5 = r5.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.n(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.cobw r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.coan
            if (r0 == 0) goto L13
            r0 = r14
            coan r0 = (defpackage.coan) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coan r0 = new coan
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.Object r13 = r0.a
            defpackage.fctl.b(r14)
            goto Lbf
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            defpackage.fctl.b(r14)
            cqce r14 = r12.p
            cqbd r2 = r14.c()
            java.lang.String r4 = "Queued sync(s) merged with Active Sync"
            r2.I(r4)
            java.util.Set r13 = r13.c
            int r4 = r13.size()
            java.lang.String r5 = "mergeDetailsCount"
            r2.y(r5, r4)
            r2.r()
            java.util.Iterator r2 = r13.iterator()
        L52:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r2.next()
            cobv r4 = (defpackage.cobv) r4
            cnyz r5 = r4.c
            cqbd r6 = r14.a()
            cnyz r7 = r4.a
            evqs r8 = r7.e
            r8.getClass()
            evqs r4 = r4.b
            java.util.UUID r8 = defpackage.cobs.c(r8)
            java.util.UUID r9 = defpackage.cobs.c(r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Queued sync request ["
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = "] merged into active sync ["
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = "]"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r6.I(r8)
            if (r5 == 0) goto L97
            r5 = r3
            goto L98
        L97:
            r5 = 0
        L98:
            java.lang.String r8 = "wasPartialMerge"
            r6.B(r8, r5)
            r6.r()
            fcsu r6 = r12.k
            java.lang.Object r6 = r6.b()
            cnvb r6 = (defpackage.cnvb) r6
            evqs r7 = r7.e
            r7.getClass()
            java.util.UUID r7 = defpackage.cobs.c(r7)
            java.util.UUID r4 = defpackage.cobs.c(r4)
            r8 = 8
            r6.c(r7, r4, r8, r5)
            goto L52
        Lbb:
            java.util.Iterator r13 = r13.iterator()
        Lbf:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lde
            java.lang.Object r14 = r13.next()
            cobv r14 = (defpackage.cobv) r14
            fdue r2 = r12.r
            cnvg r4 = new cnvg
            r5 = 2
            r4.<init>(r14, r5)
            r0.a = r13
            r0.d = r3
            java.lang.Object r14 = r2.fO(r4, r0)
            if (r14 != r1) goto Lbf
            return r1
        Lde:
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.o(cobw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.cobx r17, java.util.UUID r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.p(cobx, java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x015c, code lost:
    
        if (r2.fO(r1, r4) != r5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.cnxu r22, defpackage.cnyk r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.q(cnxu, cnyk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.cnyk r8, java.util.UUID r9, boolean r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.coaq
            if (r0 == 0) goto L13
            r0 = r11
            coaq r0 = (defpackage.coaq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coaq r0 = new coaq
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            cnvj r8 = r0.d
            defpackage.fctl.b(r11)
            goto La4
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r11)
            cnyz r11 = r8.c
            if (r11 != 0) goto L3b
            cnyz r11 = defpackage.cnyz.a
        L3b:
            r11.getClass()
            java.lang.String r2 = "Resumed sync"
            r7.x(r2, r11)
            fcsu r11 = r7.k
            java.lang.Object r11 = r11.b()
            cnvb r11 = (defpackage.cnvb) r11
            cnyz r2 = r8.c
            if (r2 != 0) goto L51
            cnyz r2 = defpackage.cnyz.a
        L51:
            evqs r2 = r2.e
            r2.getClass()
            java.util.UUID r2 = defpackage.cobs.c(r2)
            enqt r4 = defpackage.enqt.a
            evsf r4 = r4.createBuilder()
            enqs r4 = (defpackage.enqs) r4
            evqs r9 = defpackage.cnru.a(r9)
            r4.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance
            enqt r5 = (defpackage.enqt) r5
            int r6 = r5.b
            r6 = r6 | r3
            r5.b = r6
            r5.c = r9
            r4.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r9 = r4.instance
            enqt r9 = (defpackage.enqt) r9
            int r5 = r9.b
            r5 = r5 | 2
            r9.b = r5
            r9.d = r10
            evsn r9 = r4.build()
            enqt r9 = (defpackage.enqt) r9
            cnuj r10 = r11.d
            int r11 = defpackage.ekgb.d
            ekgb r11 = defpackage.ekoe.a
            r10.b(r2, r11, r9)
            cnvj r9 = new cnvj
            r9.<init>(r8)
            fdue r8 = r7.r
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 == r1) goto Lb6
            r8 = r9
        La4:
            cnvv r9 = r7.m
            r8.getClass()
            cnvk r10 = new cnvk
            cnyk r8 = r8.a
            r10.<init>(r8)
            r9.c(r10)
            fctx r8 = defpackage.fctx.a
            return r8
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.r(cnyk, java.util.UUID, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.cnyk r9, java.util.UUID r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.s(cnyk, java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (o(r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.cnyk r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.coas
            if (r0 == 0) goto L13
            r0 = r8
            coas r0 = (defpackage.coas) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coas r0 = new coas
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.a
            cobw r7 = (defpackage.cobw) r7
            defpackage.fctl.b(r8)
            goto L92
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.a
            cobw r7 = (defpackage.cobw) r7
            defpackage.fctl.b(r8)
            goto L87
        L41:
            cnyk r7 = r0.e
            java.lang.Object r2 = r0.a
            coby r2 = (defpackage.coby) r2
            defpackage.fctl.b(r8)
            goto L65
        L4b:
            defpackage.fctl.b(r8)
            fcsu r8 = r6.f
            java.lang.Object r8 = r8.b()
            r2 = r8
            coby r2 = (defpackage.coby) r2
            coaf r8 = r6.u
            r0.a = r2
            r0.e = r7
            r0.d = r5
            java.lang.Object r8 = r8.b(r0)
            if (r8 == r1) goto L95
        L65:
            cnza r8 = (defpackage.cnza) r8
            evtg r8 = r8.c
            r8.getClass()
            cobw r7 = r2.a(r7, r8)
            r8 = 0
            if (r7 != 0) goto L74
            return r8
        L74:
            coaf r2 = r6.u
            cnzo r5 = new cnzo
            r5.<init>()
            r0.a = r7
            r0.e = r8
            r0.d = r4
            java.lang.Object r8 = r2.c(r5, r0)
            if (r8 == r1) goto L95
        L87:
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.o(r7, r0)
            if (r8 != r1) goto L92
            goto L95
        L92:
            cnyk r7 = r7.b
            return r7
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.t(cnyk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.cnyp r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.coau
            if (r0 == 0) goto L13
            r0 = r6
            coau r0 = (defpackage.coau) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coau r0 = new coau
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cnyk r5 = r0.e
            cnyk r0 = r0.d
            defpackage.fctl.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r6)
            cnyk r5 = r5.c
            if (r5 != 0) goto L3c
            cnyk r5 = defpackage.cnyk.a
        L3c:
            coaf r6 = r4.u
            cnzs r2 = new cnzs
            r2.<init>()
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 == r1) goto L6b
            r0 = r5
        L50:
            cqce r6 = r4.p
            cqbd r6 = r6.c()
            java.lang.String r1 = "Restored interrupted sync to active"
            r6.I(r1)
            cnyz r5 = r5.c
            if (r5 != 0) goto L61
            cnyz r5 = defpackage.cnyz.a
        L61:
            r5.getClass()
            defpackage.coay.d(r6, r5)
            r6.r()
            return r0
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.u(cnyp, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.cnyk r9, defpackage.cnxt r10, defpackage.cnxb r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaw.v(cnyk, cnxt, cnxb, fcxy):java.lang.Object");
    }
}
