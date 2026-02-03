package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jau implements igl {
    public static final jau a = new jau();
    public static Boolean b;

    private jau() {
    }

    @Override // defpackage.igl
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.igl
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        itw.b("canFocus is read before it is written");
        throw new fcta();
    }

    @Override // defpackage.igl
    public final /* synthetic */ void b(fdap fdapVar) {
    }

    @Override // defpackage.igl
    public final /* synthetic */ void c(fdap fdapVar) {
    }
}
