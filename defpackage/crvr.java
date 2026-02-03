package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crvr extends fcyz implements fdat {
    int a;
    final /* synthetic */ crvu b;
    final /* synthetic */ Conversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crvr(crvu crvuVar, Conversation conversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crvuVar;
        this.c = conversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crvr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        crvu crvuVar = this.b;
        Conversation conversation = this.c;
        this.a = 1;
        Object objF = crvuVar.f(conversation, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crvr(this.b, this.c, fcxyVar);
    }
}
