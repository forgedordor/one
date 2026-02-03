package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfqp implements eyiz {
    public final Object a;
    public final eosd b;
    public final diep c;
    public final eyir d;
    final eyik e;
    final eyik f;
    final eyik g;
    final eyik h;
    final eyik i;
    final eyir j;
    final eyik k;
    final eyir l;
    final eyik m;
    final eyir n;
    final eyik o;
    final eyik p;
    final eyir q;
    final eyik r;
    final eyir s;
    final eyik t;
    final eyir u;
    final eyik v;
    final eyir w;
    final eyir x;
    final eyir y;
    private final dfqp z = this;

    public dfqp(Object obj, Context context, Executor executor, dfvj dfvjVar, diep diepVar, eosd eosdVar, cjim cjimVar) {
        this.a = obj;
        this.b = eosdVar;
        this.c = diepVar;
        eyif eyifVarA = eyig.a(executor);
        this.e = eyifVarA;
        eyik eyikVarC = eyie.c(eyifVarA);
        this.f = eyikVarC;
        this.g = eyig.a(this);
        eyik eyikVarC2 = eyie.c(new dfqo(this, 0));
        this.h = eyikVarC2;
        dfqo dfqoVar = new dfqo(this, 1);
        this.i = dfqoVar;
        eyir eyirVarD = eyje.d(dfqoVar);
        this.j = eyirVarD;
        eyif eyifVarA2 = eyig.a(context);
        this.k = eyifVarA2;
        eyir eyirVarD2 = eyje.d(eyifVarA2);
        this.l = eyirVarD2;
        eyif eyifVarA3 = eyig.a(dfvjVar);
        this.m = eyifVarA3;
        eyir eyirVarD3 = eyje.d(eyifVarA3);
        this.n = eyirVarD3;
        this.o = eyig.a(cjimVar);
        dfqo dfqoVar2 = new dfqo(this, 2);
        this.p = dfqoVar2;
        eyir eyirVarD4 = eyje.d(dfqoVar2);
        this.q = eyirVarD4;
        dfqo dfqoVar3 = new dfqo(this, 3);
        this.r = dfqoVar3;
        eyir eyirVarD5 = eyje.d(dfqoVar3);
        this.s = eyirVarD5;
        dfqo dfqoVar4 = new dfqo(this, 4);
        this.t = dfqoVar4;
        eyir eyirVarD6 = eyje.d(dfqoVar4);
        this.u = eyirVarD6;
        dfqo dfqoVar5 = new dfqo(this, 5);
        this.v = dfqoVar5;
        eyir eyirVarD7 = eyje.d(dfqoVar5);
        this.w = eyirVarD7;
        dfry dfryVar = new dfry(eyikVarC, eyikVarC2, eyirVarD, eyirVarD4, eyirVarD5, eyirVarD6, eyirVarD7);
        this.x = dfryVar;
        dfrz dfrzVar = new dfrz(eyikVarC, eyikVarC2, eyirVarD, eyirVarD2, eyirVarD3, dfryVar);
        this.y = dfrzVar;
        this.d = eyje.b(dfrzVar, this);
    }

    @Override // defpackage.eyiz
    public final void a(boolean z) {
        eyje.e(this.y, z);
        eyje.e(this.x, z);
        eyje.e(this.w, z);
        eyje.e(this.u, z);
        eyje.e(this.s, z);
        eyje.e(this.q, z);
        eyje.e(this.n, z);
        eyje.e(this.l, z);
        eyje.e(this.j, z);
    }
}
