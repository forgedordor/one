package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dusg implements durk {
    public final dtpi a;
    public ejwi b = ejud.a;
    private final Context c;
    private final String d;
    private final durr e;
    private final duvk f;

    public dusg(Context context, duvk duvkVar, durr durrVar, dtpi dtpiVar) {
        this.c = context;
        this.f = duvkVar;
        this.d = context.getPackageName();
        this.e = durrVar;
        this.a = dtpiVar;
    }

    private final ListenableFuture t(final int i, final eooy eooyVar, final int i2) {
        return eika.k(this.e.a(i2, this.b), new eooz() { // from class: dusb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ejwi ejwiVar = (ejwi) obj;
                if (!ejwiVar.g()) {
                    return eorv.a;
                }
                final int i3 = i2;
                final int i4 = i;
                eooy eooyVar2 = eooyVar;
                final dusg dusgVar = this.a;
                return dvaq.e(eooyVar2.a()).f(new ejvr() { // from class: durv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        List list = (List) obj2;
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ejwi ejwiVar2 = ejwiVar;
                            dusgVar.r(i4, (eoiu) ((eoiv) it.next()).toBuilder(), i3, (eokj) ejwiVar2.c());
                        }
                        return null;
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }

    private final void u(int i, eoiu eoiuVar, long j) {
        eoki eokiVar = (eoki) eokj.a.createBuilder();
        eokiVar.copyOnWrite();
        eokj eokjVar = (eokj) eokiVar.instance;
        eokjVar.b |= 1;
        eokjVar.c = false;
        r(i, eoiuVar, j, (eokj) eokiVar.build());
    }

    @Override // defpackage.durk
    public final ListenableFuture a(final eooy eooyVar) {
        return t(1046, new eooy() { // from class: dusc
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eika.j(eooyVar.a(), new ejvr() { // from class: durx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        for (durj durjVar : (List) obj) {
                            eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
                            eojh eojhVarB = durjVar.b();
                            eoiuVar.copyOnWrite();
                            eoiv eoivVar = (eoiv) eoiuVar.instance;
                            eoivVar.h = eojhVarB;
                            eoivVar.b |= Integer.MIN_VALUE;
                            eoir eoirVarA = durjVar.a();
                            eoiuVar.copyOnWrite();
                            eoiv eoivVar2 = (eoiv) eoiuVar.instance;
                            eoivVar2.e = eoirVarA;
                            eoivVar2.b |= 256;
                            arrayList.add((eoiv) eoiuVar.build());
                        }
                        return arrayList;
                    }
                }, eoqg.a);
            }
        }, this.a.i());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [duru, java.lang.Object] */
    @Override // defpackage.durk
    public final ListenableFuture b(final String str, final ejwi ejwiVar, final ejwi ejwiVar2) {
        ListenableFuture listenableFutureI = eork.i(ejud.a);
        if (this.b.g()) {
            listenableFutureI = this.b.c().d(str);
        }
        dvaq dvaqVarE = dvaq.e(listenableFutureI);
        ejvr ejvrVar = new ejvr() { // from class: durz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int iB;
                ejwi ejwiVar3 = (ejwi) obj;
                eoiy eoiyVar = (eoiy) eoiz.a.createBuilder();
                eoiyVar.copyOnWrite();
                eoiz eoizVar = (eoiz) eoiyVar.instance;
                eoizVar.b |= 1;
                eoizVar.c = str;
                ejwi ejwiVar4 = ejwiVar2;
                if (ejwiVar4.g()) {
                    eokf eokfVar = (eokf) ejwiVar4.c();
                    eoiyVar.copyOnWrite();
                    eoiz eoizVar2 = (eoiz) eoiyVar.instance;
                    eoizVar2.g = eokfVar;
                    eoizVar2.b |= 32;
                }
                if (ejwiVar3.g()) {
                    long jLongValue = ((Long) ejwiVar3.c()).longValue();
                    eoiyVar.copyOnWrite();
                    eoiz eoizVar3 = (eoiz) eoiyVar.instance;
                    eoizVar3.b |= 2;
                    eoizVar3.d = jLongValue;
                }
                ejwi ejwiVar5 = ejwiVar;
                if (ejwiVar5.g()) {
                    String simpleName = ejwiVar5.c().getClass().getSimpleName();
                    eoiyVar.copyOnWrite();
                    eoiz eoizVar4 = (eoiz) eoiyVar.instance;
                    simpleName.getClass();
                    eoizVar4.b |= 4;
                    eoizVar4.e = simpleName;
                    if (((Throwable) ejwiVar5.c()).getCause() != null) {
                        String simpleName2 = ((Throwable) ejwiVar5.c()).getCause().getClass().getSimpleName();
                        eoiyVar.copyOnWrite();
                        eoiz eoizVar5 = (eoiz) eoiyVar.instance;
                        simpleName2.getClass();
                        eoizVar5.b |= 8;
                        eoizVar5.f = simpleName2;
                    }
                    if ((ejwiVar5.c() instanceof dtox) && (iB = eokq.b(((dtox) ejwiVar5.c()).a.aF)) != 0) {
                        eoiyVar.copyOnWrite();
                        eoiz eoizVar6 = (eoiz) eoiyVar.instance;
                        eoizVar6.h = eokq.a(iB);
                        eoizVar6.b |= 64;
                    }
                }
                return (eoiz) eoiyVar.build();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eika.j(dvaqVarE.f(ejvrVar, eoqgVar), new ejvr() { // from class: dusa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eoiz eoizVar = (eoiz) obj;
                eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
                eoiuVar.copyOnWrite();
                eoiv eoivVar = (eoiv) eoiuVar.instance;
                eoizVar.getClass();
                eoivVar.y = eoizVar;
                eoivVar.d |= 32768;
                this.a.s(1120, eoiuVar, r5.a.k());
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.durk
    public final ListenableFuture c(final eooy eooyVar) {
        return t(1058, new eooy() { // from class: dusd
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eika.j(eooyVar.a(), new ejvr() { // from class: dury
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eojt eojtVar = (eojt) obj;
                        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
                        eoiuVar.copyOnWrite();
                        eoiv eoivVar = (eoiv) eoiuVar.instance;
                        eojtVar.getClass();
                        eoivVar.l = eojtVar;
                        eoivVar.c |= 65536;
                        return Arrays.asList((eoiv) eoiuVar.build());
                    }
                }, eoqg.a);
            }
        }, this.a.m());
    }

    @Override // defpackage.durk
    public final ListenableFuture d(final eooy eooyVar) {
        return t(1057, new eooy() { // from class: duse
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eika.j(eooyVar.a(), new ejvr() { // from class: durw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eojz eojzVar = (eojz) obj;
                        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
                        eoiuVar.copyOnWrite();
                        eoiv eoivVar = (eoiv) eoiuVar.instance;
                        eojzVar.getClass();
                        eoivVar.j = eojzVar;
                        eoivVar.c |= 8192;
                        return Arrays.asList((eoiv) eoiuVar.build());
                    }
                }, eoqg.a);
            }
        }, this.a.o());
    }

    @Override // defpackage.durk
    public final void e(eoix eoixVar) {
        long j = this.a.j();
        if (durt.a(j)) {
            eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
            eoiuVar.copyOnWrite();
            eoiv eoivVar = (eoiv) eoiuVar.instance;
            eoixVar.getClass();
            eoivVar.r = eoixVar;
            eoivVar.d |= 4;
            u(1075, eoiuVar, j);
        }
    }

    @Override // defpackage.durk
    public final void f(eoir eoirVar, eojb eojbVar) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojbVar.getClass();
        eoivVar.s = eojbVar;
        eoivVar.d |= 8;
        eoiuVar.copyOnWrite();
        eoiv eoivVar2 = (eoiv) eoiuVar.instance;
        eoirVar.getClass();
        eoivVar2.e = eoirVar;
        eoivVar2.b |= 256;
        s(1082, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void g(eojl eojlVar) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojlVar.getClass();
        eoivVar.u = eojlVar;
        eoivVar.d |= 256;
        s(1110, eoiuVar, this.a.e());
    }

    @Override // defpackage.durk
    public final void h(eoir eoirVar) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoju eojuVar = (eoju) eojv.a.createBuilder();
        eojuVar.copyOnWrite();
        eojv eojvVar = (eojv) eojuVar.instance;
        eoirVar.getClass();
        eojvVar.c = eoirVar;
        eojvVar.b |= 1;
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojv eojvVar2 = (eojv) eojuVar.build();
        eojvVar2.getClass();
        eoivVar.p = eojvVar2;
        eoivVar.d |= 1;
        s(1071, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void i(eoir eoirVar, int i) {
        eojw eojwVar = (eojw) eojx.a.createBuilder();
        eojwVar.copyOnWrite();
        eojx eojxVar = (eojx) eojwVar.instance;
        eojxVar.b |= 1;
        eojxVar.c = i;
        eojx eojxVar2 = (eojx) eojwVar.build();
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojxVar2.getClass();
        eoivVar.w = eojxVar2;
        eoivVar.d |= 2048;
        eoiuVar.copyOnWrite();
        eoiv eoivVar2 = (eoiv) eoiuVar.instance;
        eoirVar.getClass();
        eoivVar2.e = eoirVar;
        eoivVar2.b |= 256;
        s(1117, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void j(eoir eoirVar, eokh eokhVar) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eokhVar.getClass();
        eoivVar.v = eokhVar;
        eoivVar.d |= 512;
        eoiuVar.copyOnWrite();
        eoiv eoivVar2 = (eoiv) eoiuVar.instance;
        eoirVar.getClass();
        eoivVar2.e = eoirVar;
        eoivVar2.b |= 256;
        s(1018, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void k(int i, int i2) {
        u(i, (eoiu) eoiv.a.createBuilder(), i2);
    }

    @Override // defpackage.durk
    public final void l(int i) {
        s(i, (eoiu) eoiv.a.createBuilder(), this.a.k());
    }

    @Override // defpackage.durk
    public final void m(int i, String str, int i2, long j, String str2) {
        eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
        eoiqVar.copyOnWrite();
        eoir eoirVar = (eoir) eoiqVar.instance;
        str.getClass();
        eoirVar.b |= 1;
        eoirVar.c = str;
        eoiqVar.copyOnWrite();
        eoir eoirVar2 = (eoir) eoiqVar.instance;
        eoirVar2.b |= 2;
        eoirVar2.d = i2;
        eoiqVar.copyOnWrite();
        eoir eoirVar3 = (eoir) eoiqVar.instance;
        eoirVar3.b |= 64;
        eoirVar3.i = j;
        eoiqVar.copyOnWrite();
        eoir eoirVar4 = (eoir) eoiqVar.instance;
        str2.getClass();
        eoirVar4.b |= 128;
        eoirVar4.j = str2;
        eoir eoirVar5 = (eoir) eoiqVar.build();
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eoirVar5.getClass();
        eoivVar.e = eoirVar5;
        eoivVar.b |= 256;
        s(i, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void n(int i, int i2) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoje eojeVar = (eoje) eojf.a.createBuilder();
        eojeVar.copyOnWrite();
        eojf eojfVar = (eojf) eojeVar.instance;
        eojfVar.b |= 2;
        eojfVar.d = i2;
        eojeVar.copyOnWrite();
        eojf eojfVar2 = (eojf) eojeVar.instance;
        eojfVar2.c = i - 2;
        eojfVar2.b |= 1;
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojf eojfVar3 = (eojf) eojeVar.build();
        eojfVar3.getClass();
        eoivVar.k = eojfVar3;
        eoivVar.c |= 32768;
        s(1053, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void o(eoir eoirVar, int i, long j, long j2, String str, int i2) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eojo eojoVar = (eojo) eojp.a.createBuilder();
        eojoVar.copyOnWrite();
        eojp eojpVar = (eojp) eojoVar.instance;
        eoirVar.getClass();
        eojpVar.c = eoirVar;
        eojpVar.b |= 1;
        eojoVar.copyOnWrite();
        eojp eojpVar2 = (eojp) eojoVar.instance;
        eojpVar2.d = i - 2;
        eojpVar2.b |= 2;
        eojoVar.copyOnWrite();
        eojp eojpVar3 = (eojp) eojoVar.instance;
        eojpVar3.b |= 4;
        eojpVar3.e = j;
        eojoVar.copyOnWrite();
        eojp eojpVar4 = (eojp) eojoVar.instance;
        eojpVar4.b |= 8;
        eojpVar4.f = j2;
        eojoVar.copyOnWrite();
        eojp eojpVar5 = (eojp) eojoVar.instance;
        str.getClass();
        eojpVar5.b |= 16;
        eojpVar5.g = str;
        eojoVar.copyOnWrite();
        eojp eojpVar6 = (eojp) eojoVar.instance;
        eojpVar6.b |= 32;
        eojpVar6.h = i2;
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojp eojpVar7 = (eojp) eojoVar.build();
        eojpVar7.getClass();
        eoivVar.n = eojpVar7;
        eoivVar.c |= 4194304;
        s(1068, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void p(eoir eoirVar, int i) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eoka eokaVar = (eoka) eokb.a.createBuilder();
        eokaVar.copyOnWrite();
        eokb eokbVar = (eokb) eokaVar.instance;
        eokbVar.c = i - 2;
        eokbVar.b |= 1;
        eokb eokbVar2 = (eokb) eokaVar.build();
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eokbVar2.getClass();
        eoivVar.x = eokbVar2;
        eoivVar.d |= 16384;
        eoiuVar.copyOnWrite();
        eoiv eoivVar2 = (eoiv) eoiuVar.instance;
        eoirVar.getClass();
        eoivVar2.e = eoirVar;
        eoivVar2.b |= 256;
        s(1119, eoiuVar, this.a.k());
    }

    @Override // defpackage.durk
    public final void q(int i, eoir eoirVar, int i2) {
        eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
        eojc eojcVar = (eojc) eojd.a.createBuilder();
        eojcVar.copyOnWrite();
        eojd eojdVar = (eojd) eojcVar.instance;
        eojdVar.c = eokq.a(i);
        eojdVar.b |= 1;
        eojcVar.copyOnWrite();
        eojd eojdVar2 = (eojd) eojcVar.instance;
        eoirVar.getClass();
        eojdVar2.d = eoirVar;
        eojdVar2.b |= 2;
        eojcVar.copyOnWrite();
        eojd eojdVar3 = (eojd) eojcVar.instance;
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        eojdVar3.e = i2 - 2;
        eojdVar3.b |= 4;
        eojcVar.copyOnWrite();
        eojd eojdVar4 = (eojd) eojcVar.instance;
        eojdVar4.b |= 8;
        eojdVar4.f = 0;
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eojd eojdVar5 = (eojd) eojcVar.build();
        eojdVar5.getClass();
        eoivVar.o = eojdVar5;
        eoivVar.c |= Integer.MIN_VALUE;
        s(1070, eoiuVar, this.a.k());
    }

    public final void r(int i, eoiu eoiuVar, long j, eokj eokjVar) {
        eoio eoioVar = (eoio) eoip.a.createBuilder();
        eoioVar.copyOnWrite();
        eoip eoipVar = (eoip) eoioVar.instance;
        String str = this.d;
        str.getClass();
        eoipVar.b |= 2;
        eoipVar.d = str;
        eoioVar.copyOnWrite();
        eoip eoipVar2 = (eoip) eoioVar.instance;
        eoipVar2.b |= 1;
        eoipVar2.c = 722788935;
        eoiuVar.copyOnWrite();
        eoiv eoivVar = (eoiv) eoiuVar.instance;
        eoiv eoivVar2 = eoiv.a;
        eoivVar.b |= 524288;
        eoivVar.f = j;
        eois eoisVar = (eois) eoit.a.createBuilder();
        StatFs statFs = new StatFs(this.c.getFilesDir().getAbsolutePath());
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        long blockSize2 = statFs.getBlockSize();
        double dMin = Math.min(5.24288E8d, blockCount * blockSize * 0.05d);
        eoisVar.copyOnWrite();
        eoit eoitVar = (eoit) eoisVar.instance;
        eoitVar.b |= 1;
        eoitVar.c = ((double) (availableBlocks * blockSize2)) < dMin;
        eoiuVar.copyOnWrite();
        eoiv eoivVar3 = (eoiv) eoiuVar.instance;
        eoit eoitVar2 = (eoit) eoisVar.build();
        eoitVar2.getClass();
        eoivVar3.i = eoitVar2;
        eoivVar3.c |= 128;
        eoiuVar.copyOnWrite();
        eoiv eoivVar4 = (eoiv) eoiuVar.instance;
        eoip eoipVar3 = (eoip) eoioVar.build();
        eoipVar3.getClass();
        eoivVar4.m = eoipVar3;
        eoivVar4.c |= 524288;
        eoiuVar.copyOnWrite();
        eoiv eoivVar5 = (eoiv) eoiuVar.instance;
        eokjVar.getClass();
        eoivVar5.g = eokjVar;
        eoivVar5.b |= 1048576;
        this.f.a(eoiuVar.build(), eokk.a(i));
    }

    public final void s(int i, eoiu eoiuVar, long j) {
        eika.l(this.e.a(j, this.b), new dusf(this, i, eoiuVar, j), eoqg.a);
    }
}
