package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bof implements Enumeration {
    final Enumeration a;
    final /* synthetic */ bog b;

    public bof(bog bogVar) {
        this.b = bogVar;
        this.a = Collections.enumeration(bogVar.b);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
