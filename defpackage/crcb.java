package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crcb extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ elny d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crcb(crcm crcmVar, MessageCoreData messageCoreData, elny elnyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = messageCoreData;
        this.d = elnyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crcb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        crcm crcmVar = this.b;
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        if (crcmVar.l(messageCoreData, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crcb(this.b, this.c, this.d, fcxyVar);
    }
}
