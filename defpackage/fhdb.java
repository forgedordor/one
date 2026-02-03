package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdb extends fhdn {
    private final String a;

    public fhdb(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return;
        }
        fhdsVar.b(this.a, string);
    }
}
