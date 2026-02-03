package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxd extends ejxi {
    final /* synthetic */ ejvf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejxd(ejxk ejxkVar, CharSequence charSequence, ejvf ejvfVar) {
        super(ejxkVar, charSequence);
        this.b = ejvfVar;
    }

    @Override // defpackage.ejxi
    public final int b(int i) {
        return i + 1;
    }

    @Override // defpackage.ejxi
    public final int c(int i) {
        return this.b.e(this.c, i);
    }
}
