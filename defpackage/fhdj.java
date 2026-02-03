package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdj extends fhdn {
    private final boolean a;

    public fhdj(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        if (obj == null) {
            return;
        }
        fhdsVar.d(obj.toString(), null, this.a);
    }
}
