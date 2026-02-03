package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anix implements cqto {
    final /* synthetic */ anja a;

    public anix(anja anjaVar) {
        this.a = anjaVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final anja anjaVar = this.a;
        anjaVar.d = cqty.b(anjaVar.b.a(anjaVar.f, "MessageReplyCountObservableSupplier#repliesQuery").f(new cqtk() { // from class: aniq
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                anja anjaVar2 = anjaVar;
                return auvw.c(anjaVar2.a, fcyi.a, fdjz.a, new aniz(anjaVar2, null));
            }
        }, "MessageReplyCountObservableSupplier::register", "MessageReplyCountObservableSupplier::callback", "MessageReplyCountObservableSupplier::unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        anja anjaVar = this.a;
        cquc cqucVar = anjaVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        anjaVar.d = null;
    }
}
