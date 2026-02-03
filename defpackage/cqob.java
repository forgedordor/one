package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqob implements eora {
    private final ejvr a;
    private final ejvr b;

    public cqob(final Consumer consumer) {
        this.a = eiid.a(new ejvr() { // from class: cqoa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                consumer.accept(obj);
                return null;
            }
        });
        this.b = null;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ejvr ejvrVar = this.b;
        if (ejvrVar != null) {
        }
    }

    public cqob(final Consumer consumer, final Consumer consumer2) {
        this.a = eiid.a(new ejvr() { // from class: cqny
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                consumer.accept(obj);
                return null;
            }
        });
        this.b = eiid.a(new ejvr() { // from class: cqnz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                consumer2.accept((Throwable) obj);
                return null;
            }
        });
    }
}
