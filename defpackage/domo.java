package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domo extends fcyz implements fdap {
    final /* synthetic */ domr a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domo(domr domrVar, Uri uri, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = domrVar;
        this.b = uri;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = ebsv.a;
        InputStream inputStreamB = ebsv.b(this.a.a, this.b, ebsu.a);
        inputStreamB.getClass();
        return inputStreamB;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new domo(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
