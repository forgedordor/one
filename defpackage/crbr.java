package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbr extends fcyz implements fdat {
    final /* synthetic */ crcm a;
    final /* synthetic */ MessageIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbr(fcxy fcxyVar, crcm crcmVar, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.a = crcmVar;
        this.b = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((baxe) this.a.a.b()).w(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbr crbrVar = new crbr(fcxyVar, this.a, this.b);
        crbrVar.c = obj;
        return crbrVar;
    }
}
