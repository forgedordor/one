package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anai extends fcyz implements fdat {
    int a;
    final /* synthetic */ anao b;
    final /* synthetic */ anpj c;
    final /* synthetic */ BugleConversationId d;
    final /* synthetic */ aoer e;
    final /* synthetic */ amvr f;
    final /* synthetic */ basd g;
    final /* synthetic */ Instant h;
    final /* synthetic */ MessageId i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anai(anao anaoVar, anpj anpjVar, BugleConversationId bugleConversationId, aoer aoerVar, amvr amvrVar, basd basdVar, Instant instant, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anaoVar;
        this.c = anpjVar;
        this.d = bugleConversationId;
        this.e = aoerVar;
        this.f = amvrVar;
        this.g = basdVar;
        this.h = instant;
        this.i = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anai) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            anao anaoVar = this.b;
            anpj anpjVar = this.c;
            BugleConversationId bugleConversationId = this.d;
            aoer aoerVar = this.e;
            amvr amvrVar = this.f;
            basd basdVar = this.g;
            Instant instant = this.h;
            MessageId messageId = this.i;
            this.a = 1;
            if (anaoVar.e(anpjVar, bugleConversationId, aoerVar, amvrVar, basdVar, instant, 1, messageId, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anai(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
    }
}
