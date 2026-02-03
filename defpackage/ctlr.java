package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctlr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ djqn c;
    final /* synthetic */ List d;
    final /* synthetic */ ejy e;
    final /* synthetic */ oxm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctlr(fdat fdatVar, djqn djqnVar, List list, ejy ejyVar, oxm oxmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = djqnVar;
        this.d = list;
        this.e = ejyVar;
        this.f = oxmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctlr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.e;
            ctln ctlnVar = new ctln(fdqq.a(new ctlq(hsb.a(new fdae() { // from class: ctlk
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }), this.f, this.c, this.d)));
            this.a = 1;
            if (fdtc.a(ctlnVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.a(Boolean.valueOf(!this.c.b.isEmpty()), Boolean.valueOf(!this.d.isEmpty()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctlr(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
