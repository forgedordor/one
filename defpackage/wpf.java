package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wpf extends fcyz implements fdat {
    int a;
    final /* synthetic */ wpk b;
    final /* synthetic */ Uri c;
    final /* synthetic */ doif d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpf(wpk wpkVar, Uri uri, doif doifVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wpkVar;
        this.c = uri;
        this.d = doifVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Uri uri;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wpk wpkVar = this.b;
            this.a = 1;
            obj = wpkVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue() || (uri = this.c) == null) {
            return null;
        }
        return this.b.b(this.d, uri);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wpf(this.b, this.c, this.d, fcxyVar);
    }
}
