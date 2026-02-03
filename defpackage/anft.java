package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anft extends fcyz implements fdat {
    final /* synthetic */ anfw a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anft(fcxy fcxyVar, anfw anfwVar, Uri uri) {
        super(2, fcxyVar);
        this.a = anfwVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anft) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Long(this.a.b.a(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        anft anftVar = new anft(fcxyVar, this.a, this.b);
        anftVar.c = obj;
        return anftVar;
    }
}
