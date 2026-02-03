package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvz {
    public final dpux a;
    public final fdap b;
    public final fdap c;
    public final fdap d;
    public final dpvy e = new dpvy(this);

    @fcsv
    public dpvz(dpux dpuxVar, fdap fdapVar, fdap fdapVar2, fdap fdapVar3) {
        this.a = dpuxVar;
        this.b = fdapVar;
        this.c = fdapVar2;
        this.d = fdapVar3;
    }

    public final void a() {
        this.a.c.setOnHierarchyChangeListener(null);
    }

    public final void b() {
        a();
        if (this.a.h) {
            c(this.c);
        }
    }

    public final void c(fdap fdapVar) {
        fdep fdepVar = new fdep((fdeq) fdey.k(new lfd(this.a.c), this.d));
        while (fdepVar.hasNext()) {
            fdapVar.invoke((View) fdepVar.next());
        }
    }
}
