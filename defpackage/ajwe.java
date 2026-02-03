package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajwe extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajwg b;
    final /* synthetic */ Conversation c;
    final /* synthetic */ auib d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajwe(ajwg ajwgVar, Conversation conversation, int i, auib auibVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajwgVar;
        this.c = conversation;
        this.e = i;
        this.d = auibVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajwe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ajwg ajwgVar = this.b;
        Conversation conversation = this.c;
        int i2 = this.e;
        auib auibVar = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(ajwgVar.b), new ajwd(null, conversation, ajwgVar, i2, auibVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajwe(this.b, this.c, this.e, this.d, fcxyVar);
    }
}
