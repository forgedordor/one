package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yck {
    public static final Object a(auyl auylVar, hml hmlVar) {
        Object objC;
        hmlVar.v(433349789);
        boolean z = auylVar instanceof auxq;
        fcyi fcyiVar = fcyi.a;
        if (z) {
            try {
                objC = ((auxq) auylVar).c();
            } catch (NullPointerException e) {
                ((ekrd) ((ekrd) ycj.a.j()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListScrollHelperKt", "collectMessage", 70, "PagedMessageListScrollHelper.kt")).q("Failed to get state flow value to display");
                objC = null;
            }
        } else {
            objC = hsb.b(auylVar, auylVar.b(), fcyiVar, hmlVar, 0).a();
        }
        hmlVar.o();
        return objC;
    }
}
