package defpackage;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccoz implements Enumeration {
    final /* synthetic */ Iterator a;

    public ccoz(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasNext();
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        return (InputStream) this.a.next();
    }
}
