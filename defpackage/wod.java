package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wod extends fcyz implements fdat {
    final /* synthetic */ wog a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wod(fcxy fcxyVar, wog wogVar, Uri uri) {
        super(2, fcxyVar);
        this.a = wogVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bxfu bxfuVar = this.a.b;
        Uri uri = this.b;
        Uri uriC = bxfuVar.c(uri);
        if (uriC != null) {
            return uriC;
        }
        throw new IllegalStateException(a.h(uri, "Failed to copy ", " to scratch space"));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wod wodVar = new wod(fcxyVar, this.a, this.b);
        wodVar.c = obj;
        return wodVar;
    }
}
