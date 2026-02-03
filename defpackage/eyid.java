package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyid implements eyif {
    private eyik a;

    public static void a(eyid eyidVar, eyik eyikVar) {
        eyikVar.getClass();
        if (eyidVar.a != null) {
            throw new IllegalStateException();
        }
        eyidVar.a = eyikVar;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        eyik eyikVar = this.a;
        if (eyikVar != null) {
            return eyikVar.b();
        }
        throw new IllegalStateException();
    }
}
