package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgw extends edgv {
    private static final ekrg a = ekrg.c("com/google/android/libraries/user/profile/photopicker/common/logging/ObakeLoggerImpl");
    private final dbyl b;
    private final eupp c;
    private final Context d;

    public edgw(Context context, dbyl dbylVar, eupp euppVar) {
        this.d = context;
        this.b = dbylVar;
        this.c = euppVar;
    }

    private final eupq f() {
        eupq eupqVar = (eupq) eupr.a.createBuilder();
        eupqVar.copyOnWrite();
        eupr euprVar = (eupr) eupqVar.instance;
        euprVar.c = this.c;
        euprVar.b |= 1;
        return eupqVar;
    }

    private final void g(eupr euprVar) {
        dbyk dbykVarK = this.b.k(euprVar, dqnz.b(this.d, new eups()));
        ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/user/profile/photopicker/common/logging/ObakeLoggerImpl", "logObakeExtension", 42, "ObakeLoggerImpl.java")).t("extension=%s", euprVar);
        dbykVarK.c();
    }

    private static void h(eurk eurkVar) {
        euro euroVar = eurkVar.d;
        if (euroVar == null) {
            euroVar = euro.a;
        }
        if ((euroVar.b & 1) == 0) {
            throw new IllegalArgumentException("OperationEntries require an OperationSummary with a set EntryType.");
        }
    }

    @Override // defpackage.edgv
    public final void a(euqv euqvVar) {
        eupq eupqVarF = f();
        eupt euptVar = (eupt) eupu.a.createBuilder();
        euqr euqrVar = (euqr) euqs.a.createBuilder();
        euqrVar.copyOnWrite();
        euqs euqsVar = (euqs) euqrVar.instance;
        euqsVar.c = 2;
        euqsVar.b |= 1;
        euqrVar.copyOnWrite();
        euqs euqsVar2 = (euqs) euqrVar.instance;
        euqvVar.getClass();
        euqsVar2.f = euqvVar;
        euqsVar2.b |= 8;
        euptVar.copyOnWrite();
        eupu eupuVar = (eupu) euptVar.instance;
        euqs euqsVar3 = (euqs) euqrVar.build();
        euqsVar3.getClass();
        eupuVar.c = euqsVar3;
        eupuVar.b |= 1;
        eupqVarF.copyOnWrite();
        eupr euprVar = (eupr) eupqVarF.instance;
        eupu eupuVar2 = (eupu) euptVar.build();
        eupr euprVar2 = eupr.a;
        eupuVar2.getClass();
        euprVar.d = eupuVar2;
        euprVar.b |= 2;
        g((eupr) eupqVarF.build());
    }

    @Override // defpackage.edgv
    public final void b(eura euraVar) {
        eupq eupqVarF = f();
        eupt euptVar = (eupt) eupu.a.createBuilder();
        euqr euqrVar = (euqr) euqs.a.createBuilder();
        euqrVar.copyOnWrite();
        euqs euqsVar = (euqs) euqrVar.instance;
        euqsVar.c = 3;
        euqsVar.b |= 1;
        euqrVar.copyOnWrite();
        euqs euqsVar2 = (euqs) euqrVar.instance;
        euraVar.getClass();
        euqsVar2.g = euraVar;
        euqsVar2.b |= 16;
        euptVar.copyOnWrite();
        eupu eupuVar = (eupu) euptVar.instance;
        euqs euqsVar3 = (euqs) euqrVar.build();
        euqsVar3.getClass();
        eupuVar.c = euqsVar3;
        eupuVar.b |= 1;
        eupqVarF.copyOnWrite();
        eupr euprVar = (eupr) eupqVarF.instance;
        eupu eupuVar2 = (eupu) euptVar.build();
        eupr euprVar2 = eupr.a;
        eupuVar2.getClass();
        euprVar.d = eupuVar2;
        euprVar.b |= 2;
        g((eupr) eupqVarF.build());
    }

    @Override // defpackage.edgv
    public final void c(eurk eurkVar) {
        h(eurkVar);
        eupq eupqVarF = f();
        eupt euptVar = (eupt) eupu.a.createBuilder();
        euqr euqrVar = (euqr) euqs.a.createBuilder();
        euqrVar.copyOnWrite();
        euqs euqsVar = (euqs) euqrVar.instance;
        euqsVar.c = 1;
        euqsVar.b |= 1;
        euqrVar.copyOnWrite();
        euqs euqsVar2 = (euqs) euqrVar.instance;
        eurkVar.getClass();
        euqsVar2.e = eurkVar;
        euqsVar2.b |= 4;
        euptVar.copyOnWrite();
        eupu eupuVar = (eupu) euptVar.instance;
        euqs euqsVar3 = (euqs) euqrVar.build();
        euqsVar3.getClass();
        eupuVar.c = euqsVar3;
        eupuVar.b |= 1;
        eupqVarF.copyOnWrite();
        eupr euprVar = (eupr) eupqVarF.instance;
        eupu eupuVar2 = (eupu) euptVar.build();
        eupr euprVar2 = eupr.a;
        eupuVar2.getClass();
        euprVar.d = eupuVar2;
        euprVar.b |= 2;
        g((eupr) eupqVarF.build());
    }

    @Override // defpackage.edgv
    public final void d(eurk eurkVar, eupw eupwVar) {
        h(eurkVar);
        eupq eupqVarF = f();
        eupt euptVar = (eupt) eupu.a.createBuilder();
        euptVar.copyOnWrite();
        eupu eupuVar = (eupu) euptVar.instance;
        eupwVar.getClass();
        eupuVar.d = eupwVar;
        eupuVar.b |= 2;
        euqr euqrVar = (euqr) euqs.a.createBuilder();
        euqrVar.copyOnWrite();
        euqs euqsVar = (euqs) euqrVar.instance;
        euqsVar.c = 1;
        euqsVar.b |= 1;
        euqrVar.copyOnWrite();
        euqs euqsVar2 = (euqs) euqrVar.instance;
        eurkVar.getClass();
        euqsVar2.e = eurkVar;
        euqsVar2.b |= 4;
        euptVar.copyOnWrite();
        eupu eupuVar2 = (eupu) euptVar.instance;
        euqs euqsVar3 = (euqs) euqrVar.build();
        euqsVar3.getClass();
        eupuVar2.c = euqsVar3;
        eupuVar2.b |= 1;
        eupqVarF.copyOnWrite();
        eupr euprVar = (eupr) eupqVarF.instance;
        eupu eupuVar3 = (eupu) euptVar.build();
        eupr euprVar2 = eupr.a;
        eupuVar3.getClass();
        euprVar.d = eupuVar3;
        euprVar.b |= 2;
        g((eupr) eupqVarF.build());
    }

    @Override // defpackage.edgv
    public final void e(eurm eurmVar) {
        eupq eupqVarF = f();
        eupt euptVar = (eupt) eupu.a.createBuilder();
        euqr euqrVar = (euqr) euqs.a.createBuilder();
        euqrVar.copyOnWrite();
        euqs euqsVar = (euqs) euqrVar.instance;
        euqsVar.c = 4;
        euqsVar.b |= 1;
        euqrVar.copyOnWrite();
        euqs euqsVar2 = (euqs) euqrVar.instance;
        eurmVar.getClass();
        euqsVar2.d = eurmVar;
        euqsVar2.b |= 2;
        euptVar.copyOnWrite();
        eupu eupuVar = (eupu) euptVar.instance;
        euqs euqsVar3 = (euqs) euqrVar.build();
        euqsVar3.getClass();
        eupuVar.c = euqsVar3;
        eupuVar.b |= 1;
        eupqVarF.copyOnWrite();
        eupr euprVar = (eupr) eupqVarF.instance;
        eupu eupuVar2 = (eupu) euptVar.build();
        eupr euprVar2 = eupr.a;
        eupuVar2.getClass();
        euprVar.d = eupuVar2;
        euprVar.b |= 2;
        g((eupr) eupqVarF.build());
    }
}
