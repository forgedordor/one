package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiml {
    public final eiii e;
    public final float f;
    public eies j;
    public eies k;
    private final SparseArray l;
    private final long[] m;
    private final boolean[] n;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public final Map c = new HashMap();
    public final fegb d = (fegb) fegm.a.createBuilder();
    public long g = 0;
    public long h = Long.MAX_VALUE;
    public long i = Long.MIN_VALUE;
    private long o = 1;
    private long p = 2;

    public eiml(eiii eiiiVar, SparseArray sparseArray, float f) {
        this.e = eiiiVar;
        this.l = sparseArray;
        this.f = f;
        this.n = new boolean[eiiiVar.e.size()];
        this.m = new long[eiiiVar.e.size()];
    }

    private final long c(long j, evrj evrjVar, String str) {
        long j2 = this.o;
        this.o = 1 + j2;
        fegv fegvVar = (fegv) fegw.a.createBuilder();
        fegvVar.copyOnWrite();
        fegw fegwVar = (fegw) fegvVar.instance;
        fegwVar.b |= 2;
        fegwVar.d = j;
        fegvVar.copyOnWrite();
        fegw fegwVar2 = (fegw) fegvVar.instance;
        fegwVar2.b |= 1;
        fegwVar2.c = str;
        n(j2, evrjVar, (fegw) fegvVar.build());
        feje fejeVarM = m(j2);
        fejeVarM.copyOnWrite();
        fejf fejfVar = (fejf) fejeVarM.instance;
        fejf fejfVar2 = fejf.a;
        fejfVar.b |= 16;
        fejfVar.g = true;
        return j2;
    }

    private final long d(int i) {
        long[] jArr = this.m;
        long j = jArr[i];
        if (j != 0) {
            return j;
        }
        long j2 = this.o;
        this.o = 1 + j2;
        jArr[i] = j2;
        return j2;
    }

    private final long e(eies eiesVar) {
        return d(eiesVar.d);
    }

    private static long f(eies eiesVar) {
        return ((eiesVar.f + eiesVar.h) * 1000000) + eiesVar.g + eiesVar.i;
    }

    private static long g(eies eiesVar) {
        return (eiesVar.f * 1000000) + eiesVar.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eimk h(defpackage.eies r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiml.h(eies):eimk");
    }

    private static evrj i(eies eiesVar) {
        return evwy.e(f(eiesVar));
    }

    private static evrj j(eies eiesVar) {
        return k(eiesVar, 0L);
    }

    private static evrj k(eies eiesVar, long j) {
        return evwy.e(g(eiesVar) + j);
    }

    private final fegw l(eies eiesVar, long j) {
        fegv fegvVar = (fegv) fegw.a.createBuilder();
        String str = eiesVar.c;
        fegvVar.copyOnWrite();
        fegw fegwVar = (fegw) fegvVar.instance;
        str.getClass();
        fegwVar.b |= 1;
        fegwVar.c = str;
        fegvVar.copyOnWrite();
        fegw fegwVar2 = (fegw) fegvVar.instance;
        fegwVar2.b |= 2;
        fegwVar2.d = j;
        ekhx ekhxVarA = eigw.a((eiez) this.l.get(eiesVar.d, eiey.a));
        if (ekhxVarA != null) {
            fegvVar.copyOnWrite();
            fegw fegwVar3 = (fegw) fegvVar.instance;
            evta evtaVar = fegwVar3.e;
            if (!evtaVar.c()) {
                fegwVar3.e = evsn.mutableCopy(evtaVar);
            }
            evpz.addAll(ekhxVarA, fegwVar3.e);
        }
        return (fegw) fegvVar.build();
    }

    private final feje m(long j) {
        Map map = this.a;
        Long lValueOf = Long.valueOf(j);
        feje fejeVar = (feje) map.get(lValueOf);
        if (fejeVar != null) {
            return fejeVar;
        }
        feje fejeVar2 = (feje) fejf.a.createBuilder();
        fejeVar2.copyOnWrite();
        fejf fejfVar = (fejf) fejeVar2.instance;
        fejfVar.b |= 1;
        fejfVar.c = j;
        map.put(lValueOf, fejeVar2);
        return fejeVar2;
    }

    private final void n(long j, evrj evrjVar, fegw fegwVar) {
        fegn fegnVar = (fegn) fegx.a.createBuilder();
        fegnVar.copyOnWrite();
        fegx fegxVar = (fegx) fegnVar.instance;
        fegxVar.b |= 1;
        fegxVar.e = j;
        fegnVar.copyOnWrite();
        fegx fegxVar2 = (fegx) fegnVar.instance;
        evrjVar.getClass();
        fegxVar2.f = evrjVar;
        fegxVar2.b |= 2;
        fego fegoVar = (fego) fegp.a.createBuilder();
        fegoVar.copyOnWrite();
        fegp fegpVar = (fegp) fegoVar.instance;
        fegwVar.getClass();
        fegpVar.c = fegwVar;
        fegpVar.b |= 1;
        fegnVar.copyOnWrite();
        fegx fegxVar3 = (fegx) fegnVar.instance;
        fegp fegpVar2 = (fegp) fegoVar.build();
        fegpVar2.getClass();
        fegxVar3.d = fegpVar2;
        fegxVar3.c = 5;
        this.d.a(fegnVar);
    }

    private final void o(eies eiesVar, long j, long j2, long j3, String str, long j4) {
        long jE = e(eiesVar);
        evrj evrjVarK = k(eiesVar, j4);
        fegq fegqVar = (fegq) fegs.a.createBuilder();
        fegw fegwVarL = l(eiesVar, j);
        fegqVar.copyOnWrite();
        fegs fegsVar = (fegs) fegqVar.instance;
        fegwVarL.getClass();
        fegsVar.c = fegwVarL;
        fegsVar.b |= 1;
        if (j2 != 0) {
            fegqVar.copyOnWrite();
            fegs fegsVar2 = (fegs) fegqVar.instance;
            fegsVar2.b |= 2;
            fegsVar2.d = j2;
        }
        if (j3 != 0 && str != null) {
            fegqVar.copyOnWrite();
            fegs fegsVar3 = (fegs) fegqVar.instance;
            fegsVar3.b |= 8;
            fegsVar3.e = str;
            fegqVar.copyOnWrite();
            fegs fegsVar4 = (fegs) fegqVar.instance;
            fegsVar4.b |= 32;
            fegsVar4.g = 1L;
            fegqVar.copyOnWrite();
            fegs fegsVar5 = (fegs) fegqVar.instance;
            fegsVar5.f = 3;
            fegsVar5.b |= 16;
        }
        fegb fegbVar = this.d;
        fegx fegxVar = fegx.a;
        fegn fegnVar = (fegn) fegxVar.createBuilder();
        fegnVar.copyOnWrite();
        fegx fegxVar2 = (fegx) fegnVar.instance;
        fegxVar2.b |= 1;
        fegxVar2.e = jE;
        fegnVar.copyOnWrite();
        fegx fegxVar3 = (fegx) fegnVar.instance;
        evrjVarK.getClass();
        fegxVar3.f = evrjVarK;
        fegxVar3.b |= 2;
        fegnVar.copyOnWrite();
        fegx fegxVar4 = (fegx) fegnVar.instance;
        fegs fegsVar6 = (fegs) fegqVar.build();
        fegsVar6.getClass();
        fegxVar4.d = fegsVar6;
        fegxVar4.c = 3;
        fegbVar.a(fegnVar);
        if ((eiesVar.b & 32) != 0) {
            if (eiesVar.h > 0 || eiesVar.i > 0) {
                evrjVarK = i(eiesVar);
            }
            fegt fegtVar = (fegt) fegu.a.createBuilder();
            if ((eiesVar.b & 128) != 0) {
                evrj evrjVarD = evwy.d(eiesVar.j);
                fegtVar.copyOnWrite();
                fegu feguVar = (fegu) fegtVar.instance;
                evrjVarD.getClass();
                feguVar.c = evrjVarD;
                feguVar.b |= 1;
            }
            fegn fegnVar2 = (fegn) fegxVar.createBuilder();
            fegnVar2.copyOnWrite();
            fegx fegxVar5 = (fegx) fegnVar2.instance;
            fegxVar5.b |= 1;
            fegxVar5.e = jE;
            fegnVar2.copyOnWrite();
            fegx fegxVar6 = (fegx) fegnVar2.instance;
            evrjVarK.getClass();
            fegxVar6.f = evrjVarK;
            fegxVar6.b |= 2;
            fegnVar2.copyOnWrite();
            fegx fegxVar7 = (fegx) fegnVar2.instance;
            fegu feguVar2 = (fegu) fegtVar.build();
            feguVar2.getClass();
            fegxVar7.d = feguVar2;
            fegxVar7.c = 4;
            fegbVar.a(fegnVar2);
        }
    }

    public final ejwi a(eies eiesVar) {
        eiev eievVarJ = eiez.j(eimf.a, (eiez) this.l.get(eiesVar.d, eiey.a));
        return eievVarJ.b() ? ((eime) eievVarJ.a()).a() : ejud.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.eies r23) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiml.b(eies):void");
    }
}
