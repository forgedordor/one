package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agi {
    private final String a;
    private css b = new css();
    private boolean c = false;

    public agi(String str) {
        this.a = str;
    }

    public final agj a() {
        this.c = true;
        return new agj(this.a, new ArrayList(this.b));
    }

    public final void b(Collection collection) {
        lcg.i(collection);
        if (this.c) {
            this.b = new css(this.b);
            this.c = false;
        }
        this.b.addAll(collection);
    }
}
