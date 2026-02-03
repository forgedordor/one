package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnis extends fdbo implements fdap {
    public dnis(Object obj) {
        super(1, obj, dniu.class, "onEmojiAdded", "onEmojiAdded(Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnnp dnnpVar = (dnnp) obj;
        dnnpVar.getClass();
        Iterator it = ((dniu) this.g).c.iterator();
        while (it.hasNext()) {
            ((dnhm) it.next()).a(dnnpVar);
        }
        return fctx.a;
    }
}
