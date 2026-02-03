package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjh implements dnhm {
    public static final dnce a = new dnce(0);
    private static final ekrg f = ekrg.c("com/google/android/libraries/compose/draft/text/EmojiUsageListener");
    public final eony b;
    public final dnky c;
    public final dnga d;
    public final dnce e;
    private final fdjx g;

    public dnjh(fdjx fdjxVar, eony eonyVar, dnky dnkyVar, dnga dngaVar, dnce dnceVar) {
        this.g = fdjxVar;
        this.b = eonyVar;
        this.c = dnkyVar;
        this.d = dngaVar;
        this.e = dnceVar;
    }

    @Override // defpackage.dnhm
    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((dnnp) it.next());
        }
    }

    public final void d(dnnp dnnpVar) {
        dnnpVar.getClass();
        ((ekrd) f.f().h("com/google/android/libraries/compose/draft/text/EmojiUsageListener", "addUsage", 48, "EmojiUsageListener.kt")).q("Adding emoji usage");
        fdil.d(this.g, null, null, new dnjf(dnnpVar, this, null), 3);
    }

    @Override // defpackage.dnhm
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(dnnp dnnpVar) {
        fdil.d(this.g, null, null, new dnjg(this, dnnpVar, null), 3);
    }

    @Override // defpackage.dnhm
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }
}
