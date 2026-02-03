package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxty extends fcyz implements fdat {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxty(fcxy fcxyVar, LoadMessagesReceiver loadMessagesReceiver, String str) {
        super(2, fcxyVar);
        this.a = loadMessagesReceiver;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxty) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Long(((cmot) this.a.f().b()).f(cmmo.e, this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxty cxtyVar = new cxty(fcxyVar, this.a, this.b);
        cxtyVar.c = obj;
        return cxtyVar;
    }
}
