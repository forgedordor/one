package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhhg extends dhhq {
    public final boolean a;
    public final Object b;
    private final dhho c;
    private final Executor d;
    private final Function e;

    public dhhg(dhho dhhoVar, Executor executor, boolean z, Object obj, Function function) {
        this.c = dhhoVar;
        this.d = executor;
        this.a = z;
        this.b = obj;
        this.e = function;
    }

    @Override // defpackage.dhhq
    public final dhho a() {
        return this.c;
    }

    @Override // defpackage.dhhq
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.dhhq
    public final Executor c() {
        return this.d;
    }

    @Override // defpackage.dhhq
    public final Function d() {
        return this.e;
    }

    @Override // defpackage.dhhq
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Function function;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhhq) {
            dhhq dhhqVar = (dhhq) obj;
            if (this.c.equals(dhhqVar.a()) && this.d.equals(dhhqVar.c()) && this.a == dhhqVar.e() && this.b.equals(dhhqVar.b()) && ((function = this.e) != null ? function.equals(dhhqVar.d()) : dhhqVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
        Function function = this.e;
        return (iHashCode * 1000003) ^ (function == null ? 0 : function.hashCode());
    }

    public final String toString() {
        Function function = this.e;
        Object obj = this.b;
        Executor executor = this.d;
        return "ObserverWrapper{observer=" + this.c.toString() + ", executor=" + executor.toString() + ", notifyOnAdd=" + this.a + ", identifier=" + obj.toString() + ", filter=" + String.valueOf(function) + "}";
    }
}
