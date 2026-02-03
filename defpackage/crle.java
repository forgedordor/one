package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crle extends fcyz implements fdat {
    int a;
    final /* synthetic */ crlj b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crle(crlj crljVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crljVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crle) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        crlj crljVar = this.b;
        fcsu fcsuVar = crljVar.c;
        if (((Optional) fcsuVar.b()).isPresent() && !this.c) {
            ((cdvn) ((Optional) fcsuVar.b()).get()).d(false, true);
        }
        final boolean z = this.c;
        fdap fdapVar = new fdap() { // from class: crld
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                crkt builder = ((crku) obj2).toBuilder();
                builder.copyOnWrite();
                crku crkuVar = (crku) builder.instance;
                crkuVar.b |= 4;
                crkuVar.e = z;
                crku crkuVarBuild = builder.build();
                crkuVarBuild.getClass();
                return crkuVarBuild;
            }
        };
        this.a = 1;
        if (crljVar.f(fdapVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crle(this.b, this.c, fcxyVar);
    }
}
