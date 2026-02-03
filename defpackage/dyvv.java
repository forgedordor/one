package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyvv implements res {
    public static dyvv c(Object obj, dxxk dxxkVar) {
        return new dyvm(dyvl.g(obj, dxxkVar));
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b().toString().getBytes(a));
    }

    public abstract dyvl b();

    public final String toString() {
        return "dyvv:" + super.toString();
    }
}
