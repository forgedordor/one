package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtw extends fcyz implements fdat {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ fdci b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtw(fcxy fcxyVar, LoadMessagesReceiver loadMessagesReceiver, fdci fdciVar) {
        super(2, fcxyVar);
        this.a = loadMessagesReceiver;
        this.b = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxtw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long jE;
        fctl.b(obj);
        if (((Boolean) avos.a.e()).booleanValue()) {
            jE = ((cmot) this.a.f().b()).f(cmmo.e, (String) this.b.a);
        } else {
            jE = ((cmot) this.a.f().b()).e((String) this.b.a);
        }
        return new Long(jE);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxtw cxtwVar = new cxtw(fcxyVar, this.a, this.b);
        cxtwVar.c = obj;
        return cxtwVar;
    }
}
