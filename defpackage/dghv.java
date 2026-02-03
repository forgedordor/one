package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghv extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgia b;
    final /* synthetic */ dggk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghv(fcxy fcxyVar, dgia dgiaVar, dggk dggkVar) {
        super(2, fcxyVar);
        this.b = dgiaVar;
        this.c = dggkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgia dgiaVar = this.b;
            this.a = 1;
            if (dgiaVar.s(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fdct.b(this.b.h(this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghv dghvVar = new dghv(fcxyVar, this.b, this.c);
        dghvVar.d = obj;
        return dghvVar;
    }
}
