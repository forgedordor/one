package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class atys {
    public static atyr c() {
        atux atuxVar = new atux();
        atuxVar.b(0);
        return atuxVar;
    }

    protected abstract int a();

    public abstract aufh b();

    public final atyr d() {
        atyr atyrVarC = c();
        atyrVarC.b(a());
        atyrVarC.c(b());
        return atyrVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aubt e() {
        aufh aufhVarB = b();
        return (aubt) aufhVarB.m.get(a());
    }
}
