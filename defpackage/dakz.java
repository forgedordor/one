package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dakz extends lxd implements bajq {
    private final babw a = new babw();
    private final lvy b;

    public dakz() {
        lvy lvyVar = new lvy();
        this.b = lvyVar;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        lvyVar.m(new daky());
    }

    @Override // defpackage.bajq
    public final void a(bajr bajrVar) {
        this.a.d();
        this.b.j(new daky());
    }

    @Override // defpackage.bajq
    public final void b(bajr bajrVar) {
        ejwl.a(true);
        this.a.d();
        baiy baiyVar = (baiy) bajrVar;
        ejwl.a(baiyVar.q());
        List listP = baiyVar.p();
        ejwl.l(listP.size() == 1);
        bxfm bxfmVar = (bxfm) listP.get(0);
        Uri uri = bxfmVar.c;
        String str = bxfmVar.d;
    }

    @Override // defpackage.lxd
    public final void fC() {
        babw babwVar = this.a;
        if (babwVar.g()) {
            babwVar.f();
        }
    }
}
