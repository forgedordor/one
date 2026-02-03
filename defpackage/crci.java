package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crci extends fcyz implements fdat {
    final /* synthetic */ crcm a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crci(fcxy fcxyVar, crcm crcmVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = crcmVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        crif crifVar = (crif) this.a.b.b();
        MessageIdType messageIdTypeC = this.b.C();
        messageIdTypeC.getClass();
        return crifVar.c(messageIdTypeC).orElse(null);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crci crciVar = new crci(fcxyVar, this.a, this.b);
        crciVar.c = obj;
        return crciVar;
    }
}
