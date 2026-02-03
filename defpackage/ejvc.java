package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejvc extends ejuz {
    static final ejvf a = new ejvc();

    private ejvc() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return false;
    }

    @Override // defpackage.ejvf
    public final int d(CharSequence charSequence) {
        charSequence.getClass();
        return -1;
    }

    @Override // defpackage.ejvf
    public final int e(CharSequence charSequence, int i) {
        ejwl.x(i, charSequence.length());
        return -1;
    }

    @Override // defpackage.ejut, defpackage.ejvf
    public final ejvf f() {
        return ejuo.a;
    }

    @Override // defpackage.ejvf
    public final String h(CharSequence charSequence, char c) {
        return charSequence.toString();
    }

    @Override // defpackage.ejvf
    public final boolean i(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.ejvf
    public final boolean j(CharSequence charSequence) {
        charSequence.getClass();
        return true;
    }

    @Override // defpackage.ejvf
    public final ejvf g(ejvf ejvfVar) {
        return ejvfVar;
    }
}
