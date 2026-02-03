package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akaa extends fcyz implements fdat {
    int a;
    final /* synthetic */ akaf b;
    final /* synthetic */ aoer c;
    final /* synthetic */ ekgb d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ Uri g;
    final /* synthetic */ auib h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akaa(akaf akafVar, aoer aoerVar, ekgb ekgbVar, boolean z, String str, Uri uri, auib auibVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akafVar;
        this.c = aoerVar;
        this.d = ekgbVar;
        this.e = z;
        this.f = str;
        this.g = uri;
        this.h = auibVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akaa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akaf akafVar = this.b;
        aoer aoerVar = this.c;
        ekgb ekgbVar = this.d;
        boolean z = this.e;
        String str = this.f;
        Uri uri = this.g;
        auib auibVar = this.h;
        this.a = 1;
        Object objC = akafVar.c(aoerVar, ekgbVar, z, str, uri, auibVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akaa(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
