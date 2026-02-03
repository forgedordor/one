package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alex extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ alff c;
    final /* synthetic */ aley d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alex(alff alffVar, aley aleyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = alffVar;
        this.d = aleyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alex) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            alff alffVar = this.c;
            String strB = alffVar.b();
            if (strB == null) {
                return null;
            }
            obj2 = strB;
            if (alffVar.a() == alfd.f) {
                fcsu fcsuVar = this.d.c;
                obj2 = strB;
                if (((Optional) fcsuVar.b()).isPresent()) {
                    crbi crbiVar = (crbi) ((Optional) fcsuVar.b()).get();
                    this.a = strB;
                    this.b = 1;
                    Object objF = crbiVar.f(strB, this);
                    obj2 = strB;
                    if (objF != fcylVar) {
                    }
                    return fcylVar;
                }
            }
        } else {
            if (i != 1) {
                fctl.b(obj);
                return null;
            }
            Object obj3 = this.a;
            fctl.b(obj);
            obj2 = obj3;
        }
        aley aleyVar = this.d;
        crif crifVar = (crif) aleyVar.b.b();
        ezaj ezajVar = ezaj.CONSUMED;
        this.a = null;
        this.b = 2;
        if (crifVar.f(aleyVar.d.a, (String) obj2, ezajVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alex(this.c, this.d, fcxyVar);
    }
}
