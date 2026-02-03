package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbl extends elbm {
    public elbl(elbg elbgVar) {
        super(elbgVar);
    }

    @Override // defpackage.ekao
    protected final /* bridge */ /* synthetic */ Object a() {
        while (!this.d.hasNext()) {
            ejwl.l(!this.d.hasNext());
            Iterator it = ((elbm) this).b;
            if (!it.hasNext()) {
                b();
                return null;
            }
            this.c = it.next();
            this.d = ((elbm) this).a.e(this.c).iterator();
        }
        Object obj = this.c;
        obj.getClass();
        return new elbj(obj, this.d.next());
    }
}
