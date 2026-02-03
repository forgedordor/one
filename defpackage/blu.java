package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blu implements bll {
    private final lbz a;

    public blu(lbz lbzVar) {
        this.a = lbzVar;
    }

    @Override // defpackage.bll
    public final void a(Throwable th) {
        bbs.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    @Override // defpackage.bll
    public final void b(Object obj) {
        this.a.accept(obj);
    }
}
