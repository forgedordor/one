package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdve extends fdvo implements fduf, fdpl, fdww {
    private final fdhz a;
    private int b;

    public fdve(Object obj) {
        this.a = new fdhz(obj, fdia.a);
    }

    private final boolean i(Object obj, Object obj2) {
        int i;
        fdvq[] fdvqVarArr;
        fdzi fdziVar;
        synchronized (this) {
            fdhz fdhzVar = this.a;
            Object obj3 = fdhzVar.a;
            if (obj != null && !fdbq.f(obj3, obj)) {
                return false;
            }
            if (fdbq.f(obj3, obj2)) {
                return true;
            }
            fdhzVar.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) != 0) {
                this.b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.b = i3;
            fdvq[] fdvqVarArr2 = this.d;
            while (true) {
                fdvh[] fdvhVarArr = (fdvh[]) fdvqVarArr2;
                if (fdvhVarArr != null) {
                    for (fdvh fdvhVar : fdvhVarArr) {
                        if (fdvhVar != null) {
                            while (true) {
                                AtomicReference atomicReference = fdvhVar.a;
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (fdziVar = fdvf.b)) {
                                    fdzi fdziVar2 = fdvf.a;
                                    if (obj4 != fdziVar2) {
                                        if (fdvg.a(atomicReference, obj4, fdziVar2)) {
                                            ((fdiu) obj4).w(fctx.a);
                                            break;
                                        }
                                    } else {
                                        if (fdvg.a(atomicReference, obj4, fdziVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.b;
                    if (i == i3) {
                        this.b = i3 + 1;
                        return true;
                    }
                    fdvqVarArr = this.d;
                }
                fdvqVarArr2 = fdvqVarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r14 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (defpackage.fdbq.f(r13, r14) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0081, code lost:
    
        if (r14 == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:32:0x0081, B:47:0x00bb], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:36:0x008c, B:38:0x0092], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:38:0x0092, B:36:0x008c], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:38:0x0092, B:45:0x00aa], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:47:0x00bb, B:32:0x0081], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:54:0x00e7, B:55:0x00e9], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:32:0x0081, B:34:0x0087, B:36:0x008c, B:45:0x00aa, B:47:0x00bb, B:49:0x00d7, B:50:0x00dc, B:52:0x00e2, B:54:0x00e7, B:38:0x0092, B:42:0x0099, B:19:0x0046, B:22:0x004e, B:31:0x0072, B:27:0x005f, B:29:0x0063), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:32:0x0081, B:34:0x0087, B:36:0x008c, B:45:0x00aa, B:47:0x00bb, B:49:0x00d7, B:50:0x00dc, B:52:0x00e2, B:54:0x00e7, B:38:0x0092, B:42:0x0099, B:19:0x0046, B:22:0x004e, B:31:0x0072, B:27:0x005f, B:29:0x0063), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:32:0x0081, B:34:0x0087, B:36:0x008c, B:45:0x00aa, B:47:0x00bb, B:49:0x00d7, B:50:0x00dc, B:52:0x00e2, B:54:0x00e7, B:38:0x0092, B:42:0x0099, B:19:0x0046, B:22:0x004e, B:31:0x0072, B:27:0x005f, B:29:0x0063), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [fdve, fdvo] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [fdlr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [fdpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b9 -> B:32:0x0081). Please report as a decompilation issue!!! */
    @Override // defpackage.fduj, defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdve.a(fdpm, fcxy):java.lang.Object");
    }

    @Override // defpackage.fduf, defpackage.fdvc
    public final Object c() {
        fdzi fdziVar = fdwz.a;
        Object obj = this.a.a;
        if (obj == fdziVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.fduj
    public final List d() {
        return fcva.b(c());
    }

    @Override // defpackage.fdue
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.fduf
    public final void f(Object obj) {
        if (obj == null) {
            obj = fdwz.a;
        }
        i(null, obj);
    }

    @Override // defpackage.fdue, defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        f(obj);
        return fctx.a;
    }

    @Override // defpackage.fduf
    public final boolean g(Object obj, Object obj2) {
        if (obj == null) {
            obj = fdwz.a;
        }
        if (obj2 == null) {
            obj2 = fdwz.a;
        }
        return i(obj, obj2);
    }

    @Override // defpackage.fdue
    public final boolean h(Object obj) {
        f(obj);
        return true;
    }

    @Override // defpackage.fdww
    public final fdpl hM(fcyh fcyhVar, int i, int i2) {
        return fdvf.b(this, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvo
    public final /* synthetic */ fdvq j() {
        return new fdvh();
    }

    @Override // defpackage.fdvo
    public final /* bridge */ /* synthetic */ fdvq[] m() {
        return new fdvh[2];
    }
}
