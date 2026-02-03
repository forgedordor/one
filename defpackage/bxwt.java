package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxwt {
    public static bxws j() {
        bxue bxueVar = new bxue();
        bxut bxutVar = bxut.c;
        bxueVar.c(bxutVar);
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        bxueVar.g(ekgbVar);
        bxueVar.d(ekgbVar);
        bxueVar.i(ekgbVar);
        bxueVar.e(ekgbVar);
        bxueVar.f(ekgbVar);
        bxueVar.b(ekgbVar);
        bxueVar.h(bxutVar);
        return bxueVar;
    }

    public static boolean k(bxwt bxwtVar) {
        return !bxwtVar.g().isEmpty();
    }

    public abstract bxut a();

    public abstract bxut b();

    public abstract ekgb c();

    public abstract ekgb d();

    public abstract ekgb e();

    public abstract ekgb f();

    public abstract ekgb g();

    public abstract ekgb h();

    public final int i() {
        bxut bxutVarA = a();
        ekgb ekgbVarG = g();
        ekgb ekgbVarD = d();
        ekgb ekgbVarH = h();
        ekgb ekgbVarF = f();
        ekgb ekgbVarE = e();
        ekgb ekgbVarC = c();
        Cursor cursor = ((bxtv) b()).a;
        int i = !bxutVarA.c() ? 1 : 0;
        int i2 = !ekgbVarG.isEmpty() ? 1 : 0;
        int i3 = !ekgbVarD.isEmpty() ? 1 : 0;
        int i4 = !ekgbVarH.isEmpty() ? 1 : 0;
        int i5 = !ekgbVarE.isEmpty() ? 1 : 0;
        int i6 = !ekgbVarF.isEmpty() ? 1 : 0;
        return i + i2 + i3 + i4 + i5 + i6 + (!ekgbVarC.isEmpty() ? 1 : 0) + (cursor.getCount() == 0 ? 0 : 1);
    }
}
