package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqtz implements cquc {
    private final List a;

    public cqtz(List list) {
        this.a = list;
    }

    @Override // defpackage.cquc
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cquc) it.next()).a();
        }
    }

    @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        cqub.a(this);
    }
}
