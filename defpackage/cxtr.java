package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ LoadMessagesReceiver c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtr(fdpl fdplVar, fcxy fcxyVar, LoadMessagesReceiver loadMessagesReceiver) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = loadMessagesReceiver;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxtr) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.d;
            fdpl fdplVar = this.b;
            cxtq cxtqVar = new cxtq(fdpmVar, this.c);
            this.a = 1;
            if (fdplVar.a(cxtqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxtr cxtrVar = new cxtr(this.b, fcxyVar, this.c);
        cxtrVar.d = obj;
        return cxtrVar;
    }
}
