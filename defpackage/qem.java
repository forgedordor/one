package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qem extends fdbr implements fdap {
    public static final qem a = new qem();

    public qem() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        qjn qjnVar = (qjn) obj;
        qjnVar.getClass();
        return true != qjnVar.f() ? "OneTime" : "Periodic";
    }
}
