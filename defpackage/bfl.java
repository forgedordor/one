package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfl {
    public static int a;
    public final bkp b;
    public final bjl c;
    public final bfe d;
    public final bfd e;
    private final bga f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [bhr] */
    /* JADX WARN: Type inference failed for: r4v10, types: [bbw] */
    /* JADX WARN: Type inference failed for: r6v14, types: [bbw] */
    /* JADX WARN: Type inference failed for: r6v17, types: [bhr] */
    public bfl(bkp bkpVar, Size size, CameraCharacteristics cameraCharacteristics, ayy ayyVar, boolean z, bfp bfpVar) {
        int iIntValue;
        lbz lbzVar;
        bbw bbwVar;
        bfo bfoVar;
        bfo bfoVar2;
        box.b();
        this.b = bkpVar;
        bhr bhrVarA = null;
        bjk bjkVar = (bjk) blz.c(bkpVar, bni.s, null);
        if (bjkVar == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for ".concat(String.valueOf(brl.b(bkpVar, bkpVar.toString()))));
        }
        bjj bjjVar = new bjj();
        bjkVar.a(bkpVar, bjjVar);
        this.c = bjjVar.b();
        final bfe bfeVar = new bfe();
        this.d = bfeVar;
        Executor executor = (Executor) blz.c(bkpVar, bkp.P, bpm.a());
        executor.getClass();
        final bga bgaVar = new bga(executor, cameraCharacteristics, ayyVar != null ? new btf(ayyVar) : null);
        this.f = bgaVar;
        ArrayList arrayList = new ArrayList();
        if (bkq.b(bkpVar) != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            Integer num = (Integer) blz.c(bkpVar, bkp.d, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) blz.c(bkpVar, bkr.D, null);
                iIntValue = (num2 == null || num2.intValue() != 4101) ? (num2 == null || num2.intValue() != 32) ? 256 : 32 : 4101;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        bee beeVar = new bee(size, bkpVar.a(), arrayList, z, (bbn) blz.c(bkpVar, bkp.f, null), bfpVar, new btb(), new btb());
        this.e = beeVar;
        lcg.d(bfeVar.f == null && bfeVar.b == null, "CaptureNode does not support recreation yet.");
        bfeVar.f = beeVar;
        Size size2 = beeVar.a;
        int i = beeVar.b;
        boolean z2 = beeVar.d;
        bfa bfaVar = new bfa(bfeVar);
        boolean z3 = beeVar.c.size() > 1;
        if (z2 || beeVar.e != null) {
            bfeVar.g = new bfo(bfe.b(beeVar.e, size2.getWidth(), size2.getHeight(), i));
            bfo bfoVar3 = bfeVar.g;
            lbzVar = new lbz() { // from class: bes
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    bfe bfeVar2 = bfeVar;
                    bgb bgbVar = (bgb) obj;
                    bfeVar2.c(bgbVar);
                    bfo bfoVar4 = bfeVar2.g;
                    lcg.d(bfoVar4.a == null, "Pending request should be null");
                    bfoVar4.a = bgbVar;
                }
            };
            bbwVar = null;
            bfoVar = bfoVar3;
        } else {
            if (z3) {
                ?? bbwVar2 = new bbw(size2.getWidth(), size2.getHeight(), 256, 4);
                ?? A = bhu.a(bfaVar, bbwVar2.b);
                bbwVar = new bbw(size2.getWidth(), size2.getHeight(), 32, 4);
                bhr[] bhrVarArr = {bfaVar, bbwVar.b};
                bfaVar = A;
                bfoVar2 = bbwVar2;
                bhrVarA = bhu.a(bhrVarArr);
            } else {
                ?? bbwVar3 = new bbw(size2.getWidth(), size2.getHeight(), i, 4);
                bfaVar = bhu.a(bfaVar, bbwVar3.b);
                bbwVar = null;
                bfoVar2 = bbwVar3;
            }
            lbzVar = new lbz() { // from class: ber
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    bfeVar.c((bgb) obj);
                }
            };
            bfoVar = bfoVar2;
        }
        beeVar.i = bfaVar;
        if (z3 && bhrVarA != null) {
            beeVar.j = bhrVarA;
        }
        Surface surfaceE = bfoVar.e();
        surfaceE.getClass();
        lcg.d(beeVar.k == null, "The surface is already set.");
        beeVar.k = new bkx(surfaceE, beeVar.a, beeVar.b);
        bfeVar.b = new bco(bfoVar);
        bfeVar.e(bfoVar);
        bfp bfpVar2 = beeVar.f;
        if (bfpVar2 != null) {
            bei beiVar = (bei) bfpVar2;
            bkw bkwVarB = bfe.b(beeVar.e, beiVar.a.getWidth(), beiVar.a.getHeight(), beiVar.b);
            bkwVarB.j(new bkv() { // from class: bet
                @Override // defpackage.bkv
                public final void a(bkw bkwVar) {
                    bfe bfeVar2 = bfeVar;
                    try {
                        bbm bbmVarF = bkwVar.f();
                        if (bbmVarF != null) {
                            bgb bgbVar = bfeVar2.a;
                            if (bgbVar == null) {
                                bbs.f("CaptureNode", "Postview image is closed due to request completed or aborted");
                                bbmVarF.close();
                            } else {
                                bfy bfyVar = bfeVar2.e;
                                bfyVar.getClass();
                                ((bej) bfyVar).b.accept(new bek(bgbVar, bbmVarF));
                            }
                        }
                    } catch (IllegalStateException e) {
                        bbs.d("CaptureNode", "Failed to acquire latest image of postview", e);
                    }
                }
            }, bpn.a());
            bfeVar.d = new bco(bkwVarB);
            beeVar.m = new bkx(bkwVarB.e(), beiVar.a, beiVar.b);
        }
        if (z3 && bbwVar != null) {
            Surface surfaceE2 = bbwVar.e();
            lcg.d(beeVar.l == null, "The secondary surface is already set.");
            beeVar.l = new bkx(surfaceE2, beeVar.a, beeVar.b);
            bfeVar.c = new bco(bbwVar);
            bfeVar.e(bbwVar);
        }
        beeVar.g.a = lbzVar;
        beeVar.h.a = new lbz() { // from class: beu
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                bfeVar.d((bgi) obj);
            }
        };
        bfeVar.e = new bej(new btb(), new btb(), beeVar.b, beeVar.c);
        bfy bfyVar = bfeVar.e;
        bgaVar.d = bfyVar;
        bej bejVar = (bej) bfyVar;
        bejVar.a.a = new lbz() { // from class: bfs
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                final bfz bfzVar = (bfz) obj;
                if (bfzVar.b().a()) {
                    bfzVar.a().close();
                    return;
                }
                final bga bgaVar2 = bgaVar;
                bgaVar2.a.execute(new Runnable() { // from class: bfx
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        bgaVar2.a(bfzVar);
                    }
                });
            }
        };
        bejVar.b.a = new lbz() { // from class: bft
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                final bfz bfzVar = (bfz) obj;
                if (bfzVar.b().a()) {
                    bbs.f("ProcessingNode", "The postview image is closed due to request aborted");
                    bfzVar.a().close();
                } else {
                    final bga bgaVar2 = bgaVar;
                    bgaVar2.a.execute(new Runnable() { // from class: bfr
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            boolean z4;
                            bfz bfzVar2 = bfzVar;
                            final bgb bgbVarB = bfzVar2.b();
                            try {
                                Object objA = bgaVar2.e.a(bfzVar2);
                                int i2 = ((bsg) objA).c;
                                if (i2 == 35 || i2 == 256) {
                                    z4 = true;
                                } else if (i2 == 4101) {
                                    i2 = 4101;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                lcg.b(z4, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(i2)));
                                bfi.b((bti) objA);
                                bpn.a().execute(new Runnable() { // from class: bfw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        box.b();
                                        bge bgeVar = bgbVarB.l;
                                        if (bgeVar.f) {
                                            return;
                                        }
                                        bgeVar.a.i().execute(new Runnable() { // from class: bgq
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                            }
                                        });
                                    }
                                });
                            } catch (Exception e) {
                                bfzVar2.a().close();
                                bbs.d("ProcessingNode", "process postview input packet failed.", e);
                            }
                        }
                    });
                }
            }
        };
        bgaVar.e = new bfq();
        bgaVar.f = new bfk(bgaVar.h);
        int i2 = bejVar.c;
        btf btfVar = bgaVar.b;
        if (btfVar != null) {
            bgaVar.g = new beo(btfVar);
        }
    }

    public final void a() {
        bjz bjzVar;
        box.b();
        box.b();
        bfe bfeVar = this.d;
        bfd bfdVar = bfeVar.f;
        bfdVar.getClass();
        final bco bcoVar = bfeVar.b;
        bcoVar.getClass();
        final bco bcoVar2 = bfeVar.c;
        final bco bcoVar3 = bfeVar.d;
        bfdVar.i().d();
        bfdVar.i().c().b(new Runnable() { // from class: bew
            @Override // java.lang.Runnable
            public final void run() {
                bcoVar.k();
            }
        }, bpn.a());
        bjz bjzVar2 = bfdVar.m;
        if (bjzVar2 != null) {
            bjzVar2.d();
            bfdVar.m.c().b(new Runnable() { // from class: bex
                @Override // java.lang.Runnable
                public final void run() {
                    bco bcoVar4 = bcoVar3;
                    if (bcoVar4 != null) {
                        bcoVar4.k();
                    }
                }
            }, bpn.a());
        }
        if (((bee) bfdVar).c.size() <= 1 || (bjzVar = bfdVar.l) == null) {
            return;
        }
        bjzVar.d();
        bfdVar.l.c().b(new Runnable() { // from class: bey
            @Override // java.lang.Runnable
            public final void run() {
                bco bcoVar4 = bcoVar2;
                if (bcoVar4 != null) {
                    bcoVar4.k();
                }
            }
        }, bpn.a());
    }

    final void b(bgi bgiVar) {
        box.b();
        ((bee) this.e).h.accept(bgiVar);
    }
}
