package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gen extends fcyz implements fdat {
    final /* synthetic */ Long a;
    final /* synthetic */ hhr b;
    final /* synthetic */ hid c;
    final /* synthetic */ Locale d;
    final /* synthetic */ hox e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gen(Long l, hhr hhrVar, hid hidVar, Locale locale, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = l;
        this.b = hhrVar;
        this.c = hidVar;
        this.d = locale;
        this.e = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gen) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long jA;
        fctl.b(obj);
        Long l = this.a;
        if (l != null) {
            hhr hhrVar = this.b;
            hid hidVar = this.c;
            Locale locale = this.d;
            hox hoxVar = this.e;
            String strJ = hhrVar.j(l.longValue(), hidVar.c, locale);
            if (strJ.length() == 0) {
                jA = jyo.a;
            } else {
                jA = jyp.a(strJ.length(), strJ.length());
                long j = jyo.a;
            }
            geo.b(hoxVar, new kew(strJ, jA, 4));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gen(this.a, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
