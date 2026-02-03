package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufx extends aivg {
    private final apvx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufx(fcsu fcsuVar, ufp ufpVar, Executor executor, apvx apvxVar) {
        super(fcsuVar, ufpVar, executor);
        fcsuVar.getClass();
        executor.getClass();
        this.a = apvxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r5
      0x003a: PHI (r5v6 int) = (r5v0 int), (r5v1 int), (r5v2 int), (r5v3 int) binds: [B:17:0x0038, B:22:0x0041, B:28:0x004a, B:33:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[PHI: r6
      0x0047: PHI (r6v3 int) = (r6v0 int), (r6v1 int) binds: [B:25:0x0045, B:36:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void d(defpackage.ufx r7, int r8, int r9, int r10, int r11, boolean r12, int r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufx.d(ufx, int, int, int, int, boolean, int):void");
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new ufw(ufv.a);
    }

    public final void b(final fdap fdapVar) {
        k(new Supplier() { // from class: ufs
            @Override // java.util.function.Supplier
            public final Object get() {
                emsz emszVar = (emsz) emta.a.createBuilder();
                emszVar.getClass();
                ennk ennkVar = new ennk(emszVar);
                fdapVar.invoke(ennkVar);
                evsn evsnVarBuild = ennkVar.a.build();
                evsnVarBuild.getClass();
                return (emta) evsnVarBuild;
            }
        });
    }

    public final void c(final int i, final int i2) {
        b(new fdap() { // from class: ufr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ennk ennkVar = (ennk) obj;
                ennkVar.getClass();
                emtb emtbVar = (emtb) emtd.a.createBuilder();
                emtbVar.copyOnWrite();
                emtd emtdVar = (emtd) emtbVar.instance;
                emtdVar.c = i - 1;
                emtdVar.b |= 1;
                emtbVar.copyOnWrite();
                emtd emtdVar2 = (emtd) emtbVar.instance;
                emtdVar2.d = i2 - 1;
                emtdVar2.b |= 2;
                evsn evsnVarBuild = emtbVar.build();
                evsnVarBuild.getClass();
                emsz emszVar = ennkVar.a;
                emszVar.copyOnWrite();
                emta emtaVar = (emta) emszVar.instance;
                emta emtaVar2 = emta.a;
                emtaVar.c = (emtd) evsnVarBuild;
                emtaVar.b = 4;
                return fctx.a;
            }
        });
    }
}
