package defpackage;

import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alre {
    private final fcsu a;

    public alre(fcsu fcsuVar) {
        this.a = new ajlc(new fcsu() { // from class: alqn
            @Override // defpackage.fcsu
            public final Object b() {
                return true;
            }
        }, fcsuVar);
    }

    public static alwl c(alqm alqmVar) {
        final alwi alwiVar = (alwi) alwl.a.createBuilder();
        alwk alwkVarA = alqmVar.a();
        alwiVar.copyOnWrite();
        ((alwl) alwiVar.instance).c = alwkVarA.a();
        String strO = alqmVar.o();
        alwiVar.copyOnWrite();
        ((alwl) alwiVar.instance).h = strO;
        String strN = alqmVar.n();
        if (strN != null) {
            alwiVar.copyOnWrite();
            ((alwl) alwiVar.instance).k = strN;
        }
        String str = alqmVar.F().a;
        if (str != null) {
            alwiVar.copyOnWrite();
            ((alwl) alwiVar.instance).f = str;
        }
        String strJ = alqmVar.j();
        if (strJ != null) {
            alwiVar.copyOnWrite();
            ((alwl) alwiVar.instance).d = strJ;
        }
        String strM = alqmVar.m(true);
        if (strM != null) {
            alwiVar.copyOnWrite();
            ((alwl) alwiVar.instance).e = strM;
        }
        Optional optionalC = alqmVar.c();
        alwiVar.getClass();
        optionalC.ifPresent(new Consumer() { // from class: alqq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                alwi alwiVar2 = alwiVar;
                String str2 = (String) obj;
                alwiVar2.copyOnWrite();
                alwl alwlVar = (alwl) alwiVar2.instance;
                alwl alwlVar2 = alwl.a;
                str2.getClass();
                alwlVar.g = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        alqmVar.f().map(new Function() { // from class: alqr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((crnc) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: alqs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                alwi alwiVar2 = alwiVar;
                String str2 = (String) obj;
                alwiVar2.copyOnWrite();
                alwl alwlVar = (alwl) alwiVar2.instance;
                alwl alwlVar2 = alwl.a;
                str2.getClass();
                alwlVar.j = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        alqmVar.g().ifPresent(new Consumer() { // from class: alqt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                alwi alwiVar2 = alwiVar;
                String str2 = (String) obj;
                alwiVar2.copyOnWrite();
                alwl alwlVar = (alwl) alwiVar2.instance;
                alwl alwlVar2 = alwl.a;
                str2.getClass();
                alwlVar.l = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        alqmVar.e().ifPresent(new Consumer() { // from class: alqu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                alwi alwiVar2 = alwiVar;
                aubq aubqVar = (aubq) obj;
                alwiVar2.copyOnWrite();
                alwl alwlVar = (alwl) alwiVar2.instance;
                alwl alwlVar2 = alwl.a;
                aubqVar.getClass();
                alwlVar.i = aubqVar;
                alwlVar.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (alwl) alwiVar.build();
    }

    public static evwl d(alqm alqmVar) {
        return new ProtoParsers.InternalDontUse(null, c(alqmVar));
    }

    public final alqm a(evwl evwlVar) {
        return b((alwl) evwlVar.a(alwl.a, evrr.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alqm b(final defpackage.alwl r19) {
        /*
            r18 = this;
            r0 = r19
            aubq r1 = r0.i
            if (r1 != 0) goto L8
            aubq r1 = defpackage.aubq.a
        L8:
            int r1 = r1.b
            r1 = r1 & 2
            if (r1 == 0) goto L25
            aubq r1 = r0.i
            if (r1 != 0) goto L15
            aubq r2 = defpackage.aubq.a
            goto L16
        L15:
            r2 = r1
        L16:
            int r2 = r2.b
            r2 = r2 & 1
            if (r2 == 0) goto L25
            if (r1 != 0) goto L20
            aubq r1 = defpackage.aubq.a
        L20:
            j$.util.Optional r1 = j$.util.Optional.of(r1)
            goto L29
        L25:
            j$.util.Optional r1 = j$.util.Optional.empty()
        L29:
            java.lang.String r2 = r0.g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L36
            j$.util.Optional r2 = j$.util.Optional.empty()
            goto L3c
        L36:
            java.lang.String r2 = r0.g
            j$.util.Optional r2 = j$.util.Optional.of(r2)
        L3c:
            java.lang.String r3 = r0.j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L49
            j$.util.Optional r3 = j$.util.Optional.empty()
            goto L58
        L49:
            crnc r3 = new crnc
            java.lang.String r4 = r0.j
            int r4 = java.lang.Integer.parseInt(r4)
            r3.<init>(r4)
            j$.util.Optional r3 = j$.util.Optional.of(r3)
        L58:
            java.lang.String r4 = r0.l
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            alqv r5 = new alqv
            r5.<init>()
            j$.util.Optional r4 = r4.filter(r5)
            r5 = r18
            fcsu r6 = r5.a
            java.lang.Object r6 = r6.b()
            r7 = r6
            alql r7 = (defpackage.alql) r7
            r0.getClass()
            alqx r8 = new alqx
            r8.<init>()
            alqy r9 = new alqy
            r9.<init>()
            alqz r10 = new alqz
            r10.<init>()
            alra r11 = new alra
            r11.<init>()
            alrb r12 = new alrb
            r12.<init>()
            alrc r13 = new alrc
            r13.<init>()
            alrd r14 = new alrd
            r14.<init>()
            alqo r15 = new alqo
            r15.<init>()
            alqp r0 = new alqp
            r0.<init>()
            alqw r1 = new alqw
            r1.<init>()
            r16 = r0
            r17 = r1
            alqk r0 = r7.c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alre.b(alwl):alqm");
    }
}
