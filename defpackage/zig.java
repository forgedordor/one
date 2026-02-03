package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zig extends fcyz implements fdat {
    int a;
    final /* synthetic */ fduf b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ zij d;
    final /* synthetic */ zih e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zig(fduf fdufVar, MessageId messageId, zij zijVar, zih zihVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdufVar;
        this.c = messageId;
        this.d = zijVar;
        this.e = zihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zig) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            ekrd ekrdVar = (ekrd) zih.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$startCountdown$1$1", "invokeSuspend", 617, "VideoBubbleUiAdapter.kt");
            MessageId messageId = this.c;
            zij zijVar = this.d;
            ekrdVar.D("Video bubble with messageId = %s has timed out and now in %s state", messageId.a(), zijVar.e);
            do {
                objC = fdufVar.c();
            } while (!fdufVar.g(objC, zijVar));
        }
        zih zihVar = this.e;
        zihVar.u.add(this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zig(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
