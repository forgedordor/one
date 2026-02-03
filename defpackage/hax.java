package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hax implements fdap {
    final /* synthetic */ hbl a;
    final /* synthetic */ hox b;

    public hax(hbl hblVar, hox hoxVar) {
        this.a = hblVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        int unicodeChar = ((iqh) obj).a.getUnicodeChar();
        if (unicodeChar >= 48 && unicodeChar < 58) {
            hox hoxVar = this.b;
            if (jyo.e(hbj.g(hoxVar).c) == 2 && hbj.g(hoxVar).a().length() == 2) {
                this.a.j(1);
            }
        }
        return false;
    }
}
