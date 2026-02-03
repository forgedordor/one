package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crvt extends fcyz implements fdat {
    int a;
    final /* synthetic */ crvu b;
    final /* synthetic */ Conversation c;
    final /* synthetic */ crwz d;
    final /* synthetic */ String e;
    final /* synthetic */ crvz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crvt(crvu crvuVar, Conversation conversation, crwz crwzVar, String str, crvz crvzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crvuVar;
        this.c = conversation;
        this.d = crwzVar;
        this.e = str;
        this.f = crvzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crvt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        crwz crwzVar = this.d;
        String str = this.e;
        crvz crvzVar = this.f;
        this.a = 1;
        Object objG = crvuVar.g(conversation, crwzVar, str, crvzVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crvt(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
