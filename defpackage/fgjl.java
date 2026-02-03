package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjl extends fgmf {
    private final fglj b = new fglj();
    public final fgjf a = new fgjf();

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.b;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        fgin fginVar = (fgin) fgmlVar;
        if (fginVar.h) {
            return null;
        }
        return new fgid(fginVar.d, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ca A[SYNTHETIC] */
    @Override // defpackage.fgmf, defpackage.fgmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.fgly r13) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgjl.d(fgly):void");
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void e(fglr fglrVar) {
        fglz fglzVarB = this.a.b();
        if (fglzVarB.e()) {
            return;
        }
        fglrVar.a(fglzVarB, this.b);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean f() {
        return true;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void l() {
        fgjf fgjfVar = this.a;
        for (fglb fglbVar : fgjfVar.a()) {
            fglj fgljVar = this.b;
            fglbVar.k();
            fglbVar.h = fgljVar.h;
            fgle fgleVar = fglbVar.h;
            if (fgleVar != null) {
                fgleVar.i = fglbVar;
            }
            fglbVar.i = fgljVar;
            fgljVar.h = fglbVar;
            fglbVar.e = fgljVar.e;
            if (fglbVar.h == null) {
                fglbVar.e.f = fglbVar;
            }
        }
        if (fgjfVar.b().e()) {
            this.b.k();
        } else {
            this.b.j(fgjfVar.b);
        }
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final List m() {
        fgkq fgkqVar = new fgkq(fglb.class);
        for (fglb fglbVar : this.a.a()) {
            Map.EL.putIfAbsent(fgkqVar.b, fgkf.a(fglbVar.a), fglbVar);
        }
        Object[] objArr = {fgkqVar};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
