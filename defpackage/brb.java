package defpackage;

import android.util.Log;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brb implements ayv {
    public final bgz a;
    public final bqz b;
    public bdu d;
    public final big g;
    private final bnm i;
    private bdr m;
    private bvk n;
    private final azu o;
    private final azu p;
    private final brh r;
    public final List c = new ArrayList();
    private final List j = new ArrayList();
    public List e = Collections.EMPTY_LIST;
    public Range f = bms.h;
    public final Object h = new Object();
    private boolean k = true;
    private bjq l = null;
    private final brx q = new brx();

    public brb(biu biuVar, bgy bgyVar, azu azuVar, azu azuVar2, brh brhVar, bnm bnmVar) {
        this.g = bgyVar.b;
        this.a = new bgz(biuVar, bgyVar);
        this.o = azuVar;
        this.p = azuVar2;
        this.i = bnmVar;
        this.b = l(bgyVar);
        this.r = brhVar;
    }

    static Map d(Collection collection, bnm bnmVar, bnm bnmVar2, Range range) {
        bni bniVarF;
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            if (bdrVar instanceof bvk) {
                bvk bvkVar = (bvk) bdrVar;
                bni bniVarF2 = new bce().b().f(false, bnmVar);
                if (bniVarF2 == null) {
                    bniVarF = null;
                } else {
                    bli bliVarB = bli.b(bniVarF2);
                    bliVarB.e(brm.n);
                    bniVarF = bvkVar.e(bliVarB).c();
                }
            } else {
                bniVarF = bdrVar.f(false, bnmVar);
            }
            bni bniVarF3 = bdrVar.f(true, bnmVar2);
            bli bliVarB2 = bniVarF3 != null ? bli.b(bniVarF3) : bli.a();
            bliVarB2.c(bni.v, range);
            map.put(bdrVar, new bra(bniVarF, bdrVar.e(bliVarB2).c()));
        }
        return map;
    }

    static boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (k((bdr) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(bdr bdrVar) {
        if (bdrVar != null) {
            if (bdrVar.l.t(bni.y)) {
                return bdrVar.l.l() == bnk.VIDEO_CAPTURE;
            }
            Objects.toString(bdrVar);
            Log.e("CameraUseCaseAdapter", bdrVar.toString().concat(" UseCase does not have capture type."));
        }
        return false;
    }

    public static bqz l(bgy bgyVar) {
        return new bqt(bgyVar.l().concat(""), ((bii) bgyVar.b).h);
    }

    private static List m(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            bdrVar.O(null);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ayy ayyVar = (ayy) it2.next();
                if (bdrVar.T(ayyVar.a)) {
                    lcg.d(bdrVar.p == null, bdrVar + " already has effect" + bdrVar.p);
                    bdrVar.O(ayyVar);
                    arrayList.remove(ayyVar);
                }
            }
        }
        return arrayList;
    }

    private final boolean n() {
        boolean z;
        synchronized (this.h) {
            z = this.g.b() != null;
        }
        return z;
    }

    private static boolean o(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            if (bdrVar instanceof bbf) {
                bni bniVar = bdrVar.l;
                bjo bjoVar = bkp.e;
                if (bniVar.t(bjoVar)) {
                    Integer num = (Integer) bniVar.m(bjoVar);
                    lcg.i(num);
                    if (num.intValue() == 2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this.h) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    @Override // defpackage.ayv
    public final ayx b() {
        throw null;
    }

    @Override // defpackage.ayv
    public final azd c() {
        throw null;
    }

    public final void e() {
        Object obj = this.h;
        synchronized (obj) {
            if (!this.k) {
                List list = this.j;
                if (!list.isEmpty()) {
                    this.a.B(this.g);
                }
                bgz bgzVar = this.a;
                bgzVar.o(list);
                synchronized (obj) {
                    bjq bjqVar = this.l;
                    if (bjqVar != null) {
                        bgzVar.b.o(bjqVar);
                    }
                    Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        ((bdr) it.next()).M();
                    }
                    this.k = true;
                }
            }
        }
    }

    public final void f() {
        Object obj = this.h;
        synchronized (obj) {
            if (this.k) {
                bgz bgzVar = this.a;
                bgzVar.s(new ArrayList(this.j));
                synchronized (obj) {
                    bgw bgwVar = bgzVar.b;
                    this.l = bgwVar.f();
                    bgwVar.r();
                    this.k = false;
                }
            }
        }
    }

    public final void g(Collection collection) {
        synchronized (this.h) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((bdr) it.next()).P(null);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.c);
            linkedHashSet.removeAll(collection);
            i(linkedHashSet, false, false);
        }
    }

    public final void h(boolean z) {
        this.a.A(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        throw new java.lang.IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0145, code lost:
    
        if (r7 != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ce A[Catch: all -> 0x091e, TryCatch #12 {, blocks: (B:4:0x0007, B:6:0x000f, B:7:0x0013, B:9:0x0019, B:18:0x0037, B:19:0x003e, B:20:0x003f, B:23:0x0046, B:24:0x004d, B:25:0x004e, B:46:0x0098, B:48:0x009e, B:98:0x0147, B:99:0x014a, B:51:0x00a6, B:53:0x00b4, B:55:0x00ba, B:57:0x00c2, B:60:0x00ca, B:62:0x00d0, B:64:0x00d8, B:67:0x00e0, B:69:0x00e4, B:71:0x00ea, B:73:0x00f2, B:76:0x00f9, B:85:0x0116, B:88:0x011e, B:89:0x0122, B:91:0x0128, B:93:0x0138, B:79:0x0101, B:80:0x0105, B:82:0x010b, B:101:0x014c, B:158:0x0219, B:159:0x021b, B:203:0x02c7, B:205:0x02ce, B:207:0x02d3, B:208:0x02dd, B:209:0x0309, B:210:0x030d, B:212:0x030f, B:213:0x0335, B:215:0x033b, B:217:0x034b, B:219:0x0355, B:221:0x0361, B:223:0x036b, B:225:0x0374, B:227:0x039f, B:228:0x03bb, B:229:0x03c2, B:230:0x03c3, B:231:0x03ca, B:232:0x03cb, B:233:0x03d2, B:234:0x03d3, B:235:0x03da, B:236:0x03db, B:238:0x0413, B:239:0x041d, B:242:0x0423, B:244:0x0427, B:246:0x042d, B:248:0x0435, B:250:0x043b, B:252:0x044b, B:254:0x0469, B:258:0x0475, B:262:0x0485, B:263:0x048c, B:264:0x048d, B:266:0x0497, B:268:0x04b9, B:269:0x04c5, B:271:0x04cb, B:273:0x04e3, B:274:0x04e7, B:275:0x04ee, B:276:0x04ef, B:277:0x04fe, B:279:0x0504, B:281:0x0514, B:283:0x051e, B:284:0x0529, B:285:0x0530, B:291:0x0547, B:292:0x054b, B:293:0x054d, B:402:0x07ae, B:404:0x07ca, B:405:0x07dc, B:406:0x07e0, B:408:0x07e6, B:409:0x07f2, B:411:0x07ff, B:412:0x0803, B:414:0x0809, B:416:0x0815, B:418:0x0821, B:428:0x086a, B:430:0x0874, B:421:0x0842, B:422:0x084a, B:424:0x0850, B:426:0x085c, B:431:0x0878, B:432:0x087c, B:434:0x0882, B:435:0x08aa, B:437:0x08ae, B:439:0x08b6, B:440:0x08ba, B:442:0x08c0, B:443:0x08ca, B:444:0x08e2, B:448:0x08e6, B:286:0x0531, B:287:0x053c, B:288:0x053d, B:289:0x0544, B:462:0x08f7, B:464:0x08fd, B:466:0x0907, B:467:0x090c, B:469:0x090e, B:454:0x08ee, B:475:0x0914, B:481:0x091a, B:484:0x091d, B:294:0x054e, B:296:0x0552, B:298:0x0558, B:302:0x056d, B:304:0x0587, B:308:0x0591, B:309:0x05ad, B:311:0x05b3, B:312:0x060a, B:382:0x06ee, B:383:0x0705, B:385:0x070b, B:386:0x072f, B:387:0x0733, B:389:0x0739, B:391:0x074e, B:392:0x0752, B:394:0x0758, B:396:0x0779, B:400:0x0782, B:401:0x07ad, B:315:0x0617, B:319:0x0632, B:322:0x0643, B:326:0x0651, B:376:0x06ab, B:377:0x06c9, B:378:0x06ca, B:379:0x06db, B:380:0x06e4, B:320:0x0638, B:321:0x063e, B:160:0x021c, B:162:0x0223, B:163:0x022d, B:167:0x0245, B:168:0x024b, B:170:0x0251, B:172:0x025b, B:175:0x0260, B:181:0x026c, B:183:0x0272, B:202:0x02c6, B:184:0x0289, B:185:0x028f, B:187:0x0295, B:189:0x029f, B:192:0x02a4, B:198:0x02b0, B:200:0x02b6, B:472:0x0911, B:164:0x022e, B:165:0x0242, B:102:0x014d, B:103:0x0152, B:121:0x018a, B:122:0x018e, B:124:0x0194, B:126:0x01a8, B:127:0x01ac, B:129:0x01b3, B:131:0x01b9, B:133:0x01bf, B:135:0x01c2, B:137:0x01c6, B:139:0x01d0, B:140:0x01d5, B:142:0x01d7, B:143:0x01e5, B:145:0x01eb, B:147:0x01f4, B:149:0x01fc, B:151:0x0206, B:153:0x0208, B:154:0x020b, B:155:0x020e, B:156:0x0217, B:478:0x0917, B:104:0x0153, B:105:0x015a, B:107:0x0160, B:109:0x016b, B:114:0x0178, B:119:0x0187, B:120:0x0189, B:117:0x0183, B:26:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0061, B:33:0x006b, B:35:0x0075, B:41:0x008c, B:42:0x0093, B:38:0x0085, B:43:0x0094), top: B:507:0x0007, inners: #1, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d3 A[Catch: all -> 0x091e, TryCatch #12 {, blocks: (B:4:0x0007, B:6:0x000f, B:7:0x0013, B:9:0x0019, B:18:0x0037, B:19:0x003e, B:20:0x003f, B:23:0x0046, B:24:0x004d, B:25:0x004e, B:46:0x0098, B:48:0x009e, B:98:0x0147, B:99:0x014a, B:51:0x00a6, B:53:0x00b4, B:55:0x00ba, B:57:0x00c2, B:60:0x00ca, B:62:0x00d0, B:64:0x00d8, B:67:0x00e0, B:69:0x00e4, B:71:0x00ea, B:73:0x00f2, B:76:0x00f9, B:85:0x0116, B:88:0x011e, B:89:0x0122, B:91:0x0128, B:93:0x0138, B:79:0x0101, B:80:0x0105, B:82:0x010b, B:101:0x014c, B:158:0x0219, B:159:0x021b, B:203:0x02c7, B:205:0x02ce, B:207:0x02d3, B:208:0x02dd, B:209:0x0309, B:210:0x030d, B:212:0x030f, B:213:0x0335, B:215:0x033b, B:217:0x034b, B:219:0x0355, B:221:0x0361, B:223:0x036b, B:225:0x0374, B:227:0x039f, B:228:0x03bb, B:229:0x03c2, B:230:0x03c3, B:231:0x03ca, B:232:0x03cb, B:233:0x03d2, B:234:0x03d3, B:235:0x03da, B:236:0x03db, B:238:0x0413, B:239:0x041d, B:242:0x0423, B:244:0x0427, B:246:0x042d, B:248:0x0435, B:250:0x043b, B:252:0x044b, B:254:0x0469, B:258:0x0475, B:262:0x0485, B:263:0x048c, B:264:0x048d, B:266:0x0497, B:268:0x04b9, B:269:0x04c5, B:271:0x04cb, B:273:0x04e3, B:274:0x04e7, B:275:0x04ee, B:276:0x04ef, B:277:0x04fe, B:279:0x0504, B:281:0x0514, B:283:0x051e, B:284:0x0529, B:285:0x0530, B:291:0x0547, B:292:0x054b, B:293:0x054d, B:402:0x07ae, B:404:0x07ca, B:405:0x07dc, B:406:0x07e0, B:408:0x07e6, B:409:0x07f2, B:411:0x07ff, B:412:0x0803, B:414:0x0809, B:416:0x0815, B:418:0x0821, B:428:0x086a, B:430:0x0874, B:421:0x0842, B:422:0x084a, B:424:0x0850, B:426:0x085c, B:431:0x0878, B:432:0x087c, B:434:0x0882, B:435:0x08aa, B:437:0x08ae, B:439:0x08b6, B:440:0x08ba, B:442:0x08c0, B:443:0x08ca, B:444:0x08e2, B:448:0x08e6, B:286:0x0531, B:287:0x053c, B:288:0x053d, B:289:0x0544, B:462:0x08f7, B:464:0x08fd, B:466:0x0907, B:467:0x090c, B:469:0x090e, B:454:0x08ee, B:475:0x0914, B:481:0x091a, B:484:0x091d, B:294:0x054e, B:296:0x0552, B:298:0x0558, B:302:0x056d, B:304:0x0587, B:308:0x0591, B:309:0x05ad, B:311:0x05b3, B:312:0x060a, B:382:0x06ee, B:383:0x0705, B:385:0x070b, B:386:0x072f, B:387:0x0733, B:389:0x0739, B:391:0x074e, B:392:0x0752, B:394:0x0758, B:396:0x0779, B:400:0x0782, B:401:0x07ad, B:315:0x0617, B:319:0x0632, B:322:0x0643, B:326:0x0651, B:376:0x06ab, B:377:0x06c9, B:378:0x06ca, B:379:0x06db, B:380:0x06e4, B:320:0x0638, B:321:0x063e, B:160:0x021c, B:162:0x0223, B:163:0x022d, B:167:0x0245, B:168:0x024b, B:170:0x0251, B:172:0x025b, B:175:0x0260, B:181:0x026c, B:183:0x0272, B:202:0x02c6, B:184:0x0289, B:185:0x028f, B:187:0x0295, B:189:0x029f, B:192:0x02a4, B:198:0x02b0, B:200:0x02b6, B:472:0x0911, B:164:0x022e, B:165:0x0242, B:102:0x014d, B:103:0x0152, B:121:0x018a, B:122:0x018e, B:124:0x0194, B:126:0x01a8, B:127:0x01ac, B:129:0x01b3, B:131:0x01b9, B:133:0x01bf, B:135:0x01c2, B:137:0x01c6, B:139:0x01d0, B:140:0x01d5, B:142:0x01d7, B:143:0x01e5, B:145:0x01eb, B:147:0x01f4, B:149:0x01fc, B:151:0x0206, B:153:0x0208, B:154:0x020b, B:155:0x020e, B:156:0x0217, B:478:0x0917, B:104:0x0153, B:105:0x015a, B:107:0x0160, B:109:0x016b, B:114:0x0178, B:119:0x0187, B:120:0x0189, B:117:0x0183, B:26:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0061, B:33:0x006b, B:35:0x0075, B:41:0x008c, B:42:0x0093, B:38:0x0085, B:43:0x0094), top: B:507:0x0007, inners: #1, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0666 A[PHI: r4
      0x0666: PHI (r4v16 int) = (r4v15 int), (r4v23 int) binds: [B:333:0x065e, B:336:0x0665] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0669 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x030e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e A[Catch: all -> 0x091e, TryCatch #12 {, blocks: (B:4:0x0007, B:6:0x000f, B:7:0x0013, B:9:0x0019, B:18:0x0037, B:19:0x003e, B:20:0x003f, B:23:0x0046, B:24:0x004d, B:25:0x004e, B:46:0x0098, B:48:0x009e, B:98:0x0147, B:99:0x014a, B:51:0x00a6, B:53:0x00b4, B:55:0x00ba, B:57:0x00c2, B:60:0x00ca, B:62:0x00d0, B:64:0x00d8, B:67:0x00e0, B:69:0x00e4, B:71:0x00ea, B:73:0x00f2, B:76:0x00f9, B:85:0x0116, B:88:0x011e, B:89:0x0122, B:91:0x0128, B:93:0x0138, B:79:0x0101, B:80:0x0105, B:82:0x010b, B:101:0x014c, B:158:0x0219, B:159:0x021b, B:203:0x02c7, B:205:0x02ce, B:207:0x02d3, B:208:0x02dd, B:209:0x0309, B:210:0x030d, B:212:0x030f, B:213:0x0335, B:215:0x033b, B:217:0x034b, B:219:0x0355, B:221:0x0361, B:223:0x036b, B:225:0x0374, B:227:0x039f, B:228:0x03bb, B:229:0x03c2, B:230:0x03c3, B:231:0x03ca, B:232:0x03cb, B:233:0x03d2, B:234:0x03d3, B:235:0x03da, B:236:0x03db, B:238:0x0413, B:239:0x041d, B:242:0x0423, B:244:0x0427, B:246:0x042d, B:248:0x0435, B:250:0x043b, B:252:0x044b, B:254:0x0469, B:258:0x0475, B:262:0x0485, B:263:0x048c, B:264:0x048d, B:266:0x0497, B:268:0x04b9, B:269:0x04c5, B:271:0x04cb, B:273:0x04e3, B:274:0x04e7, B:275:0x04ee, B:276:0x04ef, B:277:0x04fe, B:279:0x0504, B:281:0x0514, B:283:0x051e, B:284:0x0529, B:285:0x0530, B:291:0x0547, B:292:0x054b, B:293:0x054d, B:402:0x07ae, B:404:0x07ca, B:405:0x07dc, B:406:0x07e0, B:408:0x07e6, B:409:0x07f2, B:411:0x07ff, B:412:0x0803, B:414:0x0809, B:416:0x0815, B:418:0x0821, B:428:0x086a, B:430:0x0874, B:421:0x0842, B:422:0x084a, B:424:0x0850, B:426:0x085c, B:431:0x0878, B:432:0x087c, B:434:0x0882, B:435:0x08aa, B:437:0x08ae, B:439:0x08b6, B:440:0x08ba, B:442:0x08c0, B:443:0x08ca, B:444:0x08e2, B:448:0x08e6, B:286:0x0531, B:287:0x053c, B:288:0x053d, B:289:0x0544, B:462:0x08f7, B:464:0x08fd, B:466:0x0907, B:467:0x090c, B:469:0x090e, B:454:0x08ee, B:475:0x0914, B:481:0x091a, B:484:0x091d, B:294:0x054e, B:296:0x0552, B:298:0x0558, B:302:0x056d, B:304:0x0587, B:308:0x0591, B:309:0x05ad, B:311:0x05b3, B:312:0x060a, B:382:0x06ee, B:383:0x0705, B:385:0x070b, B:386:0x072f, B:387:0x0733, B:389:0x0739, B:391:0x074e, B:392:0x0752, B:394:0x0758, B:396:0x0779, B:400:0x0782, B:401:0x07ad, B:315:0x0617, B:319:0x0632, B:322:0x0643, B:326:0x0651, B:376:0x06ab, B:377:0x06c9, B:378:0x06ca, B:379:0x06db, B:380:0x06e4, B:320:0x0638, B:321:0x063e, B:160:0x021c, B:162:0x0223, B:163:0x022d, B:167:0x0245, B:168:0x024b, B:170:0x0251, B:172:0x025b, B:175:0x0260, B:181:0x026c, B:183:0x0272, B:202:0x02c6, B:184:0x0289, B:185:0x028f, B:187:0x0295, B:189:0x029f, B:192:0x02a4, B:198:0x02b0, B:200:0x02b6, B:472:0x0911, B:164:0x022e, B:165:0x0242, B:102:0x014d, B:103:0x0152, B:121:0x018a, B:122:0x018e, B:124:0x0194, B:126:0x01a8, B:127:0x01ac, B:129:0x01b3, B:131:0x01b9, B:133:0x01bf, B:135:0x01c2, B:137:0x01c6, B:139:0x01d0, B:140:0x01d5, B:142:0x01d7, B:143:0x01e5, B:145:0x01eb, B:147:0x01f4, B:149:0x01fc, B:151:0x0206, B:153:0x0208, B:154:0x020b, B:155:0x020e, B:156:0x0217, B:478:0x0917, B:104:0x0153, B:105:0x015a, B:107:0x0160, B:109:0x016b, B:114:0x0178, B:119:0x0187, B:120:0x0189, B:117:0x0183, B:26:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0061, B:33:0x006b, B:35:0x0075, B:41:0x008c, B:42:0x0093, B:38:0x0085, B:43:0x0094), top: B:507:0x0007, inners: #1, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /* JADX WARN: Type inference failed for: r8v7, types: [bjq, bma] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Collection r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 2337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brb.i(java.util.Collection, boolean, boolean):void");
    }
}
