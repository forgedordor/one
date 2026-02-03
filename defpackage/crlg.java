package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crlg extends fcyz implements fdat {
    final /* synthetic */ crlj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlg(crlj crljVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crljVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crlg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        crlj crljVar = this.a;
        ((cdvn) ((Optional) crljVar.c.b()).get()).d(true, false);
        return crljVar.e(new fdap() { // from class: crlf
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                crkt builder = ((crku) obj2).toBuilder();
                builder.copyOnWrite();
                crku crkuVar = (crku) builder.instance;
                crkuVar.b |= 1;
                crkuVar.c = false;
                crku crkuVarBuild = builder.build();
                crkuVarBuild.getClass();
                return crkuVarBuild;
            }
        });
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crlg(this.a, fcxyVar);
    }
}
