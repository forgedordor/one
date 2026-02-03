package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftw extends fcyz implements fdat {
    int a;
    final /* synthetic */ aftz b;
    final /* synthetic */ alqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftw(aftz aftzVar, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aftzVar;
        this.c = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aftw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aftz aftzVar = this.b;
            Recipient recipientH = aftzVar.e.h(this.c);
            eiju eijuVarO = aftzVar.g.o(Optional.empty(), ekgb.r(recipientH), null);
            eijuVarO.getClass();
            fdkf fdkfVarE = auvw.e(eijuVarO);
            this.a = 1;
            obj = fdkfVarE.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b(((Conversation) obj).d());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aftw(this.b, this.c, fcxyVar);
    }
}
