package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0037f extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C0037f("Unsupported " + str + " :" + serializable);
    }
}
