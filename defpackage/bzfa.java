package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzfa extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzfe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfa(bzfe bzfeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzfeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzfa) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Map map = (Map) this.b;
        fcyh fcyhVarA = eicg.a(this.c.c);
        bzez bzezVar = new bzez(null, map);
        this.a = 1;
        Object objA = fdin.a(fcyhVarA, bzezVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzfa bzfaVar = new bzfa(this.c, fcxyVar);
        bzfaVar.b = obj;
        return bzfaVar;
    }
}
