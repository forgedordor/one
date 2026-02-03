package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzf implements drzc {
    private final String a;
    private final eosc b;
    private final eygg c;

    public drzf(String str, eosc eoscVar, eygg eyggVar) {
        this.a = str;
        this.c = eyggVar;
        this.b = eoscVar;
    }

    @Override // defpackage.drzc
    public final ListenableFuture a(int i) {
        etkk etkkVar = (etkk) etkl.a.createBuilder();
        etkkVar.copyOnWrite();
        etkl etklVar = (etkl) etkkVar.instance;
        etklVar.b |= 1;
        etklVar.c = 46;
        etkkVar.copyOnWrite();
        etkl etklVar2 = (etkl) etkkVar.instance;
        etklVar2.b |= 2;
        etklVar2.d = i;
        String strA = etii.a(this.a);
        etkkVar.copyOnWrite();
        etkl etklVar3 = (etkl) etkkVar.instance;
        strA.getClass();
        etklVar3.b |= 4;
        etklVar3.e = strA;
        final etkl etklVar4 = (etkl) etkkVar.build();
        final eygg eyggVar = this.c;
        eyggVar.getClass();
        Callable callable = new Callable() { // from class: drzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (dsdf) eyggVar.b();
            }
        };
        eosc eoscVar = this.b;
        return eooq.g(eoqt.t(eoscVar.submit(callable)), eiid.d(new eooz() { // from class: drze
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((dsdf) obj).a(etklVar4);
            }
        }), eoscVar);
    }
}
