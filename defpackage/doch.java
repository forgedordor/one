package defpackage;

import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doch extends fcyz implements fdat {
    final /* synthetic */ docj a;
    final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doch(docj docjVar, Integer num, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = docjVar;
        this.b = num;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doch) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Toast toastMakeText = Toast.makeText(this.a.z(), this.b.intValue(), 1);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doch(this.a, this.b, fcxyVar);
    }
}
