package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpn extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ axcm b;
    final /* synthetic */ awpo c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpn(axcm axcmVar, awpo awpoVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = axcmVar;
        this.c = awpoVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpn) c((awpt) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        awpp awppVar = (awpp) ((awpt) this.a).toBuilder();
        awppVar.getClass();
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((awpt) awppVar.instance).b)).getClass();
        String strB = this.b.b();
        strB.getClass();
        awpq awpqVar = (awpq) awpr.a.createBuilder();
        awpqVar.getClass();
        Instant instantF = this.c.e.f();
        instantF.getClass();
        evvp evvpVarB = evxd.b(instantF);
        awpqVar.copyOnWrite();
        awpr awprVar = (awpr) awpqVar.instance;
        awprVar.c = evvpVarB;
        awprVar.b |= 1;
        String str = this.d;
        str.getClass();
        awpqVar.copyOnWrite();
        ((awpr) awpqVar.instance).d = str;
        evsn evsnVarBuild = awpqVar.build();
        evsnVarBuild.getClass();
        awpr awprVar2 = (awpr) evsnVarBuild;
        awppVar.copyOnWrite();
        awpt awptVar = (awpt) awppVar.instance;
        evub evubVar = awptVar.b;
        if (!evubVar.b) {
            awptVar.b = evubVar.a();
        }
        awptVar.b.put(strB, awprVar2);
        return awpu.a(awppVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awpn awpnVar = new awpn(this.b, this.c, this.d, fcxyVar);
        awpnVar.a = obj;
        return awpnVar;
    }
}
