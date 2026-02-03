package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcf implements fdau {
    final /* synthetic */ cwbx a;
    final /* synthetic */ fdae b;

    public cwcf(cwbx cwbxVar, fdae fdaeVar) {
        this.a = cwbxVar;
        this.b = fdaeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwbx cwbxVar = this.a;
            ekqh it = cwbxVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                dihq dihqVar = (dihq) it.next();
                dihqVar.getClass();
                cwch.a(dihqVar, this.b, cwbxVar.b, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
