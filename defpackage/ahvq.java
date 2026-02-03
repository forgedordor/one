package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvq extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahwd b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvq(ahwd ahwdVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahwdVar;
        this.c = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvq) c((UUID) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahwd ahwdVar = this.b;
            UUID uuid = this.c;
            this.a = 1;
            obj = ahwdVar.o(uuid, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ahto ahtoVar = (ahto) obj;
        if (ahtoVar != null) {
            return ahtoVar.c;
        }
        throw new ahui(this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahvq(this.b, this.c, fcxyVar);
    }
}
