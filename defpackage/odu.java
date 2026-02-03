package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odu implements oal, oak {
    public static final mau a;
    private mau A;
    private volatile long B;
    public final List b;
    public final oaj c;
    public final oai d;
    public final mew e;
    public final Map f;
    public final ekfw g;
    public final AtomicInteger h;
    public boolean i;
    public int j;
    public oal k;
    public boolean l;
    public int m;
    public volatile boolean n;
    public volatile long o;
    public volatile long p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    private final oak t;
    private final Map u;
    private final AtomicInteger v;
    private boolean w;
    private boolean x;
    private int y;
    private mau z;

    static {
        mat matVar = new mat();
        matVar.c("audio/mp4a-latm");
        matVar.F = 44100;
        matVar.E = 2;
        new mau(matVar);
        mat matVar2 = new mat();
        matVar2.t = 1;
        matVar2.u = 1;
        matVar2.c("image/raw");
        matVar2.C = mag.b;
        a = new mau(matVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public odu(obv obvVar, oaj oajVar, oai oaiVar, oak oakVar, mej mejVar, Looper looper) {
        ekgb ekgbVar = obvVar.a;
        this.b = ekgbVar;
        boolean z = obvVar.b;
        boolean z2 = obvVar.c;
        boolean z3 = obvVar.d;
        odp odpVar = new odp(this, oajVar);
        this.c = odpVar;
        this.d = oaiVar;
        this.t = oakVar;
        this.e = mejVar.b(looper, null);
        this.u = new HashMap();
        this.f = new HashMap();
        this.g = new ekfw();
        this.v = new AtomicInteger();
        this.h = new AtomicInteger();
        this.i = true;
        this.k = odpVar.a((obt) ekgbVar.get(0), looper, this, oaiVar);
    }

    public static Bitmap i() {
        return Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888);
    }

    private final void n(int i, mau mauVar) {
        odi odiVar = (odi) this.f.get(Integer.valueOf(i));
        if (odiVar == null) {
            return;
        }
        obt obtVar = (obt) this.b.get(this.j);
        if (i == 1) {
            i = 1;
        }
        long j = this.B;
        if (obtVar.b() && i == 1) {
            mauVar = null;
        }
        odiVar.e(obtVar, j, mauVar, m());
    }

    @Override // defpackage.oak
    public final void a(long j) {
        if (j == -9223372036854775807L) {
            z = m();
            j = -9223372036854775807L;
        }
        mee.b(z, "Could not retrieve required duration for EditedMediaItem " + this.j);
        List list = this.b;
        this.o = ((obt) list.get(this.j)).a(j);
        this.B = j;
        int i = ((ekoe) list).c;
    }

    @Override // defpackage.oak
    public final void b(ocp ocpVar) {
        this.t.b(ocpVar);
    }

    @Override // defpackage.oak
    public final void c(int i) {
        this.v.set(i);
        this.h.set(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023a A[Catch: all -> 0x02c9, TryCatch #1 {, blocks: (B:38:0x008b, B:41:0x00b6, B:43:0x00bc, B:44:0x00d3, B:48:0x00e2, B:49:0x00f3, B:128:0x0253, B:130:0x0258, B:132:0x025f, B:138:0x027f, B:140:0x028d, B:145:0x0296, B:146:0x029d, B:148:0x02a5, B:152:0x02b5, B:154:0x02c0, B:153:0x02b9, B:54:0x0108, B:56:0x0120, B:60:0x0130, B:62:0x0136, B:65:0x0143, B:66:0x0146, B:69:0x0155, B:71:0x0159, B:75:0x0162, B:78:0x0169, B:81:0x0183, B:89:0x0199, B:91:0x01b0, B:94:0x01bf, B:97:0x01ce, B:100:0x01d3, B:102:0x01d7, B:104:0x01dd, B:107:0x01e9, B:109:0x01ef, B:112:0x01fa, B:115:0x0203, B:117:0x022f, B:120:0x023a), top: B:165:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0258 A[Catch: all -> 0x02c9, TryCatch #1 {, blocks: (B:38:0x008b, B:41:0x00b6, B:43:0x00bc, B:44:0x00d3, B:48:0x00e2, B:49:0x00f3, B:128:0x0253, B:130:0x0258, B:132:0x025f, B:138:0x027f, B:140:0x028d, B:145:0x0296, B:146:0x029d, B:148:0x02a5, B:152:0x02b5, B:154:0x02c0, B:153:0x02b9, B:54:0x0108, B:56:0x0120, B:60:0x0130, B:62:0x0136, B:65:0x0143, B:66:0x0146, B:69:0x0155, B:71:0x0159, B:75:0x0162, B:78:0x0169, B:81:0x0183, B:89:0x0199, B:91:0x01b0, B:94:0x01bf, B:97:0x01ce, B:100:0x01d3, B:102:0x01d7, B:104:0x01dd, B:107:0x01e9, B:109:0x01ef, B:112:0x01fa, B:115:0x0203, B:117:0x022f, B:120:0x023a), top: B:165:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027f A[Catch: all -> 0x02c9, TryCatch #1 {, blocks: (B:38:0x008b, B:41:0x00b6, B:43:0x00bc, B:44:0x00d3, B:48:0x00e2, B:49:0x00f3, B:128:0x0253, B:130:0x0258, B:132:0x025f, B:138:0x027f, B:140:0x028d, B:145:0x0296, B:146:0x029d, B:148:0x02a5, B:152:0x02b5, B:154:0x02c0, B:153:0x02b9, B:54:0x0108, B:56:0x0120, B:60:0x0130, B:62:0x0136, B:65:0x0143, B:66:0x0146, B:69:0x0155, B:71:0x0159, B:75:0x0162, B:78:0x0169, B:81:0x0183, B:89:0x0199, B:91:0x01b0, B:94:0x01bf, B:97:0x01ce, B:100:0x01d3, B:102:0x01d7, B:104:0x01dd, B:107:0x01e9, B:109:0x01ef, B:112:0x01fa, B:115:0x0203, B:117:0x022f, B:120:0x023a), top: B:165:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a5 A[Catch: all -> 0x02c9, TryCatch #1 {, blocks: (B:38:0x008b, B:41:0x00b6, B:43:0x00bc, B:44:0x00d3, B:48:0x00e2, B:49:0x00f3, B:128:0x0253, B:130:0x0258, B:132:0x025f, B:138:0x027f, B:140:0x028d, B:145:0x0296, B:146:0x029d, B:148:0x02a5, B:152:0x02b5, B:154:0x02c0, B:153:0x02b9, B:54:0x0108, B:56:0x0120, B:60:0x0130, B:62:0x0136, B:65:0x0143, B:66:0x0146, B:69:0x0155, B:71:0x0159, B:75:0x0162, B:78:0x0169, B:81:0x0183, B:89:0x0199, B:91:0x01b0, B:94:0x01bf, B:97:0x01ce, B:100:0x01d3, B:102:0x01d7, B:104:0x01dd, B:107:0x01e9, B:109:0x01ef, B:112:0x01fa, B:115:0x0203, B:117:0x022f, B:120:0x023a), top: B:165:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b9 A[Catch: all -> 0x02c9, TryCatch #1 {, blocks: (B:38:0x008b, B:41:0x00b6, B:43:0x00bc, B:44:0x00d3, B:48:0x00e2, B:49:0x00f3, B:128:0x0253, B:130:0x0258, B:132:0x025f, B:138:0x027f, B:140:0x028d, B:145:0x0296, B:146:0x029d, B:148:0x02a5, B:152:0x02b5, B:154:0x02c0, B:153:0x02b9, B:54:0x0108, B:56:0x0120, B:60:0x0130, B:62:0x0136, B:65:0x0143, B:66:0x0146, B:69:0x0155, B:71:0x0159, B:75:0x0162, B:78:0x0169, B:81:0x0183, B:89:0x0199, B:91:0x01b0, B:94:0x01bf, B:97:0x01ce, B:100:0x01d3, B:102:0x01d7, B:104:0x01dd, B:107:0x01e9, B:109:0x01ef, B:112:0x01fa, B:115:0x0203, B:117:0x022f, B:120:0x023a), top: B:165:0x008b }] */
    @Override // defpackage.oak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.mau r20, int r21) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odu.d(mau, int):boolean");
    }

    @Override // defpackage.oal
    public final int e(odj odjVar) {
        int iE = this.k.e(odjVar);
        int i = ((ekoe) this.b).c;
        if (i == 1 || iE == 0) {
            return iE;
        }
        int iR = mgb.r(this.j, i);
        if (iE == 2) {
            iR += odjVar.a / i;
        }
        odjVar.a = iR;
        return 2;
    }

    @Override // defpackage.oal
    public final ekgp f() {
        return this.k.f();
    }

    @Override // defpackage.oal
    public final void g() {
        this.k.g();
        this.n = true;
    }

    @Override // defpackage.oal
    public final void h() {
        this.k.h();
        int i = ((ekoe) this.b).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7, types: [odt] */
    /* JADX WARN: Type inference failed for: r17v8 */
    public final odt j(mau mauVar) {
        mau mauVar2;
        odt odtVar;
        int i;
        oak oakVar;
        oer oerVar;
        Object obj;
        oem oemVar;
        final int i2;
        ?? r17;
        final ocx ocxVarR;
        int i3;
        boolean z;
        List list;
        mau mauVar3;
        ekgb ekgbVar;
        boolean z2;
        String str = mauVar.o;
        int iB = oeu.b(str);
        String str2 = mgb.a;
        int i4 = mjr.a;
        if (this.i) {
            if (iB == 2) {
                this.s = true;
            } else {
                this.r = true;
            }
            oak oakVar2 = this.t;
            oer oerVar2 = ((oeq) oakVar2).j;
            Object obj2 = oerVar2.h;
            synchronized (obj2) {
                try {
                    try {
                        oem oemVar2 = oerVar2.i;
                        if (oemVar2.d()) {
                            int iB2 = oeu.b(str);
                            SparseArray sparseArray = oemVar2.b;
                            mee.c(mgb.U(sparseArray, iB2));
                            if (((Boolean) sparseArray.get(iB2)).booleanValue()) {
                                mee.d(oemVar2.d(), "Primary track can only be queried after all tracks are added.");
                                int i5 = 0;
                                while (true) {
                                    list = oemVar2.a;
                                    if (i5 >= list.size()) {
                                        i5 = -1;
                                        break;
                                    }
                                    if (mgb.U(((oel) list.get(i5)).a, iB2)) {
                                        break;
                                    }
                                    i5++;
                                }
                                int i6 = ((oeq) oakVar2).a;
                                if (i5 == i6) {
                                    int iB3 = oeu.b(str);
                                    mee.c(oemVar2.b(iB3) == null);
                                    mau mauVarA = oemVar2.a(i6, iB3);
                                    if (mbw.i(str)) {
                                        odx odxVar = ((oeq) oakVar2).d;
                                        obt obtVar = ((oeq) oakVar2).b;
                                        ekgb ekgbVar2 = ((oeq) oakVar2).c.c.b;
                                        r17 = 0;
                                        oba obaVar = ((oeq) oakVar2).k;
                                        obj = obj2;
                                        oerVar = oerVar2;
                                        i2 = iB2;
                                        oakVar = oakVar2;
                                        oemVar2.c(1, new oar(mauVarA, mauVar, odxVar, obtVar, ekgbVar2, oerVar2.d, oerVar2.k, ((oeq) oakVar2).f, ((oeq) oakVar2).h));
                                        oemVar = oemVar2;
                                    } else {
                                        oakVar = oakVar2;
                                        oerVar = oerVar2;
                                        obj = obj2;
                                        oemVar = oemVar2;
                                        i2 = iB2;
                                        r17 = 0;
                                        if (mbw.l(str)) {
                                            mag magVarC = oeu.c(oeu.d(mauVarA.E), ((oeq) oakVar).d.d == 1);
                                            mat matVar = new mat(mauVarA);
                                            matVar.C = magVarC;
                                            mauVar3 = new mau(matVar);
                                        } else {
                                            if (!mbw.j(str)) {
                                                throw new ocp("Unexpected runtime error", new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."), 1001);
                                            }
                                            mat matVar2 = new mat(mauVar);
                                            matVar2.C = oeu.d(mauVar.E);
                                            mauVar3 = new mau(matVar2);
                                        }
                                        Context context = oerVar.a;
                                        odx odxVar2 = ((oeq) oakVar).d;
                                        oay oayVar = ((oeq) oakVar).c;
                                        mcv mcvVar = oayVar.b;
                                        ekgb ekgbVar3 = oayVar.c.c;
                                        mcy mcyVar = ((oeq) oakVar).e;
                                        oat oatVar = oerVar.d;
                                        odh odhVar = oerVar.k;
                                        final oeq oeqVar = (oeq) oakVar;
                                        meo meoVar = new meo() { // from class: oeo
                                            @Override // defpackage.meo
                                            public final void a(Object obj3) {
                                                oeqVar.b((ocp) obj3);
                                            }
                                        };
                                        ocv ocvVar = ((oeq) oakVar).f;
                                        maj majVar = ((oeq) oakVar).g;
                                        if (list.size() < 2) {
                                            ekgbVar = ekgbVar3;
                                        } else {
                                            ekgbVar = ekgbVar3;
                                            int i7 = 0;
                                            int i8 = 0;
                                            while (i7 < list.size()) {
                                                int i9 = i7;
                                                if (mgb.U(((oel) list.get(i7)).a, 2)) {
                                                    i8++;
                                                }
                                                i7 = i9 + 1;
                                            }
                                            if (i8 > 1) {
                                                z2 = true;
                                            }
                                            oemVar.c(2, new ofa(context, mauVar3, odxVar2, mcvVar, ekgbVar, mcyVar, oatVar, odhVar, meoVar, ocvVar, majVar, z2, oerVar.q, ((oeq) oakVar).h));
                                        }
                                        z2 = false;
                                        oemVar.c(2, new ofa(context, mauVar3, odxVar2, mcvVar, ekgbVar, mcyVar, oatVar, odhVar, meoVar, ocvVar, majVar, z2, oerVar.q, ((oeq) oakVar).h));
                                    }
                                } else {
                                    oakVar = oakVar2;
                                    oerVar = oerVar2;
                                    obj = obj2;
                                    oemVar = oemVar2;
                                    i2 = iB2;
                                    r17 = 0;
                                }
                            } else {
                                oakVar = oakVar2;
                                oerVar = oerVar2;
                                obj = obj2;
                                oemVar = oemVar2;
                                i2 = iB2;
                                r17 = 0;
                                mee.c(oemVar.b(i2) == null);
                                ekgb ekgbVar4 = ((oeq) oakVar).c.a;
                                int i10 = ((oeq) oakVar).a;
                                mee.b(!((obv) ekgbVar4.get(i10)).a(), "Gaps can not be transmuxed.");
                                oemVar.c(i2, new ocb(oemVar.a(i10, i2), ((oeq) oakVar).d, oerVar.k, ((oeq) oakVar).f));
                            }
                            odm odmVarB = oemVar.b(i2);
                            if (odmVarB == null) {
                                ocxVarR = r17;
                            } else {
                                obt obtVar2 = ((oeq) oakVar).b;
                                int i11 = ((oeq) oakVar).a;
                                ocxVarR = odmVarB.r(obtVar2, mauVar, i11);
                                final oeq oeqVar2 = (oeq) oakVar;
                                odi odiVar = new odi() { // from class: oep
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.odi
                                    public final void e(obt obtVar3, long j, mau mauVar4, boolean z3) {
                                        oeq oeqVar3 = oeqVar2;
                                        oer oerVar3 = oeqVar3.j;
                                        if (oerVar3.c) {
                                            synchronized (oerVar3.h) {
                                                oem oemVar3 = oerVar3.i;
                                                int i12 = oeqVar3.a;
                                                boolean z4 = true;
                                                if (((oel) oemVar3.a.get(i12)).a.size() <= 1 || i2 != 2) {
                                                    boolean z5 = ((obv) oeqVar3.c.a.get(i12)).b;
                                                    int i13 = 0;
                                                    mee.d(j != -9223372036854775807L, "MediaItem duration required for sequence looping could not be extracted.");
                                                    oeqVar3.i += j;
                                                    synchronized (oerVar3.m) {
                                                        if (z3) {
                                                            oerVar3.t--;
                                                        }
                                                        boolean z6 = oerVar3.t == 0;
                                                        long j2 = oeqVar3.i;
                                                        long j3 = oerVar3.s;
                                                        if (j2 > j3) {
                                                            z4 = z6;
                                                        } else if (z6) {
                                                        }
                                                        oerVar3.s = Math.max(j2, j3);
                                                        while (true) {
                                                            List list2 = oerVar3.g;
                                                            if (i13 >= list2.size()) {
                                                                break;
                                                            }
                                                            odu oduVar = (odu) list2.get(i13);
                                                            oduVar.p = oerVar3.s;
                                                            oduVar.q = z4;
                                                            i13++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ocxVarR.e(obtVar3, j, mauVar4, z3);
                                    }
                                };
                                odu oduVar = (odu) oerVar.g.get(i11);
                                if (i2 == 1) {
                                    i3 = i2;
                                    z = true;
                                } else if (i2 == 2) {
                                    i3 = 2;
                                    z = true;
                                    i2 = 2;
                                } else {
                                    i3 = i2;
                                    z = false;
                                }
                                mee.a(z);
                                Map map = oduVar.f;
                                Integer numValueOf = Integer.valueOf(i3);
                                mee.a(map.get(numValueOf) == null);
                                map.put(numValueOf, odiVar);
                                SparseArray sparseArray2 = oemVar.c;
                                sparseArray2.put(i2, Integer.valueOf(mgb.U(sparseArray2, i2) ? ((Integer) sparseArray2.get(i2)).intValue() + 1 : 1));
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    List list2 = oemVar.a;
                                    if (i12 >= list2.size()) {
                                        break;
                                    }
                                    if (mgb.U(((oel) list2.get(i12)).a, i2)) {
                                        i13++;
                                    }
                                    i12++;
                                }
                                if (((Integer) sparseArray2.get(i2)).intValue() == i13) {
                                    oerVar.c();
                                    oerVar.f.d(2, odmVarB).b();
                                }
                            }
                        } else {
                            ocxVarR = null;
                            r17 = 0;
                        }
                        if (ocxVarR == null) {
                            return r17;
                        }
                        odtVar = new odt(this, ocxVarR, iB);
                        this.u.put(Integer.valueOf(iB), odtVar);
                        this.v.get();
                        i = 1;
                        mauVar2 = r17;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } else {
            mauVar2 = null;
            odtVar = (odt) this.u.get(Integer.valueOf(iB));
            i = 1;
            mee.h(odtVar, iB == 1 ? "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true." : "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.");
        }
        n(iB, mauVar);
        if (this.v.get() == i && this.u.size() == 2) {
            if (iB == i) {
                n(2, a);
                this.h.incrementAndGet();
                this.e.b(new Runnable() { // from class: odo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(odu.i());
                    }
                });
                return odtVar;
            }
            n(i, mauVar2);
        }
        return odtVar;
    }

    public final void k() {
        List list = this.b;
        int i = this.m * ((ekoe) list).c;
        int i2 = this.j;
        if (i + i2 >= this.y) {
            mbo mboVar = ((obt) list.get(i2)).a;
            ekgp ekgpVarF = f();
            this.g.h(new ocr(this.B, this.z, this.A, (String) ekgpVarF.get(1), (String) ekgpVarF.get(2)));
            this.y++;
        }
    }

    public final void l(final Bitmap bitmap) {
        odt odtVar = (odt) this.u.get(2);
        mee.f(odtVar);
        if (odtVar.h(bitmap, new men(this.B, 30.0f)) != 1) {
            this.e.h(new Runnable() { // from class: odn
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(bitmap);
                }
            });
        } else {
            odtVar.f();
        }
    }

    public final boolean m() {
        return this.j == ((ekoe) this.b).c + (-1);
    }
}
