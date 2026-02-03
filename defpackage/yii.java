package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yii extends fcyz implements fdat {
    final /* synthetic */ yik a;
    final /* synthetic */ Optional b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yii(yik yikVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yikVar;
        this.b = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yii) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        yik yikVar = this.a;
        ajhd ajhdVar = (ajhd) yikVar.e.b();
        elrk elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_START;
        Optional optional = this.b;
        ajhdVar.am(2, elrkVar, ((anvx) optional.get()).b());
        ((afzc) yikVar.f.b()).h(new agde(yikVar.b, ((anvx) optional.get()).b()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yii(this.a, this.b, fcxyVar);
    }
}
