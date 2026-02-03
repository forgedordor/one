package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agvq extends fcyz implements fdau {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ agvz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvq(agvz agvzVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = agvzVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        agvq agvqVar = new agvq(this.d, (fcxy) obj3);
        agvqVar.b = zBooleanValue;
        agvqVar.c = zBooleanValue2;
        return agvqVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        boolean z = this.b;
        boolean z2 = this.c;
        agvz agvzVar = this.d;
        this.a = 1;
        Object objC = agvzVar.c(z, z2, agvzVar.e instanceof PenpalBotConversationId, this);
        return objC == fcylVar ? fcylVar : objC;
    }
}
