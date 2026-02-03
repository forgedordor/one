package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydw extends evsf implements eydy {
    public eydw() {
        super(eydx.a);
    }

    @Override // defpackage.eydy
    public final int a() {
        return ((eydx) this.instance).c.size();
    }

    @Override // defpackage.eydy
    public final String b() {
        return ((eydx) this.instance).b;
    }

    @Override // defpackage.eydy
    public final List c() {
        return DesugarCollections.unmodifiableList(((eydx) this.instance).d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eydy
    public final String d() {
        return (String) ((eydx) this.instance).c.get(0);
    }
}
