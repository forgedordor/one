package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ancj implements anbf {
    public final String a;
    public final cqtq b;
    private final dqpi c;

    public ancj(cqtp cqtpVar, String str, dqwl dqwlVar, anci anciVar) {
        this.a = str;
        dqpi dqpiVar = (dqpi) anciVar.a(new Consumer() { // from class: ancf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                int size = ekgbVar.size();
                for (int i = 0; i < size; i++) {
                    ancj ancjVar = this.a;
                    final ajmf ajmfVar = (ajmf) ekgbVar.get(i);
                    ancjVar.b.c(new Supplier() { // from class: ance
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return ajmfVar;
                        }
                    }, ancjVar.a);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c = dqpiVar;
        this.b = cqtpVar.a(new ancg(dqwlVar, dqpiVar));
    }

    @Override // defpackage.anbf
    public final anbe a() {
        return new anbe(this.a);
    }

    @Override // defpackage.anbf
    public final cquc b(final ajmg ajmgVar) {
        cqtk cqtkVar = new cqtk() { // from class: ancd
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return ajmgVar.a((ajmf) obj);
            }
        };
        String str = this.a;
        return this.b.a(cqtkVar, str, str, str);
    }
}
