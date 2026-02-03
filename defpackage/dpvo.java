package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvo implements dpvv {
    final /* synthetic */ dpvp a;

    public dpvo(dpvp dpvpVar) {
        this.a = dpvpVar;
    }

    @Override // defpackage.dpvv
    public final void a(int i, float f) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((dpvv) it.next()).a(i, f);
        }
    }

    @Override // defpackage.dpvv
    public final void b(int i) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((dpvv) it.next()).b(i);
        }
    }
}
