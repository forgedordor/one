package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebzw implements ebzy {
    private final String a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public ebzw(String str) {
        this.a = str;
    }

    @Override // defpackage.ebzx
    public final synchronized ebzu a(String str) {
        return (ebzu) this.b.get(str);
    }

    @Override // defpackage.ebzx
    public final synchronized ebzv b(String str) {
        return (ebzv) this.c.get(str);
    }

    @Override // defpackage.ebzv
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ebzv
    public final synchronized List d() {
        return new ArrayList(this.b.values());
    }

    @Override // defpackage.ebzv
    public final synchronized List e() {
        return new ArrayList(this.c.values());
    }

    @Override // defpackage.ebzy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized void g(ebzu ebzuVar) {
        this.b.put(ebzuVar.b(), ebzuVar);
    }

    @Override // defpackage.ebzy
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void i(ebzv ebzvVar) {
        this.c.put(ebzvVar.c(), ebzvVar);
    }
}
