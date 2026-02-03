package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btml extends dqpg {
    public String a;
    public Instant b;
    public Instant c;

    public btml() {
        super(btnj.b().M());
        this.b = bart.b(0L);
        this.c = bart.b(0L);
    }

    public final btmj a() {
        btmk btmkVar = new btmk();
        btmkVar.aD(aB());
        btmkVar.a = this.a;
        btmkVar.b = this.b;
        btmkVar.c = this.c;
        btmkVar.cM = aC();
        return btmkVar;
    }

    public final void b(Instant instant) {
        aE(2);
        this.c = instant;
    }

    public final void c(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void d(String str) {
        aE(0);
        this.a = str;
    }
}
