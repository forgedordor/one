package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhfg {
    public static final Object a = new Object();
    public static dhfo b;

    public static Optional a() {
        Optional optionalOfNullable;
        synchronized (a) {
            optionalOfNullable = Optional.ofNullable(b);
        }
        return optionalOfNullable;
    }

    public static void b() {
        synchronized (a) {
            dhja.k("Destroying JibeServiceComponent", new Object[0]);
            b = null;
        }
    }
}
