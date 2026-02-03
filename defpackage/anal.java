package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anal extends fcyz implements fdat {
    int a;
    final /* synthetic */ anao b;
    final /* synthetic */ anpj c;
    final /* synthetic */ BugleConversationId d;
    final /* synthetic */ aoer e;
    final /* synthetic */ amwf f;
    final /* synthetic */ basd g;
    final /* synthetic */ Instant h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anal(anao anaoVar, anpj anpjVar, BugleConversationId bugleConversationId, aoer aoerVar, amwf amwfVar, basd basdVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anaoVar;
        this.c = anpjVar;
        this.d = bugleConversationId;
        this.e = aoerVar;
        this.f = amwfVar;
        this.g = basdVar;
        this.h = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        anao anaoVar = this.b;
        anpj anpjVar = this.c;
        BugleConversationId bugleConversationId = this.d;
        aoer aoerVar = this.e;
        amwf amwfVar = this.f;
        basd basdVar = this.g;
        Instant instant = this.h;
        this.a = 1;
        Object objF = anaoVar.f(anpjVar, bugleConversationId, aoerVar, amwfVar, basdVar, instant, 1, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anal(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
