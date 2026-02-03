package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edqw extends lvx {
    public ejwi a;
    public ejwi h;
    public ejwi i;
    private final edln j;
    private final edlj k;
    private final edlv l;
    private final boolean m;

    public edqw(edln edlnVar, edlj edljVar, edlv edlvVar, boolean z) {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.h = ejudVar;
        this.i = ejudVar;
        this.j = edlnVar;
        this.k = edljVar;
        this.l = edlvVar;
        this.m = z;
        b();
    }

    public final void b() {
        edln edlnVar = this.j;
        if (edlnVar.a().o()) {
            return;
        }
        lvy lvyVar = this.k.e;
        if (lvyVar.o()) {
            return;
        }
        edlv edlvVar = this.l;
        if (edlvVar.a().o()) {
            return;
        }
        if (!this.m) {
            p(edlnVar.a(), new lvz() { // from class: edqt
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    ejwi ejwiVarJ = ejwi.j((edlw) obj);
                    edqw edqwVar = this.a;
                    edqwVar.a = ejwiVarJ;
                    edqwVar.c();
                }
            });
        }
        p(lvyVar, new lvz() { // from class: edqu
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVarJ = ejwi.j((edll) obj);
                edqw edqwVar = this.a;
                edqwVar.h = ejwiVarJ;
                edqwVar.c();
            }
        });
        p(edlvVar.a(), new lvz() { // from class: edqv
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVarJ = ejwi.j((edlw) obj);
                edqw edqwVar = this.a;
                edqwVar.i = ejwiVarJ;
                edqwVar.c();
            }
        });
    }

    public final void c() {
        if (this.m) {
            if (this.h.g() && this.i.g()) {
                Object objC = this.h.c();
                Object objC2 = this.i.c();
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                j(new edqi(new edle(ekgbVar, ejud.a, false, ekgbVar), (edll) objC, (edlw) objC2));
                q(this.k.e);
                q(this.l.a());
                return;
            }
            return;
        }
        if (this.a.g() && this.h.g() && this.i.g()) {
            Object objC3 = this.a.c();
            edlw edlwVar = (edlw) objC3;
            j(new edqi(edlwVar, (edll) this.h.c(), (edlw) this.i.c()));
            q(this.j.a());
            q(this.k.e);
            q(this.l.a());
        }
    }
}
