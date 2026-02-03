package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhip {
    public final String a;

    public dhip(String str) {
        this.a = str;
    }

    public static dhip a(String str) {
        return new dhip(String.format("%s:[%s]", str, UUID.randomUUID().toString().substring(0, 13)));
    }

    public final dhip b(String str) {
        return new dhip(this.a + ">" + str);
    }

    public final String toString() {
        return this.a;
    }

    public dhip(String str, Object... objArr) {
        this(String.format(str, objArr));
    }
}
