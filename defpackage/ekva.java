package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekva extends ekux {
    public static final ekux a = new ekva();

    private ekva() {
    }

    @Override // defpackage.ekux
    public final ekta a(String str) {
        return new ekvc(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
