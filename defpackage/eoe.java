package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoe {
    public final hyb a;
    public final fdae b;
    private final cuz c;

    public eoe(hyb hybVar, fdae fdaeVar) {
        this.a = hybVar;
        this.b = fdaeVar;
        long[] jArr = cvp.a;
        this.c = new cuz((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eoi, java.lang.Object] */
    public final Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        eod eodVar = (eod) this.c.f(obj);
        if (eodVar != null) {
            return eodVar.b;
        }
        ?? Invoke = this.b.invoke();
        int iA = Invoke.a(obj);
        if (iA == -1) {
            return null;
        }
        return Invoke.c(iA);
    }

    public final fdat b(int i, Object obj, Object obj2) {
        cuz cuzVar = this.c;
        eod eodVar = (eod) cuzVar.f(obj);
        if (eodVar != null && eodVar.c == i && fdbq.f(eodVar.b, obj2)) {
            return eodVar.a();
        }
        eod eodVar2 = new eod(this, i, obj, obj2);
        cuzVar.e(obj, eodVar2);
        return eodVar2.a();
    }
}
