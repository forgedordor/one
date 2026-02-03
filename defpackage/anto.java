package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anto implements anpj {
    public final fdat a;
    private final antm b;
    private final aokq c;

    public anto(antm antmVar, fdat fdatVar, aokq aokqVar) {
        antmVar.getClass();
        this.b = antmVar;
        this.a = fdatVar;
        this.c = aokqVar;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        final antn antnVar = new antn(this, anpiVar);
        final antm antmVar = this.b;
        List list = antmVar.a;
        synchronized (list) {
            list.add(antnVar);
            if (list.size() == 1) {
                antmVar.c.M(antmVar.b);
                antmVar.e.M(antmVar.d);
            }
        }
        return new cquc() { // from class: antj
            @Override // defpackage.cquc
            public final void a() {
                antm antmVar2 = antmVar;
                List list2 = antmVar2.a;
                antn antnVar2 = antnVar;
                synchronized (list2) {
                    list2.remove(antnVar2);
                    if (list2.isEmpty()) {
                        antmVar2.c.Q(antmVar2.b);
                        antmVar2.e.Q(antmVar2.d);
                    }
                }
            }

            @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                cqub.a(this);
            }
        };
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return this.c.a();
    }

    @Override // defpackage.anpj
    public final Object c() {
        return this.c.b();
    }
}
