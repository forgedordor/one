package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmw {
    public final dzno a;
    public final ejxr b;
    public final ejxr c;
    public final Executor d;
    public final dzlm e;
    public final fcsu f;
    public final AtomicBoolean g = new AtomicBoolean(true);

    public dzmw(dzno dznoVar, ejxr ejxrVar, ejxr ejxrVar2, Executor executor, eygg eyggVar, dzln dzlnVar, fcsu fcsuVar) {
        this.a = dznoVar;
        this.b = ejxrVar;
        this.c = ejxrVar2;
        this.d = executor;
        this.e = dzlnVar.a(executor, eyggVar, null);
        this.f = fcsuVar;
    }
}
