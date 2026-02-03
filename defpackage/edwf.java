package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwf extends fcyz implements fdat {
    int a;
    final /* synthetic */ edwi b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edwf(edwi edwiVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edwiVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edwf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            edwi edwiVar = this.b;
            InputStream inputStreamB = ebsv.b(edwiVar.g.a, this.c, ebsu.c);
            inputStreamB.getClass();
            this.a = 1;
            if (edwiVar.c(inputStreamB, "User camera photo", "c", this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edwf(this.b, this.c, fcxyVar);
    }
}
