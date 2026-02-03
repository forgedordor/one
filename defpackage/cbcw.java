package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbcw {
    public static cbcv h() {
        caxp caxpVar = new caxp();
        caxpVar.d(false);
        return caxpVar;
    }

    public static cbcw i() {
        caxp caxpVar = new caxp();
        caxpVar.b(true);
        caxpVar.c(false);
        caxpVar.d(false);
        return caxpVar.a();
    }

    public static cbcw j(ekgb ekgbVar) {
        cbcv cbcvVarH = caxq.h();
        cbcvVarH.b(true);
        cbcvVarH.c(false);
        ((caxp) cbcvVarH).a = ekgbVar;
        return cbcvVarH.a();
    }

    public static cbcw k() {
        cbcv cbcvVarH = caxq.h();
        cbcvVarH.b(false);
        cbcvVarH.c(false);
        cbcvVarH.d(false);
        return cbcvVarH.a();
    }

    public static cbcw l(Exception exc) {
        cbcv cbcvVarH = caxq.h();
        cbcvVarH.b(false);
        cbcvVarH.c(false);
        cbcvVarH.d(false);
        ((caxp) cbcvVarH).b = exc;
        return cbcvVarH.a();
    }

    public static cbcw m() {
        cbcv cbcvVarH = caxq.h();
        cbcvVarH.b(false);
        cbcvVarH.c(true);
        cbcvVarH.d(false);
        return cbcvVarH.a();
    }

    static cbcw n() {
        cbcv cbcvVarH = caxq.h();
        cbcvVarH.b(false);
        cbcvVarH.c(true);
        cbcvVarH.d(true);
        return cbcvVarH.a();
    }

    public abstract Bundle a();

    public abstract cbcv b();

    public abstract ekgb c();

    public abstract Exception d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();
}
