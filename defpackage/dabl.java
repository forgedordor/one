package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabl {
    public static final cqce a = cqce.g("BugleUsageStatistics", "SearchLogger");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public aisq f;
    private final cogw g;

    public dabl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.g = cogwVar;
        this.e = eoscVar;
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 11;
            default:
                return 1;
        }
    }

    public final void a() {
        aisq aisqVar = this.f;
        if (aisqVar != null) {
            aisqVar.b();
        }
    }

    public final void b(elsu elsuVar) {
        long epochMilli = this.g.f().toEpochMilli();
        elsuVar.copyOnWrite();
        elsw elswVar = (elsw) elsuVar.instance;
        elsw elswVar2 = elsw.a;
        elswVar.b |= 8;
        elswVar.e = epochMilli;
        if (!((ajhd) this.b.b()).Y()) {
            a.m("Clearcut loggings are disabled.");
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_SEARCH;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elsw elswVar3 = (elsw) elsuVar.build();
        elswVar3.getClass();
        ellhVar2.o = elswVar3;
        ellhVar2.b |= 32;
        ((aill) this.c.b()).j(ellgVar);
    }

    public final void d(int i) {
        f(i, 1);
    }

    public final void e(int i, int i2) {
        f(i, c(i2));
    }

    public final void f(final int i, final int i2) {
        eijx.g(new Callable() { // from class: dabf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                elsu elsuVar = (elsu) elsw.a.createBuilder();
                emgz emgzVar = (emgz) emhb.a.createBuilder();
                emgzVar.copyOnWrite();
                emhb emhbVar = (emhb) emgzVar.instance;
                emhbVar.c = i - 1;
                emhbVar.b |= 1;
                emgzVar.copyOnWrite();
                emhb emhbVar2 = (emhb) emgzVar.instance;
                emhbVar2.d = i2 - 1;
                emhbVar2.b |= 2;
                elsuVar.copyOnWrite();
                elsw elswVar = (elsw) elsuVar.instance;
                emhb emhbVar3 = (emhb) emgzVar.build();
                emhbVar3.getClass();
                elswVar.d = emhbVar3;
                elswVar.c = 5;
                this.a.b(elsuVar);
                return true;
            }
        }, this.e).k(auwc.a(new dabk()), eoqg.a);
    }

    public final void g(int i) {
        h(i, bxwt.j().a());
    }

    public final void h(final int i, final bxwt bxwtVar) {
        eijx.g(new Callable() { // from class: dabg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                elsx elsxVar = (elsx) elsy.a.createBuilder();
                bxwt bxwtVar2 = bxwtVar;
                Cursor cursor = ((bxtv) bxwtVar2.a()).a;
                ekgb ekgbVarG = bxwtVar2.g();
                ekgb ekgbVarD = bxwtVar2.d();
                ekgb ekgbVarH = bxwtVar2.h();
                ekgb ekgbVarE = bxwtVar2.e();
                ekgb ekgbVarF = bxwtVar2.f();
                ekgb ekgbVarC = bxwtVar2.c();
                int count = cursor.getCount();
                int size = ekgbVarG.size();
                int size2 = ekgbVarD.size();
                int size3 = ekgbVarH.size();
                int size4 = ekgbVarE.size();
                int size5 = ekgbVarF.size();
                int size6 = ekgbVarC.size();
                elsxVar.copyOnWrite();
                elsy elsyVar = (elsy) elsxVar.instance;
                elsyVar.b |= 1;
                elsyVar.c = count;
                elsxVar.copyOnWrite();
                elsy elsyVar2 = (elsy) elsxVar.instance;
                elsyVar2.b |= 2;
                elsyVar2.d = size;
                elsxVar.copyOnWrite();
                elsy elsyVar3 = (elsy) elsxVar.instance;
                elsyVar3.b |= 4;
                elsyVar3.e = size2;
                elsxVar.copyOnWrite();
                elsy elsyVar4 = (elsy) elsxVar.instance;
                elsyVar4.b |= 8;
                elsyVar4.f = size3;
                elsxVar.copyOnWrite();
                elsy elsyVar5 = (elsy) elsxVar.instance;
                elsyVar5.b |= 32;
                elsyVar5.h = size4;
                elsxVar.copyOnWrite();
                elsy elsyVar6 = (elsy) elsxVar.instance;
                elsyVar6.b |= 16;
                elsyVar6.g = size5;
                elsxVar.copyOnWrite();
                elsy elsyVar7 = (elsy) elsxVar.instance;
                elsyVar7.b |= 64;
                elsyVar7.i = size6;
                int count2 = ((bxtv) bxwtVar2.b()).a.getCount();
                elsxVar.copyOnWrite();
                elsy elsyVar8 = (elsy) elsxVar.instance;
                elsyVar8.b |= 128;
                elsyVar8.j = count2;
                emhe emheVar = (emhe) emhg.a.createBuilder();
                emheVar.copyOnWrite();
                emhg emhgVar = (emhg) emheVar.instance;
                emhgVar.c = i - 1;
                emhgVar.b |= 1;
                dabl dablVar = this.a;
                emheVar.copyOnWrite();
                emhg emhgVar2 = (emhg) emheVar.instance;
                elsy elsyVar9 = (elsy) elsxVar.build();
                elsyVar9.getClass();
                emhgVar2.d = elsyVar9;
                emhgVar2.b |= 2;
                emhg emhgVar3 = (emhg) emheVar.build();
                elsu elsuVar = (elsu) elsw.a.createBuilder();
                elsuVar.copyOnWrite();
                elsw elswVar = (elsw) elsuVar.instance;
                emhgVar3.getClass();
                elswVar.d = emhgVar3;
                elswVar.c = 4;
                dablVar.b(elsuVar);
                return true;
            }
        }, this.e).k(auwc.a(new dabj()), eoqg.a);
    }
}
