package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wph extends fcyz implements fdat {
    int a;
    final /* synthetic */ wpk b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wph(fcxy fcxyVar, wpk wpkVar, Uri uri) {
        super(2, fcxyVar);
        this.b = wpkVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wph) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cslj csljVar = (cslj) this.b.b.b();
        Uri uri = this.c;
        this.a = 1;
        Object objB = csljVar.b(uri, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wph wphVar = new wph(fcxyVar, this.b, this.c);
        wphVar.d = obj;
        return wphVar;
    }
}
