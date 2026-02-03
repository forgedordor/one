package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afiz extends abs {
    final /* synthetic */ afjl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afiz(afjl afjlVar) {
        super(false);
        this.a = afjlVar;
    }

    @Override // defpackage.abs
    public final void b() {
        afjl afjlVar = this.a;
        if (!afjlVar.e().isPresent()) {
            throw new IllegalArgumentException("expecting action mode is be able to exit action mode on back pressed");
        }
        afjlVar.f();
        afjlVar.z.p("handled back press by dismssing action mode");
    }
}
