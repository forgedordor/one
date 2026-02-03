package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anpl implements anpj {
    final /* synthetic */ anpj a;
    final /* synthetic */ ejvr b;
    final /* synthetic */ Executor c;

    public anpl(anpj anpjVar, ejvr ejvrVar, Executor executor) {
        this.a = anpjVar;
        this.b = ejvrVar;
        this.c = executor;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.a.a(anpiVar);
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return this.a.b().h(this.b, this.c);
    }

    @Override // defpackage.anpj
    public final Object c() {
        return this.b.apply(this.a.c());
    }
}
