package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chs implements lbz {
    final /* synthetic */ Executor a;
    final /* synthetic */ lbz b;
    final /* synthetic */ chu c;

    public chs(chu chuVar, Executor executor, lbz lbzVar) {
        this.c = chuVar;
        this.a = executor;
        this.b = lbzVar;
    }

    @Override // defpackage.lbz
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        cav cavVar = (cav) obj;
        if (cavVar instanceof caq) {
            if (box.d()) {
                this.c.j(this);
            } else {
                this.a.execute(new Runnable() { // from class: chr
                    @Override // java.lang.Runnable
                    public final void run() {
                        chs chsVar = this.a;
                        chsVar.c.j(chsVar);
                    }
                });
            }
        }
        this.b.accept(cavVar);
    }
}
