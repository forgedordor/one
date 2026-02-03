package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wof extends fcyz implements fdat {
    final /* synthetic */ wog a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wof(fcxy fcxyVar, wog wogVar, Uri uri) {
        super(2, fcxyVar);
        this.a = wogVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wof) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        wog wogVar = this.a;
        wogVar.b.h(wogVar.a, this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wof wofVar = new wof(fcxyVar, this.a, this.b);
        wofVar.c = obj;
        return wofVar;
    }
}
