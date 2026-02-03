package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hay implements fdap {
    final /* synthetic */ hbl a;
    final /* synthetic */ hox b;

    public hay(hbl hblVar, hox hoxVar) {
        this.a = hblVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        boolean z = ((iqh) obj).a.getUnicodeChar() == 0 && jyo.e(hbj.h(this.b).c) == 0;
        if (z) {
            this.a.j(0);
        }
        return Boolean.valueOf(z);
    }
}
