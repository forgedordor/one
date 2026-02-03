package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgnc implements Serializable {
    public static final fgnc a = new fgnb("eras", (byte) 1);
    public static final fgnc b = new fgnb("centuries", (byte) 2);
    public static final fgnc c = new fgnb("weekyears", (byte) 3);
    public static final fgnc d = new fgnb("years", (byte) 4);
    public static final fgnc e = new fgnb("months", (byte) 5);
    public static final fgnc f = new fgnb("weeks", (byte) 6);
    public static final fgnc g = new fgnb("days", (byte) 7);
    public static final fgnc h = new fgnb("halfdays", (byte) 8);
    public static final fgnc i = new fgnb("hours", (byte) 9);
    public static final fgnc j = new fgnb("minutes", (byte) 10);
    public static final fgnc k = new fgnb("seconds", (byte) 11);
    public static final fgnc l = new fgnb("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    protected fgnc(String str) {
        this.m = str;
    }

    public abstract fgna a(fgmq fgmqVar);

    public final String toString() {
        return this.m;
    }
}
