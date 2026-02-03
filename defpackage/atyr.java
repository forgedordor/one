package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class atyr {
    public abstract atys a();

    public abstract void b(int i);

    public abstract void c(aufh aufhVar);

    public final atys d() {
        atys atysVarA = a();
        ejwl.m(true, "Invalid negative content part index");
        atuy atuyVar = (atuy) atysVarA;
        ejwl.m(atuyVar.b < atuyVar.a.m.size(), "Content part index larger than content count");
        return atysVarA;
    }
}
