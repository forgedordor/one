package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbl extends fcyz implements fdat {
    final /* synthetic */ crbb a;
    final /* synthetic */ crcm b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbl(fcxy fcxyVar, crbb crbbVar, crcm crcmVar, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.a = crbbVar;
        this.b = crcmVar;
        this.c = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a(((baxe) this.b.a.b()).u(this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbl crblVar = new crbl(fcxyVar, this.a, this.b, this.c);
        crblVar.d = obj;
        return crblVar;
    }
}
