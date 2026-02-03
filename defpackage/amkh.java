package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amkh implements amkd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/classification/ClassificationControllerImpl");
    public final fcsu b;
    public final BugleConversationId c;
    private final amkx d;
    private final fcyh e;

    public amkh(amkx amkxVar, fcsu fcsuVar, fcyh fcyhVar, BugleConversationId bugleConversationId) {
        this.d = amkxVar;
        this.b = fcsuVar;
        this.e = fcyhVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.amkd
    public final anpj a() {
        amkx amkxVar = this.d;
        fdjx fdjxVar = (fdjx) amkxVar.a.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) amkxVar.b.b();
        fdjxVar2.getClass();
        cqtp cqtpVar = (cqtp) amkxVar.c.b();
        cqtpVar.getClass();
        bbmo bbmoVar = (bbmo) amkxVar.d.b();
        bbmoVar.getClass();
        Optional optional = (Optional) amkxVar.e.b();
        optional.getClass();
        cgrz cgrzVar = (cgrz) amkxVar.f.b();
        cgrzVar.getClass();
        cgry cgryVar = (cgry) amkxVar.g.b();
        cgryVar.getClass();
        return new amkw(fdjxVar, fdjxVar2, cqtpVar, bbmoVar, optional, cgrzVar, cgryVar, this.c);
    }

    @Override // defpackage.amkd
    public final Object b(amkc amkcVar, fcxy fcxyVar) {
        Object objA;
        MessageIdType messageIdType = ((CoreBugleMessageId) amkcVar.c).a;
        return (messageIdType != null && (objA = fdin.a(eicg.a(this.e), new amkf(null, this, messageIdType), fcxyVar)) == fcyl.a) ? objA : fctx.a;
    }

    @Override // defpackage.amkd
    public final Object c(amkc amkcVar) {
        Object objK = ((crbi) this.b.b()).k(new Long(amkcVar.d), amkcVar.e, this.c.a, amkcVar.b, elpn.SHOWN);
        return objK == fcyl.a ? objK : fctx.a;
    }
}
