package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhp extends IOException {
    public final int a;

    public mhp(int i) {
        this.a = i;
    }

    public mhp(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public mhp(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
