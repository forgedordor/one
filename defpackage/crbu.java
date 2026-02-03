package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbu extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ crcm c;
    final /* synthetic */ boolean d;
    final /* synthetic */ elny e;
    Object f;
    Object g;
    Object h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbu(fcxy fcxyVar, MessageCoreData messageCoreData, crcm crcmVar, boolean z, elny elnyVar) {
        super(2, fcxyVar);
        this.b = messageCoreData;
        this.c = crcmVar;
        this.d = z;
        this.e = elnyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        elny elnyVar;
        List list;
        crcp crcpVar;
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            MessageCoreData messageCoreData = this.b;
            if (messageCoreData != null) {
                crcm crcmVar = this.c;
                fcsu fcsuVar = crcmVar.f;
                if (((crlk) fcsuVar.b()).b() && ((crlk) fcsuVar.b()).c() && !this.d && ((elnyVar = this.e) == elny.NOTIFICATION_REPLY || elnyVar == elny.PHONE_QUICK_REPLY || elnyVar == elny.PHONE_SMART_REPLY || elnyVar == elny.WIDGET_REPLY)) {
                    MessageIdType messageIdTypeC = messageCoreData.C();
                    messageIdTypeC.getClass();
                    this.a = 1;
                    obj = crcmVar.n(messageIdTypeC, this);
                    if (obj != fcylVar) {
                    }
                    return fcylVar;
                }
            }
            return fctx.a;
        }
        if (i != 1) {
            Object obj4 = this.h;
            obj2 = this.g;
            obj3 = this.f;
            list = (List) this.i;
            fctl.b(obj);
            crcpVar = obj4;
            emig emigVar = (emig) obj2;
            crcpVar.i(emigVar, (elny) obj3, list, (List) obj, this.b);
            return fctx.a;
        }
        fctl.b(obj);
        crcm crcmVar2 = this.c;
        list = (List) obj;
        ((crif) crcmVar2.b.b()).o(list, ezai.SHOWN_REPLIED);
        crcp crcpVar2 = (crcp) crcmVar2.g.b();
        crbb crbbVar = (crbb) crcmVar2.e.b();
        MessageCoreData messageCoreData2 = this.b;
        emig emigVarA = crbbVar.a(messageCoreData2);
        elny elnyVar2 = this.e;
        list.size();
        fdkf fdkfVarO = crcmVar2.o(messageCoreData2);
        this.i = list;
        this.f = elnyVar2;
        this.g = emigVarA;
        this.h = crcpVar2;
        this.a = 2;
        Object objC = fdkfVarO.c(this);
        if (objC != fcylVar) {
            crcpVar = crcpVar2;
            obj = objC;
            obj2 = emigVarA;
            obj3 = elnyVar2;
            emig emigVar2 = (emig) obj2;
            crcpVar.i(emigVar2, (elny) obj3, list, (List) obj, this.b);
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbu crbuVar = new crbu(fcxyVar, this.b, this.c, this.d, this.e);
        crbuVar.i = obj;
        return crbuVar;
    }
}
