package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxm extends fcyz implements fdap {
    int a;
    final /* synthetic */ ctxr b;
    final /* synthetic */ List c;
    final /* synthetic */ aoer d;
    final /* synthetic */ String e;
    final /* synthetic */ Uri f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctxm(ctxr ctxrVar, List list, aoer aoerVar, String str, Uri uri, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ctxrVar;
        this.c = list;
        this.d = aoerVar;
        this.e = str;
        this.f = uri;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctxr ctxrVar = this.b;
            List list = this.c;
            aoer aoerVar = this.d;
            String str = this.e;
            Uri uri = this.f;
            this.a = 1;
            fcsu fcsuVar = ctxrVar.d;
            ((dzuc) fcsuVar.b()).e(ajfo.n);
            ((dzuc) fcsuVar.b()).e(cqjd.m);
            Object objA = fdin.a(eicg.a(ctxrVar.b), new ctxn(null, list, ctxrVar, aoerVar, str, uri), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ctxm(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
