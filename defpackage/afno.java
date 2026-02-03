package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afno extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ afnp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afno(afnp afnpVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = afnpVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        afno afnoVar = new afno(this.c, (fcxy) obj3);
        afnoVar.a = zBooleanValue;
        afnoVar.b = (List) obj2;
        return afnoVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        ?? r2 = this.b;
        afnp afnpVar = this.c;
        return new afns(z, r2, afnpVar.e.a(), afnpVar.d, new afnr(afnpVar.b.a()));
    }
}
