package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class croh implements crog {
    private final cror a;
    private final crpb b;
    private final crpf c;
    private final crph d;
    private final crpl e;

    public croh(cror crorVar, crpb crpbVar, crpf crpfVar, crph crphVar, crpl crplVar) {
        this.a = crorVar;
        this.b = crpbVar;
        this.c = crpfVar;
        this.d = crphVar;
        this.e = crplVar;
    }

    @Override // defpackage.crog
    public final crof a(crmu crmuVar, int i) {
        crou crouVarA;
        if (craf.f) {
            crpl crplVar = this.e;
            crpj crpjVar = (crpj) crplVar.a.b();
            crpjVar.getClass();
            Context context = (Context) crplVar.b.b();
            context.getClass();
            crouVarA = new crpk(crpjVar, context, i);
        } else {
            crouVarA = craf.d ? this.d.a(i) : craf.c ? this.c.a(i) : this.b.a(i);
        }
        crpo crpoVar = new crpo(crouVarA);
        cror crorVar = this.a;
        crny crnyVar = (crny) crorVar.a.b();
        crnyVar.getClass();
        alfq alfqVar = (alfq) crorVar.b.b();
        alfqVar.getClass();
        crnf crnfVar = (crnf) crorVar.c.b();
        crnfVar.getClass();
        crnt crntVar = (crnt) crorVar.d.b();
        crntVar.getClass();
        crmuVar.getClass();
        return new croq(crnyVar, alfqVar, crnfVar, crntVar, crmuVar, crpoVar, i);
    }
}
