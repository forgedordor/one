package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvx extends fcyz implements fdat {
    final /* synthetic */ axwp a;
    final /* synthetic */ Uri b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ boolean g;
    final /* synthetic */ long h;
    final /* synthetic */ lx i;
    final /* synthetic */ long j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvx(fcxy fcxyVar, axwp axwpVar, Uri uri, int i, String str, String str2, String str3, boolean z, long j, lx lxVar, long j2) {
        super(2, fcxyVar);
        this.a = axwpVar;
        this.b = uri;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = j;
        this.i = lxVar;
        this.j = j2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        axwp axwpVar = this.a;
        return axwpVar.m.q(axwpVar.c, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axvx axvxVar = new axvx(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        axvxVar.k = obj;
        return axvxVar;
    }
}
