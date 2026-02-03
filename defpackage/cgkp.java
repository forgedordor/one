package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cgkp {
    public static cgko f(cglt cgltVar, CharSequence charSequence, long j) {
        cggv cggvVar = new cggv();
        cggvVar.a = Optional.of(cgltVar);
        cggvVar.b(charSequence);
        cggvVar.c(j);
        return cggvVar;
    }

    public abstract long a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract CharSequence e();
}
