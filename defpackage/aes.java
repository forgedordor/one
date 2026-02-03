package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aes {
    public csq a = new csq();
    public csq b = new csq();
    public csq c = new csq();
    public boolean d = false;

    public final void a() {
        if (this.d) {
            this.a = new csq(this.a);
            this.b = new csq(this.b);
            this.c = new csq(this.c);
            this.d = false;
        }
    }

    public final void b(Object obj, aew aewVar) {
        lcg.i(obj);
        a();
        if (aewVar.b()) {
            csq csqVar = this.a;
            if (!aewVar.b()) {
                Objects.toString(aewVar);
                throw new IllegalStateException("AppSearchResult is a failure: ".concat(aewVar.toString()));
            }
            csqVar.put(obj, aewVar.b);
            this.b.remove(obj);
        } else {
            this.b.put(obj, aewVar);
            this.a.remove(obj);
        }
        this.c.put(obj, aewVar);
    }
}
