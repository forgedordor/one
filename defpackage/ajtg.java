package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajtg extends fcyz implements fdat {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ ajth c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajtg(BugleConversation bugleConversation, ajth ajthVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bugleConversation;
        this.c = ajthVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajtg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objB;
        int i;
        int iA;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 != 0) {
            objB = obj;
        } else {
            BugleConversation bugleConversation = this.b;
            DefaultConversation defaultConversation = (DefaultConversation) bugleConversation;
            eiju eijuVarB = defaultConversation.f.b();
            eijuVarB.getClass();
            eiju eijuVarB2 = defaultConversation.d.b();
            eijuVarB2.getClass();
            eiju eijuVarB3 = bugleConversation.a().c().b();
            eijuVarB3.getClass();
            fdkf[] fdkfVarArr = {auvw.e(eijuVarB), auvw.e(eijuVarB2), auvw.e(eijuVarB3)};
            this.a = 1;
            objB = fdii.b(fdkfVarArr, this);
            if (objB == fcylVar) {
                return fcylVar;
            }
        }
        List list = (List) objB;
        Object obj2 = list.get(0);
        obj2.getClass();
        ajts ajtsVar = (ajts) obj2;
        Object obj3 = list.get(1);
        obj3.getClass();
        ekgb ekgbVar = (ekgb) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        ajna ajnaVarE = ((ajlh) obj4).e();
        boolean z = ajnaVarE.g;
        boolean z2 = ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ekgbVar.size() == 1 && ((ResolvedRecipient) fcva.N(ekgbVar)).g().z();
        ajth ajthVar = this.c;
        ajhd ajhdVar = (ajhd) ajthVar.a.b();
        BugleConversation bugleConversation2 = this.b;
        elka elkaVar = elka.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        int size = ekgbVar.size();
        boolean zU = ajtsVar.u();
        Boolean boolValueOf = Boolean.valueOf(ajtsVar.I() == elwp.SEND_MODE_XMS_LATCH);
        int iA2 = ajtsVar.A();
        aixq aixqVar = (aixq) ajthVar.b.b();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolvedRecipient) it.next()).g());
        }
        ekgb ekgbVarA = aixqVar.a(ekfv.a(arrayList));
        boolean zO = ajtsVar.O();
        if (ajtsVar.c() == ajlj.GROUP) {
            iA = csyi.a(csxq.a(ekgbVar));
        } else {
            if (ajtsVar.c() != ajlj.ONE_ON_ONE || ekgbVar.size() != 1) {
                i = 7;
                ajhdVar.as(((DefaultConversation) bugleConversation2).a.a, elkaVar, size, zU, boolValueOf, z, z2, iA2, ekgbVarA, zO, i, ajnaVarE.h, bvdk.h(ajtsVar.i()));
                return null;
            }
            iA = csyi.a(((aobo) ((ResolvedRecipient) fcva.X(ekgbVar)).m()).d);
        }
        i = iA;
        ajhdVar.as(((DefaultConversation) bugleConversation2).a.a, elkaVar, size, zU, boolValueOf, z, z2, iA2, ekgbVarA, zO, i, ajnaVarE.h, bvdk.h(ajtsVar.i()));
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajtg(this.b, this.c, fcxyVar);
    }
}
