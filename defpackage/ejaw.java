package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejaw implements Callable {
    final /* synthetic */ ejbe a;

    public ejaw(ejbe ejbeVar) {
        this.a = ejbeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return ejba.a(this.a.c(), ejbe.e);
    }
}
