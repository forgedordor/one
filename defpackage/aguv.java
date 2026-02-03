package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aguv extends fcyz implements fdat {
    final /* synthetic */ aguw a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aguv(aguw aguwVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aguwVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aguv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() || !((Boolean) ((cczi) crbf.aG.get()).e()).booleanValue()) {
            return fctx.a;
        }
        aguw aguwVar = this.a;
        agut agutVar = agut.a;
        caxr caxrVar = new caxr();
        caxrVar.b = "penpal_dedupe_tag";
        caxrVar.c = Duration.ofMinutes(this.b);
        ((cazj) aguwVar.b.a.b()).a(cbcu.g("penpal_conversation_auto_generate", agutVar, caxrVar.a()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aguv(this.a, this.b, fcxyVar);
    }
}
