package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdh extends fhdn {
    private final String a;
    private final boolean b;

    public fhdh(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return;
        }
        fhdsVar.d(this.a, string, this.b);
    }
}
