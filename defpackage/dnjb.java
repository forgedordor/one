package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnjb extends fdbo implements fdat {
    public dnjb(Object obj) {
        super(2, obj, dnjd.class, "onEmojiAdded", "onEmojiAdded(Ljava/util/List;Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        List list = (List) obj;
        dnnp dnnpVar = (dnnp) obj2;
        list.getClass();
        dnnpVar.getClass();
        ((dnjd) this.g).b(list, dnnpVar);
        return fctx.a;
    }
}
