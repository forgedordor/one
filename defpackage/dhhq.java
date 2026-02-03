package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dhhq {
    public static dhhp f(dhho dhhoVar, Executor executor) {
        dhhf dhhfVar = new dhhf();
        dhhfVar.a = dhhoVar;
        if (executor == null) {
            throw new NullPointerException("Null executor");
        }
        dhhfVar.b = executor;
        dhhfVar.b(dhhoVar);
        dhhfVar.c(true);
        return dhhfVar;
    }

    public abstract dhho a();

    public abstract Object b();

    public abstract Executor c();

    public abstract Function d();

    public abstract boolean e();
}
