package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpg extends fcyz implements fdat {
    int a;
    final /* synthetic */ wpk b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpg(fcxy fcxyVar, wpk wpkVar, Uri uri) {
        super(2, fcxyVar);
        this.b = wpkVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        Object objA = csljVar.a(uri, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wpg wpgVar = new wpg(fcxyVar, this.b, this.c);
        wpgVar.d = obj;
        return wpgVar;
    }
}
