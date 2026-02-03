package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbug extends fbow {
    public final fcly a;
    public final fbvb b;
    private boolean c;

    public fbug(fbty fbtyVar, final fbuh fbuhVar) {
        fbvb fbvbVar = new fbvb();
        this.b = fbvbVar;
        fbvbVar.a = fbtyVar;
        fcly fclyVar = new fcly(new fclw() { // from class: fbuf
            @Override // defpackage.fclw
            public final fcek a(List list) {
                fbvb fbvbVar2 = this.a.b;
                fbvbVar2.b = list;
                fbvd fbvdVar = new fbvd(fbvbVar2);
                fbuhVar.a = fbvdVar.b;
                return fbvdVar;
            }
        });
        this.a = fclyVar;
        fclyVar.o = false;
        fclyVar.r = false;
    }

    @Override // defpackage.fbow
    public final fbsj a() {
        ejwl.m(!this.c, "BinderServerBuilder can only be used to build one server instance.");
        this.c = true;
        c(new fbvp());
        this.b.c = this.a.j;
        return super.a();
    }

    @Override // defpackage.fbow
    public final fbsk b() {
        return this.a;
    }

    public final void g(fbut fbutVar) {
        this.b.e = fbutVar;
    }
}
