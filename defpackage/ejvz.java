package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvz extends ejwc {
    final /* synthetic */ ejwc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejvz(ejwc ejwcVar, ejwc ejwcVar2) {
        super(ejwcVar2);
        this.a = ejwcVar;
    }

    @Override // defpackage.ejwc
    public final String b(Iterable iterable) {
        return e(iterable.iterator());
    }

    @Override // defpackage.ejwc
    public final void c(Appendable appendable, Iterator it) throws IOException {
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                ejwc ejwcVar = this.a;
                appendable.append(ejwcVar.c);
                appendable.append(ejwcVar.a(next2));
            }
        }
    }
}
