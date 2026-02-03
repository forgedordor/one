package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yjd implements fdau {
    public static final yjd a = new yjd();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ije ijeVar;
        String str = (String) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(1136910848);
        if (fdbq.f(str, "error")) {
            hmlVar.v(1649634981);
            long j = glz.a(hmlVar).w;
            hmlVar.o();
            ijeVar = new ije(j);
        } else {
            hmlVar.v(-400885660);
            ijeVar = str == null ? null : new ije(dljt.a(hmlVar).c.a(str));
            hmlVar.o();
        }
        hmlVar.o();
        return ijeVar;
    }
}
