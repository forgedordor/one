package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hpt<T> extends hng<T> {
    public hpt(fdae fdaeVar) {
        super(fdaeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hng
    public final hsl b(hpu hpuVar, hsl hslVar) {
        hoa hoaVar = null;
        if (hslVar instanceof hoa) {
            if (hpuVar.d) {
                hoaVar = (hoa) hslVar;
                hoaVar.a.b(hpuVar.a());
            }
        } else if (hslVar instanceof hsh) {
            if ((hpuVar.b || hpuVar.e != null) && !hpuVar.d) {
                hsh hshVar = (hsh) hslVar;
                if (fdbq.f(hpuVar.a(), hshVar.a)) {
                    hoaVar = hshVar;
                }
            }
        } else if (hslVar instanceof hnp) {
            fdap fdapVar = ((hnp) hslVar).a;
        }
        if (hoaVar != null) {
            return hoaVar;
        }
        if (!hpuVar.d) {
            return new hsh(hpuVar.a());
        }
        Object obj = hpuVar.e;
        hrn hrnVar = hpuVar.c;
        if (hrnVar == null) {
            hrnVar = hsi.a;
        }
        return new hoa(new hpl(obj, hrnVar));
    }

    public abstract hpu c(Object obj);

    public final hpu d(Object obj) {
        hpu hpuVarC = c(obj);
        hpuVarC.f = false;
        return hpuVarC;
    }
}
