package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvj extends fcyz implements fdat {
    final /* synthetic */ UUID a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvj(fcxy fcxyVar, UUID uuid) {
        super(2, fcxyVar);
        this.a = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = btsn.a;
        btsi btsiVar = new btsi(btsn.a);
        btsiVar.A("getAttachmentMetadataForNonRestoredAttachments");
        btsiVar.c(ahvl.a);
        btqt btqtVarA = btqy.a();
        btqtVarA.c(new ahvm(this.a));
        return ((btsi) btsiVar.j(dqts.i(btqtVarA.b(), btqy.c.a, btsn.b.b))).b().z();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahvj ahvjVar = new ahvj(fcxyVar, this.a);
        ahvjVar.b = obj;
        return ahvjVar;
    }
}
