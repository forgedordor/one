package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfd extends fdcy {
    final /* synthetic */ dpfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfd(dpfe dpfeVar) {
        super(null);
        this.a = dpfeVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dnjn dnjnVar = (dnjn) obj2;
        if (dnjnVar != null) {
            ekrd ekrdVar = (ekrd) dpfe.b.h().h("com/google/android/libraries/compose/ui/composable/text/DelegatingEmojiDraftTextController$special$$inlined$distinctObservable$1", "afterChange", 23, "DelegatingEmojiDraftTextController.kt");
            dpfe dpfeVar = this.a;
            ekrdVar.B("Delegating text control to %s (%d pending operations)", dnjnVar, dpfeVar.c.a);
            Iterator itA = fdey.d(new dpfc(dpfeVar)).a();
            while (itA.hasNext()) {
                ((fdap) itA.next()).invoke(dnjnVar);
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
