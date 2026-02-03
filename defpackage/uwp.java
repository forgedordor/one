package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwp implements uwn {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final ekrg i;
    public final String j;
    private final fcsu k;
    private final fcsu l;
    private final fctc m;

    public uwp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        this.k = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
        this.l = fcsuVar10;
        this.i = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl");
        this.m = fctd.a(new fdae() { // from class: uwo
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                uwp uwpVar = this.a;
                if (((crau) uwpVar.b.b()).a()) {
                    cqdk.b(uwpVar.j);
                } else {
                    ((ekrd) uwpVar.i.i().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl", "sensitiveClassifier_delegate$lambda$0", 75, "MagicComposeSensitiveClassifierImpl.kt")).q("Failed to load hobbesTfLite");
                }
                ejjr ejjrVar = (ejjr) ejjt.a.createBuilder();
                ejjrVar.getClass();
                ejic ejicVar = (ejic) ejih.a.createBuilder();
                ejicVar.getClass();
                ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
                ejgzVar.getClass();
                ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
                ejhbVar.getClass();
                Object objB = uwpVar.c.b();
                objB.getClass();
                ejhd.b((String) objB, ejhbVar);
                Object objB2 = uwpVar.d.b();
                objB2.getClass();
                ejhd.c((String) objB2, ejhbVar);
                ejgy.b(ejhd.a(ejhbVar), ejgzVar);
                ejha ejhaVarA = ejgy.a(ejgzVar);
                ejicVar.copyOnWrite();
                ejih ejihVar = (ejih) ejicVar.instance;
                ejihVar.c = ejhaVarA;
                ejihVar.b |= 1;
                ejicVar.copyOnWrite();
                ejih ejihVar2 = (ejih) ejicVar.instance;
                ejihVar2.g = 2;
                ejihVar2.b |= 4;
                DesugarCollections.unmodifiableList(ejihVar2.e).getClass();
                ejif ejifVar = (ejif) ejig.a.createBuilder();
                ejifVar.getClass();
                Object objB3 = uwpVar.h.b();
                objB3.getClass();
                double dDoubleValue = ((Number) objB3).doubleValue();
                ejifVar.copyOnWrite();
                ejig ejigVar = (ejig) ejifVar.instance;
                ejigVar.b |= 4;
                ejigVar.e = dDoubleValue;
                int iLongValue = (int) ((Number) uwpVar.f.b()).longValue();
                ejifVar.copyOnWrite();
                ejig ejigVar2 = (ejig) ejifVar.instance;
                ejigVar2.b = 2 | ejigVar2.b;
                ejigVar2.d = iLongValue;
                Object objB4 = uwpVar.e.b();
                objB4.getClass();
                ejifVar.copyOnWrite();
                ejig ejigVar3 = (ejig) ejifVar.instance;
                ejigVar3.b |= 1;
                ejigVar3.c = (String) objB4;
                evsn evsnVarBuild = ejifVar.build();
                evsnVarBuild.getClass();
                ejicVar.copyOnWrite();
                ejih ejihVar3 = (ejih) ejicVar.instance;
                ejihVar3.a();
                ejihVar3.e.add((ejig) evsnVarBuild);
                evsn evsnVarBuild2 = ejicVar.build();
                evsnVarBuild2.getClass();
                ejjrVar.copyOnWrite();
                ejjt ejjtVar = (ejjt) ejjrVar.instance;
                ejjtVar.d = (ejih) evsnVarBuild2;
                ejjtVar.c = 3;
                int iLongValue2 = (int) ((Number) uwpVar.g.b()).longValue();
                ejjrVar.copyOnWrite();
                ejjt ejjtVar2 = (ejjt) ejjrVar.instance;
                ejjtVar2.b |= 1;
                ejjtVar2.e = iLongValue2;
                evsn evsnVarBuild3 = ejjrVar.build();
                evsnVarBuild3.getClass();
                return new ejos((ejjt) evsnVarBuild3, new crgv((ejly) uwpVar.a.b()));
            }
        });
        this.j = "sensitive_classifier_jni";
    }

    @Override // defpackage.uwn
    public final boolean a(String str) {
        str.getClass();
        if (fdgn.H(str)) {
            return false;
        }
        ezdu ezduVar = (ezdu) ezdv.a.createBuilder();
        ezduVar.getClass();
        ezduVar.copyOnWrite();
        ((ezdv) ezduVar.instance).d = "0";
        long epochMilli = ((cogw) this.k.b()).f().toEpochMilli() * 1000;
        ezduVar.copyOnWrite();
        ((ezdv) ezduVar.instance).e = epochMilli;
        eyvw.b(str, ezduVar);
        return b(fcva.b(eyvw.a(ezduVar)));
    }

    @Override // defpackage.uwn
    public final boolean b(List list) throws Exception {
        if (list.isEmpty()) {
            return false;
        }
        try {
            ((ekrd) this.i.e().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl", "isSensitive", 90, "MagicComposeSensitiveClassifierImpl.kt")).q("Running sensitive classifier for Magic Compose.");
            ejol ejolVar = (ejol) this.m.a();
            ezcx ezcxVar = (ezcx) ezcy.b.createBuilder();
            ezcxVar.getClass();
            ezdw ezdwVar = (ezdw) ezdx.a.createBuilder();
            ezdwVar.getClass();
            DesugarCollections.unmodifiableList(((ezdx) ezdwVar.instance).b).getClass();
            eyvx.b(list, ezdwVar);
            ezdx ezdxVarA = eyvx.a(ezdwVar);
            ezcxVar.copyOnWrite();
            ezcy ezcyVar = (ezcy) ezcxVar.instance;
            ezcyVar.f = ezdxVarA;
            ezcyVar.c |= 2;
            ezcxVar.copyOnWrite();
            ((ezcy) ezcxVar.instance).g = "0";
            evsn evsnVarBuild = ezcxVar.build();
            evsnVarBuild.getClass();
            return fcva.ay(ejolVar.a((ezcy) evsnVarBuild));
        } catch (Throwable th) {
            ((ekrd) ((ekrd) this.i.i()).g(th).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl", "isSensitive", 93, "MagicComposeSensitiveClassifierImpl.kt")).q("Exception running sensitive classifier");
            if (!((Boolean) this.l.b()).booleanValue()) {
                return false;
            }
            if (th instanceof Exception) {
                throw th;
            }
            throw new Exception(th);
        }
    }
}
