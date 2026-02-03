package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctkf extends fdbo implements fdap {
    public ctkf(Object obj) {
        super(1, obj, ctma.class, "onContactsLoaded", "onContactsLoaded(Ljava/util/List;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((ctma) this.g).d(list);
        return fctx.a;
    }
}
