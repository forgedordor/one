package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crbv extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ boolean c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ elny e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbv(crcm crcmVar, boolean z, MessageCoreData messageCoreData, elny elnyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = z;
        this.d = messageCoreData;
        this.e = elnyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        crcm crcmVar = this.b;
        boolean z = this.c;
        MessageCoreData messageCoreData = this.d;
        elny elnyVar = this.e;
        this.a = 1;
        Object objA = fdin.a(eicg.a(crcmVar.c), new crbu(null, messageCoreData, crcmVar, z, elnyVar), this);
        if (objA != obj2) {
            objA = fctx.a;
        }
        if (objA == obj2) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crbv(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
