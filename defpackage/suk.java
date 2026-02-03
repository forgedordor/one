package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suk extends fcyz implements fdat {
    final /* synthetic */ sun a;
    final /* synthetic */ Bundle b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suk(fcxy fcxyVar, sun sunVar, Bundle bundle) {
        super(2, fcxyVar);
        this.a = sunVar;
        this.b = bundle;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return sun.a(this.b, "com.google.recognition.extra.OFFLINE_PENDING_LANGUAGES", 3);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        suk sukVar = new suk(fcxyVar, this.a, this.b);
        sukVar.c = obj;
        return sukVar;
    }
}
