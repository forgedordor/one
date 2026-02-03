package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domp extends fcyz implements fdap {
    int a;
    final /* synthetic */ domr b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domp(domr domrVar, Uri uri, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = domrVar;
        this.c = uri;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            domr domrVar = this.b;
            if (!domrVar.e().a) {
                InputStream inputStreamB = ebsv.b(domrVar.a, this.c, ebsu.c);
                inputStreamB.getClass();
                return inputStreamB;
            }
            dndk dndkVar = domrVar.b;
            Uri uri = this.c;
            ebsu ebsuVar = ebsu.c;
            ebsuVar.getClass();
            this.a = 1;
            obj = dndkVar.b(uri, ebsuVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return (InputStream) obj;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new domp(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
