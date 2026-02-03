package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehda implements ecac {
    private final eilm a;
    private final fcsu b;
    private final fcsu c;

    public ehda(eilm eilmVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = eilmVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.ecac
    public final void a(ebzy ebzyVar) {
        Iterator it = ((Set) this.b.b()).iterator();
        while (it.hasNext()) {
            ebzyVar.i(this.a.a((ebzv) it.next()));
        }
        Iterator it2 = ((Set) ((eyig) this.c).a).iterator();
        while (it2.hasNext()) {
            ebzyVar.g(new eili(this.a, (ebzu) it2.next()));
        }
    }
}
