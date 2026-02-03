package defpackage;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnn {
    public String a;
    public esno c;
    public String f;
    public final ekjo b = new ekby();
    public boolean d = true;
    public int e = 3;
    public boolean g = false;
    public Long h = null;
    public final Set i = new HashSet();
    Integer j = null;
    Integer k = null;

    public final esnp a() {
        ejwl.m(true, "Only one of postBodyData or chunkedStreamFactory should be set");
        return new esnp(this);
    }

    public final void b(ekjo ekjoVar) {
        this.b.C(ekjoVar);
    }

    public final void c(String str) {
        boolean z = true;
        if (!str.equals("GET") && !str.equals("HEAD") && !str.equals("DELETE") && !str.equals("POST") && !str.equals("PUT")) {
            z = false;
        }
        ejwl.l(z);
        this.f = str;
    }

    public final void d(String str, ByteBuffer byteBuffer) {
        str.getClass();
        byteBuffer.getClass();
        boolean z = true;
        if (!byteBuffer.isDirect() && byteBuffer.isReadOnly()) {
            z = false;
        }
        ejwl.m(z, "Post body cannot be a ByteBuffer that is non-direct and readonly");
        this.c = new esno(str, byteBuffer);
    }

    public final void e(String str) {
        str.getClass();
        this.a = str;
    }
}
