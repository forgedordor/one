package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqgj {
    public static final ezjt a(ezpp ezppVar, Iterable iterable) {
        ezjs ezjsVar = (ezjs) ezjt.a.createBuilder();
        ezjsVar.getClass();
        ezppVar.getClass();
        ezjsVar.copyOnWrite();
        ezjt ezjtVar = (ezjt) ezjsVar.instance;
        ezjtVar.c = ezppVar;
        ezjtVar.b |= 1;
        DesugarCollections.unmodifiableList(ezjtVar.d).getClass();
        ezjsVar.a(iterable);
        ezjsVar.copyOnWrite();
        ((ezjt) ezjsVar.instance).e = true;
        evsn evsnVarBuild = ezjsVar.build();
        evsnVarBuild.getClass();
        return (ezjt) evsnVarBuild;
    }
}
