package defpackage;

import androidx.car.app.AppManager;
import androidx.car.app.model.TemplateWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class clu implements lvj {
    public final lvn a = new lvn(this);
    public TemplateWrapper b;
    public boolean c;
    private final clg d;

    protected clu(clg clgVar) {
        this.d = clgVar;
    }

    @Override // defpackage.lvj
    public final lvc P() {
        return this.a;
    }

    public abstract cpp a();

    public final void b(final lva lvaVar) {
        csb.b(new Runnable() { // from class: clt
            @Override // java.lang.Runnable
            public final void run() {
                lvn lvnVar = this.a.a;
                if (lvnVar.c.a(lvb.b)) {
                    lva lvaVar2 = lvaVar;
                    luz luzVar = lva.Companion;
                    lvnVar.e(lvaVar2);
                }
            }
        });
    }

    public final void c() {
        if (this.a.c.a(lvb.d)) {
            ((AppManager) this.d.a(AppManager.class)).a();
        }
    }
}
