package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuo extends fcyz implements fdat {
    final /* synthetic */ ahwd a;
    final /* synthetic */ UUID b;
    final /* synthetic */ aiaf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuo(fcxy fcxyVar, ahwd ahwdVar, UUID uuid, aiaf aiafVar) {
        super(2, fcxyVar);
        this.a = ahwdVar;
        this.b = uuid;
        this.c = aiafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahuo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ahwd ahwdVar = this.a;
        ((dqsn) ahwdVar.c.b()).d("completeActiveExecution", new ahur(this.b, ahwdVar, this.c));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahuo ahuoVar = new ahuo(fcxyVar, this.a, this.b, this.c);
        ahuoVar.d = obj;
        return ahuoVar;
    }
}
