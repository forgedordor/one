package defpackage;

import android.content.Context;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbuz implements fcas {
    final Context a;
    final Executor b;
    final fchy c;
    final fchy d;
    final fbur e;
    final fbub f;
    final fbuj g;
    ScheduledExecutorService h;
    Executor i;
    private boolean j;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fbuz(fbuy fbuyVar) {
        Context context = fbuyVar.a;
        context.getClass();
        this.a = context;
        fbuyVar.c.getClass();
        Executor executor = fbuyVar.d;
        this.b = executor == null ? kxj.e(context) : executor;
        fchy fchyVar = fbuyVar.e;
        fchyVar.getClass();
        this.c = fchyVar;
        fchy fchyVar2 = fbuyVar.b;
        fchyVar2.getClass();
        this.d = fchyVar2;
        fbur fburVar = fbuyVar.f;
        fburVar.getClass();
        this.e = fburVar;
        fbub fbubVar = fbuyVar.g;
        fbubVar.getClass();
        this.f = fbubVar;
        fbuj fbujVar = fbuyVar.h;
        fbujVar.getClass();
        this.g = fbujVar;
        fbuyVar.i.getClass();
        this.h = (ScheduledExecutorService) fchyVar.a();
        this.i = fchyVar2.a();
    }

    @Override // defpackage.fcas
    public final /* bridge */ /* synthetic */ fcbc a(SocketAddress socketAddress, fcar fcarVar, fbnf fbnfVar) {
        if (this.j) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new fbvk(this, (fbty) socketAddress, fcarVar);
    }

    @Override // defpackage.fcas
    public final Collection b() {
        return Collections.singleton(fbty.class);
    }

    @Override // defpackage.fcas
    public final ScheduledExecutorService c() {
        return this.h;
    }

    @Override // defpackage.fcas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}
