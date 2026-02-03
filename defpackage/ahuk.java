package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuk extends fcyz implements fdat {
    final /* synthetic */ ahwd a;
    final /* synthetic */ UUID b;
    final /* synthetic */ aiad c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuk(fcxy fcxyVar, ahwd ahwdVar, UUID uuid, aiad aiadVar) {
        super(2, fcxyVar);
        this.a = ahwdVar;
        this.b = uuid;
        this.c = aiadVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahuk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((dqsn) this.a.c.b()).d("addAttachmentFileMetadata", new ahum(this.b, this.c));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahuk ahukVar = new ahuk(fcxyVar, this.a, this.b, this.c);
        ahukVar.d = obj;
        return ahukVar;
    }
}
