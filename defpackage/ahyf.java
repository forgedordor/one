package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyf extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ ahzi c;
    final /* synthetic */ UUID d;
    final /* synthetic */ fdcg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyf(ahzi ahziVar, UUID uuid, fdcg fdcgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = ahziVar;
        this.d = uuid;
        this.e = fdcgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            ahwd ahwdVar = (ahwd) this.c.b.b();
            UUID uuid = this.d;
            aiaf aiafVar = aiaf.ATTACHMENTS_RESTORING;
            this.b = 1;
            if (ahwdVar.s(uuid, aiafVar, this) != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            ((fdcg) obj2).a = ((Number) obj).intValue();
            return fctx.a;
        }
        fctl.b(obj);
        fdcg fdcgVar = this.e;
        ahzi ahziVar = this.c;
        ahtn ahtnVar = (ahtn) ahziVar.d.b();
        UUID uuid2 = this.d;
        this.a = fdcgVar;
        this.b = 2;
        Object objF = ahtnVar.f(uuid2, ahziVar.k, this);
        if (objF != fcylVar) {
            obj2 = fdcgVar;
            obj = objF;
            ((fdcg) obj2).a = ((Number) obj).intValue();
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahyf(this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
