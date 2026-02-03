package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwin extends dwjg {
    public ejwi a;
    public Set b;
    public ejwi c;
    public String d;

    public dwin() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.c = ejudVar;
    }

    @Override // defpackage.dwjg
    public final void a(String str) {
        this.c = ejwi.j(str);
    }

    @Override // defpackage.dwjg
    public final void b(String str) {
        this.a = ejwi.j(str);
    }

    @Override // defpackage.dwjg
    public final void c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.b = set;
    }

    @Override // defpackage.dwjg
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.d = str;
    }
}
