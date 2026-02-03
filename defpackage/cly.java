package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cly implements lvj {
    public final lvn a;
    public final clg b;
    private final lvn c;
    private final lvi d;

    public cly() {
        clx clxVar = new clx(this);
        this.d = clxVar;
        lvn lvnVar = new lvn(this);
        this.c = lvnVar;
        this.a = new lvn(this);
        lvnVar.c(clxVar);
        this.b = new clg(lvnVar, new clk());
    }

    @Override // defpackage.lvj
    public final lvc P() {
        return this.a;
    }

    public final clg a() {
        clg clgVar = this.b;
        clgVar.getClass();
        return clgVar;
    }

    public final void b(lva lvaVar) {
        this.c.e(lvaVar);
    }

    public abstract clu c();
}
