package defpackage;

import android.provider.Telephony;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayax extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ lh b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayax(fcxy fcxyVar, aybe aybeVar, lh lhVar, int i, String str) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = lhVar;
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayax) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.v.g(this.b, Telephony.Mms.Inbox.CONTENT_URI, this.c, this.d, -1L, null);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayax ayaxVar = new ayax(fcxyVar, this.a, this.b, this.c, this.d);
        ayaxVar.e = obj;
        return ayaxVar;
    }
}
