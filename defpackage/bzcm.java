package defpackage;

import android.content.Context;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcm extends fcyz implements fdat {
    final /* synthetic */ bzco a;
    final /* synthetic */ cppb b;
    final /* synthetic */ bnar c;
    final /* synthetic */ EnumSet d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzcm(fcxy fcxyVar, bzco bzcoVar, cppb cppbVar, bnar bnarVar, EnumSet enumSet) {
        super(2, fcxyVar);
        this.a = bzcoVar;
        this.b = cppbVar;
        this.c = bnarVar;
        this.d = enumSet;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzcm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cpou cpouVar = this.a.h;
        ((cpob) cpouVar.b.b()).getClass();
        chvp chvpVar = (chvp) cpouVar.c.b();
        chvpVar.getClass();
        chwq chwqVar = (chwq) cpouVar.d.b();
        chwqVar.getClass();
        cmqj cmqjVar = (cmqj) cpouVar.e.b();
        cmqjVar.getClass();
        ains ainsVar = (ains) cpouVar.f.b();
        ainsVar.getClass();
        alrj alrjVar = (alrj) cpouVar.g.b();
        alrjVar.getClass();
        ((Context) cpouVar.i.b()).getClass();
        aqfr aqfrVar = (aqfr) cpouVar.j.b();
        aqfrVar.getClass();
        cppb cppbVar = this.b;
        cppbVar.getClass();
        bnar bnarVar = this.c;
        bnarVar.getClass();
        cpoz cpozVar = new cpoz(cpouVar.a, chvpVar, chwqVar, cmqjVar, ainsVar, alrjVar, cpouVar.h, aqfrVar, cppbVar, bnarVar);
        if (cpyl.a()) {
            EnumSet enumSet = this.d;
            return fdbq.f(enumSet, bzco.b) ? cpozVar.d(bzco.e) : fdbq.f(enumSet, bzco.c) ? cpozVar.d(bzco.f) : fdbq.f(enumSet, bzco.d) ? cpozVar.d(bzco.g) : cpozVar.c();
        }
        EnumSet enumSet2 = this.d;
        return fdbq.f(enumSet2, bzco.b) ? cpozVar.d(bzco.e) : fdbq.f(enumSet2, bzco.c) ? cpozVar.d(bzco.f) : cpozVar.c();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzcm bzcmVar = new bzcm(fcxyVar, this.a, this.b, this.c, this.d);
        bzcmVar.e = obj;
        return bzcmVar;
    }
}
