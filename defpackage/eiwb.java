package defpackage;

import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwb {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public boolean c;
    private final Class d;

    public eiwb(Class cls) {
        this.d = cls;
    }

    public final eiwd a() {
        return new eivy(DesugarCollections.unmodifiableList(this.a), this.b, this.c, this.d);
    }

    public final void b(Enum... enumArr) {
        DesugarArrays.stream(enumArr).forEach(new Consumer() { // from class: eiwa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Enum r2 = (Enum) obj;
                r2.getClass();
                this.a.a.add(new eivw(r2));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c = true;
    }
}
