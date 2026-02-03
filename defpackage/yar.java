package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yar extends fcyz implements fdat {
    int a;
    final /* synthetic */ ybd b;
    final /* synthetic */ ajlt c;
    final /* synthetic */ fdae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yar(ybd ybdVar, ajlt ajltVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ybdVar;
        this.c = ajltVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yar) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zqe zqeVar = (zqe) this.b.f.b();
            MessageId messageIdB = this.c.b();
            this.a = 1;
            if (zqeVar.c(messageIdB, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.d.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yar(this.b, this.c, this.d, fcxyVar);
    }
}
