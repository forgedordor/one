package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnm extends fcyz implements fdat {
    int a;
    final /* synthetic */ abno b;
    final /* synthetic */ Intent c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnm(fcxy fcxyVar, abno abnoVar, Intent intent) {
        super(2, fcxyVar);
        this.b = abnoVar;
        this.c = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abnm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdjx fdjxVar = (fdjx) this.d;
                abno abnoVar = this.b;
                Intent intent = this.c;
                this.d = fdjxVar;
                this.a = 1;
                obj = abnoVar.a(intent, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            epnz epnzVar = (epnz) obj;
            if (epnzVar == null) {
                abno.b.r("Draft message request is empty");
                return null;
            }
            abno abnoVar2 = this.b;
            eppg eppgVar = (eppg) eppi.a.createBuilder();
            eppgVar.copyOnWrite();
            eppi eppiVar = (eppi) eppgVar.instance;
            eppiVar.c = epnzVar;
            eppiVar.b = 212;
            evsn evsnVarBuild = eppgVar.build();
            evsnVarBuild.getClass();
            abnoVar2.b((eppi) evsnVarBuild);
            return null;
        } catch (abmv unused) {
            abno abnoVar3 = this.b;
            eppg eppgVar2 = (eppg) eppi.a.createBuilder();
            eppm eppmVar = (eppm) eppn.a.createBuilder();
            eppmVar.copyOnWrite();
            ((eppn) eppmVar.instance).b = 1;
            eppgVar2.copyOnWrite();
            eppi eppiVar2 = (eppi) eppgVar2.instance;
            eppn eppnVar = (eppn) eppmVar.build();
            eppnVar.getClass();
            eppiVar2.c = eppnVar;
            eppiVar2.b = 213;
            evsn evsnVarBuild2 = eppgVar2.build();
            evsnVarBuild2.getClass();
            abnoVar3.b((eppi) evsnVarBuild2);
            return null;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abnm abnmVar = new abnm(fcxyVar, this.b, this.c);
        abnmVar.d = obj;
        return abnmVar;
    }
}
