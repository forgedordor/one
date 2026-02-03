package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxwf {
    public static bxwf e() {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        return new bxty(ekgbVar, ekoj.a, ekgbVar, ekgbVar);
    }

    public abstract Collection a();

    public abstract Collection b();

    public abstract Collection c();

    public abstract Map d();

    public final boolean f() {
        return c().isEmpty() && d().isEmpty();
    }
}
