package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akae extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoer b;
    final /* synthetic */ akaf c;
    final /* synthetic */ Uri d;
    final /* synthetic */ auib e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akae(aoer aoerVar, akaf akafVar, Uri uri, auib auibVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aoerVar;
        this.c = akafVar;
        this.d = uri;
        this.e = auibVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akae) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Optional optionalE;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            alqm alqmVar = (alqm) fdct.b(this.b.o());
            aubq aubqVar = (alqmVar == null || (optionalE = alqmVar.e()) == null) ? null : (aubq) fdct.b(optionalE);
            if (aubqVar == null) {
                throw new IllegalStateException("SelfIdentity has no rcsIdentifier while creating a RCS group.");
            }
            akaf akafVar = this.c;
            Uri uri = this.d;
            this.a = 1;
            obj = akafVar.g.a(aubqVar, uri, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        atus atusVar = (atus) obj;
        if (atusVar instanceof atur) {
            return ((atur) atusVar).a;
        }
        if (!(atusVar instanceof atuq)) {
            throw new fctg();
        }
        this.c.i.p(this.e, 26);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akae(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
