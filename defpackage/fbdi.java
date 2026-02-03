package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbdi implements fbdg {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.f("45375925", new eabn() { // from class: fbdh
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dxln) evsn.parseFrom(dxln.b, (byte[]) obj);
            }
        }, "CAM", "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.e("45685404", false, "com.google.android.libraries.notifications.platform", eadcVar);
        c = eacj.e("45409568", false, "com.google.android.libraries.notifications.platform", eadcVar);
        d = eacj.e("45675511", false, "com.google.android.libraries.notifications.platform", eadcVar);
        e = eacj.e("45679963", false, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbdg
    public final dxln a() {
        return (dxln) a.get();
    }

    @Override // defpackage.fbdg
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.fbdg
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.fbdg
    public final boolean d() {
        return ((Boolean) d.get()).booleanValue();
    }

    @Override // defpackage.fbdg
    public final boolean e() {
        return ((Boolean) e.get()).booleanValue();
    }
}
