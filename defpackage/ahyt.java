package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyt extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyt(ahzi ahziVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahzi ahziVar = this.b;
            UUID uuid = this.c;
            ahziVar.o.b("Updating last attachment timestamp for session [%s]", uuid);
            ahwd ahwdVar = (ahwd) ahziVar.b.b();
            this.a = 1;
            if (ahwdVar.z(uuid) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahyt(this.b, this.c, fcxyVar);
    }
}
