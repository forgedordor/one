package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnit extends fdbo implements fdap {
    public dnit(Object obj) {
        super(1, obj, dniu.class, "onEmojiRemoved", "onEmojiRemoved(Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnnp dnnpVar = (dnnp) obj;
        dnnpVar.getClass();
        Iterator it = ((dniu) this.g).c.iterator();
        while (it.hasNext()) {
            ((dnhm) it.next()).c(dnnpVar);
        }
        return fctx.a;
    }
}
