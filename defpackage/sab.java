package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sab {
    public final ffgp a;
    public final ffgp b;
    public final ffgp c;
    public final ffgr d;

    public sab() {
        ffgp ffgpVar = new ffgp("h", "help", false, "Print this help");
        this.a = ffgpVar;
        ffgp ffgpVar2 = new ffgp("l", "list", false, "List available plugins");
        this.b = ffgpVar2;
        ffgp ffgpVar3 = new ffgp("p", "process", true, "Specify target process");
        this.c = ffgpVar3;
        ffgr ffgrVar = new ffgr();
        this.d = ffgrVar;
        ffgrVar.d(ffgpVar);
        ffgrVar.d(ffgpVar2);
        ffgrVar.d(ffgpVar3);
    }
}
