package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvg {
    public final ehvh a;
    public final ehvf b;
    public final String c;

    public ehvg(ehvh ehvhVar, ehvf ehvfVar, String str) {
        this.a = ehvhVar;
        this.b = ehvfVar;
        this.c = str;
    }

    public final File a() {
        return new File(this.b.b(this.a), this.c);
    }
}
