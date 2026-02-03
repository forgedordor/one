package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnij {
    public static final fbrg a(String str) {
        if (str == null) {
            return null;
        }
        fbrg fbrgVar = new fbrg();
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbrgVar.h(new fbqw("Authorization", fbqxVar), "Bearer ".concat(str));
        return fbrgVar;
    }
}
