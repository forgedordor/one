package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class damm {
    static fgvn a(long j) {
        fgvm fgvmVar = (fgvm) fgvn.a.createBuilder();
        fgvt fgvtVar = (fgvt) fgvu.a.createBuilder();
        fgvtVar.copyOnWrite();
        fgvu fgvuVar = (fgvu) fgvtVar.instance;
        fgvuVar.a();
        fgvuVar.b.g(j);
        fgvu fgvuVar2 = (fgvu) fgvtVar.build();
        fgvmVar.copyOnWrite();
        fgvn fgvnVar = (fgvn) fgvmVar.instance;
        fgvuVar2.getClass();
        fgvnVar.c = fgvuVar2;
        fgvnVar.b = 3;
        return (fgvn) fgvmVar.build();
    }

    static fgvn b(Iterable iterable) {
        fgvm fgvmVar = (fgvm) fgvn.a.createBuilder();
        fgvt fgvtVar = (fgvt) fgvu.a.createBuilder();
        fgvtVar.copyOnWrite();
        fgvu fgvuVar = (fgvu) fgvtVar.instance;
        fgvuVar.a();
        evpz.addAll(iterable, fgvuVar.b);
        fgvu fgvuVar2 = (fgvu) fgvtVar.build();
        fgvmVar.copyOnWrite();
        fgvn fgvnVar = (fgvn) fgvmVar.instance;
        fgvuVar2.getClass();
        fgvnVar.c = fgvuVar2;
        fgvnVar.b = 3;
        return (fgvn) fgvmVar.build();
    }

    static fgvn c(String str) {
        return e(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static fgvn d(Iterable iterable) {
        fgvi fgviVar = (fgvi) fgvj.a.createBuilder();
        ekqh it = ((ekgb) iterable).iterator();
        while (it.hasNext()) {
            fgviVar.a(evqs.A(ejwk.b((String) it.next())));
        }
        fgvm fgvmVar = (fgvm) fgvn.a.createBuilder();
        fgvj fgvjVar = (fgvj) fgviVar.build();
        fgvmVar.copyOnWrite();
        fgvn fgvnVar = (fgvn) fgvmVar.instance;
        fgvjVar.getClass();
        fgvnVar.c = fgvjVar;
        fgvnVar.b = 1;
        return (fgvn) fgvmVar.build();
    }

    static fgvn e(String... strArr) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (String str : strArr) {
            ekfwVar.h(ejwk.b(str));
        }
        return d(ekfwVar.g());
    }
}
