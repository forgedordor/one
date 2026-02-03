package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crby extends fcyz implements fdat {
    final /* synthetic */ crcm a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crby(fcxy fcxyVar, crcm crcmVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = crcmVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crby) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((crbb) this.a.e.b()).a(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crby crbyVar = new crby(fcxyVar, this.a, this.b);
        crbyVar.c = obj;
        return crbyVar;
    }
}
