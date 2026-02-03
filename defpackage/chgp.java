package defpackage;

import android.os.Bundle;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chgp extends fcyz implements fdat {
    int a;
    final /* synthetic */ chgr b;
    final /* synthetic */ auib c;
    final /* synthetic */ aubq d;
    final /* synthetic */ axcm e;
    final /* synthetic */ Instant f;
    final /* synthetic */ chbs g;
    final /* synthetic */ eyga h;
    final /* synthetic */ basd i;
    final /* synthetic */ boolean j;
    final /* synthetic */ cbqz k;
    final /* synthetic */ aubt l;
    final /* synthetic */ auhk m;
    final /* synthetic */ elny n;
    final /* synthetic */ Bundle o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chgp(chgr chgrVar, auib auibVar, aubq aubqVar, axcm axcmVar, Instant instant, chbs chbsVar, eyga eygaVar, basd basdVar, boolean z, cbqz cbqzVar, aubt aubtVar, auhk auhkVar, elny elnyVar, Bundle bundle, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chgrVar;
        this.c = auibVar;
        this.d = aubqVar;
        this.e = axcmVar;
        this.f = instant;
        this.g = chbsVar;
        this.h = eygaVar;
        this.i = basdVar;
        this.j = z;
        this.k = cbqzVar;
        this.l = aubtVar;
        this.m = auhkVar;
        this.n = elnyVar;
        this.o = bundle;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chgp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chgr chgrVar = this.b;
        auib auibVar = this.c;
        aubq aubqVar = this.d;
        axcm axcmVar = this.e;
        Instant instant = this.f;
        chbs chbsVar = this.g;
        eyga eygaVar = this.h;
        basd basdVar = this.i;
        boolean z = this.j;
        cbqz cbqzVar = this.k;
        aubt aubtVar = this.l;
        auhk auhkVar = this.m;
        elny elnyVar = this.n;
        Bundle bundle = this.o;
        this.a = 1;
        Object objC = chgrVar.a.c(auibVar, aubqVar, axcmVar, instant, chbsVar, eygaVar, basdVar, z, cbqzVar, aubtVar, auhkVar, elnyVar, bundle, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chgp(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, fcxyVar);
    }
}
