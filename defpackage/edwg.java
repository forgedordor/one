package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwg extends fcyz implements fdat {
    int a;
    final /* synthetic */ edwi b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edwg(edwi edwiVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edwiVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edwg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            edwi edwiVar = this.b;
            Uri uri = this.c;
            InputStream inputStreamB = ebsv.b(edwiVar.g.a, uri, ebsu.b);
            inputStreamB.getClass();
            String strValueOf = String.valueOf(uri.getLastPathSegment());
            this.a = 1;
            if (edwiVar.c(inputStreamB, "File name: ".concat(strValueOf), "u", this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edwg(this.b, this.c, fcxyVar);
    }
}
