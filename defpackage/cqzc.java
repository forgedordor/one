package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqzc implements cqyy {
    public final cqzf a;
    private final eosc b;

    public cqzc(cqzf cqzfVar, eosc eoscVar) {
        this.a = cqzfVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cqyy
    public final eiju a(final String str) {
        final cqzf cqzfVar = this.a;
        ejly ejlyVar = (ejly) cqzfVar.f.b();
        ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
        ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
        String str2 = (String) cqzf.b.e();
        ejhbVar.copyOnWrite();
        ejhc ejhcVar = (ejhc) ejhbVar.instance;
        str2.getClass();
        ejhcVar.b |= 1;
        ejhcVar.c = str2;
        String str3 = (String) cqzf.a.e();
        ejhbVar.copyOnWrite();
        ejhc ejhcVar2 = (ejhc) ejhbVar.instance;
        str3.getClass();
        ejhcVar2.b |= 2;
        ejhcVar2.d = str3;
        ejgzVar.copyOnWrite();
        ejha ejhaVar = (ejha) ejgzVar.instance;
        ejhc ejhcVar3 = (ejhc) ejhbVar.build();
        ejhcVar3.getClass();
        ejhaVar.c = ejhcVar3;
        ejhaVar.b |= 1;
        return new eijs(ejlyVar.c((ejha) ejgzVar.build())).f(new eopo() { // from class: cqzd
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                ejgn ejgnVar = (ejgn) evsn.parseFrom(ejgn.a, inputStream, evrr.a());
                if (ejgnVar == null) {
                    cqzf.c.r("The new configuration is null: no change made to the grammar.");
                    return null;
                }
                cqzf cqzfVar2 = cqzfVar;
                if (cqzfVar2.d == ejgnVar.d && cqzfVar2.e.equals(ejgnVar.c)) {
                    return null;
                }
                ekfw ekfwVar = new ekfw();
                try {
                    Iterator<E> it = ejgnVar.b.iterator();
                    while (it.hasNext()) {
                        ekfwVar.h(new ejhg((ejgl) it.next()));
                    }
                    cqzfVar2.d = ejgnVar.d;
                    cqzfVar2.e = ejgnVar.c;
                    cqzfVar2.i = Optional.of(new ejhh(ekfwVar.g()));
                    return null;
                } catch (IllegalStateException | NullPointerException e) {
                    cqzf.c.s("Could not reset grammar.", e);
                    return null;
                }
            }
        }, cqzfVar.g).h().e(IOException.class, new ejvr() { // from class: cqze
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqzf.c.s("Could not parse input stream", (IOException) obj);
                return null;
            }
        }, cqzfVar.h).h(new ejvr() { // from class: cqza
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final ekfw ekfwVar = new ekfw();
                final String str4 = str;
                this.a.a.i.ifPresent(new Consumer() { // from class: cqzb
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        int i;
                        int i2;
                        int i3 = ekgb.d;
                        ekfw ekfwVar2 = new ekfw();
                        ekgb ekgbVar = ((ejhh) obj2).a;
                        int i4 = ((ekoe) ekgbVar).c;
                        int i5 = 0;
                        while (i5 < i4) {
                            ejhg ejhgVar = (ejhg) ekgbVar.get(i5);
                            ekgb ekgbVar2 = ejhgVar.a;
                            int i6 = ((ekoe) ekgbVar2).c;
                            int i7 = 0;
                            while (true) {
                                i = i5 + 1;
                                if (i7 < i6) {
                                    String str5 = str4;
                                    ejhf ejhfVar = (ejhf) ekgbVar2.get(i7);
                                    Matcher matcher = ejhfVar.a.matcher(str5);
                                    ekfw ekfwVar3 = new ekfw();
                                    while (matcher.find()) {
                                        String strGroup = matcher.group(ejhfVar.c);
                                        Pattern pattern = ejhfVar.b;
                                        if (pattern == null || pattern.matcher(strGroup).matches()) {
                                            ekfwVar3.h(new ejgx(strGroup, matcher.start()));
                                        }
                                    }
                                    ekgb ekgbVarG = ekfwVar3.g();
                                    int i8 = ((ekoe) ekgbVarG).c;
                                    int i9 = 0;
                                    while (true) {
                                        i2 = i7 + 1;
                                        if (i9 < i8) {
                                            ejhe ejheVar = (ejhe) ekgbVarG.get(i9);
                                            String strB = ejheVar.b();
                                            int iA = ejheVar.a();
                                            ezdr ezdrVar = (ezdr) ezds.a.createBuilder();
                                            ezdrVar.copyOnWrite();
                                            ((ezds) ezdrVar.instance).h = iA;
                                            int length = iA + strB.length();
                                            ezdrVar.copyOnWrite();
                                            ((ezds) ezdrVar.instance).i = length;
                                            ezga ezgaVar = (ezga) ezgb.a.createBuilder();
                                            String str6 = ejhgVar.b;
                                            ezgaVar.copyOnWrite();
                                            ezgb ezgbVar = (ezgb) ezgaVar.instance;
                                            str6.getClass();
                                            ezgbVar.b = str6;
                                            ezdrVar.copyOnWrite();
                                            ezds ezdsVar = (ezds) ezdrVar.instance;
                                            ezgb ezgbVar2 = (ezgb) ezgaVar.build();
                                            ezgbVar2.getClass();
                                            ezdsVar.d = ezgbVar2;
                                            ezdsVar.c = 13;
                                            ezdrVar.copyOnWrite();
                                            ezds ezdsVar2 = (ezds) ezdrVar.instance;
                                            str6.getClass();
                                            ezdsVar2.f = str6;
                                            eyzy eyzyVar = eyzy.SIMPLE_ANNOTATION;
                                            ezdrVar.copyOnWrite();
                                            ((ezds) ezdrVar.instance).e = eyzyVar.a();
                                            ekfwVar2.h((ezds) ezdrVar.build());
                                            i9++;
                                        }
                                    }
                                    i7 = i2;
                                }
                            }
                            i5 = i;
                        }
                        ekfwVar.j(ekfwVar2.g());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return ekfwVar.g();
            }
        }, this.b);
    }
}
