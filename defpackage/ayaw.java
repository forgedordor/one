package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayaw extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ Context b;
    final /* synthetic */ ll c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayaw(fcxy fcxyVar, aybe aybeVar, Context context, ll llVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = context;
        this.c = llVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayaw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.k.S(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayaw ayawVar = new ayaw(fcxyVar, this.a, this.b, this.c);
        ayawVar.d = obj;
        return ayawVar;
    }
}
