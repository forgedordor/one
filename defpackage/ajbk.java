package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajbk {
    public final ajat a;
    public final aijz b;
    public final cqbm c;
    public final Executor d;
    public final eosc e;
    public final fcsu f;
    public final fcsu g;
    public final eosc h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;

    public ajbk(ajat ajatVar, aijz aijzVar, cqbm cqbmVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = ajatVar;
        this.b = aijzVar;
        this.c = cqbmVar;
        this.d = new eoss(eoscVar);
        this.e = eoscVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = eoscVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
    }

    public final eiju a(Callable callable) {
        return eijx.g(callable, this.d);
    }
}
