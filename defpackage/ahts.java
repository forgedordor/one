package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahts extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahtt b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahts(ahtt ahttVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahttVar;
        this.c = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahts) c((UUID) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahwd ahwdVar = (ahwd) this.b.a.b();
            UUID uuid = this.c;
            this.a = 1;
            obj = ahwdVar.o(uuid, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ahto ahtoVar = (ahto) obj;
        if (ahtoVar != null) {
            return ahtoVar.j;
        }
        aiay aiayVar = aiay.a;
        aiayVar.getClass();
        return aiayVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahts(this.b, this.c, fcxyVar);
    }
}
