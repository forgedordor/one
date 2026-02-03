package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyq implements lxk {
    private final lyt[] a;

    public lyq(lyt... lytVarArr) {
        lytVarArr.getClass();
        this.a = lytVarArr;
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd a(Class cls) {
        return lxj.b();
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        lyt lytVar;
        lyt[] lytVarArr = this.a;
        int length = lytVarArr.length;
        fddy fddyVarC = fdab.c(cls);
        lyt[] lytVarArr2 = (lyt[]) Arrays.copyOf(lytVarArr, length);
        lytVarArr2.getClass();
        int i = 0;
        while (true) {
            if (i >= lytVarArr2.length) {
                lytVar = null;
                break;
            }
            lytVar = lytVarArr2[i];
            if (fdbq.f(lytVar.a, fddyVarC)) {
                break;
            }
            i++;
        }
        lxd lxdVar = lytVar != null ? (lxd) lytVar.b.invoke(lypVar) : null;
        if (lxdVar != null) {
            return lxdVar;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(lze.a(fddyVarC))));
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
