package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yvo extends fdbo implements fdap {
    public yvo(Object obj) {
        super(1, obj, vmg.class, "saveAttachments", "saveAttachments(Ljava/util/List;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((vmg) this.g).e(list);
        return fctx.a;
    }
}
