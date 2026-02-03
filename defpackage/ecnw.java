package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecnw {
    private final StringBuilder a = new StringBuilder();
    private final ArrayList b = new ArrayList();

    public final ecnv a() {
        String string = this.a.toString();
        ArrayList arrayList = this.b;
        return new ecnv(string, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final void b(String str) {
        this.a.append(str);
    }

    public final void c(Long l) {
        this.b.add(l);
    }

    public final void d(String str) {
        this.b.add(str);
    }

    public final void e(byte[] bArr) {
        this.b.add(bArr);
    }
}
