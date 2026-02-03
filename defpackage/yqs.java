package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqs extends fcyz implements fdap {
    int a;
    final /* synthetic */ yrg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqs(yrg yrgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = yrgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yrg yrgVar = this.b;
            this.a = 1;
            fdiu fdiuVar = new fdiu(fcym.c(this), 1);
            fdiuVar.B();
            yrgVar.f.d(true, new yrf(fdiuVar, yrgVar));
            obj = fdiuVar.m();
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            ((ekrd) yrg.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog$editScheduledMessage$replaced$1", "invokeSuspend", 79, "ScheduledSendEditDialog.kt")).q("Confirmed overwriting draft message");
            return bool;
        }
        ((ekrd) yrg.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog$editScheduledMessage$replaced$1", "invokeSuspend", 81, "ScheduledSendEditDialog.kt")).q("Did not confirm overwriting draft message");
        return bool;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new yqs(this.b, (fcxy) obj).b(fctx.a);
    }
}
