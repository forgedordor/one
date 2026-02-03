package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class loe {
    final loi a;
    public boolean b;
    public boolean c;
    public int[] d;
    Set e;
    final lof f = new lom();

    protected loe(loi loiVar) {
        this.a = loiVar;
    }

    public final void a(log logVar) {
        lcg.j(logVar, "initCallback cannot be null");
        if (this.e == null) {
            this.e = new css();
        }
        this.e.add(logVar);
    }
}
