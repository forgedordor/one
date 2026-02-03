package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crjb extends fcyz implements fdat {
    final /* synthetic */ ekgb a;
    final /* synthetic */ crjd b;
    final /* synthetic */ ezan c;
    final /* synthetic */ ConversationIdType d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crjb(fcxy fcxyVar, ekgb ekgbVar, crjd crjdVar, ezan ezanVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = ekgbVar;
        this.b = crjdVar;
        this.c = ezanVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crjb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessageIdType messageIdTypeW = ((SuggestionData) this.a.get(0)).w();
        crkq crkqVar = (crkq) crkr.a.createBuilder();
        Integer num = this.c == ezan.SCREEN_EFFECTS ? new Integer(1) : (Integer) crbf.c.e();
        crjd crjdVar = this.b;
        num.getClass();
        int iIntValue = num.intValue();
        crkqVar.copyOnWrite();
        ((crkr) crkqVar.instance).d = iIntValue;
        String strB = messageIdTypeW.b();
        crkqVar.copyOnWrite();
        crkr crkrVar = (crkr) crkqVar.instance;
        strB.getClass();
        crkrVar.c = strB;
        String strA = this.d.a();
        crkqVar.copyOnWrite();
        crkr crkrVar2 = (crkr) crkqVar.instance;
        strA.getClass();
        crkrVar2.b = strA;
        crkqVar.copyOnWrite();
        ((crkr) crkqVar.instance).e = true;
        crkr crkrVar3 = (crkr) crkqVar.build();
        caxr caxrVar = new caxr();
        caxrVar.b = messageIdTypeW.b();
        return ((cazj) crjdVar.a.a.b()).a(cbcu.g("request_smart_suggestions", crkrVar3, caxrVar.a()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crjb crjbVar = new crjb(fcxyVar, this.a, this.b, this.c, this.d);
        crjbVar.e = obj;
        return crjbVar;
    }
}
