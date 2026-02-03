package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbn implements kbi {
    public final kci a;
    public final kbu b;
    public final kch c;
    public final fdap d = new fdap() { // from class: kbl
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            kcr kcrVar = (kcr) obj;
            kcc kccVar = kcrVar.b;
            int i = kcrVar.c;
            int i2 = kcrVar.d;
            Object obj2 = kcrVar.e;
            return this.a.b(new kcr(null, kccVar, i, i2)).a();
        }
    };
    private final kct e;
    private final kar f;

    public kbn(kci kciVar, kar karVar, kct kctVar, kbu kbuVar, kch kchVar) {
        this.a = kciVar;
        this.f = karVar;
        this.e = kctVar;
        this.b = kbuVar;
        this.c = kchVar;
    }

    @Override // defpackage.kbi
    public final hsf a(kbj kbjVar, kcc kccVar, int i, int i2) {
        int i3 = this.f.a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            kccVar = new kcc(fddu.i(kccVar.i + i3, 1, 1000));
        }
        return b(new kcr(kbjVar, kccVar, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [hsf, java.lang.Object, kcw] */
    public final hsf b(final kcr kcrVar) {
        fdap fdapVar = new fdap() { // from class: kbm
            /* JADX WARN: Code restructure failed: missing block: B:211:0x0361, code lost:
            
                r3 = (java.util.List) r2.a;
                r4 = r2.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:212:0x0368, code lost:
            
                if (r3 != null) goto L214;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x036a, code lost:
            
                r0 = new defpackage.kcv(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x0370, code lost:
            
                r2 = new defpackage.kax(r3, r4, r5, r10.a, r7, r11);
                defpackage.fdil.d(r10.b, null, defpackage.fdjz.d, new defpackage.kbs(r2, null), 1);
                r0 = new defpackage.kcu(r2);
             */
            /* JADX WARN: Removed duplicated region for block: B:232:0x03c4  */
            /* JADX WARN: Removed duplicated region for block: B:233:0x03c6  */
            @Override // defpackage.fdap
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 975
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kbm.invoke(java.lang.Object):java.lang.Object");
            }
        };
        final kct kctVar = this.e;
        synchronized (kctVar.a) {
            cub cubVar = kctVar.b;
            kcw kcwVar = (kcw) cubVar.c(kcrVar);
            if (kcwVar != null) {
                if (kcwVar.b()) {
                    return kcwVar;
                }
            }
            try {
                ?? Invoke = fdapVar.invoke(new fdap() { // from class: kcs
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        kcw kcwVar2 = (kcw) obj;
                        kct kctVar2 = kctVar;
                        synchronized (kctVar2.a) {
                            boolean zB = kcwVar2.b();
                            kcr kcrVar2 = kcrVar;
                            if (zB) {
                            }
                        }
                        return fctx.a;
                    }
                });
                synchronized (kctVar.a) {
                    cub cubVar2 = kctVar.b;
                    if (cubVar2.c(kcrVar) == null && Invoke.b()) {
                        cubVar2.d(kcrVar, Invoke);
                    }
                }
                return Invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
