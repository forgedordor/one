package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzbv extends fcyz implements fdat {
    final /* synthetic */ bzbx a;
    final /* synthetic */ String b;
    final /* synthetic */ EnumSet c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbv(fcxy fcxyVar, bzbx bzbxVar, String str, EnumSet enumSet) {
        super(2, fcxyVar);
        this.a = bzbxVar;
        this.b = str;
        this.c = enumSet;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.e.c(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzbv bzbvVar = new bzbv(fcxyVar, this.a, this.b, this.c);
        bzbvVar.d = obj;
        return bzbvVar;
    }
}
