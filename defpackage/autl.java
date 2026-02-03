package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class autl extends fcyz implements fdat {
    int a;
    final /* synthetic */ autm b;
    final /* synthetic */ Context c;
    final /* synthetic */ efwo d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public autl(autm autmVar, Context context, efwo efwoVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = autmVar;
        this.c = context;
        this.d = efwoVar;
        this.e = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((autl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            autm autmVar = this.b;
            autk autkVar = new autk(autmVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (autmVar.b(autkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new autl(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
