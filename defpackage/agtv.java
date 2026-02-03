package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agtv extends fcyz implements fdav {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ agua e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtv(agua aguaVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.e = aguaVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        agtv agtvVar = new agtv(this.e, (fcxy) obj4);
        agtvVar.b = zBooleanValue;
        agtvVar.c = (agqo) obj2;
        agtvVar.d = zBooleanValue2;
        return agtvVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        List<agqp> list;
        boolean z3;
        boolean z4;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            z2 = this.d;
            z = this.b;
            list = (List) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            z = this.b;
            agqo agqoVar = (agqo) this.c;
            boolean z5 = this.d;
            List list2 = agqoVar != null ? agqoVar.b : null;
            agua aguaVar = this.e;
            this.c = list2;
            this.a = 1;
            Object objC = aguaVar.e.c(this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            z2 = z5;
            list = list2;
            obj = objC;
        }
        boolean z6 = z;
        boolean z7 = !((Boolean) obj).booleanValue();
        if (list == null || list.isEmpty()) {
            z3 = false;
        } else {
            for (agqp agqpVar : list) {
                if (agqpVar == agqp.c || agqpVar == agqp.d) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        if (list == null || list.isEmpty()) {
            z4 = false;
        } else {
            for (agqp agqpVar2 : list) {
                if (agqpVar2 == agqp.e || agqpVar2 == agqp.f) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
        }
        return new agti(z7, z3, z4, z6 && !z2, this.e.b instanceof PenpalBotConversationId, z6);
    }
}
