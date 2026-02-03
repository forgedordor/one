package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atws implements fcvr {
    final /* synthetic */ Iterable a;

    public atws(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.fcvr
    public final Object a(Object obj) {
        return (awos) obj;
    }

    @Override // defpackage.fcvr
    public final Iterator b() {
        return this.a.iterator();
    }
}
