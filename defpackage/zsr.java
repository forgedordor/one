package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsr extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsr(ztv ztvVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wwd wwdVar = (wwd) this.b.n.b();
            IncomingDraft incomingDraft = new IncomingDraft(this.c, null, null, false, null, null, false, 126, null);
            zsq zsqVar = new zsq(null);
            this.a = 1;
            obj = wwdVar.a(incomingDraft, zsqVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsr(this.b, this.c, fcxyVar);
    }
}
