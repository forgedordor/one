package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efgy {
    public int a = -1;

    public abstract efgz a();

    public abstract ekfw b();

    public abstract void c(evqs evqsVar);

    public abstract void d(ebco ebcoVar);

    public final efgz e() {
        efgz efgzVarA = a();
        efgp efgpVar = (efgp) efgzVarA;
        Optional optional = efgpVar.b;
        if (optional.isPresent() && !Objects.equals(efgpVar.a, evqs.b)) {
            throw new IllegalArgumentException("content and messageContent can't be both present.");
        }
        if (Objects.equals(efgpVar.a, evqs.b) && optional.isEmpty()) {
            throw new IllegalArgumentException("One of content and messageContent should be present.");
        }
        return efgzVarA;
    }

    public final void f(String str, String str2) {
        b().h(str);
        b().h(str2);
    }
}
