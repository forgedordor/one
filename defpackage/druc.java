package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class druc implements AutoCloseable, lvh, eora {
    public final Executor a;
    private final AtomicReference b;
    private final lvb c;

    public druc(Executor executor, lvb lvbVar, drud drudVar) {
        this.a = executor;
        this.c = lvbVar;
        this.b = new AtomicReference(drudVar);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        ekgb ekgbVar = ((drud) this.b.get()).b;
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            aky$$ExternalSyntheticApiModelOutline0.m177m((Object) ekgbVar.get(i2)).accept(obj);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        lvj lvjVar = ((drud) this.b.getAndSet(new drud(ekgbVar, ekgbVar, ekgbVar))).a;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvjVar.P().a().a(this.c)) {
            return;
        }
        close();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        drud drudVar = (drud) this.b.get();
        int i = 0;
        if ((th instanceof CancellationException) || (th instanceof InterruptedException)) {
            ekgb ekgbVar = drudVar.d;
            int i2 = ((ekoe) ekgbVar).c;
            while (i < i2) {
                aky$$ExternalSyntheticApiModelOutline0.m177m((Object) ekgbVar.get(i)).accept(th);
                i++;
            }
            return;
        }
        ekgb ekgbVar2 = drudVar.c;
        int i3 = ((ekoe) ekgbVar2).c;
        while (i < i3) {
            aky$$ExternalSyntheticApiModelOutline0.m177m((Object) ekgbVar2.get(i)).accept(th);
            i++;
        }
    }
}
