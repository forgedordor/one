package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfe {
    public bco b;
    bco c;
    bco d;
    public bfy e;
    public bfd f;
    bgb a = null;
    public bfo g = null;

    public static bkw b(bbn bbnVar, int i, int i2, int i3) {
        return bbnVar != null ? bbnVar.a() : bbo.a(i, i2, i3, 4);
    }

    public final int a() {
        int iC;
        box.b();
        lcg.d(this.b != null, "The ImageReader is not initialized.");
        bco bcoVar = this.b;
        synchronized (bcoVar.a) {
            iC = bcoVar.d.c() - bcoVar.b;
        }
        return iC;
    }

    final void c(bgb bgbVar) {
        box.b();
        lcg.d(bgbVar.i.size() == 1, "only one capture stage is supported.");
        lcg.d(a() > 0, "Too many acquire images. Close image to be able to process next.");
        this.a = bgbVar;
        bqk.i(bgbVar.j, new bfb(this, bgbVar), bpc.a());
    }

    final void d(bgi bgiVar) {
        box.b();
        bgb bgbVar = this.a;
        if (bgbVar != null) {
            if (bgbVar.a == bgiVar.a()) {
                bgb bgbVar2 = this.a;
                bbg bbgVarB = bgiVar.b();
                box.b();
                bge bgeVar = bgbVar2.l;
                if (bgeVar.f) {
                    return;
                }
                bgv bgvVar = bgeVar.a;
                box.b();
                boolean z = false;
                if (bgvVar.a > 0) {
                    bgvVar.a = 0;
                    z = true;
                }
                if (!z) {
                    bgeVar.f(bbgVarB);
                }
                bgeVar.d();
                bgeVar.d.c(bbgVarB);
                if (z) {
                    bgeVar.b.c(bgvVar);
                }
            }
        }
    }

    public final void e(bkw bkwVar) {
        bkwVar.j(new bkv() { // from class: bev
            /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: IllegalStateException -> 0x00d4, TryCatch #0 {IllegalStateException -> 0x00d4, blocks: (B:3:0x0004, B:5:0x000b, B:8:0x0014, B:10:0x0028, B:12:0x003c, B:14:0x0058, B:16:0x0063, B:18:0x0067, B:19:0x0070, B:21:0x0074, B:24:0x007e, B:28:0x0087, B:30:0x0092, B:31:0x00a0, B:34:0x00aa, B:36:0x00ae, B:37:0x00b1, B:23:0x007c, B:39:0x00b7, B:41:0x00c0, B:43:0x00c4), top: B:50:0x0004 }] */
            @Override // defpackage.bkv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.bkw r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "Failed to acquire latest image"
                    bfe r1 = r6.a
                    bbm r7 = r7.f()     // Catch: java.lang.IllegalStateException -> Ld4
                    r2 = 0
                    if (r7 == 0) goto Lc0
                    defpackage.box.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    bgb r3 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r4 = "CaptureNode"
                    if (r3 != 0) goto L28
                    java.lang.String r2 = "Discarding ImageProxy which was inadvertently acquired: "
                    java.util.Objects.toString(r7)     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r3 = r7.toString()     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.IllegalStateException -> Ld4
                    defpackage.bbs.f(r4, r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.close()     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                L28:
                    bbh r3 = r7.e()     // Catch: java.lang.IllegalStateException -> Ld4
                    bmx r3 = r3.c()     // Catch: java.lang.IllegalStateException -> Ld4
                    bgb r5 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r5 = r5.h     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.Object r3 = r3.c(r5)     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r3 == 0) goto Lb7
                    defpackage.box.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    bfy r3 = r1.e     // Catch: java.lang.IllegalStateException -> Ld4
                    r3.getClass()     // Catch: java.lang.IllegalStateException -> Ld4
                    bej r3 = (defpackage.bej) r3     // Catch: java.lang.IllegalStateException -> Ld4
                    btb r3 = r3.a     // Catch: java.lang.IllegalStateException -> Ld4
                    bgb r4 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    bek r5 = new bek     // Catch: java.lang.IllegalStateException -> Ld4
                    r5.<init>(r4, r7)     // Catch: java.lang.IllegalStateException -> Ld4
                    r3.accept(r5)     // Catch: java.lang.IllegalStateException -> Ld4
                    bgb r3 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    bfd r4 = r1.f     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r4 == 0) goto L7c
                    bee r4 = (defpackage.bee) r4     // Catch: java.lang.IllegalStateException -> Ld4
                    java.util.List r4 = r4.c     // Catch: java.lang.IllegalStateException -> Ld4
                    int r4 = r4.size()     // Catch: java.lang.IllegalStateException -> Ld4
                    r5 = 1
                    if (r4 <= r5) goto L7c
                    bgb r4 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r4 == 0) goto L70
                    bgv r4 = r4.b     // Catch: java.lang.IllegalStateException -> Ld4
                    int r7 = r7.a()     // Catch: java.lang.IllegalStateException -> Ld4
                    r4.o(r7)     // Catch: java.lang.IllegalStateException -> Ld4
                L70:
                    bgb r7 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r7 == 0) goto L7e
                    bgv r7 = r7.b     // Catch: java.lang.IllegalStateException -> Ld4
                    boolean r7 = r7.n()     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r7 == 0) goto L7e
                L7c:
                    r1.a = r2     // Catch: java.lang.IllegalStateException -> Ld4
                L7e:
                    int r7 = r3.k     // Catch: java.lang.IllegalStateException -> Ld4
                    r4 = -1
                    if (r7 == r4) goto La0
                    r4 = 100
                    if (r7 == r4) goto La0
                    r3.k = r4     // Catch: java.lang.IllegalStateException -> Ld4
                    bge r7 = r3.l     // Catch: java.lang.IllegalStateException -> Ld4
                    defpackage.box.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    boolean r4 = r7.f     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r4 != 0) goto La0
                    bgv r7 = r7.a     // Catch: java.lang.IllegalStateException -> Ld4
                    java.util.concurrent.Executor r7 = r7.i()     // Catch: java.lang.IllegalStateException -> Ld4
                    bgs r4 = new bgs     // Catch: java.lang.IllegalStateException -> Ld4
                    r4.<init>()     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.execute(r4)     // Catch: java.lang.IllegalStateException -> Ld4
                La0:
                    bge r7 = r3.l     // Catch: java.lang.IllegalStateException -> Ld4
                    defpackage.box.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    boolean r3 = r7.f     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r3 == 0) goto Laa
                    goto Le8
                Laa:
                    boolean r3 = r7.g     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r3 != 0) goto Lb1
                    r7.e()     // Catch: java.lang.IllegalStateException -> Ld4
                Lb1:
                    kog r7 = r7.d     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.b(r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                Lb7:
                    java.lang.String r2 = "Discarding ImageProxy which was acquired for aborted request"
                    defpackage.bbs.f(r4, r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.close()     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                Lc0:
                    bgb r7 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r7 == 0) goto Le8
                    int r7 = r7.a     // Catch: java.lang.IllegalStateException -> Ld4
                    bbg r3 = new bbg     // Catch: java.lang.IllegalStateException -> Ld4
                    r3.<init>(r0, r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    bel r2 = new bel     // Catch: java.lang.IllegalStateException -> Ld4
                    r2.<init>(r7, r3)     // Catch: java.lang.IllegalStateException -> Ld4
                    r1.d(r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                Ld4:
                    r7 = move-exception
                    bgb r2 = r1.a
                    if (r2 == 0) goto Le8
                    bbg r3 = new bbg
                    r3.<init>(r0, r7)
                    bel r7 = new bel
                    int r0 = r2.a
                    r7.<init>(r0, r3)
                    r1.d(r7)
                Le8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bev.a(bkw):void");
            }
        }, bpn.a());
    }
}
