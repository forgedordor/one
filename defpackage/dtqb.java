package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtqb {
    public abstract dtqc a();

    public abstract void b(boolean z);

    public final dtqc c() {
        dtqc dtqcVarA = a();
        if (!((dtmr) dtqcVarA).a) {
            ejwl.b(false, "Request must provide a group name prefix or a source to filter by");
            return dtqcVarA;
        }
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        return dtqcVarA;
    }
}
