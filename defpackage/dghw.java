package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dghw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgia b;
    final /* synthetic */ dggk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghw(dgia dgiaVar, dggk dggkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dgiaVar;
        this.c = dggkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgia dgiaVar = this.b;
            dggk dggkVar = this.c;
            this.a = 1;
            obj = fdin.a(eicg.a(dgiaVar.d), new dghv(null, dgiaVar, dggkVar), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dghw(this.b, this.c, fcxyVar);
    }
}
