package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekrj extends ekrz {
    public ekrj(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.ekrz
    public final void b(Iterator it, ekry ekryVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                ekryVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            ekryVar.a(str, sb.toString());
        }
    }
}
