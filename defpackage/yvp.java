package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvp extends fcyz implements fdat {
    int a;
    final /* synthetic */ fduf b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ djtq d;
    final /* synthetic */ yvq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvp(fduf fdufVar, MessageId messageId, djtq djtqVar, yvq yvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdufVar;
        this.c = messageId;
        this.d = djtqVar;
        this.e = yvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fdkj.c(1000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        fduf fdufVar = this.b;
        if (((Number) fdufVar.b().c()).intValue() > 0) {
            ekrw ekrwVarE = yvq.a.e();
            ekrwVarE.X(eksq.a, "BugleImage");
            ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$startCountdown$1$1", "invokeSuspend", 660, "ImageBubbleUiAdapter.kt");
            MessageId messageId = this.c;
            djtq djtqVar = this.d;
            ekrdVar.D("Image bubble with messageId = %s has timed out and now in %s state", messageId.a(), djtqVar.f);
            do {
                objC = fdufVar.c();
            } while (!fdufVar.g(objC, djtqVar));
        }
        yvq yvqVar = this.e;
        yvqVar.u.add(this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yvp(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
