package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejuo extends ejuz {
    static final ejvf a = new ejuo();

    private ejuo() {
        super("CharMatcher.any()");
    }

    @Override // defpackage.ejvf
    public final boolean c(char c) {
        return true;
    }

    @Override // defpackage.ejvf
    public final int d(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    @Override // defpackage.ejvf
    public final int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        ejwl.x(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.ejut, defpackage.ejvf
    public final ejvf f() {
        return ejvc.a;
    }

    @Override // defpackage.ejvf
    public final String h(CharSequence charSequence, char c) {
        char[] cArr = new char[charSequence.length()];
        Arrays.fill(cArr, '.');
        return new String(cArr);
    }

    @Override // defpackage.ejvf
    public final boolean i(CharSequence charSequence) {
        charSequence.getClass();
        return true;
    }

    @Override // defpackage.ejvf
    public final boolean j(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.ejvf
    public final ejvf g(ejvf ejvfVar) {
        return this;
    }
}
