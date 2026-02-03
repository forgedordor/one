package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adlc extends fcyz implements fdat {
    final /* synthetic */ adlf a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlc(adlf adlfVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = adlfVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adlc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        afzc afzcVar = (afzc) this.a.d.b();
        final Uri uri = this.b;
        afzcVar.h(new agcy(new amwf() { // from class: adlb
            @Override // defpackage.amwf
            public final /* synthetic */ ekgb a() {
                int i = ekgb.d;
                return ekoe.a;
            }

            @Override // defpackage.amwf, defpackage.amvr
            public final /* synthetic */ String b() {
                return "text/plain";
            }

            @Override // defpackage.amwf
            public final String c() {
                return String.valueOf(uri);
            }
        }));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adlc(this.a, this.b, fcxyVar);
    }
}
